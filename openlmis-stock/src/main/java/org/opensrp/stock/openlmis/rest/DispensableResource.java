package org.opensrp.stock.openlmis.rest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import org.joda.time.DateTime;
import org.json.JSONObject;
import org.opensrp.stock.openlmis.domain.MasterTableEntry;
import org.opensrp.stock.openlmis.domain.metadata.DispensableMetaData;
import org.opensrp.stock.openlmis.service.DispensableService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

import static java.text.MessageFormat.format;
import static org.opensrp.stock.openlmis.util.Utils.*;
import static org.springframework.http.HttpStatus.*;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import static org.springframework.web.bind.annotation.RequestMethod.PUT;

@Controller
@RequestMapping(value = "/rest/dispensables")
public class DispensableResource {

    @Autowired
    private DispensableService dispensableService;

    private static Logger logger = LoggerFactory.getLogger(DispensableResource.class.toString());

    private Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ")
            .registerTypeAdapter(DateTime.class, new DateTimeTypeConverter()).create();

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    protected List<DispensableMetaData> getAll() {
        return dispensableService.getAll();
    }

    @RequestMapping(value = "/sync", method = RequestMethod.GET)
    @ResponseBody
    protected List<DispensableMetaData> sync(HttpServletRequest request) {
        try {
            long serverVersion = getLongFilter(SYNC_SERVER_VERSION, request);
            return dispensableService.get(serverVersion);
        } catch (Exception e) {
            logger.error("", e);
            return new ArrayList<>();
        }
    }

    @SuppressWarnings("unchecked")
    @RequestMapping(headers = { "Accept=application/json" }, method = POST)
    public ResponseEntity<HttpStatus> add(@RequestBody String data) {

        try {
            JSONObject postData = new JSONObject(data);
            if (!postData.has(DISPENSABLES)) {
                return new ResponseEntity<>(BAD_REQUEST);
            }

            List<DispensableMetaData> entries = (ArrayList<DispensableMetaData>) gson.fromJson(postData.getString(DISPENSABLES),
                    new TypeToken<ArrayList<DispensableMetaData>>() {}.getType());
            long serverVersion = getCurrentTime();
            for (DispensableMetaData entry : entries) {
                try {
                    entry.setServerVersion(serverVersion);
                    dispensableService.addOrUpdate(entry);
                    serverVersion++;
                } catch (Exception e) {
                    logger.error("Dispensable " + entry.getId() == null ? "" : entry.getId() + " failed to sync", e);
                }
            }
        } catch (Exception e) {
            logger.error(format("Sync data processing failed with exception {0}.- ", e));
            return new ResponseEntity<>(INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(CREATED);
    }

    @SuppressWarnings("unchecked")
    @RequestMapping(headers = { "Accept=application/json" }, method = PUT)
    public ResponseEntity<HttpStatus> update(@RequestBody String data) {

        try {
            JSONObject postData = new JSONObject(data);
            if (!postData.has(DISPENSABLES)) {
                return new ResponseEntity<>(BAD_REQUEST);
            }

            List<DispensableMetaData> dispensables = (ArrayList<DispensableMetaData>) gson.fromJson(postData.getString(DISPENSABLES),
                    new TypeToken<ArrayList<DispensableMetaData>>() {}.getType());
            long serverVersion = getCurrentTime();
            for (DispensableMetaData dispensable : dispensables) {
                try {
                    MasterTableEntry entry = dispensableService.get(DISPENSABLE, dispensable.getId());
                    entry.setJson(dispensable);
                    entry.setServerVersion(serverVersion);
                    dispensableService.update(entry);
                    serverVersion++;
                } catch (Exception e) {
                    logger.error("Dispensable " + dispensable.getId() == null ? "" : dispensable.getId() + " failed to sync", e);
                }
            }
        } catch (Exception e) {
            logger.error(format("Sync data processing failed with exception {0}.- ", e));
            return new ResponseEntity<>(INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(CREATED);
    }
}

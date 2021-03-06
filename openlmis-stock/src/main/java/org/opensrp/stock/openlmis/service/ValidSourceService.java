package org.opensrp.stock.openlmis.service;

import org.opensrp.stock.openlmis.domain.MasterTableEntry;
import org.opensrp.stock.openlmis.domain.metadata.BaseMetaData;
import org.opensrp.stock.openlmis.domain.metadata.ValidSourceMetaData;
import org.opensrp.stock.openlmis.repository.MasterTableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static org.opensrp.stock.openlmis.util.Utils.VALID_SOURCE;

@Service
public class ValidSourceService {

    @Autowired
    private MasterTableRepository repository;

    public List<ValidSourceMetaData> getAll() {

        List<MasterTableEntry> validSources = repository.get(VALID_SOURCE);
        List<ValidSourceMetaData> validSourcesMetaData = new ArrayList<>();
        for (MasterTableEntry validSource : validSources) {
            validSourcesMetaData.add((ValidSourceMetaData) validSource.getJson());
        }
        return validSourcesMetaData;
    }

    public List<ValidSourceMetaData> getFiltered(String openlmisUuid, String facilityTypeUuid) {

        List<ValidSourceMetaData> validSources = getAll();
        if (openlmisUuid != null && facilityTypeUuid != null) {
            return filterResult(validSources, openlmisUuid, facilityTypeUuid);
        }
        return validSources;
    }

    private List<ValidSourceMetaData> filterResult(List<ValidSourceMetaData> validSources, String openlmisUuid, String facilityTypeUuid) {
        List<ValidSourceMetaData> filteredResult = new ArrayList<>();
        for (ValidSourceMetaData validSource : validSources) {
            if (validSource.getOpenlmisUuid().equals(openlmisUuid) && validSource.getFacilityTypeUuid().equals(facilityTypeUuid)) {
                filteredResult.add(validSource);
            }
        }
        return filteredResult;
    }

    public List<ValidSourceMetaData> get(long syncServerVersion, String openlmisUuid, String facilityTypeUuid) {

        List<MasterTableEntry> validSources = repository.get(VALID_SOURCE, syncServerVersion);
        List<ValidSourceMetaData> validSourcesMetaData  = new ArrayList<>();
        for (MasterTableEntry validSource : validSources) {
            validSourcesMetaData.add((ValidSourceMetaData) validSource.getJson());
        }
        if (openlmisUuid != null && facilityTypeUuid != null) {
            return filterResult(validSourcesMetaData, openlmisUuid, facilityTypeUuid);
        }
        return validSourcesMetaData;
    }

    public MasterTableEntry get(String type, String id) {
        return repository.get(type, id);
    }

    public void addOrUpdate(BaseMetaData entry) {
        repository.add(entry);
    }

    public void update(MasterTableEntry entry) { repository.update(entry); }
}

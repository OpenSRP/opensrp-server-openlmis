import org.junit.BeforeClass;
import org.junit.Test;
import org.opensrp.stock.openlmis.domain.MasterTableMetaData;
import org.opensrp.stock.openlmis.domain.postgres.MasterTableEntry;
import org.opensrp.stock.openlmis.repository.postgres.MasterTableRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static junit.framework.TestCase.assertNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class MasterTableRepositoryTest extends BaseRepositoryTest {

    @Autowired
    private MasterTableRepository repository;

    @BeforeClass
    public static void bootStrap() {
        tableName = "core.master_table";
    }

    @Test
    public void testAddShouldAddNewMasterTableEntry() {

        MasterTableMetaData metaData = new MasterTableMetaData(
                "id",
                "type",
                "identifier",
                482492049L
        );

        MasterTableEntry masterTable = new MasterTableEntry();
        masterTable.setJson(metaData);
        masterTable.setDateUpdated(782894L);

        repository.add(masterTable);

        MasterTableEntry masterTableEntryEntry = repository.get(masterTable.getId());
        assertNotNull(masterTableEntryEntry);
    }

    @Test
    public void testAddShouldAddNewMasterTableEntryFromMetadata() {

        MasterTableMetaData metaData = new MasterTableMetaData(
                "id",
                "type",
                "identifier",
                482492049L
        );

        MasterTableEntry entry = repository.add(metaData);
        assertNotNull(entry);

        MasterTableEntry masterTableEntryEntry = repository.get(entry.getId());
        assertNotNull(masterTableEntryEntry);
    }

    @Test
    public void testGetShouldRetrieveExistingMasterTableEntry() {

        MasterTableMetaData metaData = new MasterTableMetaData(
                "id",
                "type",
                "identifier",
                482492049L
        );

        MasterTableEntry entry = repository.add(metaData);
        entry = repository.get(entry.getId());
        assertNotNull(entry);
    }

    @Test
    public void testUpdateShouldUpdateExistingMasterTableEntry() {

        MasterTableMetaData metaData = new MasterTableMetaData(
                "id",
                "type",
                "identifier",
                482492049L
        );
        MasterTableEntry entry = repository.add(metaData);

        MasterTableEntry updatedEntry = new MasterTableEntry();
        updatedEntry.setId(entry.getId());

        MasterTableMetaData newMetaData = new MasterTableMetaData(
                "id_2",
                "type_2",
                "identifier_2",
                89240234939L
        );
        updatedEntry.setJson(newMetaData);
        repository.update(updatedEntry);

        // assert all data matches
        metaData = (MasterTableMetaData) repository.get(entry.getId()).getJson();
        assertEquals(metaData.getId(), "id_2");
        assertEquals(metaData.getType(), "type_2");
        assertEquals(metaData.getIdentifier(), "identifier_2");
        assertEquals(metaData.getServerVersion(), 89240234939L);
    }

    @Test
    public void testGetAllShouldRetrieveAllMasterTableEntries() {

        MasterTableMetaData metaData = new MasterTableMetaData(
                "id",
                "type",
                "identifier",
                482492049L
        );
        repository.add(metaData);

        metaData = new MasterTableMetaData(
                "id_2",
                "type_2",
                "identifier_2", 90684492049L
        );
        repository.add(metaData);

       metaData = new MasterTableMetaData(
                "id_3",
                "type_3",
                "identifier_3",
                5234892049L
        );
        repository.add(metaData);

        List<MasterTableEntry> masterTableEntries = repository.getAll();
        assertEquals(masterTableEntries.size(), 3);
    }

    @Test
    public void testSafeRemoveShouldAddDeleteDateToMasterTableEntry() {

        MasterTableMetaData metaData = new MasterTableMetaData(
                "id_3",
                "type_3",
                "identifier_3",
                5234892049L
        );
        MasterTableEntry entry = repository.add(metaData);
        assertNull(entry.getDateDeleted());

        repository.safeRemove(entry);
        entry = repository.get(entry.getId());

        assertNotNull(entry.getDateDeleted());
    }
}

package org.opensrp.stock.openlmis.repository.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.opensrp.stock.openlmis.domain.MasterTableEntry;
import org.opensrp.stock.openlmis.domain.MasterTableEntryExample;

public interface MasterTableEntryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core.master_table
     *
     * @mbg.generated Wed Jul 25 16:08:22 EAT 2018
     */
    long countByExample(MasterTableEntryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core.master_table
     *
     * @mbg.generated Wed Jul 25 16:08:22 EAT 2018
     */
    int deleteByExample(MasterTableEntryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core.master_table
     *
     * @mbg.generated Wed Jul 25 16:08:22 EAT 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core.master_table
     *
     * @mbg.generated Wed Jul 25 16:08:22 EAT 2018
     */
    int insert(MasterTableEntry record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core.master_table
     *
     * @mbg.generated Wed Jul 25 16:08:22 EAT 2018
     */
    int insertSelective(MasterTableEntry record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core.master_table
     *
     * @mbg.generated Wed Jul 25 16:08:22 EAT 2018
     */
    List<MasterTableEntry> selectByExample(MasterTableEntryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core.master_table
     *
     * @mbg.generated Wed Jul 25 16:08:22 EAT 2018
     */
    MasterTableEntry selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core.master_table
     *
     * @mbg.generated Wed Jul 25 16:08:22 EAT 2018
     */
    int updateByExampleSelective(@Param("record") MasterTableEntry record, @Param("example") MasterTableEntryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core.master_table
     *
     * @mbg.generated Wed Jul 25 16:08:22 EAT 2018
     */
    int updateByExample(@Param("record") MasterTableEntry record, @Param("example") MasterTableEntryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core.master_table
     *
     * @mbg.generated Wed Jul 25 16:08:22 EAT 2018
     */
    int updateByPrimaryKeySelective(MasterTableEntry record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core.master_table
     *
     * @mbg.generated Wed Jul 25 16:08:22 EAT 2018
     */
    int updateByPrimaryKey(MasterTableEntry record);
}
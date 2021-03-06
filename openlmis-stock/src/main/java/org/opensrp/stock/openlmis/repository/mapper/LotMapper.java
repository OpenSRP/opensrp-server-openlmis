package org.opensrp.stock.openlmis.repository.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.opensrp.stock.openlmis.domain.Lot;
import org.opensrp.stock.openlmis.domain.LotExample;

public interface LotMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core.lot
     *
     * @mbg.generated Fri Aug 10 19:20:03 EAT 2018
     */
    long countByExample(LotExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core.lot
     *
     * @mbg.generated Fri Aug 10 19:20:03 EAT 2018
     */
    int deleteByExample(LotExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core.lot
     *
     * @mbg.generated Fri Aug 10 19:20:03 EAT 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core.lot
     *
     * @mbg.generated Fri Aug 10 19:20:03 EAT 2018
     */
    int insert(Lot record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core.lot
     *
     * @mbg.generated Fri Aug 10 19:20:03 EAT 2018
     */
    int insertSelective(Lot record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core.lot
     *
     * @mbg.generated Fri Aug 10 19:20:03 EAT 2018
     */
    List<Lot> selectByExample(LotExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core.lot
     *
     * @mbg.generated Fri Aug 10 19:20:03 EAT 2018
     */
    Lot selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core.lot
     *
     * @mbg.generated Fri Aug 10 19:20:03 EAT 2018
     */
    int updateByExampleSelective(@Param("record") Lot record, @Param("example") LotExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core.lot
     *
     * @mbg.generated Fri Aug 10 19:20:03 EAT 2018
     */
    int updateByExample(@Param("record") Lot record, @Param("example") LotExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core.lot
     *
     * @mbg.generated Fri Aug 10 19:20:03 EAT 2018
     */
    int updateByPrimaryKeySelective(Lot record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core.lot
     *
     * @mbg.generated Fri Aug 10 19:20:03 EAT 2018
     */
    int updateByPrimaryKey(Lot record);
}
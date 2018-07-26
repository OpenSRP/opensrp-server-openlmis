package org.opensrp.stock.openlmis.domain;

public class MasterTableEntry {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core.master_table.id
     *
     * @mbg.generated Wed Jul 25 16:08:22 EAT 2018
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core.master_table.json
     *
     * @mbg.generated Wed Jul 25 16:08:22 EAT 2018
     */
    private Object json;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core.master_table.server_version
     *
     * @mbg.generated Wed Jul 25 16:08:22 EAT 2018
     */
    private Long serverVersion;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column core.master_table.date_deleted
     *
     * @mbg.generated Wed Jul 25 16:08:22 EAT 2018
     */
    private Long dateDeleted;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core.master_table.id
     *
     * @return the value of core.master_table.id
     *
     * @mbg.generated Wed Jul 25 16:08:22 EAT 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core.master_table.id
     *
     * @param id the value for core.master_table.id
     *
     * @mbg.generated Wed Jul 25 16:08:22 EAT 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core.master_table.json
     *
     * @return the value of core.master_table.json
     *
     * @mbg.generated Wed Jul 25 16:08:22 EAT 2018
     */
    public Object getJson() {
        return json;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core.master_table.json
     *
     * @param json the value for core.master_table.json
     *
     * @mbg.generated Wed Jul 25 16:08:22 EAT 2018
     */
    public void setJson(Object json) {
        this.json = json;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core.master_table.server_version
     *
     * @return the value of core.master_table.server_version
     *
     * @mbg.generated Wed Jul 25 16:08:22 EAT 2018
     */
    public Long getServerVersion() {
        return serverVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core.master_table.server_version
     *
     * @param serverVersion the value for core.master_table.server_version
     *
     * @mbg.generated Wed Jul 25 16:08:22 EAT 2018
     */
    public void setServerVersion(Long serverVersion) {
        this.serverVersion = serverVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column core.master_table.date_deleted
     *
     * @return the value of core.master_table.date_deleted
     *
     * @mbg.generated Wed Jul 25 16:08:22 EAT 2018
     */
    public Long getDateDeleted() {
        return dateDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column core.master_table.date_deleted
     *
     * @param dateDeleted the value for core.master_table.date_deleted
     *
     * @mbg.generated Wed Jul 25 16:08:22 EAT 2018
     */
    public void setDateDeleted(Long dateDeleted) {
        this.dateDeleted = dateDeleted;
    }
}
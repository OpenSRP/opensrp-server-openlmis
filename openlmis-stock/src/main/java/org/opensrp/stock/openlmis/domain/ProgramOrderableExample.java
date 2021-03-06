package org.opensrp.stock.openlmis.domain;

import org.opensrp.stock.openlmis.exception.NullQueryValueException;

import java.util.ArrayList;
import java.util.List;

public class ProgramOrderableExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table core.program_orderable
     *
     * @mbg.generated Wed Jul 25 16:08:22 EAT 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table core.program_orderable
     *
     * @mbg.generated Wed Jul 25 16:08:22 EAT 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table core.program_orderable
     *
     * @mbg.generated Wed Jul 25 16:08:22 EAT 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core.program_orderable
     *
     * @mbg.generated Wed Jul 25 16:08:22 EAT 2018
     */
    public ProgramOrderableExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core.program_orderable
     *
     * @mbg.generated Wed Jul 25 16:08:22 EAT 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core.program_orderable
     *
     * @mbg.generated Wed Jul 25 16:08:22 EAT 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core.program_orderable
     *
     * @mbg.generated Wed Jul 25 16:08:22 EAT 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core.program_orderable
     *
     * @mbg.generated Wed Jul 25 16:08:22 EAT 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core.program_orderable
     *
     * @mbg.generated Wed Jul 25 16:08:22 EAT 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core.program_orderable
     *
     * @mbg.generated Wed Jul 25 16:08:22 EAT 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core.program_orderable
     *
     * @mbg.generated Wed Jul 25 16:08:22 EAT 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core.program_orderable
     *
     * @mbg.generated Wed Jul 25 16:08:22 EAT 2018
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core.program_orderable
     *
     * @mbg.generated Wed Jul 25 16:08:22 EAT 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core.program_orderable
     *
     * @mbg.generated Wed Jul 25 16:08:22 EAT 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table core.program_orderable
     *
     * @mbg.generated Wed Jul 25 16:08:22 EAT 2018
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new NullQueryValueException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new NullQueryValueException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new NullQueryValueException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andProgramIdIsNull() {
            addCriterion("program_id is null");
            return (Criteria) this;
        }

        public Criteria andProgramIdIsNotNull() {
            addCriterion("program_id is not null");
            return (Criteria) this;
        }

        public Criteria andProgramIdEqualTo(String value) {
            addCriterion("program_id =", value, "programId");
            return (Criteria) this;
        }

        public Criteria andProgramIdNotEqualTo(String value) {
            addCriterion("program_id <>", value, "programId");
            return (Criteria) this;
        }

        public Criteria andProgramIdGreaterThan(String value) {
            addCriterion("program_id >", value, "programId");
            return (Criteria) this;
        }

        public Criteria andProgramIdGreaterThanOrEqualTo(String value) {
            addCriterion("program_id >=", value, "programId");
            return (Criteria) this;
        }

        public Criteria andProgramIdLessThan(String value) {
            addCriterion("program_id <", value, "programId");
            return (Criteria) this;
        }

        public Criteria andProgramIdLessThanOrEqualTo(String value) {
            addCriterion("program_id <=", value, "programId");
            return (Criteria) this;
        }

        public Criteria andProgramIdLike(String value) {
            addCriterion("program_id like", value, "programId");
            return (Criteria) this;
        }

        public Criteria andProgramIdNotLike(String value) {
            addCriterion("program_id not like", value, "programId");
            return (Criteria) this;
        }

        public Criteria andProgramIdIn(List<String> values) {
            addCriterion("program_id in", values, "programId");
            return (Criteria) this;
        }

        public Criteria andProgramIdNotIn(List<String> values) {
            addCriterion("program_id not in", values, "programId");
            return (Criteria) this;
        }

        public Criteria andProgramIdBetween(String value1, String value2) {
            addCriterion("program_id between", value1, value2, "programId");
            return (Criteria) this;
        }

        public Criteria andProgramIdNotBetween(String value1, String value2) {
            addCriterion("program_id not between", value1, value2, "programId");
            return (Criteria) this;
        }

        public Criteria andOrderableIdIsNull() {
            addCriterion("orderable_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderableIdIsNotNull() {
            addCriterion("orderable_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderableIdEqualTo(String value) {
            addCriterion("orderable_id =", value, "orderableId");
            return (Criteria) this;
        }

        public Criteria andOrderableIdNotEqualTo(String value) {
            addCriterion("orderable_id <>", value, "orderableId");
            return (Criteria) this;
        }

        public Criteria andOrderableIdGreaterThan(String value) {
            addCriterion("orderable_id >", value, "orderableId");
            return (Criteria) this;
        }

        public Criteria andOrderableIdGreaterThanOrEqualTo(String value) {
            addCriterion("orderable_id >=", value, "orderableId");
            return (Criteria) this;
        }

        public Criteria andOrderableIdLessThan(String value) {
            addCriterion("orderable_id <", value, "orderableId");
            return (Criteria) this;
        }

        public Criteria andOrderableIdLessThanOrEqualTo(String value) {
            addCriterion("orderable_id <=", value, "orderableId");
            return (Criteria) this;
        }

        public Criteria andOrderableIdLike(String value) {
            addCriterion("orderable_id like", value, "orderableId");
            return (Criteria) this;
        }

        public Criteria andOrderableIdNotLike(String value) {
            addCriterion("orderable_id not like", value, "orderableId");
            return (Criteria) this;
        }

        public Criteria andOrderableIdIn(List<String> values) {
            addCriterion("orderable_id in", values, "orderableId");
            return (Criteria) this;
        }

        public Criteria andOrderableIdNotIn(List<String> values) {
            addCriterion("orderable_id not in", values, "orderableId");
            return (Criteria) this;
        }

        public Criteria andOrderableIdBetween(String value1, String value2) {
            addCriterion("orderable_id between", value1, value2, "orderableId");
            return (Criteria) this;
        }

        public Criteria andOrderableIdNotBetween(String value1, String value2) {
            addCriterion("orderable_id not between", value1, value2, "orderableId");
            return (Criteria) this;
        }

        public Criteria andDosesPerPatientIsNull() {
            addCriterion("doses_per_patient is null");
            return (Criteria) this;
        }

        public Criteria andDosesPerPatientIsNotNull() {
            addCriterion("doses_per_patient is not null");
            return (Criteria) this;
        }

        public Criteria andDosesPerPatientEqualTo(Integer value) {
            addCriterion("doses_per_patient =", value, "dosesPerPatient");
            return (Criteria) this;
        }

        public Criteria andDosesPerPatientNotEqualTo(Integer value) {
            addCriterion("doses_per_patient <>", value, "dosesPerPatient");
            return (Criteria) this;
        }

        public Criteria andDosesPerPatientGreaterThan(Integer value) {
            addCriterion("doses_per_patient >", value, "dosesPerPatient");
            return (Criteria) this;
        }

        public Criteria andDosesPerPatientGreaterThanOrEqualTo(Integer value) {
            addCriterion("doses_per_patient >=", value, "dosesPerPatient");
            return (Criteria) this;
        }

        public Criteria andDosesPerPatientLessThan(Integer value) {
            addCriterion("doses_per_patient <", value, "dosesPerPatient");
            return (Criteria) this;
        }

        public Criteria andDosesPerPatientLessThanOrEqualTo(Integer value) {
            addCriterion("doses_per_patient <=", value, "dosesPerPatient");
            return (Criteria) this;
        }

        public Criteria andDosesPerPatientIn(List<Integer> values) {
            addCriterion("doses_per_patient in", values, "dosesPerPatient");
            return (Criteria) this;
        }

        public Criteria andDosesPerPatientNotIn(List<Integer> values) {
            addCriterion("doses_per_patient not in", values, "dosesPerPatient");
            return (Criteria) this;
        }

        public Criteria andDosesPerPatientBetween(Integer value1, Integer value2) {
            addCriterion("doses_per_patient between", value1, value2, "dosesPerPatient");
            return (Criteria) this;
        }

        public Criteria andDosesPerPatientNotBetween(Integer value1, Integer value2) {
            addCriterion("doses_per_patient not between", value1, value2, "dosesPerPatient");
            return (Criteria) this;
        }

        public Criteria andActiveIsNull() {
            addCriterion("active is null");
            return (Criteria) this;
        }

        public Criteria andActiveIsNotNull() {
            addCriterion("active is not null");
            return (Criteria) this;
        }

        public Criteria andActiveEqualTo(Boolean value) {
            addCriterion("active =", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotEqualTo(Boolean value) {
            addCriterion("active <>", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveGreaterThan(Boolean value) {
            addCriterion("active >", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveGreaterThanOrEqualTo(Boolean value) {
            addCriterion("active >=", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveLessThan(Boolean value) {
            addCriterion("active <", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveLessThanOrEqualTo(Boolean value) {
            addCriterion("active <=", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveIn(List<Boolean> values) {
            addCriterion("active in", values, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotIn(List<Boolean> values) {
            addCriterion("active not in", values, "active");
            return (Criteria) this;
        }

        public Criteria andActiveBetween(Boolean value1, Boolean value2) {
            addCriterion("active between", value1, value2, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotBetween(Boolean value1, Boolean value2) {
            addCriterion("active not between", value1, value2, "active");
            return (Criteria) this;
        }

        public Criteria andFullSupplyIsNull() {
            addCriterion("full_supply is null");
            return (Criteria) this;
        }

        public Criteria andFullSupplyIsNotNull() {
            addCriterion("full_supply is not null");
            return (Criteria) this;
        }

        public Criteria andFullSupplyEqualTo(Boolean value) {
            addCriterion("full_supply =", value, "fullSupply");
            return (Criteria) this;
        }

        public Criteria andFullSupplyNotEqualTo(Boolean value) {
            addCriterion("full_supply <>", value, "fullSupply");
            return (Criteria) this;
        }

        public Criteria andFullSupplyGreaterThan(Boolean value) {
            addCriterion("full_supply >", value, "fullSupply");
            return (Criteria) this;
        }

        public Criteria andFullSupplyGreaterThanOrEqualTo(Boolean value) {
            addCriterion("full_supply >=", value, "fullSupply");
            return (Criteria) this;
        }

        public Criteria andFullSupplyLessThan(Boolean value) {
            addCriterion("full_supply <", value, "fullSupply");
            return (Criteria) this;
        }

        public Criteria andFullSupplyLessThanOrEqualTo(Boolean value) {
            addCriterion("full_supply <=", value, "fullSupply");
            return (Criteria) this;
        }

        public Criteria andFullSupplyIn(List<Boolean> values) {
            addCriterion("full_supply in", values, "fullSupply");
            return (Criteria) this;
        }

        public Criteria andFullSupplyNotIn(List<Boolean> values) {
            addCriterion("full_supply not in", values, "fullSupply");
            return (Criteria) this;
        }

        public Criteria andFullSupplyBetween(Boolean value1, Boolean value2) {
            addCriterion("full_supply between", value1, value2, "fullSupply");
            return (Criteria) this;
        }

        public Criteria andFullSupplyNotBetween(Boolean value1, Boolean value2) {
            addCriterion("full_supply not between", value1, value2, "fullSupply");
            return (Criteria) this;
        }

        public Criteria andServerVersionIsNull() {
            addCriterion("server_version is null");
            return (Criteria) this;
        }

        public Criteria andServerVersionIsNotNull() {
            addCriterion("server_version is not null");
            return (Criteria) this;
        }

        public Criteria andServerVersionEqualTo(Long value) {
            addCriterion("server_version =", value, "serverVersion");
            return (Criteria) this;
        }

        public Criteria andServerVersionNotEqualTo(Long value) {
            addCriterion("server_version <>", value, "serverVersion");
            return (Criteria) this;
        }

        public Criteria andServerVersionGreaterThan(Long value) {
            addCriterion("server_version >", value, "serverVersion");
            return (Criteria) this;
        }

        public Criteria andServerVersionGreaterThanOrEqualTo(Long value) {
            addCriterion("server_version >=", value, "serverVersion");
            return (Criteria) this;
        }

        public Criteria andServerVersionLessThan(Long value) {
            addCriterion("server_version <", value, "serverVersion");
            return (Criteria) this;
        }

        public Criteria andServerVersionLessThanOrEqualTo(Long value) {
            addCriterion("server_version <=", value, "serverVersion");
            return (Criteria) this;
        }

        public Criteria andServerVersionIn(List<Long> values) {
            addCriterion("server_version in", values, "serverVersion");
            return (Criteria) this;
        }

        public Criteria andServerVersionNotIn(List<Long> values) {
            addCriterion("server_version not in", values, "serverVersion");
            return (Criteria) this;
        }

        public Criteria andServerVersionBetween(Long value1, Long value2) {
            addCriterion("server_version between", value1, value2, "serverVersion");
            return (Criteria) this;
        }

        public Criteria andServerVersionNotBetween(Long value1, Long value2) {
            addCriterion("server_version not between", value1, value2, "serverVersion");
            return (Criteria) this;
        }

        public Criteria andDateDeletedIsNull() {
            addCriterion("date_deleted is null");
            return (Criteria) this;
        }

        public Criteria andDateDeletedIsNotNull() {
            addCriterion("date_deleted is not null");
            return (Criteria) this;
        }

        public Criteria andDateDeletedEqualTo(Long value) {
            addCriterion("date_deleted =", value, "dateDeleted");
            return (Criteria) this;
        }

        public Criteria andDateDeletedNotEqualTo(Long value) {
            addCriterion("date_deleted <>", value, "dateDeleted");
            return (Criteria) this;
        }

        public Criteria andDateDeletedGreaterThan(Long value) {
            addCriterion("date_deleted >", value, "dateDeleted");
            return (Criteria) this;
        }

        public Criteria andDateDeletedGreaterThanOrEqualTo(Long value) {
            addCriterion("date_deleted >=", value, "dateDeleted");
            return (Criteria) this;
        }

        public Criteria andDateDeletedLessThan(Long value) {
            addCriterion("date_deleted <", value, "dateDeleted");
            return (Criteria) this;
        }

        public Criteria andDateDeletedLessThanOrEqualTo(Long value) {
            addCriterion("date_deleted <=", value, "dateDeleted");
            return (Criteria) this;
        }

        public Criteria andDateDeletedIn(List<Long> values) {
            addCriterion("date_deleted in", values, "dateDeleted");
            return (Criteria) this;
        }

        public Criteria andDateDeletedNotIn(List<Long> values) {
            addCriterion("date_deleted not in", values, "dateDeleted");
            return (Criteria) this;
        }

        public Criteria andDateDeletedBetween(Long value1, Long value2) {
            addCriterion("date_deleted between", value1, value2, "dateDeleted");
            return (Criteria) this;
        }

        public Criteria andDateDeletedNotBetween(Long value1, Long value2) {
            addCriterion("date_deleted not between", value1, value2, "dateDeleted");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table core.program_orderable
     *
     * @mbg.generated do_not_delete_during_merge Wed Jul 25 16:08:22 EAT 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table core.program_orderable
     *
     * @mbg.generated Wed Jul 25 16:08:22 EAT 2018
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}
package com.smartwasser.swrmq.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SystemAllocationExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table system_allocation
     *
     * @mbggenerated Wed Jul 20 10:22:59 CST 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table system_allocation
     *
     * @mbggenerated Wed Jul 20 10:22:59 CST 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table system_allocation
     *
     * @mbggenerated Wed Jul 20 10:22:59 CST 2016
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_allocation
     *
     * @mbggenerated Wed Jul 20 10:22:59 CST 2016
     */
    public SystemAllocationExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_allocation
     *
     * @mbggenerated Wed Jul 20 10:22:59 CST 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_allocation
     *
     * @mbggenerated Wed Jul 20 10:22:59 CST 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_allocation
     *
     * @mbggenerated Wed Jul 20 10:22:59 CST 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_allocation
     *
     * @mbggenerated Wed Jul 20 10:22:59 CST 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_allocation
     *
     * @mbggenerated Wed Jul 20 10:22:59 CST 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_allocation
     *
     * @mbggenerated Wed Jul 20 10:22:59 CST 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_allocation
     *
     * @mbggenerated Wed Jul 20 10:22:59 CST 2016
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_allocation
     *
     * @mbggenerated Wed Jul 20 10:22:59 CST 2016
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
     * This method corresponds to the database table system_allocation
     *
     * @mbggenerated Wed Jul 20 10:22:59 CST 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table system_allocation
     *
     * @mbggenerated Wed Jul 20 10:22:59 CST 2016
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table system_allocation
     *
     * @mbggenerated Wed Jul 20 10:22:59 CST 2016
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
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andFkSystemIdIsNull() {
            addCriterion("fk_system_id is null");
            return (Criteria) this;
        }

        public Criteria andFkSystemIdIsNotNull() {
            addCriterion("fk_system_id is not null");
            return (Criteria) this;
        }

        public Criteria andFkSystemIdEqualTo(String value) {
            addCriterion("fk_system_id =", value, "fkSystemId");
            return (Criteria) this;
        }

        public Criteria andFkSystemIdNotEqualTo(String value) {
            addCriterion("fk_system_id <>", value, "fkSystemId");
            return (Criteria) this;
        }

        public Criteria andFkSystemIdGreaterThan(String value) {
            addCriterion("fk_system_id >", value, "fkSystemId");
            return (Criteria) this;
        }

        public Criteria andFkSystemIdGreaterThanOrEqualTo(String value) {
            addCriterion("fk_system_id >=", value, "fkSystemId");
            return (Criteria) this;
        }

        public Criteria andFkSystemIdLessThan(String value) {
            addCriterion("fk_system_id <", value, "fkSystemId");
            return (Criteria) this;
        }

        public Criteria andFkSystemIdLessThanOrEqualTo(String value) {
            addCriterion("fk_system_id <=", value, "fkSystemId");
            return (Criteria) this;
        }

        public Criteria andFkSystemIdLike(String value) {
            addCriterion("fk_system_id like", value, "fkSystemId");
            return (Criteria) this;
        }

        public Criteria andFkSystemIdNotLike(String value) {
            addCriterion("fk_system_id not like", value, "fkSystemId");
            return (Criteria) this;
        }

        public Criteria andFkSystemIdIn(List<String> values) {
            addCriterion("fk_system_id in", values, "fkSystemId");
            return (Criteria) this;
        }

        public Criteria andFkSystemIdNotIn(List<String> values) {
            addCriterion("fk_system_id not in", values, "fkSystemId");
            return (Criteria) this;
        }

        public Criteria andFkSystemIdBetween(String value1, String value2) {
            addCriterion("fk_system_id between", value1, value2, "fkSystemId");
            return (Criteria) this;
        }

        public Criteria andFkSystemIdNotBetween(String value1, String value2) {
            addCriterion("fk_system_id not between", value1, value2, "fkSystemId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andAllocationPersonIsNull() {
            addCriterion("allocation_person is null");
            return (Criteria) this;
        }

        public Criteria andAllocationPersonIsNotNull() {
            addCriterion("allocation_person is not null");
            return (Criteria) this;
        }

        public Criteria andAllocationPersonEqualTo(String value) {
            addCriterion("allocation_person =", value, "allocationPerson");
            return (Criteria) this;
        }

        public Criteria andAllocationPersonNotEqualTo(String value) {
            addCriterion("allocation_person <>", value, "allocationPerson");
            return (Criteria) this;
        }

        public Criteria andAllocationPersonGreaterThan(String value) {
            addCriterion("allocation_person >", value, "allocationPerson");
            return (Criteria) this;
        }

        public Criteria andAllocationPersonGreaterThanOrEqualTo(String value) {
            addCriterion("allocation_person >=", value, "allocationPerson");
            return (Criteria) this;
        }

        public Criteria andAllocationPersonLessThan(String value) {
            addCriterion("allocation_person <", value, "allocationPerson");
            return (Criteria) this;
        }

        public Criteria andAllocationPersonLessThanOrEqualTo(String value) {
            addCriterion("allocation_person <=", value, "allocationPerson");
            return (Criteria) this;
        }

        public Criteria andAllocationPersonLike(String value) {
            addCriterion("allocation_person like", value, "allocationPerson");
            return (Criteria) this;
        }

        public Criteria andAllocationPersonNotLike(String value) {
            addCriterion("allocation_person not like", value, "allocationPerson");
            return (Criteria) this;
        }

        public Criteria andAllocationPersonIn(List<String> values) {
            addCriterion("allocation_person in", values, "allocationPerson");
            return (Criteria) this;
        }

        public Criteria andAllocationPersonNotIn(List<String> values) {
            addCriterion("allocation_person not in", values, "allocationPerson");
            return (Criteria) this;
        }

        public Criteria andAllocationPersonBetween(String value1, String value2) {
            addCriterion("allocation_person between", value1, value2, "allocationPerson");
            return (Criteria) this;
        }

        public Criteria andAllocationPersonNotBetween(String value1, String value2) {
            addCriterion("allocation_person not between", value1, value2, "allocationPerson");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andFkBusinessUnitCodeIsNull() {
            addCriterion("fk_business_unit_code is null");
            return (Criteria) this;
        }

        public Criteria andFkBusinessUnitCodeIsNotNull() {
            addCriterion("fk_business_unit_code is not null");
            return (Criteria) this;
        }

        public Criteria andFkBusinessUnitCodeEqualTo(String value) {
            addCriterion("fk_business_unit_code =", value, "fkBusinessUnitCode");
            return (Criteria) this;
        }

        public Criteria andFkBusinessUnitCodeNotEqualTo(String value) {
            addCriterion("fk_business_unit_code <>", value, "fkBusinessUnitCode");
            return (Criteria) this;
        }

        public Criteria andFkBusinessUnitCodeGreaterThan(String value) {
            addCriterion("fk_business_unit_code >", value, "fkBusinessUnitCode");
            return (Criteria) this;
        }

        public Criteria andFkBusinessUnitCodeGreaterThanOrEqualTo(String value) {
            addCriterion("fk_business_unit_code >=", value, "fkBusinessUnitCode");
            return (Criteria) this;
        }

        public Criteria andFkBusinessUnitCodeLessThan(String value) {
            addCriterion("fk_business_unit_code <", value, "fkBusinessUnitCode");
            return (Criteria) this;
        }

        public Criteria andFkBusinessUnitCodeLessThanOrEqualTo(String value) {
            addCriterion("fk_business_unit_code <=", value, "fkBusinessUnitCode");
            return (Criteria) this;
        }

        public Criteria andFkBusinessUnitCodeLike(String value) {
            addCriterion("fk_business_unit_code like", value, "fkBusinessUnitCode");
            return (Criteria) this;
        }

        public Criteria andFkBusinessUnitCodeNotLike(String value) {
            addCriterion("fk_business_unit_code not like", value, "fkBusinessUnitCode");
            return (Criteria) this;
        }

        public Criteria andFkBusinessUnitCodeIn(List<String> values) {
            addCriterion("fk_business_unit_code in", values, "fkBusinessUnitCode");
            return (Criteria) this;
        }

        public Criteria andFkBusinessUnitCodeNotIn(List<String> values) {
            addCriterion("fk_business_unit_code not in", values, "fkBusinessUnitCode");
            return (Criteria) this;
        }

        public Criteria andFkBusinessUnitCodeBetween(String value1, String value2) {
            addCriterion("fk_business_unit_code between", value1, value2, "fkBusinessUnitCode");
            return (Criteria) this;
        }

        public Criteria andFkBusinessUnitCodeNotBetween(String value1, String value2) {
            addCriterion("fk_business_unit_code not between", value1, value2, "fkBusinessUnitCode");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table system_allocation
     *
     * @mbggenerated do_not_delete_during_merge Wed Jul 20 10:22:59 CST 2016
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table system_allocation
     *
     * @mbggenerated Wed Jul 20 10:22:59 CST 2016
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
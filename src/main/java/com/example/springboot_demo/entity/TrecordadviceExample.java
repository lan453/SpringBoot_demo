package com.example.springboot_demo.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TrecordadviceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TrecordadviceExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andFestivalIsNull() {
            addCriterion("festival is null");
            return (Criteria) this;
        }

        public Criteria andFestivalIsNotNull() {
            addCriterion("festival is not null");
            return (Criteria) this;
        }

        public Criteria andFestivalEqualTo(Byte value) {
            addCriterion("festival =", value, "festival");
            return (Criteria) this;
        }

        public Criteria andFestivalNotEqualTo(Byte value) {
            addCriterion("festival <>", value, "festival");
            return (Criteria) this;
        }

        public Criteria andFestivalGreaterThan(Byte value) {
            addCriterion("festival >", value, "festival");
            return (Criteria) this;
        }

        public Criteria andFestivalGreaterThanOrEqualTo(Byte value) {
            addCriterion("festival >=", value, "festival");
            return (Criteria) this;
        }

        public Criteria andFestivalLessThan(Byte value) {
            addCriterion("festival <", value, "festival");
            return (Criteria) this;
        }

        public Criteria andFestivalLessThanOrEqualTo(Byte value) {
            addCriterion("festival <=", value, "festival");
            return (Criteria) this;
        }

        public Criteria andFestivalIn(List<Byte> values) {
            addCriterion("festival in", values, "festival");
            return (Criteria) this;
        }

        public Criteria andFestivalNotIn(List<Byte> values) {
            addCriterion("festival not in", values, "festival");
            return (Criteria) this;
        }

        public Criteria andFestivalBetween(Byte value1, Byte value2) {
            addCriterion("festival between", value1, value2, "festival");
            return (Criteria) this;
        }

        public Criteria andFestivalNotBetween(Byte value1, Byte value2) {
            addCriterion("festival not between", value1, value2, "festival");
            return (Criteria) this;
        }

        public Criteria andBegindateIsNull() {
            addCriterion("beginDate is null");
            return (Criteria) this;
        }

        public Criteria andBegindateIsNotNull() {
            addCriterion("beginDate is not null");
            return (Criteria) this;
        }

        public Criteria andBegindateEqualTo(Date value) {
            addCriterion("beginDate =", value, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateNotEqualTo(Date value) {
            addCriterion("beginDate <>", value, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateGreaterThan(Date value) {
            addCriterion("beginDate >", value, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateGreaterThanOrEqualTo(Date value) {
            addCriterion("beginDate >=", value, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateLessThan(Date value) {
            addCriterion("beginDate <", value, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateLessThanOrEqualTo(Date value) {
            addCriterion("beginDate <=", value, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateIn(List<Date> values) {
            addCriterion("beginDate in", values, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateNotIn(List<Date> values) {
            addCriterion("beginDate not in", values, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateBetween(Date value1, Date value2) {
            addCriterion("beginDate between", value1, value2, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateNotBetween(Date value1, Date value2) {
            addCriterion("beginDate not between", value1, value2, "begindate");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNull() {
            addCriterion("endDate is null");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNotNull() {
            addCriterion("endDate is not null");
            return (Criteria) this;
        }

        public Criteria andEnddateEqualTo(Date value) {
            addCriterion("endDate =", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotEqualTo(Date value) {
            addCriterion("endDate <>", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThan(Date value) {
            addCriterion("endDate >", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThanOrEqualTo(Date value) {
            addCriterion("endDate >=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThan(Date value) {
            addCriterion("endDate <", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThanOrEqualTo(Date value) {
            addCriterion("endDate <=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateIn(List<Date> values) {
            addCriterion("endDate in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotIn(List<Date> values) {
            addCriterion("endDate not in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateBetween(Date value1, Date value2) {
            addCriterion("endDate between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotBetween(Date value1, Date value2) {
            addCriterion("endDate not between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andRegbegindateIsNull() {
            addCriterion("regbeginDate is null");
            return (Criteria) this;
        }

        public Criteria andRegbegindateIsNotNull() {
            addCriterion("regbeginDate is not null");
            return (Criteria) this;
        }

        public Criteria andRegbegindateEqualTo(Date value) {
            addCriterion("regbeginDate =", value, "regbegindate");
            return (Criteria) this;
        }

        public Criteria andRegbegindateNotEqualTo(Date value) {
            addCriterion("regbeginDate <>", value, "regbegindate");
            return (Criteria) this;
        }

        public Criteria andRegbegindateGreaterThan(Date value) {
            addCriterion("regbeginDate >", value, "regbegindate");
            return (Criteria) this;
        }

        public Criteria andRegbegindateGreaterThanOrEqualTo(Date value) {
            addCriterion("regbeginDate >=", value, "regbegindate");
            return (Criteria) this;
        }

        public Criteria andRegbegindateLessThan(Date value) {
            addCriterion("regbeginDate <", value, "regbegindate");
            return (Criteria) this;
        }

        public Criteria andRegbegindateLessThanOrEqualTo(Date value) {
            addCriterion("regbeginDate <=", value, "regbegindate");
            return (Criteria) this;
        }

        public Criteria andRegbegindateIn(List<Date> values) {
            addCriterion("regbeginDate in", values, "regbegindate");
            return (Criteria) this;
        }

        public Criteria andRegbegindateNotIn(List<Date> values) {
            addCriterion("regbeginDate not in", values, "regbegindate");
            return (Criteria) this;
        }

        public Criteria andRegbegindateBetween(Date value1, Date value2) {
            addCriterion("regbeginDate between", value1, value2, "regbegindate");
            return (Criteria) this;
        }

        public Criteria andRegbegindateNotBetween(Date value1, Date value2) {
            addCriterion("regbeginDate not between", value1, value2, "regbegindate");
            return (Criteria) this;
        }

        public Criteria andRegenddateIsNull() {
            addCriterion("regendDate is null");
            return (Criteria) this;
        }

        public Criteria andRegenddateIsNotNull() {
            addCriterion("regendDate is not null");
            return (Criteria) this;
        }

        public Criteria andRegenddateEqualTo(Date value) {
            addCriterion("regendDate =", value, "regenddate");
            return (Criteria) this;
        }

        public Criteria andRegenddateNotEqualTo(Date value) {
            addCriterion("regendDate <>", value, "regenddate");
            return (Criteria) this;
        }

        public Criteria andRegenddateGreaterThan(Date value) {
            addCriterion("regendDate >", value, "regenddate");
            return (Criteria) this;
        }

        public Criteria andRegenddateGreaterThanOrEqualTo(Date value) {
            addCriterion("regendDate >=", value, "regenddate");
            return (Criteria) this;
        }

        public Criteria andRegenddateLessThan(Date value) {
            addCriterion("regendDate <", value, "regenddate");
            return (Criteria) this;
        }

        public Criteria andRegenddateLessThanOrEqualTo(Date value) {
            addCriterion("regendDate <=", value, "regenddate");
            return (Criteria) this;
        }

        public Criteria andRegenddateIn(List<Date> values) {
            addCriterion("regendDate in", values, "regenddate");
            return (Criteria) this;
        }

        public Criteria andRegenddateNotIn(List<Date> values) {
            addCriterion("regendDate not in", values, "regenddate");
            return (Criteria) this;
        }

        public Criteria andRegenddateBetween(Date value1, Date value2) {
            addCriterion("regendDate between", value1, value2, "regenddate");
            return (Criteria) this;
        }

        public Criteria andRegenddateNotBetween(Date value1, Date value2) {
            addCriterion("regendDate not between", value1, value2, "regenddate");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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
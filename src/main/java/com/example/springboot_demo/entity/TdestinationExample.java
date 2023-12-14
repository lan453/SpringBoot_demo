package com.example.springboot_demo.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TdestinationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TdestinationExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andRecordadviceidIsNull() {
            addCriterion("recordAdviceId is null");
            return (Criteria) this;
        }

        public Criteria andRecordadviceidIsNotNull() {
            addCriterion("recordAdviceId is not null");
            return (Criteria) this;
        }

        public Criteria andRecordadviceidEqualTo(Long value) {
            addCriterion("recordAdviceId =", value, "recordadviceid");
            return (Criteria) this;
        }

        public Criteria andRecordadviceidNotEqualTo(Long value) {
            addCriterion("recordAdviceId <>", value, "recordadviceid");
            return (Criteria) this;
        }

        public Criteria andRecordadviceidGreaterThan(Long value) {
            addCriterion("recordAdviceId >", value, "recordadviceid");
            return (Criteria) this;
        }

        public Criteria andRecordadviceidGreaterThanOrEqualTo(Long value) {
            addCriterion("recordAdviceId >=", value, "recordadviceid");
            return (Criteria) this;
        }

        public Criteria andRecordadviceidLessThan(Long value) {
            addCriterion("recordAdviceId <", value, "recordadviceid");
            return (Criteria) this;
        }

        public Criteria andRecordadviceidLessThanOrEqualTo(Long value) {
            addCriterion("recordAdviceId <=", value, "recordadviceid");
            return (Criteria) this;
        }

        public Criteria andRecordadviceidIn(List<Long> values) {
            addCriterion("recordAdviceId in", values, "recordadviceid");
            return (Criteria) this;
        }

        public Criteria andRecordadviceidNotIn(List<Long> values) {
            addCriterion("recordAdviceId not in", values, "recordadviceid");
            return (Criteria) this;
        }

        public Criteria andRecordadviceidBetween(Long value1, Long value2) {
            addCriterion("recordAdviceId between", value1, value2, "recordadviceid");
            return (Criteria) this;
        }

        public Criteria andRecordadviceidNotBetween(Long value1, Long value2) {
            addCriterion("recordAdviceId not between", value1, value2, "recordadviceid");
            return (Criteria) this;
        }

        public Criteria andStudentidIsNull() {
            addCriterion("studentId is null");
            return (Criteria) this;
        }

        public Criteria andStudentidIsNotNull() {
            addCriterion("studentId is not null");
            return (Criteria) this;
        }

        public Criteria andStudentidEqualTo(Long value) {
            addCriterion("studentId =", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidNotEqualTo(Long value) {
            addCriterion("studentId <>", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidGreaterThan(Long value) {
            addCriterion("studentId >", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidGreaterThanOrEqualTo(Long value) {
            addCriterion("studentId >=", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidLessThan(Long value) {
            addCriterion("studentId <", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidLessThanOrEqualTo(Long value) {
            addCriterion("studentId <=", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidIn(List<Long> values) {
            addCriterion("studentId in", values, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidNotIn(List<Long> values) {
            addCriterion("studentId not in", values, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidBetween(Long value1, Long value2) {
            addCriterion("studentId between", value1, value2, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidNotBetween(Long value1, Long value2) {
            addCriterion("studentId not between", value1, value2, "studentid");
            return (Criteria) this;
        }

        public Criteria andProvinceidIsNull() {
            addCriterion("provinceId is null");
            return (Criteria) this;
        }

        public Criteria andProvinceidIsNotNull() {
            addCriterion("provinceId is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceidEqualTo(Long value) {
            addCriterion("provinceId =", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidNotEqualTo(Long value) {
            addCriterion("provinceId <>", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidGreaterThan(Long value) {
            addCriterion("provinceId >", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidGreaterThanOrEqualTo(Long value) {
            addCriterion("provinceId >=", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidLessThan(Long value) {
            addCriterion("provinceId <", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidLessThanOrEqualTo(Long value) {
            addCriterion("provinceId <=", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidIn(List<Long> values) {
            addCriterion("provinceId in", values, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidNotIn(List<Long> values) {
            addCriterion("provinceId not in", values, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidBetween(Long value1, Long value2) {
            addCriterion("provinceId between", value1, value2, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidNotBetween(Long value1, Long value2) {
            addCriterion("provinceId not between", value1, value2, "provinceid");
            return (Criteria) this;
        }

        public Criteria andCityidIsNull() {
            addCriterion("cityId is null");
            return (Criteria) this;
        }

        public Criteria andCityidIsNotNull() {
            addCriterion("cityId is not null");
            return (Criteria) this;
        }

        public Criteria andCityidEqualTo(Long value) {
            addCriterion("cityId =", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidNotEqualTo(Long value) {
            addCriterion("cityId <>", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidGreaterThan(Long value) {
            addCriterion("cityId >", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidGreaterThanOrEqualTo(Long value) {
            addCriterion("cityId >=", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidLessThan(Long value) {
            addCriterion("cityId <", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidLessThanOrEqualTo(Long value) {
            addCriterion("cityId <=", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidIn(List<Long> values) {
            addCriterion("cityId in", values, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidNotIn(List<Long> values) {
            addCriterion("cityId not in", values, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidBetween(Long value1, Long value2) {
            addCriterion("cityId between", value1, value2, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidNotBetween(Long value1, Long value2) {
            addCriterion("cityId not between", value1, value2, "cityid");
            return (Criteria) this;
        }

        public Criteria andCountyidIsNull() {
            addCriterion("countyId is null");
            return (Criteria) this;
        }

        public Criteria andCountyidIsNotNull() {
            addCriterion("countyId is not null");
            return (Criteria) this;
        }

        public Criteria andCountyidEqualTo(Long value) {
            addCriterion("countyId =", value, "countyid");
            return (Criteria) this;
        }

        public Criteria andCountyidNotEqualTo(Long value) {
            addCriterion("countyId <>", value, "countyid");
            return (Criteria) this;
        }

        public Criteria andCountyidGreaterThan(Long value) {
            addCriterion("countyId >", value, "countyid");
            return (Criteria) this;
        }

        public Criteria andCountyidGreaterThanOrEqualTo(Long value) {
            addCriterion("countyId >=", value, "countyid");
            return (Criteria) this;
        }

        public Criteria andCountyidLessThan(Long value) {
            addCriterion("countyId <", value, "countyid");
            return (Criteria) this;
        }

        public Criteria andCountyidLessThanOrEqualTo(Long value) {
            addCriterion("countyId <=", value, "countyid");
            return (Criteria) this;
        }

        public Criteria andCountyidIn(List<Long> values) {
            addCriterion("countyId in", values, "countyid");
            return (Criteria) this;
        }

        public Criteria andCountyidNotIn(List<Long> values) {
            addCriterion("countyId not in", values, "countyid");
            return (Criteria) this;
        }

        public Criteria andCountyidBetween(Long value1, Long value2) {
            addCriterion("countyId between", value1, value2, "countyid");
            return (Criteria) this;
        }

        public Criteria andCountyidNotBetween(Long value1, Long value2) {
            addCriterion("countyId not between", value1, value2, "countyid");
            return (Criteria) this;
        }

        public Criteria andDetailIsNull() {
            addCriterion("detail is null");
            return (Criteria) this;
        }

        public Criteria andDetailIsNotNull() {
            addCriterion("detail is not null");
            return (Criteria) this;
        }

        public Criteria andDetailEqualTo(String value) {
            addCriterion("detail =", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotEqualTo(String value) {
            addCriterion("detail <>", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailGreaterThan(String value) {
            addCriterion("detail >", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailGreaterThanOrEqualTo(String value) {
            addCriterion("detail >=", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailLessThan(String value) {
            addCriterion("detail <", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailLessThanOrEqualTo(String value) {
            addCriterion("detail <=", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailLike(String value) {
            addCriterion("detail like", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotLike(String value) {
            addCriterion("detail not like", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailIn(List<String> values) {
            addCriterion("detail in", values, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotIn(List<String> values) {
            addCriterion("detail not in", values, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailBetween(String value1, String value2) {
            addCriterion("detail between", value1, value2, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotBetween(String value1, String value2) {
            addCriterion("detail not between", value1, value2, "detail");
            return (Criteria) this;
        }

        public Criteria andBackdateIsNull() {
            addCriterion("backDate is null");
            return (Criteria) this;
        }

        public Criteria andBackdateIsNotNull() {
            addCriterion("backDate is not null");
            return (Criteria) this;
        }

        public Criteria andBackdateEqualTo(Date value) {
            addCriterionForJDBCDate("backDate =", value, "backdate");
            return (Criteria) this;
        }

        public Criteria andBackdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("backDate <>", value, "backdate");
            return (Criteria) this;
        }

        public Criteria andBackdateGreaterThan(Date value) {
            addCriterionForJDBCDate("backDate >", value, "backdate");
            return (Criteria) this;
        }

        public Criteria andBackdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("backDate >=", value, "backdate");
            return (Criteria) this;
        }

        public Criteria andBackdateLessThan(Date value) {
            addCriterionForJDBCDate("backDate <", value, "backdate");
            return (Criteria) this;
        }

        public Criteria andBackdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("backDate <=", value, "backdate");
            return (Criteria) this;
        }

        public Criteria andBackdateIn(List<Date> values) {
            addCriterionForJDBCDate("backDate in", values, "backdate");
            return (Criteria) this;
        }

        public Criteria andBackdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("backDate not in", values, "backdate");
            return (Criteria) this;
        }

        public Criteria andBackdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("backDate between", value1, value2, "backdate");
            return (Criteria) this;
        }

        public Criteria andBackdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("backDate not between", value1, value2, "backdate");
            return (Criteria) this;
        }

        public Criteria andLeavedateIsNull() {
            addCriterion("leaveDate is null");
            return (Criteria) this;
        }

        public Criteria andLeavedateIsNotNull() {
            addCriterion("leaveDate is not null");
            return (Criteria) this;
        }

        public Criteria andLeavedateEqualTo(Date value) {
            addCriterionForJDBCDate("leaveDate =", value, "leavedate");
            return (Criteria) this;
        }

        public Criteria andLeavedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("leaveDate <>", value, "leavedate");
            return (Criteria) this;
        }

        public Criteria andLeavedateGreaterThan(Date value) {
            addCriterionForJDBCDate("leaveDate >", value, "leavedate");
            return (Criteria) this;
        }

        public Criteria andLeavedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("leaveDate >=", value, "leavedate");
            return (Criteria) this;
        }

        public Criteria andLeavedateLessThan(Date value) {
            addCriterionForJDBCDate("leaveDate <", value, "leavedate");
            return (Criteria) this;
        }

        public Criteria andLeavedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("leaveDate <=", value, "leavedate");
            return (Criteria) this;
        }

        public Criteria andLeavedateIn(List<Date> values) {
            addCriterionForJDBCDate("leaveDate in", values, "leavedate");
            return (Criteria) this;
        }

        public Criteria andLeavedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("leaveDate not in", values, "leavedate");
            return (Criteria) this;
        }

        public Criteria andLeavedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("leaveDate between", value1, value2, "leavedate");
            return (Criteria) this;
        }

        public Criteria andLeavedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("leaveDate not between", value1, value2, "leavedate");
            return (Criteria) this;
        }

        public Criteria andIsleaveIsNull() {
            addCriterion("isLeave is null");
            return (Criteria) this;
        }

        public Criteria andIsleaveIsNotNull() {
            addCriterion("isLeave is not null");
            return (Criteria) this;
        }

        public Criteria andIsleaveEqualTo(Integer value) {
            addCriterion("isLeave =", value, "isleave");
            return (Criteria) this;
        }

        public Criteria andIsleaveNotEqualTo(Integer value) {
            addCriterion("isLeave <>", value, "isleave");
            return (Criteria) this;
        }

        public Criteria andIsleaveGreaterThan(Integer value) {
            addCriterion("isLeave >", value, "isleave");
            return (Criteria) this;
        }

        public Criteria andIsleaveGreaterThanOrEqualTo(Integer value) {
            addCriterion("isLeave >=", value, "isleave");
            return (Criteria) this;
        }

        public Criteria andIsleaveLessThan(Integer value) {
            addCriterion("isLeave <", value, "isleave");
            return (Criteria) this;
        }

        public Criteria andIsleaveLessThanOrEqualTo(Integer value) {
            addCriterion("isLeave <=", value, "isleave");
            return (Criteria) this;
        }

        public Criteria andIsleaveIn(List<Integer> values) {
            addCriterion("isLeave in", values, "isleave");
            return (Criteria) this;
        }

        public Criteria andIsleaveNotIn(List<Integer> values) {
            addCriterion("isLeave not in", values, "isleave");
            return (Criteria) this;
        }

        public Criteria andIsleaveBetween(Integer value1, Integer value2) {
            addCriterion("isLeave between", value1, value2, "isleave");
            return (Criteria) this;
        }

        public Criteria andIsleaveNotBetween(Integer value1, Integer value2) {
            addCriterion("isLeave not between", value1, value2, "isleave");
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
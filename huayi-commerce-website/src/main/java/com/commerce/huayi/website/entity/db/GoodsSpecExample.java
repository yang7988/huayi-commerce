package com.commerce.huayi.website.entity.db;

import com.rayvision.common.plugin.Limit;
import com.rayvision.common.plugin.Page;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoodsSpecExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = 0;

    protected int limitEnd = 0;

    protected Limit limit;

    protected Page page;

    public GoodsSpecExample() {
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

    public void setLimitStart(int limitStart) {
        this.limitStart=limitStart;
    }

    public int getLimitStart() {
        return limitStart;
    }

    public void setLimitEnd(int limitEnd) {
        this.limitEnd=limitEnd;
    }

    public int getLimitEnd() {
        return limitEnd;
    }

    public void setLimit(Limit limit) {
        this.limit=limit;
    }

    public Limit getLimit() {
        return limit;
    }

    public void setPage(Page page) {
        this.page=page;
    }

    public Page getPage() {
        return page;
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

        public Criteria andSpecNoIsNull() {
            addCriterion("spec_no is null");
            return (Criteria) this;
        }

        public Criteria andSpecNoIsNotNull() {
            addCriterion("spec_no is not null");
            return (Criteria) this;
        }

        public Criteria andSpecNoEqualTo(String value) {
            addCriterion("spec_no =", value, "specNo");
            return (Criteria) this;
        }

        public Criteria andSpecNoNotEqualTo(String value) {
            addCriterion("spec_no <>", value, "specNo");
            return (Criteria) this;
        }

        public Criteria andSpecNoGreaterThan(String value) {
            addCriterion("spec_no >", value, "specNo");
            return (Criteria) this;
        }

        public Criteria andSpecNoGreaterThanOrEqualTo(String value) {
            addCriterion("spec_no >=", value, "specNo");
            return (Criteria) this;
        }

        public Criteria andSpecNoLessThan(String value) {
            addCriterion("spec_no <", value, "specNo");
            return (Criteria) this;
        }

        public Criteria andSpecNoLessThanOrEqualTo(String value) {
            addCriterion("spec_no <=", value, "specNo");
            return (Criteria) this;
        }

        public Criteria andSpecNoLike(String value) {
            addCriterion("spec_no like", value, "specNo");
            return (Criteria) this;
        }

        public Criteria andSpecNoNotLike(String value) {
            addCriterion("spec_no not like", value, "specNo");
            return (Criteria) this;
        }

        public Criteria andSpecNoIn(List<String> values) {
            addCriterion("spec_no in", values, "specNo");
            return (Criteria) this;
        }

        public Criteria andSpecNoNotIn(List<String> values) {
            addCriterion("spec_no not in", values, "specNo");
            return (Criteria) this;
        }

        public Criteria andSpecNoBetween(String value1, String value2) {
            addCriterion("spec_no between", value1, value2, "specNo");
            return (Criteria) this;
        }

        public Criteria andSpecNoNotBetween(String value1, String value2) {
            addCriterion("spec_no not between", value1, value2, "specNo");
            return (Criteria) this;
        }

        public Criteria andSpecNameIsNull() {
            addCriterion("spec_name is null");
            return (Criteria) this;
        }

        public Criteria andSpecNameIsNotNull() {
            addCriterion("spec_name is not null");
            return (Criteria) this;
        }

        public Criteria andSpecNameEqualTo(String value) {
            addCriterion("spec_name =", value, "specName");
            return (Criteria) this;
        }

        public Criteria andSpecNameNotEqualTo(String value) {
            addCriterion("spec_name <>", value, "specName");
            return (Criteria) this;
        }

        public Criteria andSpecNameGreaterThan(String value) {
            addCriterion("spec_name >", value, "specName");
            return (Criteria) this;
        }

        public Criteria andSpecNameGreaterThanOrEqualTo(String value) {
            addCriterion("spec_name >=", value, "specName");
            return (Criteria) this;
        }

        public Criteria andSpecNameLessThan(String value) {
            addCriterion("spec_name <", value, "specName");
            return (Criteria) this;
        }

        public Criteria andSpecNameLessThanOrEqualTo(String value) {
            addCriterion("spec_name <=", value, "specName");
            return (Criteria) this;
        }

        public Criteria andSpecNameLike(String value) {
            addCriterion("spec_name like", value, "specName");
            return (Criteria) this;
        }

        public Criteria andSpecNameNotLike(String value) {
            addCriterion("spec_name not like", value, "specName");
            return (Criteria) this;
        }

        public Criteria andSpecNameIn(List<String> values) {
            addCriterion("spec_name in", values, "specName");
            return (Criteria) this;
        }

        public Criteria andSpecNameNotIn(List<String> values) {
            addCriterion("spec_name not in", values, "specName");
            return (Criteria) this;
        }

        public Criteria andSpecNameBetween(String value1, String value2) {
            addCriterion("spec_name between", value1, value2, "specName");
            return (Criteria) this;
        }

        public Criteria andSpecNameNotBetween(String value1, String value2) {
            addCriterion("spec_name not between", value1, value2, "specName");
            return (Criteria) this;
        }

        public Criteria andSpecDescriptionIsNull() {
            addCriterion("spec_description is null");
            return (Criteria) this;
        }

        public Criteria andSpecDescriptionIsNotNull() {
            addCriterion("spec_description is not null");
            return (Criteria) this;
        }

        public Criteria andSpecDescriptionEqualTo(String value) {
            addCriterion("spec_description =", value, "specDescription");
            return (Criteria) this;
        }

        public Criteria andSpecDescriptionNotEqualTo(String value) {
            addCriterion("spec_description <>", value, "specDescription");
            return (Criteria) this;
        }

        public Criteria andSpecDescriptionGreaterThan(String value) {
            addCriterion("spec_description >", value, "specDescription");
            return (Criteria) this;
        }

        public Criteria andSpecDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("spec_description >=", value, "specDescription");
            return (Criteria) this;
        }

        public Criteria andSpecDescriptionLessThan(String value) {
            addCriterion("spec_description <", value, "specDescription");
            return (Criteria) this;
        }

        public Criteria andSpecDescriptionLessThanOrEqualTo(String value) {
            addCriterion("spec_description <=", value, "specDescription");
            return (Criteria) this;
        }

        public Criteria andSpecDescriptionLike(String value) {
            addCriterion("spec_description like", value, "specDescription");
            return (Criteria) this;
        }

        public Criteria andSpecDescriptionNotLike(String value) {
            addCriterion("spec_description not like", value, "specDescription");
            return (Criteria) this;
        }

        public Criteria andSpecDescriptionIn(List<String> values) {
            addCriterion("spec_description in", values, "specDescription");
            return (Criteria) this;
        }

        public Criteria andSpecDescriptionNotIn(List<String> values) {
            addCriterion("spec_description not in", values, "specDescription");
            return (Criteria) this;
        }

        public Criteria andSpecDescriptionBetween(String value1, String value2) {
            addCriterion("spec_description between", value1, value2, "specDescription");
            return (Criteria) this;
        }

        public Criteria andSpecDescriptionNotBetween(String value1, String value2) {
            addCriterion("spec_description not between", value1, value2, "specDescription");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("update_date is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("update_date is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("update_date =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("update_date <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("update_date >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("update_date >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("update_date <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("update_date <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("update_date in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("update_date not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("update_date between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("update_date not between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNull() {
            addCriterion("is_delete is null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNotNull() {
            addCriterion("is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteEqualTo(Byte value) {
            addCriterion("is_delete =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(Byte value) {
            addCriterion("is_delete <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(Byte value) {
            addCriterion("is_delete >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_delete >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(Byte value) {
            addCriterion("is_delete <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(Byte value) {
            addCriterion("is_delete <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<Byte> values) {
            addCriterion("is_delete in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<Byte> values) {
            addCriterion("is_delete not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(Byte value1, Byte value2) {
            addCriterion("is_delete between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(Byte value1, Byte value2) {
            addCriterion("is_delete not between", value1, value2, "isDelete");
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
/*
 * This file is generated by jOOQ.
*/
package cn.vertxup.ix.domain.tables.records;


import cn.vertxup.ix.domain.tables.SResource;
import cn.vertxup.ix.domain.tables.interfaces.ISResource;

import java.time.LocalDateTime;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record15;
import org.jooq.Row15;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SResourceRecord extends UpdatableRecordImpl<SResourceRecord> implements Record15<String, String, String, String, String, String, String, Integer, LocalDateTime, String, String, String, String, Boolean, String>, ISResource {

    private static final long serialVersionUID = 1290533390;

    /**
     * Setter for <code>DB_ORIGIN_X.S_RESOURCE.KEY</code>. 「key」- 资源对应的ID
     */
    @Override
    public SResourceRecord setKey(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>DB_ORIGIN_X.S_RESOURCE.KEY</code>. 「key」- 资源对应的ID
     */
    @Override
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>DB_ORIGIN_X.S_RESOURCE.MODEL_ID</code>. 「modelId」- 资源对应的模型identifier
     */
    @Override
    public SResourceRecord setModelId(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>DB_ORIGIN_X.S_RESOURCE.MODEL_ID</code>. 「modelId」- 资源对应的模型identifier
     */
    @Override
    public String getModelId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>DB_ORIGIN_X.S_RESOURCE.MODEL_KEY</code>. 「modelKey」- 资源对应的单条记录ID
     */
    @Override
    public SResourceRecord setModelKey(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>DB_ORIGIN_X.S_RESOURCE.MODEL_KEY</code>. 「modelKey」- 资源对应的单条记录ID
     */
    @Override
    public String getModelKey() {
        return (String) get(2);
    }

    /**
     * Setter for <code>DB_ORIGIN_X.S_RESOURCE.CODE</code>. 「code」- 资源编号
     */
    @Override
    public SResourceRecord setCode(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>DB_ORIGIN_X.S_RESOURCE.CODE</code>. 「code」- 资源编号
     */
    @Override
    public String getCode() {
        return (String) get(3);
    }

    /**
     * Setter for <code>DB_ORIGIN_X.S_RESOURCE.CATEGORY</code>. 「category」- 资源分类
     */
    @Override
    public SResourceRecord setCategory(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>DB_ORIGIN_X.S_RESOURCE.CATEGORY</code>. 「category」- 资源分类
     */
    @Override
    public String getCategory() {
        return (String) get(4);
    }

    /**
     * Setter for <code>DB_ORIGIN_X.S_RESOURCE.PROJECTION</code>. 「projection」- 该资源的列定义
     */
    @Override
    public SResourceRecord setProjection(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>DB_ORIGIN_X.S_RESOURCE.PROJECTION</code>. 「projection」- 该资源的列定义
     */
    @Override
    public String getProjection() {
        return (String) get(5);
    }

    /**
     * Setter for <code>DB_ORIGIN_X.S_RESOURCE.QUERY</code>. 「query」- 该资源的行查询
     */
    @Override
    public SResourceRecord setQuery(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>DB_ORIGIN_X.S_RESOURCE.QUERY</code>. 「query」- 该资源的行查询
     */
    @Override
    public String getQuery() {
        return (String) get(6);
    }

    /**
     * Setter for <code>DB_ORIGIN_X.S_RESOURCE.LEVEL</code>. 「level」- 资源需求级别
     */
    @Override
    public SResourceRecord setLevel(Integer value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>DB_ORIGIN_X.S_RESOURCE.LEVEL</code>. 「level」- 资源需求级别
     */
    @Override
    public Integer getLevel() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>DB_ORIGIN_X.S_RESOURCE.EXPIRED</code>. 「expired」- 资源过期时间（动态授权）
     */
    @Override
    public SResourceRecord setExpired(LocalDateTime value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>DB_ORIGIN_X.S_RESOURCE.EXPIRED</code>. 「expired」- 资源过期时间（动态授权）
     */
    @Override
    public LocalDateTime getExpired() {
        return (LocalDateTime) get(8);
    }

    /**
     * Setter for <code>DB_ORIGIN_X.S_RESOURCE.API_KEY</code>. 「apiKey」- 访问该资源的入口API（一对一绑定）
     */
    @Override
    public SResourceRecord setApiKey(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>DB_ORIGIN_X.S_RESOURCE.API_KEY</code>. 「apiKey」- 访问该资源的入口API（一对一绑定）
     */
    @Override
    public String getApiKey() {
        return (String) get(9);
    }

    /**
     * Setter for <code>DB_ORIGIN_X.S_RESOURCE.TYPE</code>. 「type」- 该资源类型：USER / ROLE / UNIFORM
     */
    @Override
    public SResourceRecord setType(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>DB_ORIGIN_X.S_RESOURCE.TYPE</code>. 「type」- 该资源类型：USER / ROLE / UNIFORM
     */
    @Override
    public String getType() {
        return (String) get(10);
    }

    /**
     * Setter for <code>DB_ORIGIN_X.S_RESOURCE.APP_KEY</code>. 「appKey」- 所属APP的APPKEY
     */
    @Override
    public SResourceRecord setAppKey(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>DB_ORIGIN_X.S_RESOURCE.APP_KEY</code>. 「appKey」- 所属APP的APPKEY
     */
    @Override
    public String getAppKey() {
        return (String) get(11);
    }

    /**
     * Setter for <code>DB_ORIGIN_X.S_RESOURCE.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public SResourceRecord setLanguage(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>DB_ORIGIN_X.S_RESOURCE.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return (String) get(12);
    }

    /**
     * Setter for <code>DB_ORIGIN_X.S_RESOURCE.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public SResourceRecord setActive(Boolean value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>DB_ORIGIN_X.S_RESOURCE.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return (Boolean) get(13);
    }

    /**
     * Setter for <code>DB_ORIGIN_X.S_RESOURCE.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public SResourceRecord setMetadata(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>DB_ORIGIN_X.S_RESOURCE.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public String getMetadata() {
        return (String) get(14);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record15 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row15<String, String, String, String, String, String, String, Integer, LocalDateTime, String, String, String, String, Boolean, String> fieldsRow() {
        return (Row15) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row15<String, String, String, String, String, String, String, Integer, LocalDateTime, String, String, String, String, Boolean, String> valuesRow() {
        return (Row15) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return SResource.S_RESOURCE.KEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return SResource.S_RESOURCE.MODEL_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return SResource.S_RESOURCE.MODEL_KEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return SResource.S_RESOURCE.CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return SResource.S_RESOURCE.CATEGORY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return SResource.S_RESOURCE.PROJECTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return SResource.S_RESOURCE.QUERY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return SResource.S_RESOURCE.LEVEL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field9() {
        return SResource.S_RESOURCE.EXPIRED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return SResource.S_RESOURCE.API_KEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return SResource.S_RESOURCE.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return SResource.S_RESOURCE.APP_KEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return SResource.S_RESOURCE.LANGUAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field14() {
        return SResource.S_RESOURCE.ACTIVE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return SResource.S_RESOURCE.METADATA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getModelId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getModelKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getCategory();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getProjection();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getQuery();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component8() {
        return getLevel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component9() {
        return getExpired();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getApiKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getAppKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component13() {
        return getLanguage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component14() {
        return getActive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component15() {
        return getMetadata();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getModelId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getModelKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getCategory();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getProjection();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getQuery();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getLevel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value9() {
        return getExpired();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getApiKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getAppKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getLanguage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value14() {
        return getActive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getMetadata();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SResourceRecord value1(String value) {
        setKey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SResourceRecord value2(String value) {
        setModelId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SResourceRecord value3(String value) {
        setModelKey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SResourceRecord value4(String value) {
        setCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SResourceRecord value5(String value) {
        setCategory(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SResourceRecord value6(String value) {
        setProjection(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SResourceRecord value7(String value) {
        setQuery(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SResourceRecord value8(Integer value) {
        setLevel(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SResourceRecord value9(LocalDateTime value) {
        setExpired(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SResourceRecord value10(String value) {
        setApiKey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SResourceRecord value11(String value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SResourceRecord value12(String value) {
        setAppKey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SResourceRecord value13(String value) {
        setLanguage(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SResourceRecord value14(Boolean value) {
        setActive(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SResourceRecord value15(String value) {
        setMetadata(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SResourceRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7, Integer value8, LocalDateTime value9, String value10, String value11, String value12, String value13, Boolean value14, String value15) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(ISResource from) {
        setKey(from.getKey());
        setModelId(from.getModelId());
        setModelKey(from.getModelKey());
        setCode(from.getCode());
        setCategory(from.getCategory());
        setProjection(from.getProjection());
        setQuery(from.getQuery());
        setLevel(from.getLevel());
        setExpired(from.getExpired());
        setApiKey(from.getApiKey());
        setType(from.getType());
        setAppKey(from.getAppKey());
        setLanguage(from.getLanguage());
        setActive(from.getActive());
        setMetadata(from.getMetadata());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends ISResource> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SResourceRecord
     */
    public SResourceRecord() {
        super(SResource.S_RESOURCE);
    }

    /**
     * Create a detached, initialised SResourceRecord
     */
    public SResourceRecord(String key, String modelId, String modelKey, String code, String category, String projection, String query, Integer level, LocalDateTime expired, String apiKey, String type, String appKey, String language, Boolean active, String metadata) {
        super(SResource.S_RESOURCE);

        set(0, key);
        set(1, modelId);
        set(2, modelKey);
        set(3, code);
        set(4, category);
        set(5, projection);
        set(6, query);
        set(7, level);
        set(8, expired);
        set(9, apiKey);
        set(10, type);
        set(11, appKey);
        set(12, language);
        set(13, active);
        set(14, metadata);
    }
}

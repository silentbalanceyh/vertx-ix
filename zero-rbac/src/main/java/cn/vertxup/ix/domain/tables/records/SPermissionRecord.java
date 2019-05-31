/*
 * This file is generated by jOOQ.
*/
package cn.vertxup.ix.domain.tables.records;


import cn.vertxup.ix.domain.tables.SPermission;
import cn.vertxup.ix.domain.tables.interfaces.ISPermission;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
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
public class SPermissionRecord extends UpdatableRecordImpl<SPermissionRecord> implements Record9<String, String, String, String, String, String, String, Boolean, String>, ISPermission {

    private static final long serialVersionUID = -163138251;

    /**
     * Setter for <code>DB_ORIGIN_X.S_PERMISSION.KEY</code>. 「key」- 权限ID
     */
    @Override
    public SPermissionRecord setKey(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>DB_ORIGIN_X.S_PERMISSION.KEY</code>. 「key」- 权限ID
     */
    @Override
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>DB_ORIGIN_X.S_PERMISSION.NAME</code>. 「name」- 权限名称
     */
    @Override
    public SPermissionRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>DB_ORIGIN_X.S_PERMISSION.NAME</code>. 「name」- 权限名称
     */
    @Override
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>DB_ORIGIN_X.S_PERMISSION.CODE</code>. 「code」- 权限系统码
     */
    @Override
    public SPermissionRecord setCode(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>DB_ORIGIN_X.S_PERMISSION.CODE</code>. 「code」- 权限系统码
     */
    @Override
    public String getCode() {
        return (String) get(2);
    }

    /**
     * Setter for <code>DB_ORIGIN_X.S_PERMISSION.PRIORITY</code>. 「priority」- 权限优先级：角色优先、组优先、用户优先
     */
    @Override
    public SPermissionRecord setPriority(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>DB_ORIGIN_X.S_PERMISSION.PRIORITY</code>. 「priority」- 权限优先级：角色优先、组优先、用户优先
     */
    @Override
    public String getPriority() {
        return (String) get(3);
    }

    /**
     * Setter for <code>DB_ORIGIN_X.S_PERMISSION.MODE</code>. 「mode」- 继承、限制、时域、指定
     */
    @Override
    public SPermissionRecord setMode(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>DB_ORIGIN_X.S_PERMISSION.MODE</code>. 「mode」- 继承、限制、时域、指定
     */
    @Override
    public String getMode() {
        return (String) get(4);
    }

    /**
     * Setter for <code>DB_ORIGIN_X.S_PERMISSION.APP_KEY</code>. 「appKey」- 所属APP的APPKEY
     */
    @Override
    public SPermissionRecord setAppKey(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>DB_ORIGIN_X.S_PERMISSION.APP_KEY</code>. 「appKey」- 所属APP的APPKEY
     */
    @Override
    public String getAppKey() {
        return (String) get(5);
    }

    /**
     * Setter for <code>DB_ORIGIN_X.S_PERMISSION.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public SPermissionRecord setLanguage(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>DB_ORIGIN_X.S_PERMISSION.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return (String) get(6);
    }

    /**
     * Setter for <code>DB_ORIGIN_X.S_PERMISSION.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public SPermissionRecord setActive(Boolean value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>DB_ORIGIN_X.S_PERMISSION.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return (Boolean) get(7);
    }

    /**
     * Setter for <code>DB_ORIGIN_X.S_PERMISSION.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public SPermissionRecord setMetadata(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>DB_ORIGIN_X.S_PERMISSION.METADATA</code>. 「metadata」- 附加配置数据
     */
    @Override
    public String getMetadata() {
        return (String) get(8);
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
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<String, String, String, String, String, String, String, Boolean, String> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<String, String, String, String, String, String, String, Boolean, String> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return SPermission.S_PERMISSION.KEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return SPermission.S_PERMISSION.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return SPermission.S_PERMISSION.CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return SPermission.S_PERMISSION.PRIORITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return SPermission.S_PERMISSION.MODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return SPermission.S_PERMISSION.APP_KEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return SPermission.S_PERMISSION.LANGUAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field8() {
        return SPermission.S_PERMISSION.ACTIVE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return SPermission.S_PERMISSION.METADATA;
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
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getPriority();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getMode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getAppKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getLanguage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component8() {
        return getActive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
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
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getPriority();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getMode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getAppKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getLanguage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value8() {
        return getActive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getMetadata();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SPermissionRecord value1(String value) {
        setKey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SPermissionRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SPermissionRecord value3(String value) {
        setCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SPermissionRecord value4(String value) {
        setPriority(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SPermissionRecord value5(String value) {
        setMode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SPermissionRecord value6(String value) {
        setAppKey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SPermissionRecord value7(String value) {
        setLanguage(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SPermissionRecord value8(Boolean value) {
        setActive(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SPermissionRecord value9(String value) {
        setMetadata(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SPermissionRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7, Boolean value8, String value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(ISPermission from) {
        setKey(from.getKey());
        setName(from.getName());
        setCode(from.getCode());
        setPriority(from.getPriority());
        setMode(from.getMode());
        setAppKey(from.getAppKey());
        setLanguage(from.getLanguage());
        setActive(from.getActive());
        setMetadata(from.getMetadata());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends ISPermission> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SPermissionRecord
     */
    public SPermissionRecord() {
        super(SPermission.S_PERMISSION);
    }

    /**
     * Create a detached, initialised SPermissionRecord
     */
    public SPermissionRecord(String key, String name, String code, String priority, String mode, String appKey, String language, Boolean active, String metadata) {
        super(SPermission.S_PERMISSION);

        set(0, key);
        set(1, name);
        set(2, code);
        set(3, priority);
        set(4, mode);
        set(5, appKey);
        set(6, language);
        set(7, active);
        set(8, metadata);
    }
}
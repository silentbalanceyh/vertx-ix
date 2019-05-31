/*
 * This file is generated by jOOQ.
*/
package cn.vertxup.ix.domain.tables;


import cn.vertxup.ix.domain.DbOriginX;
import cn.vertxup.ix.domain.Indexes;
import cn.vertxup.ix.domain.Keys;
import cn.vertxup.ix.domain.tables.records.XSourceRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class XSource extends TableImpl<XSourceRecord> {

    private static final long serialVersionUID = 810553028;

    /**
     * The reference instance of <code>DB_ORIGIN_X.X_SOURCE</code>
     */
    public static final XSource X_SOURCE = new XSource();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<XSourceRecord> getRecordType() {
        return XSourceRecord.class;
    }

    /**
     * The column <code>DB_ORIGIN_X.X_SOURCE.KEY</code>. 「key」- 数据源主键
     */
    public final TableField<XSourceRecord, String> KEY = createField("KEY", org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "「key」- 数据源主键");

    /**
     * The column <code>DB_ORIGIN_X.X_SOURCE.IP_V4</code>. 「ipV4」- IP v4地址
     */
    public final TableField<XSourceRecord, String> IP_V4 = createField("IP_V4", org.jooq.impl.SQLDataType.VARCHAR(15), this, "「ipV4」- IP v4地址");

    /**
     * The column <code>DB_ORIGIN_X.X_SOURCE.IP_V6</code>. 「ipV6」- IP v6地址
     */
    public final TableField<XSourceRecord, String> IP_V6 = createField("IP_V6", org.jooq.impl.SQLDataType.VARCHAR(40), this, "「ipV6」- IP v6地址");

    /**
     * The column <code>DB_ORIGIN_X.X_SOURCE.HOSTNAME</code>. 「hostname」- 主机地址
     */
    public final TableField<XSourceRecord, String> HOSTNAME = createField("HOSTNAME", org.jooq.impl.SQLDataType.VARCHAR(255), this, "「hostname」- 主机地址");

    /**
     * The column <code>DB_ORIGIN_X.X_SOURCE.PORT</code>. 「port」- 端口号
     */
    public final TableField<XSourceRecord, Integer> PORT = createField("PORT", org.jooq.impl.SQLDataType.INTEGER, this, "「port」- 端口号");

    /**
     * The column <code>DB_ORIGIN_X.X_SOURCE.CATEGORY</code>. 「category」- 数据库类型
     */
    public final TableField<XSourceRecord, String> CATEGORY = createField("CATEGORY", org.jooq.impl.SQLDataType.VARCHAR(32), this, "「category」- 数据库类型");

    /**
     * The column <code>DB_ORIGIN_X.X_SOURCE.JDBC_URL</code>. 「jdbcUrl」- JDBC连接字符串
     */
    public final TableField<XSourceRecord, String> JDBC_URL = createField("JDBC_URL", org.jooq.impl.SQLDataType.VARCHAR(1024), this, "「jdbcUrl」- JDBC连接字符串");

    /**
     * The column <code>DB_ORIGIN_X.X_SOURCE.JDBC_CONFIG</code>. 「jdbcConfig」- 连接字符串中的配置key=value
     */
    public final TableField<XSourceRecord, String> JDBC_CONFIG = createField("JDBC_CONFIG", org.jooq.impl.SQLDataType.CLOB, this, "「jdbcConfig」- 连接字符串中的配置key=value");

    /**
     * The column <code>DB_ORIGIN_X.X_SOURCE.INSTANCE</code>. 「instance」- 实例名称
     */
    public final TableField<XSourceRecord, String> INSTANCE = createField("INSTANCE", org.jooq.impl.SQLDataType.VARCHAR(255), this, "「instance」- 实例名称");

    /**
     * The column <code>DB_ORIGIN_X.X_SOURCE.USERNAME</code>. 「username」- 账号
     */
    public final TableField<XSourceRecord, String> USERNAME = createField("USERNAME", org.jooq.impl.SQLDataType.VARCHAR(255), this, "「username」- 账号");

    /**
     * The column <code>DB_ORIGIN_X.X_SOURCE.PASSWORD</code>. 「password」- 密码
     */
    public final TableField<XSourceRecord, String> PASSWORD = createField("PASSWORD", org.jooq.impl.SQLDataType.VARCHAR(255), this, "「password」- 密码");

    /**
     * The column <code>DB_ORIGIN_X.X_SOURCE.ACTIVE</code>. 「active」- 是否启用
     */
    public final TableField<XSourceRecord, Boolean> ACTIVE = createField("ACTIVE", org.jooq.impl.SQLDataType.BIT, this, "「active」- 是否启用");

    /**
     * The column <code>DB_ORIGIN_X.X_SOURCE.METADATA</code>. 「metadata」- 通过MetadataConnection分析读取的数据
     */
    public final TableField<XSourceRecord, String> METADATA = createField("METADATA", org.jooq.impl.SQLDataType.CLOB, this, "「metadata」- 通过MetadataConnection分析读取的数据");

    /**
     * The column <code>DB_ORIGIN_X.X_SOURCE.LANGUAGE</code>. 「language」- 使用的语言
     */
    public final TableField<XSourceRecord, String> LANGUAGE = createField("LANGUAGE", org.jooq.impl.SQLDataType.VARCHAR(10), this, "「language」- 使用的语言");

    /**
     * The column <code>DB_ORIGIN_X.X_SOURCE.APP_ID</code>. 「appId」- 关联的应用程序ID
     */
    public final TableField<XSourceRecord, String> APP_ID = createField("APP_ID", org.jooq.impl.SQLDataType.VARCHAR(255), this, "「appId」- 关联的应用程序ID");

    /**
     * Create a <code>DB_ORIGIN_X.X_SOURCE</code> table reference
     */
    public XSource() {
        this(DSL.name("X_SOURCE"), null);
    }

    /**
     * Create an aliased <code>DB_ORIGIN_X.X_SOURCE</code> table reference
     */
    public XSource(String alias) {
        this(DSL.name(alias), X_SOURCE);
    }

    /**
     * Create an aliased <code>DB_ORIGIN_X.X_SOURCE</code> table reference
     */
    public XSource(Name alias) {
        this(alias, X_SOURCE);
    }

    private XSource(Name alias, Table<XSourceRecord> aliased) {
        this(alias, aliased, null);
    }

    private XSource(Name alias, Table<XSourceRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return DbOriginX.DB_ORIGIN_X;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.X_SOURCE_APP_ID, Indexes.X_SOURCE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<XSourceRecord> getPrimaryKey() {
        return Keys.KEY_X_SOURCE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<XSourceRecord>> getKeys() {
        return Arrays.<UniqueKey<XSourceRecord>>asList(Keys.KEY_X_SOURCE_PRIMARY, Keys.KEY_X_SOURCE_APP_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public XSource as(String alias) {
        return new XSource(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public XSource as(Name alias) {
        return new XSource(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public XSource rename(String name) {
        return new XSource(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public XSource rename(Name name) {
        return new XSource(name, null);
    }
}
/*
 * This file is generated by jOOQ.
*/
package cn.vertxup.ix.domain.tables;


import cn.vertxup.ix.domain.DbOriginX;
import cn.vertxup.ix.domain.Indexes;
import cn.vertxup.ix.domain.Keys;
import cn.vertxup.ix.domain.tables.records.XAppRecord;

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
public class XApp extends TableImpl<XAppRecord> {

    private static final long serialVersionUID = 1082438190;

    /**
     * The reference instance of <code>DB_ORIGIN_X.X_APP</code>
     */
    public static final XApp X_APP = new XApp();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<XAppRecord> getRecordType() {
        return XAppRecord.class;
    }

    /**
     * The column <code>DB_ORIGIN_X.X_APP.KEY</code>. 「key」- 应用程序主键
     */
    public final TableField<XAppRecord, String> KEY = createField("KEY", org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "「key」- 应用程序主键");

    /**
     * The column <code>DB_ORIGIN_X.X_APP.NAME</code>. 「name」- 应用程序名称
     */
    public final TableField<XAppRecord, String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR(255), this, "「name」- 应用程序名称");

    /**
     * The column <code>DB_ORIGIN_X.X_APP.CODE</code>. 「code」- 应用程序编码
     */
    public final TableField<XAppRecord, String> CODE = createField("CODE", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「code」- 应用程序编码");

    /**
     * The column <code>DB_ORIGIN_X.X_APP.TITLE</code>. 「title」- 应用程序标题
     */
    public final TableField<XAppRecord, String> TITLE = createField("TITLE", org.jooq.impl.SQLDataType.VARCHAR(64), this, "「title」- 应用程序标题");

    /**
     * The column <code>DB_ORIGIN_X.X_APP.LOGO</code>. 「logo」- 应用程序图标
     */
    public final TableField<XAppRecord, String> LOGO = createField("LOGO", org.jooq.impl.SQLDataType.VARCHAR(255), this, "「logo」- 应用程序图标");

    /**
     * The column <code>DB_ORIGIN_X.X_APP.DOMAIN</code>. 「domain」- 应用程序所在域
     */
    public final TableField<XAppRecord, String> DOMAIN = createField("DOMAIN", org.jooq.impl.SQLDataType.VARCHAR(255), this, "「domain」- 应用程序所在域");

    /**
     * The column <code>DB_ORIGIN_X.X_APP.PATH</code>. 「path」- 应用程序路径
     */
    public final TableField<XAppRecord, String> PATH = createField("PATH", org.jooq.impl.SQLDataType.VARCHAR(255), this, "「path」- 应用程序路径");

    /**
     * The column <code>DB_ORIGIN_X.X_APP.ROUTE</code>. 「route」- 后端API的根路径，启动时需要
     */
    public final TableField<XAppRecord, String> ROUTE = createField("ROUTE", org.jooq.impl.SQLDataType.VARCHAR(255), this, "「route」- 后端API的根路径，启动时需要");

    /**
     * The column <code>DB_ORIGIN_X.X_APP.APP_KEY</code>. 「appKey」- 应用程序专用唯一hashKey
     */
    public final TableField<XAppRecord, String> APP_KEY = createField("APP_KEY", org.jooq.impl.SQLDataType.VARCHAR(128), this, "「appKey」- 应用程序专用唯一hashKey");

    /**
     * The column <code>DB_ORIGIN_X.X_APP.APP_PORT</code>. 「appPort」- 应用程序端口号，和SOURCE的端口号区别开
     */
    public final TableField<XAppRecord, Integer> APP_PORT = createField("APP_PORT", org.jooq.impl.SQLDataType.INTEGER, this, "「appPort」- 应用程序端口号，和SOURCE的端口号区别开");

    /**
     * The column <code>DB_ORIGIN_X.X_APP.URL_ENTRY</code>. 「urlEntry」— 应用程序入口页面（登录页）
     */
    public final TableField<XAppRecord, String> URL_ENTRY = createField("URL_ENTRY", org.jooq.impl.SQLDataType.VARCHAR(255), this, "「urlEntry」— 应用程序入口页面（登录页）");

    /**
     * The column <code>DB_ORIGIN_X.X_APP.URL_MAIN</code>. 「urlMain」- 应用程序内置主页（带安全）
     */
    public final TableField<XAppRecord, String> URL_MAIN = createField("URL_MAIN", org.jooq.impl.SQLDataType.VARCHAR(255), this, "「urlMain」- 应用程序内置主页（带安全）");

    /**
     * The column <code>DB_ORIGIN_X.X_APP.ACTIVE</code>. 「active」- 是否启用
     */
    public final TableField<XAppRecord, Boolean> ACTIVE = createField("ACTIVE", org.jooq.impl.SQLDataType.BIT, this, "「active」- 是否启用");

    /**
     * The column <code>DB_ORIGIN_X.X_APP.LANGUAGE</code>. 「language」- 使用的语言
     */
    public final TableField<XAppRecord, String> LANGUAGE = createField("LANGUAGE", org.jooq.impl.SQLDataType.VARCHAR(10), this, "「language」- 使用的语言");

    /**
     * The column <code>DB_ORIGIN_X.X_APP.METADATA</code>. 「metadata」- 附加配置数据
     */
    public final TableField<XAppRecord, String> METADATA = createField("METADATA", org.jooq.impl.SQLDataType.CLOB, this, "「metadata」- 附加配置数据");

    /**
     * Create a <code>DB_ORIGIN_X.X_APP</code> table reference
     */
    public XApp() {
        this(DSL.name("X_APP"), null);
    }

    /**
     * Create an aliased <code>DB_ORIGIN_X.X_APP</code> table reference
     */
    public XApp(String alias) {
        this(DSL.name(alias), X_APP);
    }

    /**
     * Create an aliased <code>DB_ORIGIN_X.X_APP</code> table reference
     */
    public XApp(Name alias) {
        this(alias, X_APP);
    }

    private XApp(Name alias, Table<XAppRecord> aliased) {
        this(alias, aliased, null);
    }

    private XApp(Name alias, Table<XAppRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.X_APP_CODE, Indexes.X_APP_NAME, Indexes.X_APP_PATH, Indexes.X_APP_PATH_2, Indexes.X_APP_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<XAppRecord> getPrimaryKey() {
        return Keys.KEY_X_APP_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<XAppRecord>> getKeys() {
        return Arrays.<UniqueKey<XAppRecord>>asList(Keys.KEY_X_APP_PRIMARY, Keys.KEY_X_APP_NAME, Keys.KEY_X_APP_CODE, Keys.KEY_X_APP_PATH, Keys.KEY_X_APP_PATH_2);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public XApp as(String alias) {
        return new XApp(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public XApp as(Name alias) {
        return new XApp(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public XApp rename(String name) {
        return new XApp(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public XApp rename(Name name) {
        return new XApp(name, null);
    }
}

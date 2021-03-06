/*
 * This file is generated by jOOQ.
*/
package cn.vertxup.ix.domain.tables;


import cn.vertxup.ix.domain.DbOriginX;
import cn.vertxup.ix.domain.Indexes;
import cn.vertxup.ix.domain.Keys;
import cn.vertxup.ix.domain.tables.records.SRoleRecord;

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
public class SRole extends TableImpl<SRoleRecord> {

    private static final long serialVersionUID = 1773325185;

    /**
     * The reference instance of <code>DB_ORIGIN_X.S_ROLE</code>
     */
    public static final SRole S_ROLE = new SRole();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SRoleRecord> getRecordType() {
        return SRoleRecord.class;
    }

    /**
     * The column <code>DB_ORIGIN_X.S_ROLE.KEY</code>. 「key」- 角色ID
     */
    public final TableField<SRoleRecord, String> KEY = createField("KEY", org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "「key」- 角色ID");

    /**
     * The column <code>DB_ORIGIN_X.S_ROLE.NAME</code>. 「name」- 角色名称
     */
    public final TableField<SRoleRecord, String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR(255), this, "「name」- 角色名称");

    /**
     * The column <code>DB_ORIGIN_X.S_ROLE.CODE</code>. 「code」- 角色系统名
     */
    public final TableField<SRoleRecord, String> CODE = createField("CODE", org.jooq.impl.SQLDataType.VARCHAR(255), this, "「code」- 角色系统名");

    /**
     * The column <code>DB_ORIGIN_X.S_ROLE.SUPER</code>. 「super」- 是否具有定制权限？
     */
    public final TableField<SRoleRecord, Boolean> SUPER = createField("SUPER", org.jooq.impl.SQLDataType.BIT, this, "「super」- 是否具有定制权限？");

    /**
     * The column <code>DB_ORIGIN_X.S_ROLE.COMMENT</code>. 「comment」- 角色备注信息
     */
    public final TableField<SRoleRecord, String> COMMENT = createField("COMMENT", org.jooq.impl.SQLDataType.CLOB, this, "「comment」- 角色备注信息");

    /**
     * The column <code>DB_ORIGIN_X.S_ROLE.APP_KEY</code>. 「appKey」- 所属APP的APPKEY
     */
    public final TableField<SRoleRecord, String> APP_KEY = createField("APP_KEY", org.jooq.impl.SQLDataType.VARCHAR(128), this, "「appKey」- 所属APP的APPKEY");

    /**
     * The column <code>DB_ORIGIN_X.S_ROLE.LANGUAGE</code>. 「language」- 使用的语言
     */
    public final TableField<SRoleRecord, String> LANGUAGE = createField("LANGUAGE", org.jooq.impl.SQLDataType.VARCHAR(10), this, "「language」- 使用的语言");

    /**
     * The column <code>DB_ORIGIN_X.S_ROLE.ACTIVE</code>. 「active」- 是否启用
     */
    public final TableField<SRoleRecord, Boolean> ACTIVE = createField("ACTIVE", org.jooq.impl.SQLDataType.BIT, this, "「active」- 是否启用");

    /**
     * The column <code>DB_ORIGIN_X.S_ROLE.METADATA</code>. 「metadata」- 附加配置数据
     */
    public final TableField<SRoleRecord, String> METADATA = createField("METADATA", org.jooq.impl.SQLDataType.CLOB, this, "「metadata」- 附加配置数据");

    /**
     * Create a <code>DB_ORIGIN_X.S_ROLE</code> table reference
     */
    public SRole() {
        this(DSL.name("S_ROLE"), null);
    }

    /**
     * Create an aliased <code>DB_ORIGIN_X.S_ROLE</code> table reference
     */
    public SRole(String alias) {
        this(DSL.name(alias), S_ROLE);
    }

    /**
     * Create an aliased <code>DB_ORIGIN_X.S_ROLE</code> table reference
     */
    public SRole(Name alias) {
        this(alias, S_ROLE);
    }

    private SRole(Name alias, Table<SRoleRecord> aliased) {
        this(alias, aliased, null);
    }

    private SRole(Name alias, Table<SRoleRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.S_ROLE_CODE, Indexes.S_ROLE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<SRoleRecord> getPrimaryKey() {
        return Keys.KEY_S_ROLE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SRoleRecord>> getKeys() {
        return Arrays.<UniqueKey<SRoleRecord>>asList(Keys.KEY_S_ROLE_PRIMARY, Keys.KEY_S_ROLE_CODE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SRole as(String alias) {
        return new SRole(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SRole as(Name alias) {
        return new SRole(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SRole rename(String name) {
        return new SRole(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SRole rename(Name name) {
        return new SRole(name, null);
    }
}

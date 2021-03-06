/*
 * This file is generated by jOOQ.
*/
package cn.vertxup.ix.domain.tables;


import cn.vertxup.ix.domain.DbOriginX;
import cn.vertxup.ix.domain.Indexes;
import cn.vertxup.ix.domain.Keys;
import cn.vertxup.ix.domain.tables.records.SRelRolePermRecord;

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
public class SRelRolePerm extends TableImpl<SRelRolePermRecord> {

    private static final long serialVersionUID = -1521947528;

    /**
     * The reference instance of <code>DB_ORIGIN_X.S_REL_ROLE_PERM</code>
     */
    public static final SRelRolePerm S_REL_ROLE_PERM = new SRelRolePerm();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SRelRolePermRecord> getRecordType() {
        return SRelRolePermRecord.class;
    }

    /**
     * The column <code>DB_ORIGIN_X.S_REL_ROLE_PERM.PERM_ID</code>. 「permId」- 关联权限ID
     */
    public final TableField<SRelRolePermRecord, String> PERM_ID = createField("PERM_ID", org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "「permId」- 关联权限ID");

    /**
     * The column <code>DB_ORIGIN_X.S_REL_ROLE_PERM.ROLE_ID</code>. 「roleId」- 关联角色ID
     */
    public final TableField<SRelRolePermRecord, String> ROLE_ID = createField("ROLE_ID", org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "「roleId」- 关联角色ID");

    /**
     * Create a <code>DB_ORIGIN_X.S_REL_ROLE_PERM</code> table reference
     */
    public SRelRolePerm() {
        this(DSL.name("S_REL_ROLE_PERM"), null);
    }

    /**
     * Create an aliased <code>DB_ORIGIN_X.S_REL_ROLE_PERM</code> table reference
     */
    public SRelRolePerm(String alias) {
        this(DSL.name(alias), S_REL_ROLE_PERM);
    }

    /**
     * Create an aliased <code>DB_ORIGIN_X.S_REL_ROLE_PERM</code> table reference
     */
    public SRelRolePerm(Name alias) {
        this(alias, S_REL_ROLE_PERM);
    }

    private SRelRolePerm(Name alias, Table<SRelRolePermRecord> aliased) {
        this(alias, aliased, null);
    }

    private SRelRolePerm(Name alias, Table<SRelRolePermRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.S_REL_ROLE_PERM_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<SRelRolePermRecord> getPrimaryKey() {
        return Keys.KEY_S_REL_ROLE_PERM_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SRelRolePermRecord>> getKeys() {
        return Arrays.<UniqueKey<SRelRolePermRecord>>asList(Keys.KEY_S_REL_ROLE_PERM_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SRelRolePerm as(String alias) {
        return new SRelRolePerm(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SRelRolePerm as(Name alias) {
        return new SRelRolePerm(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SRelRolePerm rename(String name) {
        return new SRelRolePerm(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SRelRolePerm rename(Name name) {
        return new SRelRolePerm(name, null);
    }
}

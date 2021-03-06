/*
 * This file is generated by jOOQ.
*/
package cn.vertxup.ix.domain.tables;


import cn.vertxup.ix.domain.DbOriginX;
import cn.vertxup.ix.domain.Indexes;
import cn.vertxup.ix.domain.Keys;
import cn.vertxup.ix.domain.tables.records.SRelUserRoleRecord;

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
public class SRelUserRole extends TableImpl<SRelUserRoleRecord> {

    private static final long serialVersionUID = -1451237599;

    /**
     * The reference instance of <code>DB_ORIGIN_X.S_REL_USER_ROLE</code>
     */
    public static final SRelUserRole S_REL_USER_ROLE = new SRelUserRole();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SRelUserRoleRecord> getRecordType() {
        return SRelUserRoleRecord.class;
    }

    /**
     * The column <code>DB_ORIGIN_X.S_REL_USER_ROLE.USER_ID</code>. 「userId」- 关联用户ID
     */
    public final TableField<SRelUserRoleRecord, String> USER_ID = createField("USER_ID", org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "「userId」- 关联用户ID");

    /**
     * The column <code>DB_ORIGIN_X.S_REL_USER_ROLE.ROLE_ID</code>. 「roleId」- 关联角色ID
     */
    public final TableField<SRelUserRoleRecord, String> ROLE_ID = createField("ROLE_ID", org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "「roleId」- 关联角色ID");

    /**
     * Create a <code>DB_ORIGIN_X.S_REL_USER_ROLE</code> table reference
     */
    public SRelUserRole() {
        this(DSL.name("S_REL_USER_ROLE"), null);
    }

    /**
     * Create an aliased <code>DB_ORIGIN_X.S_REL_USER_ROLE</code> table reference
     */
    public SRelUserRole(String alias) {
        this(DSL.name(alias), S_REL_USER_ROLE);
    }

    /**
     * Create an aliased <code>DB_ORIGIN_X.S_REL_USER_ROLE</code> table reference
     */
    public SRelUserRole(Name alias) {
        this(alias, S_REL_USER_ROLE);
    }

    private SRelUserRole(Name alias, Table<SRelUserRoleRecord> aliased) {
        this(alias, aliased, null);
    }

    private SRelUserRole(Name alias, Table<SRelUserRoleRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.S_REL_USER_ROLE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<SRelUserRoleRecord> getPrimaryKey() {
        return Keys.KEY_S_REL_USER_ROLE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SRelUserRoleRecord>> getKeys() {
        return Arrays.<UniqueKey<SRelUserRoleRecord>>asList(Keys.KEY_S_REL_USER_ROLE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SRelUserRole as(String alias) {
        return new SRelUserRole(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SRelUserRole as(Name alias) {
        return new SRelUserRole(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SRelUserRole rename(String name) {
        return new SRelUserRole(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SRelUserRole rename(Name name) {
        return new SRelUserRole(name, null);
    }
}

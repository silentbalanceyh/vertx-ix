/*
 * This file is generated by jOOQ.
*/
package cn.vertxup.ix.domain.tables;


import cn.vertxup.ix.domain.DbOriginX;
import cn.vertxup.ix.domain.Indexes;
import cn.vertxup.ix.domain.Keys;
import cn.vertxup.ix.domain.tables.records.SRelPermActionRecord;

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
public class SRelPermAction extends TableImpl<SRelPermActionRecord> {

    private static final long serialVersionUID = 1650475088;

    /**
     * The reference instance of <code>DB_ORIGIN_X.S_REL_PERM_ACTION</code>
     */
    public static final SRelPermAction S_REL_PERM_ACTION = new SRelPermAction();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SRelPermActionRecord> getRecordType() {
        return SRelPermActionRecord.class;
    }

    /**
     * The column <code>DB_ORIGIN_X.S_REL_PERM_ACTION.PERM_ID</code>. 「permId」- 关联权限ID
     */
    public final TableField<SRelPermActionRecord, String> PERM_ID = createField("PERM_ID", org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "「permId」- 关联权限ID");

    /**
     * The column <code>DB_ORIGIN_X.S_REL_PERM_ACTION.ACTION_ID</code>. 「actionId」- 操作ID
     */
    public final TableField<SRelPermActionRecord, String> ACTION_ID = createField("ACTION_ID", org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "「actionId」- 操作ID");

    /**
     * Create a <code>DB_ORIGIN_X.S_REL_PERM_ACTION</code> table reference
     */
    public SRelPermAction() {
        this(DSL.name("S_REL_PERM_ACTION"), null);
    }

    /**
     * Create an aliased <code>DB_ORIGIN_X.S_REL_PERM_ACTION</code> table reference
     */
    public SRelPermAction(String alias) {
        this(DSL.name(alias), S_REL_PERM_ACTION);
    }

    /**
     * Create an aliased <code>DB_ORIGIN_X.S_REL_PERM_ACTION</code> table reference
     */
    public SRelPermAction(Name alias) {
        this(alias, S_REL_PERM_ACTION);
    }

    private SRelPermAction(Name alias, Table<SRelPermActionRecord> aliased) {
        this(alias, aliased, null);
    }

    private SRelPermAction(Name alias, Table<SRelPermActionRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.S_REL_PERM_ACTION_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<SRelPermActionRecord> getPrimaryKey() {
        return Keys.KEY_S_REL_PERM_ACTION_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SRelPermActionRecord>> getKeys() {
        return Arrays.<UniqueKey<SRelPermActionRecord>>asList(Keys.KEY_S_REL_PERM_ACTION_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SRelPermAction as(String alias) {
        return new SRelPermAction(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SRelPermAction as(Name alias) {
        return new SRelPermAction(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SRelPermAction rename(String name) {
        return new SRelPermAction(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SRelPermAction rename(Name name) {
        return new SRelPermAction(name, null);
    }
}

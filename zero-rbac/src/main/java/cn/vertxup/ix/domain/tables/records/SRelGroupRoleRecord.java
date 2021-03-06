/*
 * This file is generated by jOOQ.
*/
package cn.vertxup.ix.domain.tables.records;


import cn.vertxup.ix.domain.tables.SRelGroupRole;
import cn.vertxup.ix.domain.tables.interfaces.ISRelGroupRole;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
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
public class SRelGroupRoleRecord extends UpdatableRecordImpl<SRelGroupRoleRecord> implements Record2<String, String>, ISRelGroupRole {

    private static final long serialVersionUID = -486170013;

    /**
     * Setter for <code>DB_ORIGIN_X.S_REL_GROUP_ROLE.GROUP_ID</code>. 「groupId」- 关联组ID
     */
    @Override
    public SRelGroupRoleRecord setGroupId(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>DB_ORIGIN_X.S_REL_GROUP_ROLE.GROUP_ID</code>. 「groupId」- 关联组ID
     */
    @Override
    public String getGroupId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>DB_ORIGIN_X.S_REL_GROUP_ROLE.ROLE_ID</code>. 「roleId」- 关联角色ID
     */
    @Override
    public SRelGroupRoleRecord setRoleId(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>DB_ORIGIN_X.S_REL_GROUP_ROLE.ROLE_ID</code>. 「roleId」- 关联角色ID
     */
    @Override
    public String getRoleId() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record2<String, String> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<String, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<String, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return SRelGroupRole.S_REL_GROUP_ROLE.GROUP_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return SRelGroupRole.S_REL_GROUP_ROLE.ROLE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getGroupId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getRoleId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getGroupId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getRoleId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SRelGroupRoleRecord value1(String value) {
        setGroupId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SRelGroupRoleRecord value2(String value) {
        setRoleId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SRelGroupRoleRecord values(String value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(ISRelGroupRole from) {
        setGroupId(from.getGroupId());
        setRoleId(from.getRoleId());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends ISRelGroupRole> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SRelGroupRoleRecord
     */
    public SRelGroupRoleRecord() {
        super(SRelGroupRole.S_REL_GROUP_ROLE);
    }

    /**
     * Create a detached, initialised SRelGroupRoleRecord
     */
    public SRelGroupRoleRecord(String groupId, String roleId) {
        super(SRelGroupRole.S_REL_GROUP_ROLE);

        set(0, groupId);
        set(1, roleId);
    }
}

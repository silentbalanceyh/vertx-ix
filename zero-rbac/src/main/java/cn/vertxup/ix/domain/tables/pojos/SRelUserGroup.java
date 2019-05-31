/*
 * This file is generated by jOOQ.
*/
package cn.vertxup.ix.domain.tables.pojos;


import cn.vertxup.ix.domain.tables.interfaces.ISRelUserGroup;

import javax.annotation.Generated;


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
public class SRelUserGroup implements ISRelUserGroup {

    private static final long serialVersionUID = 1148682810;

    private String groupId;
    private String roleId;

    public SRelUserGroup() {}

    public SRelUserGroup(SRelUserGroup value) {
        this.groupId = value.groupId;
        this.roleId = value.roleId;
    }

    public SRelUserGroup(
        String groupId,
        String roleId
    ) {
        this.groupId = groupId;
        this.roleId = roleId;
    }

    @Override
    public String getGroupId() {
        return this.groupId;
    }

    @Override
    public SRelUserGroup setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    @Override
    public String getRoleId() {
        return this.roleId;
    }

    @Override
    public SRelUserGroup setRoleId(String roleId) {
        this.roleId = roleId;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("SRelUserGroup (");

        sb.append(groupId);
        sb.append(", ").append(roleId);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(ISRelUserGroup from) {
        setGroupId(from.getGroupId());
        setRoleId(from.getRoleId());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends ISRelUserGroup> E into(E into) {
        into.from(this);
        return into;
    }

    public SRelUserGroup(io.vertx.core.json.JsonObject json) {
        fromJson(json);
    }
}

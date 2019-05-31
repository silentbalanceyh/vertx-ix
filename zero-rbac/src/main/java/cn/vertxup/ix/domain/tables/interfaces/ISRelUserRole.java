/*
 * This file is generated by jOOQ.
*/
package cn.vertxup.ix.domain.tables.interfaces;


import java.io.Serializable;

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
public interface ISRelUserRole extends Serializable {

    /**
     * Setter for <code>DB_ORIGIN_X.S_REL_USER_ROLE.USER_ID</code>. 「userId」- 关联用户ID
     */
    public ISRelUserRole setUserId(String value);

    /**
     * Getter for <code>DB_ORIGIN_X.S_REL_USER_ROLE.USER_ID</code>. 「userId」- 关联用户ID
     */
    public String getUserId();

    /**
     * Setter for <code>DB_ORIGIN_X.S_REL_USER_ROLE.ROLE_ID</code>. 「roleId」- 关联角色ID
     */
    public ISRelUserRole setRoleId(String value);

    /**
     * Getter for <code>DB_ORIGIN_X.S_REL_USER_ROLE.ROLE_ID</code>. 「roleId」- 关联角色ID
     */
    public String getRoleId();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface ISRelUserRole
     */
    public void from(cn.vertxup.ix.domain.tables.interfaces.ISRelUserRole from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface ISRelUserRole
     */
    public <E extends cn.vertxup.ix.domain.tables.interfaces.ISRelUserRole> E into(E into);

    default ISRelUserRole fromJson(io.vertx.core.json.JsonObject json) {
        setUserId(json.getString("USER_ID"));
        setRoleId(json.getString("ROLE_ID"));
        return this;
    }


    default io.vertx.core.json.JsonObject toJson() {
        io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
        json.put("USER_ID",getUserId());
        json.put("ROLE_ID",getRoleId());
        return json;
    }

}
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
public interface ISRelPermAction extends Serializable {

    /**
     * Setter for <code>DB_ORIGIN_X.S_REL_PERM_ACTION.PERM_ID</code>. 「permId」- 关联权限ID
     */
    public ISRelPermAction setPermId(String value);

    /**
     * Getter for <code>DB_ORIGIN_X.S_REL_PERM_ACTION.PERM_ID</code>. 「permId」- 关联权限ID
     */
    public String getPermId();

    /**
     * Setter for <code>DB_ORIGIN_X.S_REL_PERM_ACTION.ACTION_ID</code>. 「actionId」- 操作ID
     */
    public ISRelPermAction setActionId(String value);

    /**
     * Getter for <code>DB_ORIGIN_X.S_REL_PERM_ACTION.ACTION_ID</code>. 「actionId」- 操作ID
     */
    public String getActionId();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface ISRelPermAction
     */
    public void from(cn.vertxup.ix.domain.tables.interfaces.ISRelPermAction from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface ISRelPermAction
     */
    public <E extends cn.vertxup.ix.domain.tables.interfaces.ISRelPermAction> E into(E into);

    default ISRelPermAction fromJson(io.vertx.core.json.JsonObject json) {
        setPermId(json.getString("PERM_ID"));
        setActionId(json.getString("ACTION_ID"));
        return this;
    }


    default io.vertx.core.json.JsonObject toJson() {
        io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
        json.put("PERM_ID",getPermId());
        json.put("ACTION_ID",getActionId());
        return json;
    }

}

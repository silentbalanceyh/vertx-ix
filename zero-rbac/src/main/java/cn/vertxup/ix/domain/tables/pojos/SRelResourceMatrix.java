/*
 * This file is generated by jOOQ.
*/
package cn.vertxup.ix.domain.tables.pojos;


import cn.vertxup.ix.domain.tables.interfaces.ISRelResourceMatrix;

import java.time.LocalDateTime;

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
public class SRelResourceMatrix implements ISRelResourceMatrix {

    private static final long serialVersionUID = 623301543;

    private String        key;
    private String        roleId;
    private String        userId;
    private LocalDateTime expired;
    private String        resourceId;
    private String        appKey;

    public SRelResourceMatrix() {}

    public SRelResourceMatrix(SRelResourceMatrix value) {
        this.key = value.key;
        this.roleId = value.roleId;
        this.userId = value.userId;
        this.expired = value.expired;
        this.resourceId = value.resourceId;
        this.appKey = value.appKey;
    }

    public SRelResourceMatrix(
        String        key,
        String        roleId,
        String        userId,
        LocalDateTime expired,
        String        resourceId,
        String        appKey
    ) {
        this.key = key;
        this.roleId = roleId;
        this.userId = userId;
        this.expired = expired;
        this.resourceId = resourceId;
        this.appKey = appKey;
    }

    @Override
    public String getKey() {
        return this.key;
    }

    @Override
    public SRelResourceMatrix setKey(String key) {
        this.key = key;
        return this;
    }

    @Override
    public String getRoleId() {
        return this.roleId;
    }

    @Override
    public SRelResourceMatrix setRoleId(String roleId) {
        this.roleId = roleId;
        return this;
    }

    @Override
    public String getUserId() {
        return this.userId;
    }

    @Override
    public SRelResourceMatrix setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    @Override
    public LocalDateTime getExpired() {
        return this.expired;
    }

    @Override
    public SRelResourceMatrix setExpired(LocalDateTime expired) {
        this.expired = expired;
        return this;
    }

    @Override
    public String getResourceId() {
        return this.resourceId;
    }

    @Override
    public SRelResourceMatrix setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    @Override
    public String getAppKey() {
        return this.appKey;
    }

    @Override
    public SRelResourceMatrix setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("SRelResourceMatrix (");

        sb.append(key);
        sb.append(", ").append(roleId);
        sb.append(", ").append(userId);
        sb.append(", ").append(expired);
        sb.append(", ").append(resourceId);
        sb.append(", ").append(appKey);

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
    public void from(ISRelResourceMatrix from) {
        setKey(from.getKey());
        setRoleId(from.getRoleId());
        setUserId(from.getUserId());
        setExpired(from.getExpired());
        setResourceId(from.getResourceId());
        setAppKey(from.getAppKey());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends ISRelResourceMatrix> E into(E into) {
        into.from(this);
        return into;
    }

    public SRelResourceMatrix(io.vertx.core.json.JsonObject json) {
        fromJson(json);
    }
}

/*
 * This file is generated by jOOQ.
*/
package cn.vertxup.ix.domain.tables.daos;


import cn.vertxup.ix.domain.tables.SRelGroupRole;
import cn.vertxup.ix.domain.tables.records.SRelGroupRoleRecord;

import io.github.jklingsporn.vertx.jooq.future.VertxDAO;

import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.Record2;
import org.jooq.impl.DAOImpl;


import java.util.concurrent.CompletableFuture;
import io.github.jklingsporn.vertx.jooq.future.util.FutureTool;
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
public class SRelGroupRoleDao extends DAOImpl<SRelGroupRoleRecord, cn.vertxup.ix.domain.tables.pojos.SRelGroupRole, Record2<String, String>> implements VertxDAO<cn.vertxup.ix.domain.tables.records.SRelGroupRoleRecord,cn.vertxup.ix.domain.tables.pojos.SRelGroupRole,org.jooq.Record2<java.lang.String, java.lang.String>> {

    /**
     * Create a new SRelGroupRoleDao without any configuration
     */
    public SRelGroupRoleDao() {
        super(SRelGroupRole.S_REL_GROUP_ROLE, cn.vertxup.ix.domain.tables.pojos.SRelGroupRole.class);
    }

    /**
     * Create a new SRelGroupRoleDao with an attached configuration
     */
    public SRelGroupRoleDao(Configuration configuration) {
        super(SRelGroupRole.S_REL_GROUP_ROLE, cn.vertxup.ix.domain.tables.pojos.SRelGroupRole.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Record2<String, String> getId(cn.vertxup.ix.domain.tables.pojos.SRelGroupRole object) {
        return compositeKeyRecord(object.getGroupId(), object.getRoleId());
    }

    /**
     * Fetch records that have <code>GROUP_ID IN (values)</code>
     */
    public List<cn.vertxup.ix.domain.tables.pojos.SRelGroupRole> fetchByGroupId(String... values) {
        return fetch(SRelGroupRole.S_REL_GROUP_ROLE.GROUP_ID, values);
    }

    /**
     * Fetch records that have <code>ROLE_ID IN (values)</code>
     */
    public List<cn.vertxup.ix.domain.tables.pojos.SRelGroupRole> fetchByRoleId(String... values) {
        return fetch(SRelGroupRole.S_REL_GROUP_ROLE.ROLE_ID, values);
    }

    /**
     * Fetch records that have <code>GROUP_ID IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ix.domain.tables.pojos.SRelGroupRole>> fetchByGroupIdAsync(List<String> values) {
        return fetchAsync(SRelGroupRole.S_REL_GROUP_ROLE.GROUP_ID,values);
    }

    /**
     * Fetch records that have <code>ROLE_ID IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ix.domain.tables.pojos.SRelGroupRole>> fetchByRoleIdAsync(List<String> values) {
        return fetchAsync(SRelGroupRole.S_REL_GROUP_ROLE.ROLE_ID,values);
    }

    private io.vertx.core.Vertx vertx;

    @Override
    public void setVertx(io.vertx.core.Vertx vertx) {
        this.vertx = vertx;
    }

    @Override
    public io.vertx.core.Vertx vertx() {
        return this.vertx;
    }

}

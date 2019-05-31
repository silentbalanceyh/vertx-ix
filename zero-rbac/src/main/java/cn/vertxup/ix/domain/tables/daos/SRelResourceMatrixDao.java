/*
 * This file is generated by jOOQ.
*/
package cn.vertxup.ix.domain.tables.daos;


import cn.vertxup.ix.domain.tables.SRelResourceMatrix;
import cn.vertxup.ix.domain.tables.records.SRelResourceMatrixRecord;

import io.github.jklingsporn.vertx.jooq.future.VertxDAO;

import java.time.LocalDateTime;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
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
public class SRelResourceMatrixDao extends DAOImpl<SRelResourceMatrixRecord, cn.vertxup.ix.domain.tables.pojos.SRelResourceMatrix, String> implements VertxDAO<cn.vertxup.ix.domain.tables.records.SRelResourceMatrixRecord,cn.vertxup.ix.domain.tables.pojos.SRelResourceMatrix,java.lang.String> {

    /**
     * Create a new SRelResourceMatrixDao without any configuration
     */
    public SRelResourceMatrixDao() {
        super(SRelResourceMatrix.S_REL_RESOURCE_MATRIX, cn.vertxup.ix.domain.tables.pojos.SRelResourceMatrix.class);
    }

    /**
     * Create a new SRelResourceMatrixDao with an attached configuration
     */
    public SRelResourceMatrixDao(Configuration configuration) {
        super(SRelResourceMatrix.S_REL_RESOURCE_MATRIX, cn.vertxup.ix.domain.tables.pojos.SRelResourceMatrix.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getId(cn.vertxup.ix.domain.tables.pojos.SRelResourceMatrix object) {
        return object.getKey();
    }

    /**
     * Fetch records that have <code>KEY IN (values)</code>
     */
    public List<cn.vertxup.ix.domain.tables.pojos.SRelResourceMatrix> fetchByKey(String... values) {
        return fetch(SRelResourceMatrix.S_REL_RESOURCE_MATRIX.KEY, values);
    }

    /**
     * Fetch a unique record that has <code>KEY = value</code>
     */
    public cn.vertxup.ix.domain.tables.pojos.SRelResourceMatrix fetchOneByKey(String value) {
        return fetchOne(SRelResourceMatrix.S_REL_RESOURCE_MATRIX.KEY, value);
    }

    /**
     * Fetch records that have <code>ROLE_ID IN (values)</code>
     */
    public List<cn.vertxup.ix.domain.tables.pojos.SRelResourceMatrix> fetchByRoleId(String... values) {
        return fetch(SRelResourceMatrix.S_REL_RESOURCE_MATRIX.ROLE_ID, values);
    }

    /**
     * Fetch records that have <code>USER_ID IN (values)</code>
     */
    public List<cn.vertxup.ix.domain.tables.pojos.SRelResourceMatrix> fetchByUserId(String... values) {
        return fetch(SRelResourceMatrix.S_REL_RESOURCE_MATRIX.USER_ID, values);
    }

    /**
     * Fetch records that have <code>EXPIRED IN (values)</code>
     */
    public List<cn.vertxup.ix.domain.tables.pojos.SRelResourceMatrix> fetchByExpired(LocalDateTime... values) {
        return fetch(SRelResourceMatrix.S_REL_RESOURCE_MATRIX.EXPIRED, values);
    }

    /**
     * Fetch records that have <code>RESOURCE_ID IN (values)</code>
     */
    public List<cn.vertxup.ix.domain.tables.pojos.SRelResourceMatrix> fetchByResourceId(String... values) {
        return fetch(SRelResourceMatrix.S_REL_RESOURCE_MATRIX.RESOURCE_ID, values);
    }

    /**
     * Fetch records that have <code>APP_KEY IN (values)</code>
     */
    public List<cn.vertxup.ix.domain.tables.pojos.SRelResourceMatrix> fetchByAppKey(String... values) {
        return fetch(SRelResourceMatrix.S_REL_RESOURCE_MATRIX.APP_KEY, values);
    }

    /**
     * Fetch records that have <code>KEY IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ix.domain.tables.pojos.SRelResourceMatrix>> fetchByKeyAsync(List<String> values) {
        return fetchAsync(SRelResourceMatrix.S_REL_RESOURCE_MATRIX.KEY,values);
    }

    /**
     * Fetch a unique record that has <code>KEY = value</code> asynchronously
     */
    public CompletableFuture<cn.vertxup.ix.domain.tables.pojos.SRelResourceMatrix> fetchOneByKeyAsync(String value) {
        return FutureTool.executeBlocking(h->h.complete(fetchOneByKey(value)),vertx());
    }

    /**
     * Fetch records that have <code>ROLE_ID IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ix.domain.tables.pojos.SRelResourceMatrix>> fetchByRoleIdAsync(List<String> values) {
        return fetchAsync(SRelResourceMatrix.S_REL_RESOURCE_MATRIX.ROLE_ID,values);
    }

    /**
     * Fetch records that have <code>USER_ID IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ix.domain.tables.pojos.SRelResourceMatrix>> fetchByUserIdAsync(List<String> values) {
        return fetchAsync(SRelResourceMatrix.S_REL_RESOURCE_MATRIX.USER_ID,values);
    }

    /**
     * Fetch records that have <code>EXPIRED IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ix.domain.tables.pojos.SRelResourceMatrix>> fetchByExpiredAsync(List<LocalDateTime> values) {
        return fetchAsync(SRelResourceMatrix.S_REL_RESOURCE_MATRIX.EXPIRED,values);
    }

    /**
     * Fetch records that have <code>RESOURCE_ID IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ix.domain.tables.pojos.SRelResourceMatrix>> fetchByResourceIdAsync(List<String> values) {
        return fetchAsync(SRelResourceMatrix.S_REL_RESOURCE_MATRIX.RESOURCE_ID,values);
    }

    /**
     * Fetch records that have <code>APP_KEY IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ix.domain.tables.pojos.SRelResourceMatrix>> fetchByAppKeyAsync(List<String> values) {
        return fetchAsync(SRelResourceMatrix.S_REL_RESOURCE_MATRIX.APP_KEY,values);
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
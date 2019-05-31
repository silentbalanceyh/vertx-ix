/*
 * This file is generated by jOOQ.
*/
package cn.vertxup.ix.domain.tables.daos;


import cn.vertxup.ix.domain.tables.SRole;
import cn.vertxup.ix.domain.tables.records.SRoleRecord;

import io.github.jklingsporn.vertx.jooq.future.VertxDAO;

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
public class SRoleDao extends DAOImpl<SRoleRecord, cn.vertxup.ix.domain.tables.pojos.SRole, String> implements VertxDAO<cn.vertxup.ix.domain.tables.records.SRoleRecord,cn.vertxup.ix.domain.tables.pojos.SRole,java.lang.String> {

    /**
     * Create a new SRoleDao without any configuration
     */
    public SRoleDao() {
        super(SRole.S_ROLE, cn.vertxup.ix.domain.tables.pojos.SRole.class);
    }

    /**
     * Create a new SRoleDao with an attached configuration
     */
    public SRoleDao(Configuration configuration) {
        super(SRole.S_ROLE, cn.vertxup.ix.domain.tables.pojos.SRole.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getId(cn.vertxup.ix.domain.tables.pojos.SRole object) {
        return object.getKey();
    }

    /**
     * Fetch records that have <code>KEY IN (values)</code>
     */
    public List<cn.vertxup.ix.domain.tables.pojos.SRole> fetchByKey(String... values) {
        return fetch(SRole.S_ROLE.KEY, values);
    }

    /**
     * Fetch a unique record that has <code>KEY = value</code>
     */
    public cn.vertxup.ix.domain.tables.pojos.SRole fetchOneByKey(String value) {
        return fetchOne(SRole.S_ROLE.KEY, value);
    }

    /**
     * Fetch records that have <code>NAME IN (values)</code>
     */
    public List<cn.vertxup.ix.domain.tables.pojos.SRole> fetchByName(String... values) {
        return fetch(SRole.S_ROLE.NAME, values);
    }

    /**
     * Fetch records that have <code>CODE IN (values)</code>
     */
    public List<cn.vertxup.ix.domain.tables.pojos.SRole> fetchByCode(String... values) {
        return fetch(SRole.S_ROLE.CODE, values);
    }

    /**
     * Fetch records that have <code>SUPER IN (values)</code>
     */
    public List<cn.vertxup.ix.domain.tables.pojos.SRole> fetchBySuper(Boolean... values) {
        return fetch(SRole.S_ROLE.SUPER, values);
    }

    /**
     * Fetch records that have <code>COMMENT IN (values)</code>
     */
    public List<cn.vertxup.ix.domain.tables.pojos.SRole> fetchByComment(String... values) {
        return fetch(SRole.S_ROLE.COMMENT, values);
    }

    /**
     * Fetch records that have <code>APP_KEY IN (values)</code>
     */
    public List<cn.vertxup.ix.domain.tables.pojos.SRole> fetchByAppKey(String... values) {
        return fetch(SRole.S_ROLE.APP_KEY, values);
    }

    /**
     * Fetch records that have <code>LANGUAGE IN (values)</code>
     */
    public List<cn.vertxup.ix.domain.tables.pojos.SRole> fetchByLanguage(String... values) {
        return fetch(SRole.S_ROLE.LANGUAGE, values);
    }

    /**
     * Fetch records that have <code>ACTIVE IN (values)</code>
     */
    public List<cn.vertxup.ix.domain.tables.pojos.SRole> fetchByActive(Boolean... values) {
        return fetch(SRole.S_ROLE.ACTIVE, values);
    }

    /**
     * Fetch records that have <code>METADATA IN (values)</code>
     */
    public List<cn.vertxup.ix.domain.tables.pojos.SRole> fetchByMetadata(String... values) {
        return fetch(SRole.S_ROLE.METADATA, values);
    }

    /**
     * Fetch records that have <code>KEY IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ix.domain.tables.pojos.SRole>> fetchByKeyAsync(List<String> values) {
        return fetchAsync(SRole.S_ROLE.KEY,values);
    }

    /**
     * Fetch a unique record that has <code>KEY = value</code> asynchronously
     */
    public CompletableFuture<cn.vertxup.ix.domain.tables.pojos.SRole> fetchOneByKeyAsync(String value) {
        return FutureTool.executeBlocking(h->h.complete(fetchOneByKey(value)),vertx());
    }

    /**
     * Fetch records that have <code>NAME IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ix.domain.tables.pojos.SRole>> fetchByNameAsync(List<String> values) {
        return fetchAsync(SRole.S_ROLE.NAME,values);
    }

    /**
     * Fetch records that have <code>CODE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ix.domain.tables.pojos.SRole>> fetchByCodeAsync(List<String> values) {
        return fetchAsync(SRole.S_ROLE.CODE,values);
    }

    /**
     * Fetch records that have <code>SUPER IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ix.domain.tables.pojos.SRole>> fetchBySuperAsync(List<Boolean> values) {
        return fetchAsync(SRole.S_ROLE.SUPER,values);
    }

    /**
     * Fetch records that have <code>COMMENT IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ix.domain.tables.pojos.SRole>> fetchByCommentAsync(List<String> values) {
        return fetchAsync(SRole.S_ROLE.COMMENT,values);
    }

    /**
     * Fetch records that have <code>APP_KEY IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ix.domain.tables.pojos.SRole>> fetchByAppKeyAsync(List<String> values) {
        return fetchAsync(SRole.S_ROLE.APP_KEY,values);
    }

    /**
     * Fetch records that have <code>LANGUAGE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ix.domain.tables.pojos.SRole>> fetchByLanguageAsync(List<String> values) {
        return fetchAsync(SRole.S_ROLE.LANGUAGE,values);
    }

    /**
     * Fetch records that have <code>ACTIVE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ix.domain.tables.pojos.SRole>> fetchByActiveAsync(List<Boolean> values) {
        return fetchAsync(SRole.S_ROLE.ACTIVE,values);
    }

    /**
     * Fetch records that have <code>METADATA IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.ix.domain.tables.pojos.SRole>> fetchByMetadataAsync(List<String> values) {
        return fetchAsync(SRole.S_ROLE.METADATA,values);
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

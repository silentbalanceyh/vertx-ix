/*
 * This file is generated by jOOQ.
*/
package cn.vertxup.ix.domain.tables.pojos;


import cn.vertxup.ix.domain.tables.interfaces.ISResource;

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
public class SResource implements ISResource {

    private static final long serialVersionUID = 1452216452;

    private String        key;
    private String        modelId;
    private String        modelKey;
    private String        code;
    private String        category;
    private String        projection;
    private String        query;
    private Integer       level;
    private LocalDateTime expired;
    private String        apiKey;
    private String        type;
    private String        appKey;
    private String        language;
    private Boolean       active;
    private String        metadata;

    public SResource() {}

    public SResource(SResource value) {
        this.key = value.key;
        this.modelId = value.modelId;
        this.modelKey = value.modelKey;
        this.code = value.code;
        this.category = value.category;
        this.projection = value.projection;
        this.query = value.query;
        this.level = value.level;
        this.expired = value.expired;
        this.apiKey = value.apiKey;
        this.type = value.type;
        this.appKey = value.appKey;
        this.language = value.language;
        this.active = value.active;
        this.metadata = value.metadata;
    }

    public SResource(
        String        key,
        String        modelId,
        String        modelKey,
        String        code,
        String        category,
        String        projection,
        String        query,
        Integer       level,
        LocalDateTime expired,
        String        apiKey,
        String        type,
        String        appKey,
        String        language,
        Boolean       active,
        String        metadata
    ) {
        this.key = key;
        this.modelId = modelId;
        this.modelKey = modelKey;
        this.code = code;
        this.category = category;
        this.projection = projection;
        this.query = query;
        this.level = level;
        this.expired = expired;
        this.apiKey = apiKey;
        this.type = type;
        this.appKey = appKey;
        this.language = language;
        this.active = active;
        this.metadata = metadata;
    }

    @Override
    public String getKey() {
        return this.key;
    }

    @Override
    public SResource setKey(String key) {
        this.key = key;
        return this;
    }

    @Override
    public String getModelId() {
        return this.modelId;
    }

    @Override
    public SResource setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }

    @Override
    public String getModelKey() {
        return this.modelKey;
    }

    @Override
    public SResource setModelKey(String modelKey) {
        this.modelKey = modelKey;
        return this;
    }

    @Override
    public String getCode() {
        return this.code;
    }

    @Override
    public SResource setCode(String code) {
        this.code = code;
        return this;
    }

    @Override
    public String getCategory() {
        return this.category;
    }

    @Override
    public SResource setCategory(String category) {
        this.category = category;
        return this;
    }

    @Override
    public String getProjection() {
        return this.projection;
    }

    @Override
    public SResource setProjection(String projection) {
        this.projection = projection;
        return this;
    }

    @Override
    public String getQuery() {
        return this.query;
    }

    @Override
    public SResource setQuery(String query) {
        this.query = query;
        return this;
    }

    @Override
    public Integer getLevel() {
        return this.level;
    }

    @Override
    public SResource setLevel(Integer level) {
        this.level = level;
        return this;
    }

    @Override
    public LocalDateTime getExpired() {
        return this.expired;
    }

    @Override
    public SResource setExpired(LocalDateTime expired) {
        this.expired = expired;
        return this;
    }

    @Override
    public String getApiKey() {
        return this.apiKey;
    }

    @Override
    public SResource setApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public SResource setType(String type) {
        this.type = type;
        return this;
    }

    @Override
    public String getAppKey() {
        return this.appKey;
    }

    @Override
    public SResource setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }

    @Override
    public String getLanguage() {
        return this.language;
    }

    @Override
    public SResource setLanguage(String language) {
        this.language = language;
        return this;
    }

    @Override
    public Boolean getActive() {
        return this.active;
    }

    @Override
    public SResource setActive(Boolean active) {
        this.active = active;
        return this;
    }

    @Override
    public String getMetadata() {
        return this.metadata;
    }

    @Override
    public SResource setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("SResource (");

        sb.append(key);
        sb.append(", ").append(modelId);
        sb.append(", ").append(modelKey);
        sb.append(", ").append(code);
        sb.append(", ").append(category);
        sb.append(", ").append(projection);
        sb.append(", ").append(query);
        sb.append(", ").append(level);
        sb.append(", ").append(expired);
        sb.append(", ").append(apiKey);
        sb.append(", ").append(type);
        sb.append(", ").append(appKey);
        sb.append(", ").append(language);
        sb.append(", ").append(active);
        sb.append(", ").append(metadata);

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
    public void from(ISResource from) {
        setKey(from.getKey());
        setModelId(from.getModelId());
        setModelKey(from.getModelKey());
        setCode(from.getCode());
        setCategory(from.getCategory());
        setProjection(from.getProjection());
        setQuery(from.getQuery());
        setLevel(from.getLevel());
        setExpired(from.getExpired());
        setApiKey(from.getApiKey());
        setType(from.getType());
        setAppKey(from.getAppKey());
        setLanguage(from.getLanguage());
        setActive(from.getActive());
        setMetadata(from.getMetadata());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends ISResource> E into(E into) {
        into.from(this);
        return into;
    }

    public SResource(io.vertx.core.json.JsonObject json) {
        fromJson(json);
    }
}

/*
 * This file is generated by jOOQ.
*/
package cn.vertxup.ix.domain.tables.pojos;


import cn.vertxup.ix.domain.tables.interfaces.ISGroup;

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
public class SGroup implements ISGroup {

    private static final long serialVersionUID = 1934210726;

    private String  key;
    private String  name;
    private String  code;
    private String  category;
    private String  parentId;
    private String  modelId;
    private String  modelKey;
    private String  appKey;
    private String  language;
    private Boolean active;
    private String  metadata;

    public SGroup() {}

    public SGroup(SGroup value) {
        this.key = value.key;
        this.name = value.name;
        this.code = value.code;
        this.category = value.category;
        this.parentId = value.parentId;
        this.modelId = value.modelId;
        this.modelKey = value.modelKey;
        this.appKey = value.appKey;
        this.language = value.language;
        this.active = value.active;
        this.metadata = value.metadata;
    }

    public SGroup(
        String  key,
        String  name,
        String  code,
        String  category,
        String  parentId,
        String  modelId,
        String  modelKey,
        String  appKey,
        String  language,
        Boolean active,
        String  metadata
    ) {
        this.key = key;
        this.name = name;
        this.code = code;
        this.category = category;
        this.parentId = parentId;
        this.modelId = modelId;
        this.modelKey = modelKey;
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
    public SGroup setKey(String key) {
        this.key = key;
        return this;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public SGroup setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String getCode() {
        return this.code;
    }

    @Override
    public SGroup setCode(String code) {
        this.code = code;
        return this;
    }

    @Override
    public String getCategory() {
        return this.category;
    }

    @Override
    public SGroup setCategory(String category) {
        this.category = category;
        return this;
    }

    @Override
    public String getParentId() {
        return this.parentId;
    }

    @Override
    public SGroup setParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }

    @Override
    public String getModelId() {
        return this.modelId;
    }

    @Override
    public SGroup setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }

    @Override
    public String getModelKey() {
        return this.modelKey;
    }

    @Override
    public SGroup setModelKey(String modelKey) {
        this.modelKey = modelKey;
        return this;
    }

    @Override
    public String getAppKey() {
        return this.appKey;
    }

    @Override
    public SGroup setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }

    @Override
    public String getLanguage() {
        return this.language;
    }

    @Override
    public SGroup setLanguage(String language) {
        this.language = language;
        return this;
    }

    @Override
    public Boolean getActive() {
        return this.active;
    }

    @Override
    public SGroup setActive(Boolean active) {
        this.active = active;
        return this;
    }

    @Override
    public String getMetadata() {
        return this.metadata;
    }

    @Override
    public SGroup setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("SGroup (");

        sb.append(key);
        sb.append(", ").append(name);
        sb.append(", ").append(code);
        sb.append(", ").append(category);
        sb.append(", ").append(parentId);
        sb.append(", ").append(modelId);
        sb.append(", ").append(modelKey);
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
    public void from(ISGroup from) {
        setKey(from.getKey());
        setName(from.getName());
        setCode(from.getCode());
        setCategory(from.getCategory());
        setParentId(from.getParentId());
        setModelId(from.getModelId());
        setModelKey(from.getModelKey());
        setAppKey(from.getAppKey());
        setLanguage(from.getLanguage());
        setActive(from.getActive());
        setMetadata(from.getMetadata());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends ISGroup> E into(E into) {
        into.from(this);
        return into;
    }

    public SGroup(io.vertx.core.json.JsonObject json) {
        fromJson(json);
    }
}

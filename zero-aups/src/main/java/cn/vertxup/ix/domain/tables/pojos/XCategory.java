/*
 * This file is generated by jOOQ.
*/
package cn.vertxup.ix.domain.tables.pojos;


import cn.vertxup.ix.domain.tables.interfaces.IXCategory;

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
public class XCategory implements IXCategory {

    private static final long serialVersionUID = -30412051;

    private String  key;
    private String  name;
    private String  code;
    private String  icon;
    private String  type;
    private Integer sort;
    private Boolean leaf;
    private String  parentId;
    private String  identifier;
    private String  comment;
    private Boolean active;
    private String  metadata;
    private String  language;
    private String  appId;

    public XCategory() {}

    public XCategory(XCategory value) {
        this.key = value.key;
        this.name = value.name;
        this.code = value.code;
        this.icon = value.icon;
        this.type = value.type;
        this.sort = value.sort;
        this.leaf = value.leaf;
        this.parentId = value.parentId;
        this.identifier = value.identifier;
        this.comment = value.comment;
        this.active = value.active;
        this.metadata = value.metadata;
        this.language = value.language;
        this.appId = value.appId;
    }

    public XCategory(
        String  key,
        String  name,
        String  code,
        String  icon,
        String  type,
        Integer sort,
        Boolean leaf,
        String  parentId,
        String  identifier,
        String  comment,
        Boolean active,
        String  metadata,
        String  language,
        String  appId
    ) {
        this.key = key;
        this.name = name;
        this.code = code;
        this.icon = icon;
        this.type = type;
        this.sort = sort;
        this.leaf = leaf;
        this.parentId = parentId;
        this.identifier = identifier;
        this.comment = comment;
        this.active = active;
        this.metadata = metadata;
        this.language = language;
        this.appId = appId;
    }

    @Override
    public String getKey() {
        return this.key;
    }

    @Override
    public XCategory setKey(String key) {
        this.key = key;
        return this;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public XCategory setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String getCode() {
        return this.code;
    }

    @Override
    public XCategory setCode(String code) {
        this.code = code;
        return this;
    }

    @Override
    public String getIcon() {
        return this.icon;
    }

    @Override
    public XCategory setIcon(String icon) {
        this.icon = icon;
        return this;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public XCategory setType(String type) {
        this.type = type;
        return this;
    }

    @Override
    public Integer getSort() {
        return this.sort;
    }

    @Override
    public XCategory setSort(Integer sort) {
        this.sort = sort;
        return this;
    }

    @Override
    public Boolean getLeaf() {
        return this.leaf;
    }

    @Override
    public XCategory setLeaf(Boolean leaf) {
        this.leaf = leaf;
        return this;
    }

    @Override
    public String getParentId() {
        return this.parentId;
    }

    @Override
    public XCategory setParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }

    @Override
    public String getIdentifier() {
        return this.identifier;
    }

    @Override
    public XCategory setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }

    @Override
    public String getComment() {
        return this.comment;
    }

    @Override
    public XCategory setComment(String comment) {
        this.comment = comment;
        return this;
    }

    @Override
    public Boolean getActive() {
        return this.active;
    }

    @Override
    public XCategory setActive(Boolean active) {
        this.active = active;
        return this;
    }

    @Override
    public String getMetadata() {
        return this.metadata;
    }

    @Override
    public XCategory setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    @Override
    public String getLanguage() {
        return this.language;
    }

    @Override
    public XCategory setLanguage(String language) {
        this.language = language;
        return this;
    }

    @Override
    public String getAppId() {
        return this.appId;
    }

    @Override
    public XCategory setAppId(String appId) {
        this.appId = appId;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("XCategory (");

        sb.append(key);
        sb.append(", ").append(name);
        sb.append(", ").append(code);
        sb.append(", ").append(icon);
        sb.append(", ").append(type);
        sb.append(", ").append(sort);
        sb.append(", ").append(leaf);
        sb.append(", ").append(parentId);
        sb.append(", ").append(identifier);
        sb.append(", ").append(comment);
        sb.append(", ").append(active);
        sb.append(", ").append(metadata);
        sb.append(", ").append(language);
        sb.append(", ").append(appId);

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
    public void from(IXCategory from) {
        setKey(from.getKey());
        setName(from.getName());
        setCode(from.getCode());
        setIcon(from.getIcon());
        setType(from.getType());
        setSort(from.getSort());
        setLeaf(from.getLeaf());
        setParentId(from.getParentId());
        setIdentifier(from.getIdentifier());
        setComment(from.getComment());
        setActive(from.getActive());
        setMetadata(from.getMetadata());
        setLanguage(from.getLanguage());
        setAppId(from.getAppId());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends IXCategory> E into(E into) {
        into.from(this);
        return into;
    }

    public XCategory(io.vertx.core.json.JsonObject json) {
        fromJson(json);
    }
}

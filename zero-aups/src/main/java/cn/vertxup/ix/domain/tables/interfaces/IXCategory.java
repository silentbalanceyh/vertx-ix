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
public interface IXCategory extends Serializable {

    /**
     * Setter for <code>DB_ORIGIN_X.X_CATEGORY.KEY</code>. 「key」- 类型主键
     */
    public IXCategory setKey(String value);

    /**
     * Getter for <code>DB_ORIGIN_X.X_CATEGORY.KEY</code>. 「key」- 类型主键
     */
    public String getKey();

    /**
     * Setter for <code>DB_ORIGIN_X.X_CATEGORY.NAME</code>. 「name」- 类型名称
     */
    public IXCategory setName(String value);

    /**
     * Getter for <code>DB_ORIGIN_X.X_CATEGORY.NAME</code>. 「name」- 类型名称
     */
    public String getName();

    /**
     * Setter for <code>DB_ORIGIN_X.X_CATEGORY.CODE</code>. 「code」- 类型编号
     */
    public IXCategory setCode(String value);

    /**
     * Getter for <code>DB_ORIGIN_X.X_CATEGORY.CODE</code>. 「code」- 类型编号
     */
    public String getCode();

    /**
     * Setter for <code>DB_ORIGIN_X.X_CATEGORY.ICON</code>. 「icon」- 类型图标
     */
    public IXCategory setIcon(String value);

    /**
     * Getter for <code>DB_ORIGIN_X.X_CATEGORY.ICON</code>. 「icon」- 类型图标
     */
    public String getIcon();

    /**
     * Setter for <code>DB_ORIGIN_X.X_CATEGORY.TYPE</code>. 「type」- 类型的分类
     */
    public IXCategory setType(String value);

    /**
     * Getter for <code>DB_ORIGIN_X.X_CATEGORY.TYPE</code>. 「type」- 类型的分类
     */
    public String getType();

    /**
     * Setter for <code>DB_ORIGIN_X.X_CATEGORY.SORT</code>. 「sort」- 排序信息
     */
    public IXCategory setSort(Integer value);

    /**
     * Getter for <code>DB_ORIGIN_X.X_CATEGORY.SORT</code>. 「sort」- 排序信息
     */
    public Integer getSort();

    /**
     * Setter for <code>DB_ORIGIN_X.X_CATEGORY.LEAF</code>. 「leaf」- 是否叶节点
     */
    public IXCategory setLeaf(Boolean value);

    /**
     * Getter for <code>DB_ORIGIN_X.X_CATEGORY.LEAF</code>. 「leaf」- 是否叶节点
     */
    public Boolean getLeaf();

    /**
     * Setter for <code>DB_ORIGIN_X.X_CATEGORY.PARENT_ID</code>. 「parentId」- 父类ID
     */
    public IXCategory setParentId(String value);

    /**
     * Getter for <code>DB_ORIGIN_X.X_CATEGORY.PARENT_ID</code>. 「parentId」- 父类ID
     */
    public String getParentId();

    /**
     * Setter for <code>DB_ORIGIN_X.X_CATEGORY.IDENTIFIER</code>. 「identifier」- 当前类型描述的Model的标识
     */
    public IXCategory setIdentifier(String value);

    /**
     * Getter for <code>DB_ORIGIN_X.X_CATEGORY.IDENTIFIER</code>. 「identifier」- 当前类型描述的Model的标识
     */
    public String getIdentifier();

    /**
     * Setter for <code>DB_ORIGIN_X.X_CATEGORY.COMMENT</code>. 「comment」- 备注信息
     */
    public IXCategory setComment(String value);

    /**
     * Getter for <code>DB_ORIGIN_X.X_CATEGORY.COMMENT</code>. 「comment」- 备注信息
     */
    public String getComment();

    /**
     * Setter for <code>DB_ORIGIN_X.X_CATEGORY.ACTIVE</code>. 「active」- 是否启用
     */
    public IXCategory setActive(Boolean value);

    /**
     * Getter for <code>DB_ORIGIN_X.X_CATEGORY.ACTIVE</code>. 「active」- 是否启用
     */
    public Boolean getActive();

    /**
     * Setter for <code>DB_ORIGIN_X.X_CATEGORY.METADATA</code>. 「metadata」-扩展配置信息
     */
    public IXCategory setMetadata(String value);

    /**
     * Getter for <code>DB_ORIGIN_X.X_CATEGORY.METADATA</code>. 「metadata」-扩展配置信息
     */
    public String getMetadata();

    /**
     * Setter for <code>DB_ORIGIN_X.X_CATEGORY.LANGUAGE</code>. 「language」- 使用的语言
     */
    public IXCategory setLanguage(String value);

    /**
     * Getter for <code>DB_ORIGIN_X.X_CATEGORY.LANGUAGE</code>. 「language」- 使用的语言
     */
    public String getLanguage();

    /**
     * Setter for <code>DB_ORIGIN_X.X_CATEGORY.APP_ID</code>. 「appId」- 关联的应用程序ID
     */
    public IXCategory setAppId(String value);

    /**
     * Getter for <code>DB_ORIGIN_X.X_CATEGORY.APP_ID</code>. 「appId」- 关联的应用程序ID
     */
    public String getAppId();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface IXCategory
     */
    public void from(cn.vertxup.ix.domain.tables.interfaces.IXCategory from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface IXCategory
     */
    public <E extends cn.vertxup.ix.domain.tables.interfaces.IXCategory> E into(E into);

    default IXCategory fromJson(io.vertx.core.json.JsonObject json) {
        setKey(json.getString("KEY"));
        setName(json.getString("NAME"));
        setCode(json.getString("CODE"));
        setIcon(json.getString("ICON"));
        setType(json.getString("TYPE"));
        setSort(json.getInteger("SORT"));
        setLeaf(json.getBoolean("LEAF"));
        setParentId(json.getString("PARENT_ID"));
        setIdentifier(json.getString("IDENTIFIER"));
        setComment(json.getString("COMMENT"));
        setActive(json.getBoolean("ACTIVE"));
        setMetadata(json.getString("METADATA"));
        setLanguage(json.getString("LANGUAGE"));
        setAppId(json.getString("APP_ID"));
        return this;
    }


    default io.vertx.core.json.JsonObject toJson() {
        io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
        json.put("KEY",getKey());
        json.put("NAME",getName());
        json.put("CODE",getCode());
        json.put("ICON",getIcon());
        json.put("TYPE",getType());
        json.put("SORT",getSort());
        json.put("LEAF",getLeaf());
        json.put("PARENT_ID",getParentId());
        json.put("IDENTIFIER",getIdentifier());
        json.put("COMMENT",getComment());
        json.put("ACTIVE",getActive());
        json.put("METADATA",getMetadata());
        json.put("LANGUAGE",getLanguage());
        json.put("APP_ID",getAppId());
        return json;
    }

}

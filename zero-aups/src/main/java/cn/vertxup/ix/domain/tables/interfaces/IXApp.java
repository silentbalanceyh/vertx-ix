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
public interface IXApp extends Serializable {

    /**
     * Setter for <code>DB_ORIGIN_X.X_APP.KEY</code>. 「key」- 应用程序主键
     */
    public IXApp setKey(String value);

    /**
     * Getter for <code>DB_ORIGIN_X.X_APP.KEY</code>. 「key」- 应用程序主键
     */
    public String getKey();

    /**
     * Setter for <code>DB_ORIGIN_X.X_APP.NAME</code>. 「name」- 应用程序名称
     */
    public IXApp setName(String value);

    /**
     * Getter for <code>DB_ORIGIN_X.X_APP.NAME</code>. 「name」- 应用程序名称
     */
    public String getName();

    /**
     * Setter for <code>DB_ORIGIN_X.X_APP.CODE</code>. 「code」- 应用程序编码
     */
    public IXApp setCode(String value);

    /**
     * Getter for <code>DB_ORIGIN_X.X_APP.CODE</code>. 「code」- 应用程序编码
     */
    public String getCode();

    /**
     * Setter for <code>DB_ORIGIN_X.X_APP.TITLE</code>. 「title」- 应用程序标题
     */
    public IXApp setTitle(String value);

    /**
     * Getter for <code>DB_ORIGIN_X.X_APP.TITLE</code>. 「title」- 应用程序标题
     */
    public String getTitle();

    /**
     * Setter for <code>DB_ORIGIN_X.X_APP.LOGO</code>. 「logo」- 应用程序图标
     */
    public IXApp setLogo(String value);

    /**
     * Getter for <code>DB_ORIGIN_X.X_APP.LOGO</code>. 「logo」- 应用程序图标
     */
    public String getLogo();

    /**
     * Setter for <code>DB_ORIGIN_X.X_APP.DOMAIN</code>. 「domain」- 应用程序所在域
     */
    public IXApp setDomain(String value);

    /**
     * Getter for <code>DB_ORIGIN_X.X_APP.DOMAIN</code>. 「domain」- 应用程序所在域
     */
    public String getDomain();

    /**
     * Setter for <code>DB_ORIGIN_X.X_APP.PATH</code>. 「path」- 应用程序路径
     */
    public IXApp setPath(String value);

    /**
     * Getter for <code>DB_ORIGIN_X.X_APP.PATH</code>. 「path」- 应用程序路径
     */
    public String getPath();

    /**
     * Setter for <code>DB_ORIGIN_X.X_APP.ROUTE</code>. 「route」- 后端API的根路径，启动时需要
     */
    public IXApp setRoute(String value);

    /**
     * Getter for <code>DB_ORIGIN_X.X_APP.ROUTE</code>. 「route」- 后端API的根路径，启动时需要
     */
    public String getRoute();

    /**
     * Setter for <code>DB_ORIGIN_X.X_APP.APP_KEY</code>. 「appKey」- 应用程序专用唯一hashKey
     */
    public IXApp setAppKey(String value);

    /**
     * Getter for <code>DB_ORIGIN_X.X_APP.APP_KEY</code>. 「appKey」- 应用程序专用唯一hashKey
     */
    public String getAppKey();

    /**
     * Setter for <code>DB_ORIGIN_X.X_APP.APP_PORT</code>. 「appPort」- 应用程序端口号，和SOURCE的端口号区别开
     */
    public IXApp setAppPort(Integer value);

    /**
     * Getter for <code>DB_ORIGIN_X.X_APP.APP_PORT</code>. 「appPort」- 应用程序端口号，和SOURCE的端口号区别开
     */
    public Integer getAppPort();

    /**
     * Setter for <code>DB_ORIGIN_X.X_APP.URL_ENTRY</code>. 「urlEntry」— 应用程序入口页面（登录页）
     */
    public IXApp setUrlEntry(String value);

    /**
     * Getter for <code>DB_ORIGIN_X.X_APP.URL_ENTRY</code>. 「urlEntry」— 应用程序入口页面（登录页）
     */
    public String getUrlEntry();

    /**
     * Setter for <code>DB_ORIGIN_X.X_APP.URL_MAIN</code>. 「urlMain」- 应用程序内置主页（带安全）
     */
    public IXApp setUrlMain(String value);

    /**
     * Getter for <code>DB_ORIGIN_X.X_APP.URL_MAIN</code>. 「urlMain」- 应用程序内置主页（带安全）
     */
    public String getUrlMain();

    /**
     * Setter for <code>DB_ORIGIN_X.X_APP.ACTIVE</code>. 「active」- 是否启用
     */
    public IXApp setActive(Boolean value);

    /**
     * Getter for <code>DB_ORIGIN_X.X_APP.ACTIVE</code>. 「active」- 是否启用
     */
    public Boolean getActive();

    /**
     * Setter for <code>DB_ORIGIN_X.X_APP.LANGUAGE</code>. 「language」- 使用的语言
     */
    public IXApp setLanguage(String value);

    /**
     * Getter for <code>DB_ORIGIN_X.X_APP.LANGUAGE</code>. 「language」- 使用的语言
     */
    public String getLanguage();

    /**
     * Setter for <code>DB_ORIGIN_X.X_APP.METADATA</code>. 「metadata」- 附加配置数据
     */
    public IXApp setMetadata(String value);

    /**
     * Getter for <code>DB_ORIGIN_X.X_APP.METADATA</code>. 「metadata」- 附加配置数据
     */
    public String getMetadata();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface IXApp
     */
    public void from(cn.vertxup.ix.domain.tables.interfaces.IXApp from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface IXApp
     */
    public <E extends cn.vertxup.ix.domain.tables.interfaces.IXApp> E into(E into);

    default IXApp fromJson(io.vertx.core.json.JsonObject json) {
        setKey(json.getString("KEY"));
        setName(json.getString("NAME"));
        setCode(json.getString("CODE"));
        setTitle(json.getString("TITLE"));
        setLogo(json.getString("LOGO"));
        setDomain(json.getString("DOMAIN"));
        setPath(json.getString("PATH"));
        setRoute(json.getString("ROUTE"));
        setAppKey(json.getString("APP_KEY"));
        setAppPort(json.getInteger("APP_PORT"));
        setUrlEntry(json.getString("URL_ENTRY"));
        setUrlMain(json.getString("URL_MAIN"));
        setActive(json.getBoolean("ACTIVE"));
        setLanguage(json.getString("LANGUAGE"));
        setMetadata(json.getString("METADATA"));
        return this;
    }


    default io.vertx.core.json.JsonObject toJson() {
        io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
        json.put("KEY",getKey());
        json.put("NAME",getName());
        json.put("CODE",getCode());
        json.put("TITLE",getTitle());
        json.put("LOGO",getLogo());
        json.put("DOMAIN",getDomain());
        json.put("PATH",getPath());
        json.put("ROUTE",getRoute());
        json.put("APP_KEY",getAppKey());
        json.put("APP_PORT",getAppPort());
        json.put("URL_ENTRY",getUrlEntry());
        json.put("URL_MAIN",getUrlMain());
        json.put("ACTIVE",getActive());
        json.put("LANGUAGE",getLanguage());
        json.put("METADATA",getMetadata());
        return json;
    }

}
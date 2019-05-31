/*
 * This file is generated by jOOQ.
*/
package cn.vertxup.ix.domain;


import cn.vertxup.ix.domain.tables.XApp;
import cn.vertxup.ix.domain.tables.XAttachment;
import cn.vertxup.ix.domain.tables.XCategory;
import cn.vertxup.ix.domain.tables.XMenu;
import cn.vertxup.ix.domain.tables.XModule;
import cn.vertxup.ix.domain.tables.XSource;
import cn.vertxup.ix.domain.tables.XTabular;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


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
public class DbOriginX extends SchemaImpl {

    private static final long serialVersionUID = 652007852;

    /**
     * The reference instance of <code>DB_ORIGIN_X</code>
     */
    public static final DbOriginX DB_ORIGIN_X = new DbOriginX();

    /**
     * The table <code>DB_ORIGIN_X.X_APP</code>.
     */
    public final XApp X_APP = cn.vertxup.ix.domain.tables.XApp.X_APP;

    /**
     * The table <code>DB_ORIGIN_X.X_ATTACHMENT</code>.
     */
    public final XAttachment X_ATTACHMENT = cn.vertxup.ix.domain.tables.XAttachment.X_ATTACHMENT;

    /**
     * The table <code>DB_ORIGIN_X.X_CATEGORY</code>.
     */
    public final XCategory X_CATEGORY = cn.vertxup.ix.domain.tables.XCategory.X_CATEGORY;

    /**
     * The table <code>DB_ORIGIN_X.X_MENU</code>.
     */
    public final XMenu X_MENU = cn.vertxup.ix.domain.tables.XMenu.X_MENU;

    /**
     * The table <code>DB_ORIGIN_X.X_MODULE</code>.
     */
    public final XModule X_MODULE = cn.vertxup.ix.domain.tables.XModule.X_MODULE;

    /**
     * The table <code>DB_ORIGIN_X.X_SOURCE</code>.
     */
    public final XSource X_SOURCE = cn.vertxup.ix.domain.tables.XSource.X_SOURCE;

    /**
     * The table <code>DB_ORIGIN_X.X_TABULAR</code>.
     */
    public final XTabular X_TABULAR = cn.vertxup.ix.domain.tables.XTabular.X_TABULAR;

    /**
     * No further instances allowed
     */
    private DbOriginX() {
        super("DB_ORIGIN_X", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            XApp.X_APP,
            XAttachment.X_ATTACHMENT,
            XCategory.X_CATEGORY,
            XMenu.X_MENU,
            XModule.X_MODULE,
            XSource.X_SOURCE,
            XTabular.X_TABULAR);
    }
}

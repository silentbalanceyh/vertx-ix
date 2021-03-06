/*
 * This file is generated by jOOQ.
*/
package cn.vertxup.ix.domain;


import cn.vertxup.ix.domain.tables.OUser;
import cn.vertxup.ix.domain.tables.SAction;
import cn.vertxup.ix.domain.tables.SGroup;
import cn.vertxup.ix.domain.tables.SPermission;
import cn.vertxup.ix.domain.tables.SRelGroupRole;
import cn.vertxup.ix.domain.tables.SRelPermAction;
import cn.vertxup.ix.domain.tables.SRelResourceMatrix;
import cn.vertxup.ix.domain.tables.SRelRolePerm;
import cn.vertxup.ix.domain.tables.SRelUserGroup;
import cn.vertxup.ix.domain.tables.SRelUserRole;
import cn.vertxup.ix.domain.tables.SResource;
import cn.vertxup.ix.domain.tables.SRole;
import cn.vertxup.ix.domain.tables.SUser;

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

    private static final long serialVersionUID = -1393101544;

    /**
     * The reference instance of <code>DB_ORIGIN_X</code>
     */
    public static final DbOriginX DB_ORIGIN_X = new DbOriginX();

    /**
     * The table <code>DB_ORIGIN_X.O_USER</code>.
     */
    public final OUser O_USER = cn.vertxup.ix.domain.tables.OUser.O_USER;

    /**
     * The table <code>DB_ORIGIN_X.S_ACTION</code>.
     */
    public final SAction S_ACTION = cn.vertxup.ix.domain.tables.SAction.S_ACTION;

    /**
     * The table <code>DB_ORIGIN_X.S_GROUP</code>.
     */
    public final SGroup S_GROUP = cn.vertxup.ix.domain.tables.SGroup.S_GROUP;

    /**
     * The table <code>DB_ORIGIN_X.S_PERMISSION</code>.
     */
    public final SPermission S_PERMISSION = cn.vertxup.ix.domain.tables.SPermission.S_PERMISSION;

    /**
     * The table <code>DB_ORIGIN_X.S_REL_GROUP_ROLE</code>.
     */
    public final SRelGroupRole S_REL_GROUP_ROLE = cn.vertxup.ix.domain.tables.SRelGroupRole.S_REL_GROUP_ROLE;

    /**
     * The table <code>DB_ORIGIN_X.S_REL_PERM_ACTION</code>.
     */
    public final SRelPermAction S_REL_PERM_ACTION = cn.vertxup.ix.domain.tables.SRelPermAction.S_REL_PERM_ACTION;

    /**
     * The table <code>DB_ORIGIN_X.S_REL_RESOURCE_MATRIX</code>.
     */
    public final SRelResourceMatrix S_REL_RESOURCE_MATRIX = cn.vertxup.ix.domain.tables.SRelResourceMatrix.S_REL_RESOURCE_MATRIX;

    /**
     * The table <code>DB_ORIGIN_X.S_REL_ROLE_PERM</code>.
     */
    public final SRelRolePerm S_REL_ROLE_PERM = cn.vertxup.ix.domain.tables.SRelRolePerm.S_REL_ROLE_PERM;

    /**
     * The table <code>DB_ORIGIN_X.S_REL_USER_GROUP</code>.
     */
    public final SRelUserGroup S_REL_USER_GROUP = cn.vertxup.ix.domain.tables.SRelUserGroup.S_REL_USER_GROUP;

    /**
     * The table <code>DB_ORIGIN_X.S_REL_USER_ROLE</code>.
     */
    public final SRelUserRole S_REL_USER_ROLE = cn.vertxup.ix.domain.tables.SRelUserRole.S_REL_USER_ROLE;

    /**
     * The table <code>DB_ORIGIN_X.S_RESOURCE</code>.
     */
    public final SResource S_RESOURCE = cn.vertxup.ix.domain.tables.SResource.S_RESOURCE;

    /**
     * The table <code>DB_ORIGIN_X.S_ROLE</code>.
     */
    public final SRole S_ROLE = cn.vertxup.ix.domain.tables.SRole.S_ROLE;

    /**
     * The table <code>DB_ORIGIN_X.S_USER</code>.
     */
    public final SUser S_USER = cn.vertxup.ix.domain.tables.SUser.S_USER;

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
            OUser.O_USER,
            SAction.S_ACTION,
            SGroup.S_GROUP,
            SPermission.S_PERMISSION,
            SRelGroupRole.S_REL_GROUP_ROLE,
            SRelPermAction.S_REL_PERM_ACTION,
            SRelResourceMatrix.S_REL_RESOURCE_MATRIX,
            SRelRolePerm.S_REL_ROLE_PERM,
            SRelUserGroup.S_REL_USER_GROUP,
            SRelUserRole.S_REL_USER_ROLE,
            SResource.S_RESOURCE,
            SRole.S_ROLE,
            SUser.S_USER);
    }
}

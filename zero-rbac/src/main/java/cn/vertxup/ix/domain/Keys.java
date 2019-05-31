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
import cn.vertxup.ix.domain.tables.records.OUserRecord;
import cn.vertxup.ix.domain.tables.records.SActionRecord;
import cn.vertxup.ix.domain.tables.records.SGroupRecord;
import cn.vertxup.ix.domain.tables.records.SPermissionRecord;
import cn.vertxup.ix.domain.tables.records.SRelGroupRoleRecord;
import cn.vertxup.ix.domain.tables.records.SRelPermActionRecord;
import cn.vertxup.ix.domain.tables.records.SRelResourceMatrixRecord;
import cn.vertxup.ix.domain.tables.records.SRelRolePermRecord;
import cn.vertxup.ix.domain.tables.records.SRelUserGroupRecord;
import cn.vertxup.ix.domain.tables.records.SRelUserRoleRecord;
import cn.vertxup.ix.domain.tables.records.SResourceRecord;
import cn.vertxup.ix.domain.tables.records.SRoleRecord;
import cn.vertxup.ix.domain.tables.records.SUserRecord;

import javax.annotation.Generated;

import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>DB_ORIGIN_X</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<OUserRecord> KEY_O_USER_PRIMARY = UniqueKeys0.KEY_O_USER_PRIMARY;
    public static final UniqueKey<OUserRecord> KEY_O_USER_CLIENT_SECRET = UniqueKeys0.KEY_O_USER_CLIENT_SECRET;
    public static final UniqueKey<OUserRecord> KEY_O_USER_CLIENT_ID = UniqueKeys0.KEY_O_USER_CLIENT_ID;
    public static final UniqueKey<SActionRecord> KEY_S_ACTION_PRIMARY = UniqueKeys0.KEY_S_ACTION_PRIMARY;
    public static final UniqueKey<SActionRecord> KEY_S_ACTION_CODE = UniqueKeys0.KEY_S_ACTION_CODE;
    public static final UniqueKey<SActionRecord> KEY_S_ACTION_RESOURCE_ID = UniqueKeys0.KEY_S_ACTION_RESOURCE_ID;
    public static final UniqueKey<SGroupRecord> KEY_S_GROUP_PRIMARY = UniqueKeys0.KEY_S_GROUP_PRIMARY;
    public static final UniqueKey<SGroupRecord> KEY_S_GROUP_CODE = UniqueKeys0.KEY_S_GROUP_CODE;
    public static final UniqueKey<SGroupRecord> KEY_S_GROUP_MODEL_ID = UniqueKeys0.KEY_S_GROUP_MODEL_ID;
    public static final UniqueKey<SPermissionRecord> KEY_S_PERMISSION_PRIMARY = UniqueKeys0.KEY_S_PERMISSION_PRIMARY;
    public static final UniqueKey<SPermissionRecord> KEY_S_PERMISSION_CODE = UniqueKeys0.KEY_S_PERMISSION_CODE;
    public static final UniqueKey<SRelGroupRoleRecord> KEY_S_REL_GROUP_ROLE_PRIMARY = UniqueKeys0.KEY_S_REL_GROUP_ROLE_PRIMARY;
    public static final UniqueKey<SRelPermActionRecord> KEY_S_REL_PERM_ACTION_PRIMARY = UniqueKeys0.KEY_S_REL_PERM_ACTION_PRIMARY;
    public static final UniqueKey<SRelResourceMatrixRecord> KEY_S_REL_RESOURCE_MATRIX_PRIMARY = UniqueKeys0.KEY_S_REL_RESOURCE_MATRIX_PRIMARY;
    public static final UniqueKey<SRelRolePermRecord> KEY_S_REL_ROLE_PERM_PRIMARY = UniqueKeys0.KEY_S_REL_ROLE_PERM_PRIMARY;
    public static final UniqueKey<SRelUserGroupRecord> KEY_S_REL_USER_GROUP_PRIMARY = UniqueKeys0.KEY_S_REL_USER_GROUP_PRIMARY;
    public static final UniqueKey<SRelUserRoleRecord> KEY_S_REL_USER_ROLE_PRIMARY = UniqueKeys0.KEY_S_REL_USER_ROLE_PRIMARY;
    public static final UniqueKey<SResourceRecord> KEY_S_RESOURCE_PRIMARY = UniqueKeys0.KEY_S_RESOURCE_PRIMARY;
    public static final UniqueKey<SResourceRecord> KEY_S_RESOURCE_API_KEY = UniqueKeys0.KEY_S_RESOURCE_API_KEY;
    public static final UniqueKey<SRoleRecord> KEY_S_ROLE_PRIMARY = UniqueKeys0.KEY_S_ROLE_PRIMARY;
    public static final UniqueKey<SRoleRecord> KEY_S_ROLE_CODE = UniqueKeys0.KEY_S_ROLE_CODE;
    public static final UniqueKey<SUserRecord> KEY_S_USER_PRIMARY = UniqueKeys0.KEY_S_USER_PRIMARY;
    public static final UniqueKey<SUserRecord> KEY_S_USER_USERNAME = UniqueKeys0.KEY_S_USER_USERNAME;
    public static final UniqueKey<SUserRecord> KEY_S_USER_MOBILE = UniqueKeys0.KEY_S_USER_MOBILE;
    public static final UniqueKey<SUserRecord> KEY_S_USER_EMAIL = UniqueKeys0.KEY_S_USER_EMAIL;
    public static final UniqueKey<SUserRecord> KEY_S_USER_SECRET = UniqueKeys0.KEY_S_USER_SECRET;
    public static final UniqueKey<SUserRecord> KEY_S_USER_MODEL_ID = UniqueKeys0.KEY_S_USER_MODEL_ID;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class UniqueKeys0 {
        public static final UniqueKey<OUserRecord> KEY_O_USER_PRIMARY = Internal.createUniqueKey(OUser.O_USER, "KEY_O_USER_PRIMARY", OUser.O_USER.KEY);
        public static final UniqueKey<OUserRecord> KEY_O_USER_CLIENT_SECRET = Internal.createUniqueKey(OUser.O_USER, "KEY_O_USER_CLIENT_SECRET", OUser.O_USER.CLIENT_SECRET);
        public static final UniqueKey<OUserRecord> KEY_O_USER_CLIENT_ID = Internal.createUniqueKey(OUser.O_USER, "KEY_O_USER_CLIENT_ID", OUser.O_USER.CLIENT_ID);
        public static final UniqueKey<SActionRecord> KEY_S_ACTION_PRIMARY = Internal.createUniqueKey(SAction.S_ACTION, "KEY_S_ACTION_PRIMARY", SAction.S_ACTION.KEY);
        public static final UniqueKey<SActionRecord> KEY_S_ACTION_CODE = Internal.createUniqueKey(SAction.S_ACTION, "KEY_S_ACTION_CODE", SAction.S_ACTION.CODE, SAction.S_ACTION.APP_KEY);
        public static final UniqueKey<SActionRecord> KEY_S_ACTION_RESOURCE_ID = Internal.createUniqueKey(SAction.S_ACTION, "KEY_S_ACTION_RESOURCE_ID", SAction.S_ACTION.RESOURCE_ID);
        public static final UniqueKey<SGroupRecord> KEY_S_GROUP_PRIMARY = Internal.createUniqueKey(SGroup.S_GROUP, "KEY_S_GROUP_PRIMARY", SGroup.S_GROUP.KEY);
        public static final UniqueKey<SGroupRecord> KEY_S_GROUP_CODE = Internal.createUniqueKey(SGroup.S_GROUP, "KEY_S_GROUP_CODE", SGroup.S_GROUP.CODE, SGroup.S_GROUP.APP_KEY);
        public static final UniqueKey<SGroupRecord> KEY_S_GROUP_MODEL_ID = Internal.createUniqueKey(SGroup.S_GROUP, "KEY_S_GROUP_MODEL_ID", SGroup.S_GROUP.MODEL_ID, SGroup.S_GROUP.MODEL_KEY);
        public static final UniqueKey<SPermissionRecord> KEY_S_PERMISSION_PRIMARY = Internal.createUniqueKey(SPermission.S_PERMISSION, "KEY_S_PERMISSION_PRIMARY", SPermission.S_PERMISSION.KEY);
        public static final UniqueKey<SPermissionRecord> KEY_S_PERMISSION_CODE = Internal.createUniqueKey(SPermission.S_PERMISSION, "KEY_S_PERMISSION_CODE", SPermission.S_PERMISSION.CODE, SPermission.S_PERMISSION.APP_KEY);
        public static final UniqueKey<SRelGroupRoleRecord> KEY_S_REL_GROUP_ROLE_PRIMARY = Internal.createUniqueKey(SRelGroupRole.S_REL_GROUP_ROLE, "KEY_S_REL_GROUP_ROLE_PRIMARY", SRelGroupRole.S_REL_GROUP_ROLE.GROUP_ID, SRelGroupRole.S_REL_GROUP_ROLE.ROLE_ID);
        public static final UniqueKey<SRelPermActionRecord> KEY_S_REL_PERM_ACTION_PRIMARY = Internal.createUniqueKey(SRelPermAction.S_REL_PERM_ACTION, "KEY_S_REL_PERM_ACTION_PRIMARY", SRelPermAction.S_REL_PERM_ACTION.PERM_ID, SRelPermAction.S_REL_PERM_ACTION.ACTION_ID);
        public static final UniqueKey<SRelResourceMatrixRecord> KEY_S_REL_RESOURCE_MATRIX_PRIMARY = Internal.createUniqueKey(SRelResourceMatrix.S_REL_RESOURCE_MATRIX, "KEY_S_REL_RESOURCE_MATRIX_PRIMARY", SRelResourceMatrix.S_REL_RESOURCE_MATRIX.KEY);
        public static final UniqueKey<SRelRolePermRecord> KEY_S_REL_ROLE_PERM_PRIMARY = Internal.createUniqueKey(SRelRolePerm.S_REL_ROLE_PERM, "KEY_S_REL_ROLE_PERM_PRIMARY", SRelRolePerm.S_REL_ROLE_PERM.PERM_ID, SRelRolePerm.S_REL_ROLE_PERM.ROLE_ID);
        public static final UniqueKey<SRelUserGroupRecord> KEY_S_REL_USER_GROUP_PRIMARY = Internal.createUniqueKey(SRelUserGroup.S_REL_USER_GROUP, "KEY_S_REL_USER_GROUP_PRIMARY", SRelUserGroup.S_REL_USER_GROUP.GROUP_ID, SRelUserGroup.S_REL_USER_GROUP.ROLE_ID);
        public static final UniqueKey<SRelUserRoleRecord> KEY_S_REL_USER_ROLE_PRIMARY = Internal.createUniqueKey(SRelUserRole.S_REL_USER_ROLE, "KEY_S_REL_USER_ROLE_PRIMARY", SRelUserRole.S_REL_USER_ROLE.USER_ID, SRelUserRole.S_REL_USER_ROLE.ROLE_ID);
        public static final UniqueKey<SResourceRecord> KEY_S_RESOURCE_PRIMARY = Internal.createUniqueKey(SResource.S_RESOURCE, "KEY_S_RESOURCE_PRIMARY", SResource.S_RESOURCE.KEY);
        public static final UniqueKey<SResourceRecord> KEY_S_RESOURCE_API_KEY = Internal.createUniqueKey(SResource.S_RESOURCE, "KEY_S_RESOURCE_API_KEY", SResource.S_RESOURCE.API_KEY, SResource.S_RESOURCE.TYPE);
        public static final UniqueKey<SRoleRecord> KEY_S_ROLE_PRIMARY = Internal.createUniqueKey(SRole.S_ROLE, "KEY_S_ROLE_PRIMARY", SRole.S_ROLE.KEY);
        public static final UniqueKey<SRoleRecord> KEY_S_ROLE_CODE = Internal.createUniqueKey(SRole.S_ROLE, "KEY_S_ROLE_CODE", SRole.S_ROLE.CODE, SRole.S_ROLE.APP_KEY);
        public static final UniqueKey<SUserRecord> KEY_S_USER_PRIMARY = Internal.createUniqueKey(SUser.S_USER, "KEY_S_USER_PRIMARY", SUser.S_USER.KEY);
        public static final UniqueKey<SUserRecord> KEY_S_USER_USERNAME = Internal.createUniqueKey(SUser.S_USER, "KEY_S_USER_USERNAME", SUser.S_USER.USERNAME);
        public static final UniqueKey<SUserRecord> KEY_S_USER_MOBILE = Internal.createUniqueKey(SUser.S_USER, "KEY_S_USER_MOBILE", SUser.S_USER.MOBILE);
        public static final UniqueKey<SUserRecord> KEY_S_USER_EMAIL = Internal.createUniqueKey(SUser.S_USER, "KEY_S_USER_EMAIL", SUser.S_USER.EMAIL);
        public static final UniqueKey<SUserRecord> KEY_S_USER_SECRET = Internal.createUniqueKey(SUser.S_USER, "KEY_S_USER_SECRET", SUser.S_USER.SECRET);
        public static final UniqueKey<SUserRecord> KEY_S_USER_MODEL_ID = Internal.createUniqueKey(SUser.S_USER, "KEY_S_USER_MODEL_ID", SUser.S_USER.MODEL_ID, SUser.S_USER.MODEL_KEY);
    }
}

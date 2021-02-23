package com.tyc.returnJson;

/**
 * @Auther: tangyanchang
 * @Date: 2021/2/20 - 21:03
 * @Description: com.tyc.returnJson
 * @version: 1.0
 */
public class Permission {
    private String permissionId;

    public Permission() {
    }

    public Permission(String permissionId) {
        this.permissionId = permissionId;
    }

    public String getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(String permissionId) {
        this.permissionId = permissionId;
    }

    @Override
    public String toString() {
        return "Permission{" +
                "permissionId='" + permissionId + '\'' +
                '}';
    }
}

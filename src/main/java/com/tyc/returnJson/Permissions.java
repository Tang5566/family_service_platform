package com.tyc.returnJson;

import java.util.List;

/**
 * @Auther: tangyanchang
 * @Date: 2021/2/20 - 21:05
 * @Description: com.tyc.returnJson
 * @version: 1.0
 */
public class Permissions {
    private List<Permission> permissions;

    public List<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }

    @Override
    public String toString() {
        return "Permissions{" +
                "permissions=" + permissions +
                '}';
    }
}

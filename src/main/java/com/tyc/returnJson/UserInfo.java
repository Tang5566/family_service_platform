package com.tyc.returnJson;

/**
 * @Auther: tangyanchang
 * @Date: 2021/2/20 - 21:05
 * @Description: com.tyc.returnJson
 * @version: 1.0
 */
public class UserInfo {
    private String name;
    private String avatar = "/avatar2.jpg";
    private Permissions role;

    public UserInfo(String name, Permissions role) {
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Permissions getRole() {
        return role;
    }

    public void setRole(Permissions role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "name='" + name + '\'' +
                ", avatar='" + avatar + '\'' +
                ", role=" + role +
                '}';
    }
}

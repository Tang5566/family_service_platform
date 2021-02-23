package com.tyc.controller;

import com.alibaba.fastjson.JSONObject;
import com.tyc.bean.TblUserRecord;
import com.tyc.returnJson.Permission;
import com.tyc.returnJson.Permissions;
import com.tyc.returnJson.ReturnObject;
import com.tyc.returnJson.UserInfo;
import com.tyc.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: tangyanchang
 * @Date: 2021/2/19 - 17:36
 * @Description: com.tyc.controller
 * @version: 1.0
 */
@RestController
@CrossOrigin(originPatterns = "*",allowedHeaders = "*",methods = {},allowCredentials = "true")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping("/auth/2step-code")
    public Boolean test(){
        System.out.println("前端框架自带的一个验证规则！");
        return true;
    }

    @RequestMapping("/auth/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password, HttpSession session){
        System.out.println("login");
        TblUserRecord tblUserRecord = loginService.login(username,password);
//        System.out.println(username+";"+password);
        tblUserRecord.setToken(tblUserRecord.getUserName());
        System.out.println(tblUserRecord);
        session.setAttribute("userRecord",tblUserRecord);
        System.out.println(session.getId());
        ReturnObject returnObject = new ReturnObject(tblUserRecord);
        return JSONObject.toJSONString(returnObject);
    }

    @RequestMapping("/user/info")
    public String getInfo(HttpSession session){
        //获取sessiond对象
        TblUserRecord tblUserRecord = (TblUserRecord) session.getAttribute("userRecord");
        System.out.println("----1----" + tblUserRecord);
        String[] split = tblUserRecord.getTblRole().getRolePrivileges().split("-");
        //拼接返回前台对象
        List<Permission> permissionList = new ArrayList<>();
        Permissions permissions = new Permissions();
        System.out.println("--------" + permissions);
        //设置权限对象
        for (String s : split) {
            permissionList.add(new Permission(s));
        }
        permissions.setPermissions(permissionList);
        System.out.println("-----end" + permissions);
        //设置返回UserInfo对象
        UserInfo userInfo = new UserInfo(tblUserRecord.getUserName(), permissions);
        System.out.println(userInfo);
        ReturnObject returnObject = new ReturnObject(userInfo);
        return JSONObject.toJSONString(returnObject);
    }
}

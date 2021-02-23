package com.tyc.controller;

import com.alibaba.fastjson.JSONObject;
import com.tyc.bean.TblCompany;
import com.tyc.returnJson.ReturnObject;
import com.tyc.service.EstateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Auther: tangyanchang
 * @Date: 2021/2/22 - 21:31
 * @Description: com.tyc.controller
 * @version: 1.0
 */
@RestController
public class EstateController {

    @Autowired
    private EstateService estateService;

    @RequestMapping("/estate/selectCompany")
    public String selectCompany(){
        System.out.println("selectCompany");
        List<TblCompany> companies = estateService.selectCompany();
        return JSONObject.toJSONString(new ReturnObject(companies));
    }
}

package com.tyc.service;

import com.tyc.bean.TblUserRecord;
import com.tyc.mapper.TblUserRecordMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: tangyanchang
 * @Date: 2021/2/19 - 20:12
 * @Description: com.tyc.service
 * @version: 1.0
 */
@Service
public class LoginService {

    @Autowired
    private TblUserRecordMapper tblUserRecordMapper;

    public TblUserRecord login(String username, String password){
        System.out.println(username+"---"+password);
        return tblUserRecordMapper.login(username,password);
    }
}

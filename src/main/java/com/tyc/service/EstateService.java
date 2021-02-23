package com.tyc.service;

import com.tyc.bean.TblCompany;
import com.tyc.mapper.TblCompanyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: tangyanchang
 * @Date: 2021/2/22 - 21:34
 * @Description: com.tyc.service
 * @version: 1.0
 */
@Service
public class EstateService {

    @Autowired
    private TblCompanyMapper tblCompanyMapper;

    public List<TblCompany> selectCompany(){
        List<TblCompany> companys = tblCompanyMapper.selectCompany();
        return companys;
    }
}

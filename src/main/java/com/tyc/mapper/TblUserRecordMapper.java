package com.tyc.mapper;

import com.tyc.bean.TblUserRecord;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 用户档案 Mapper 接口
 * </p>
 *
 * @author tyc
 * @since 2021-02-20
 */
@Component
public interface TblUserRecordMapper extends BaseMapper<TblUserRecord> {
    /**
     * 登录
     * @param username
     * @param password
     * @return
     */
    public TblUserRecord login(@Param("username") String username, @Param("password") String password);
}

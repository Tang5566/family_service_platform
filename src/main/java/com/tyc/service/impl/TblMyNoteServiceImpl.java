package com.tyc.service.impl;

import com.tyc.bean.TblMyNote;
import com.tyc.mapper.TblMyNoteMapper;
import com.tyc.service.TblMyNoteService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 我的记事本 服务实现类
 * </p>
 *
 * @author tyc
 * @since 2021-02-20
 */
@Service
public class TblMyNoteServiceImpl extends ServiceImpl<TblMyNoteMapper, TblMyNote> implements TblMyNoteService {

}

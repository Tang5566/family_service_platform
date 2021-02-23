package com.tyc.service.impl;

import com.tyc.bean.TblTodo;
import com.tyc.mapper.TblTodoMapper;
import com.tyc.service.TblTodoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 待办事项 服务实现类
 * </p>
 *
 * @author tyc
 * @since 2021-02-20
 */
@Service
public class TblTodoServiceImpl extends ServiceImpl<TblTodoMapper, TblTodo> implements TblTodoService {

}

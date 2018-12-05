package com.alog.pay.mapper;

import java.util.List;

import com.alog.pay.model.Task;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface TaskMapper extends BaseMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Task record);

    Task selectByPrimaryKey(Long id);

    List<Task> selectAll();

    int updateByPrimaryKey(Task record);
}
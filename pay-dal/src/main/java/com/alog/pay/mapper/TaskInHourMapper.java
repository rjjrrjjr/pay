package com.alog.pay.mapper;

import java.util.List;

import com.alog.pay.model.TaskInHour;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface TaskInHourMapper extends BaseMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TaskInHour record);

    TaskInHour selectByPrimaryKey(Long id);

    List<TaskInHour> selectAll();

    int updateByPrimaryKey(TaskInHour record);
}
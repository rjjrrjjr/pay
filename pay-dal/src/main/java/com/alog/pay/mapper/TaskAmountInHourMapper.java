package com.alog.pay.mapper;

import java.util.List;

import com.alog.pay.model.TaskAmountInHour;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface TaskAmountInHourMapper extends BaseMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TaskAmountInHour record);

    TaskAmountInHour selectByPrimaryKey(Long id);

    List<TaskAmountInHour> selectAll();

    int updateByPrimaryKey(TaskAmountInHour record);
}
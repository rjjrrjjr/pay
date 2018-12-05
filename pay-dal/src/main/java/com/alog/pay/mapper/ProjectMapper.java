package com.alog.pay.mapper;

import java.util.List;

import com.alog.pay.model.Project;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface ProjectMapper extends BaseMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Project record);

    Project selectByPrimaryKey(Long id);

    List<Project> selectAll();

    int updateByPrimaryKey(Project record);
}
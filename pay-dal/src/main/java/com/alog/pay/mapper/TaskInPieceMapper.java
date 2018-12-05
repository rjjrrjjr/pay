package com.alog.pay.mapper;

import java.util.List;

import com.alog.pay.model.TaskInPiece;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface TaskInPieceMapper extends BaseMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TaskInPiece record);

    TaskInPiece selectByPrimaryKey(Long id);

    List<TaskInPiece> selectAll();

    int updateByPrimaryKey(TaskInPiece record);
}
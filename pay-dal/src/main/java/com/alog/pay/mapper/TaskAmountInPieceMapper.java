package com.alog.pay.mapper;

import java.util.List;

import com.alog.pay.model.TaskAmountInPiece;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface TaskAmountInPieceMapper extends BaseMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TaskAmountInPiece record);

    TaskAmountInPiece selectByPrimaryKey(Long id);

    List<TaskAmountInPiece> selectAll();

    int updateByPrimaryKey(TaskAmountInPiece record);
}
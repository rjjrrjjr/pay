package com.alog.pay.mapper;

import java.util.List;

import com.alog.pay.model.Wages;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface WagesMapper extends BaseMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Wages record);

    Wages selectByPrimaryKey(Long id);

    List<Wages> selectAll();

    int updateByPrimaryKey(Wages record);
}
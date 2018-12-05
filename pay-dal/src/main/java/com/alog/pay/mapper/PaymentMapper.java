package com.alog.pay.mapper;

import java.util.List;

import com.alog.pay.model.Payment;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface PaymentMapper extends BaseMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Payment record);

    Payment selectByPrimaryKey(Long id);

    List<Payment> selectAll();

    int updateByPrimaryKey(Payment record);
}
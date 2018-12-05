package com.alog.pay.mapper;

import java.util.List;

import com.alog.pay.model.Employee;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface EmployeeMapper extends BaseMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Employee record);

    Employee selectByPrimaryKey(Long id);

    List<Employee> selectAll();

    int updateByPrimaryKey(Employee record);
}
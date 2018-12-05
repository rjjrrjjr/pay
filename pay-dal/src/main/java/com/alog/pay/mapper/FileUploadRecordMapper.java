package com.alog.pay.mapper;

import java.util.List;

import com.alog.pay.model.FileUploadRecord;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface FileUploadRecordMapper extends BaseMapper {
    int deleteByPrimaryKey(Long id);

    int insert(FileUploadRecord record);

    FileUploadRecord selectByPrimaryKey(Long id);

    List<FileUploadRecord> selectAll();

    int updateByPrimaryKey(FileUploadRecord record);
}
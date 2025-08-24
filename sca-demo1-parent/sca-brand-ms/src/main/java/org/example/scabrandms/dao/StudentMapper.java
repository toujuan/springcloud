package org.example.scabrandms.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.example.scabrandms.model.Student;

@Mapper
public interface StudentMapper extends BaseMapper<Student> {
}

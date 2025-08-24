package org.example.scabrandms.service.impl;

import org.example.scabrandms.dao.StudentMapper;
import org.example.scabrandms.model.Student;
import org.example.scabrandms.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;
    @Override
    public Student findById(Integer id) {
        return studentMapper.selectById(id);
    }
}

package com.parlakberkan.services.impl;

import com.parlakberkan.entities.Student;
import com.parlakberkan.repository.StudentRepository;
import com.parlakberkan.services.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements IStudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }
}

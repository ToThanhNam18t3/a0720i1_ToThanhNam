package com.test.jpatest.service;

import com.test.jpatest.model.Student;
import com.test.jpatest.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface StudentService {
    List<Student> findAll();
    void save(Student student);
    void delete(int id);
    Student findById(int id);
}

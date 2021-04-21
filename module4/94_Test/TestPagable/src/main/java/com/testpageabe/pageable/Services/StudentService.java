package com.testpageabe.pageable.Services;

import com.testpageabe.pageable.Model.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAll();
    void save(Student student);
    void delete(int id);
    Student findById(int id);
}

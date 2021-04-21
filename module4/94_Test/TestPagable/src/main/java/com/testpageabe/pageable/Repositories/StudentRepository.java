package com.testpageabe.pageable.Repositories;
import com.testpageabe.pageable.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {

}

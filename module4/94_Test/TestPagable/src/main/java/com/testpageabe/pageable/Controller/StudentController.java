package com.testpageabe.pageable.Controller;

import com.testpageabe.pageable.Model.Student;
import com.testpageabe.pageable.Repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {
    @Autowired
    StudentRepository studentRepository;

    @GetMapping("/")
    public ModelAndView getStudentList(){
        return new ModelAndView("list", "student", new Student());
    }
}

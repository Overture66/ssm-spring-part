package com.sc.controller;

import com.sc.pojo.Student;
import com.sc.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;
@Controller
public class StudentController {

    @Autowired
    public StudentService studentService;


    public void findAll(){
        List<Student> all = studentService.findAll();
        System.out.println("全部数据为:" + all);
    }
}


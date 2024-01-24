package com.sc.controller;

import com.sc.pojo.Student;
import com.sc.service.StudentService;

import java.util.List;

public class StudentController {

    public StudentService studentService;

    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    public void findAll(){
        List<Student> all = studentService.findAll();
        System.out.println("全部数据为:" + all);
    }
}


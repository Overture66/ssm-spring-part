package com.sc.dao.impl;

import com.sc.dao.StudentDao;
import com.sc.pojo.Student;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class StudentDaoImpl implements StudentDao {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Student> queryAll() {

        String sql = "select id , name , age , gender , class as classes from students ;";

        List<Student> studentList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Student.class));

        System.out.println("studentDao:" + studentList);

        return studentList;
    }
}

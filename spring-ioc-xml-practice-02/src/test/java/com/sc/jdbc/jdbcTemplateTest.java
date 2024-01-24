package com.sc.jdbc;

import com.sc.pojo.Student;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class jdbcTemplateTest {

    @Test
    public void testForIoc(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring-01.xml");

        JdbcTemplate jdbcTemplate = classPathXmlApplicationContext.getBean("jdbcTemplate", JdbcTemplate.class);

        String sql="insert into students (name, gender, age, class) values(?,?,?,?);";

        int num = jdbcTemplate.update(sql, "尚硅谷", "男", 18, "三年二班");

        System.out.println("num = " + num);

        sql="select * from students where id=?;";

        Student student = jdbcTemplate.queryForObject(sql,  (rs, rowNum) -> {
            //自己处理结果映射
            Student stu = new Student();
            stu.setId(rs.getInt("id"));
            stu.setName(rs.getString("name"));
            stu.setAge(rs.getInt("age"));
            stu.setGender(rs.getString("gender"));
            stu.setClasses(rs.getString("class"));
            return stu;
        }, 2);

        System.out.println("student = " + student);

        sql = "select id , name , age , gender , class as classes from students ;";

        List<Student> studentList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Student.class));

        System.out.println("studentList = " + studentList);
    }
}

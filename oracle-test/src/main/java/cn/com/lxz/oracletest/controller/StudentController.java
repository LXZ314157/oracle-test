package cn.com.lxz.oracletest.controller;

import cn.com.lxz.oracletest.domain.Student;
import cn.com.lxz.oracletest.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService userService;

    @GetMapping("/{id}")
    public Student getUserByid(@PathVariable Integer id){
        Student student = userService.getStudentBySid(id);
        return student;
    }

}

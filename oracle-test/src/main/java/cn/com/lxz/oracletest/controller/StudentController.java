package cn.com.lxz.oracletest.controller;

import cn.com.lxz.oracletest.domain.Student;
import cn.com.lxz.oracletest.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/{id}")
    public Student getStudentBySid(@PathVariable Integer id){
        Student student = studentService.getStudentBySid(id);
        return student;
    }

    @GetMapping("/list")
    public List<Student> getStudentList(){
        List<Student> list = studentService.getStudentList();
        return list;
    }

}

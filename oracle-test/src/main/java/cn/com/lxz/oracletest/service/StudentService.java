package cn.com.lxz.oracletest.service;

import cn.com.lxz.oracletest.domain.Student;

import java.util.List;

public interface StudentService {

    public Student getStudentBySid(Integer id);

    public List<Student> getStudentList();

}

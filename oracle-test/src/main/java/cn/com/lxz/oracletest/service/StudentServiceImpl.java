package cn.com.lxz.oracletest.service;

import cn.com.lxz.oracletest.domain.Student;
import cn.com.lxz.oracletest.mapper.StudentMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentMapper studentMapper;

    @Override
    public Student getStudentBySid(Integer id) {
        return studentMapper.getStudentBySid(id);
    }

    @Override
    public List<Student> getStudentList() {
        return studentMapper.getStudentList();
    }
}

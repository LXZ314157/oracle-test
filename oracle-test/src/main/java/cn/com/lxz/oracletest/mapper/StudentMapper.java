package cn.com.lxz.oracletest.mapper;

import cn.com.lxz.oracletest.domain.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper {

    public Student getStudentBySid(Integer id);

    public List<Student> getStudentList();

}

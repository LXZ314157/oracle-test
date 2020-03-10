package cn.com.lxz.oracletest.mapper;

import cn.com.lxz.oracletest.domain.Student;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudentMapper {

    public Student getStudentBySid(Integer id);

}

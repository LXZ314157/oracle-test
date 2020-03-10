package cn.com.lxz.oracletest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.com.lxz.oracletest.mapper")
public class OracleTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(OracleTestApplication.class, args);
    }

}

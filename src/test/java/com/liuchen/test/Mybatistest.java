package com.liuchen.test;

import com.liuchen.mappers.EmployeeMapper;
import com.liuchen.models.Employee;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

/**
 * Package: com.liuchen.test
 * Description:
 *
 * @Author: Liu-Chen-CS
 * @Create: 3/4/2024 - 5:02 PM
 * @Version: v1.0
 */
public class Mybatistest {
    @Test
    public void test_01() throws IOException {
        // Load MyBatis configuration file
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");

        // Create SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        // Open session
        SqlSession sqlSession = sqlSessionFactory.openSession();

        EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
        Employee employee = employeeMapper.queryById(2);
        System.out.println(employee);


        // Commit session
        sqlSession.commit();
        sqlSession.close();
    }
}

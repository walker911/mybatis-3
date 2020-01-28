package com.walker.ibatis;

import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.datasource.pooled.PooledDataSourceFactory;
import org.apache.ibatis.datasource.unpooled.UnpooledDataSource;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;
import org.junit.jupiter.api.Test;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * <p>
 *
 * </p>
 *
 * @author mu qin
 * @date 2020/1/19
 */
public class SqlSessionTest {

  @Test
  void buildSqlSessionFactoryWithXML() throws IOException {
    String resource = "com/walker/ibatis/mybatis-config.xml";
    InputStream in = Resources.getResourceAsStream(resource);
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
    assertEquals("development", sqlSessionFactory.getConfiguration().getEnvironment().getId());
  }

  @Test
  void buildSqlSessionFactoryWithJava() {
    DataSource dataSource = new PooledDataSource("com.mysql.cj.jdbc.Driver",
      "jdbc:mysql://localhost:3306/test?useUnicode=true&amp;characterEncoding=UTF-8&amp;useSSL=false&amp;serverTimezone=Asia/Shanghai",
      "root", "root");
    TransactionFactory transactionFactory = new JdbcTransactionFactory();
    Environment environment = new Environment("development", transactionFactory, dataSource);
    Configuration config = new Configuration(environment);
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(config);
    assertEquals("development", sqlSessionFactory.getConfiguration().getEnvironment().getId());
  }
}

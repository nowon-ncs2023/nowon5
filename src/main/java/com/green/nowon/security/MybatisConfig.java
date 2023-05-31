package com.green.nowon.security;
import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

//@PropertySource("classpath:/application-mybatis.properties") //application.properties파일인경우 생략가능
//@MapperScan("com.green.nowon.mapper")
@Configuration
public class MybatisConfig { //myBatisConfig
	
	@Bean
	public DataSource dataSource() {
		return new HikariDataSource(hikariConfig());
	}
	//DataSource dataSource=new HikariDataSource();
	
	//application.properties 에서 spring.datasource.hikari 식작하는 name항목들을 읽어서 HikariConfig에 자동반영
	@ConfigurationProperties(prefix = "spring.datasource.hikari")
	@Bean
	public HikariConfig hikariConfig() {
		return new HikariConfig();
	}
	
	
	@Autowired
	private ApplicationContext application;
	
	//mybatisㅇ설정
	//In base MyBatis, the SqlSessionFactory is built using SqlSessionFactoryBuilder. 
	//In MyBatis-Spring, SqlSessionFactoryBean is used instead.
	@Bean
	public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
		SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
		//System.out.println(">>>>"+dataSource);
		factoryBean.setDataSource(dataSource);//dataSource세팅
		
		String locationPattern="classpath:/static/mapper/**/*-mapper.xml";
		Resource[] mapperLocations=application.getResources(locationPattern);
		factoryBean.setMapperLocations(mapperLocations);
		factoryBean.setConfiguration(mybatisConfig());//org.apache.ibatis.session.Configuration
		
		return factoryBean.getObject();
	}
	//패키지정보.클래스정보
	@ConfigurationProperties(prefix = "mybatis.configuration")
	@Bean
	public org.apache.ibatis.session.Configuration mybatisConfig() {//myBatisConfig
		return new org.apache.ibatis.session.Configuration();
	}
	
	//SqlSessionFactory 객체: SqlSession공장 : SqlSession 객체를 만들어서 사용
	//http://mybatis.org/spring/sqlsession.html#SqlSessionDaoSupport
	@Bean
	public SqlSessionTemplate sqlSession(DataSource dataSource) throws Exception {
		return new SqlSessionTemplate(sqlSessionFactory(dataSource));
	}

}
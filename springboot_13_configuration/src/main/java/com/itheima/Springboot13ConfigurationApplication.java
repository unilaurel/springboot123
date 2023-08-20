package com.itheima;

import com.alibaba.druid.pool.DruidDataSource;
import com.itheima.config.ServletConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@EnableConfigurationProperties(ServletConfig.class)
@SpringBootApplication
public class Springboot13ConfigurationApplication {

	@Bean
	@ConfigurationProperties(prefix = "datasource")
	public DruidDataSource dataSource(){
		DruidDataSource ds = new DruidDataSource();
//		ds.setDriverClassName("com.mysql.jdbc.Driver");
		return ds;
	}

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(Springboot13ConfigurationApplication.class, args);
		ServletConfig bean = ctx.getBean(ServletConfig.class);
		System.out.println(bean);


		DruidDataSource ds = ctx.getBean(DruidDataSource.class);
		System.out.println(ds);
		System.out.println(ds.getDriverClassName());
	}

}

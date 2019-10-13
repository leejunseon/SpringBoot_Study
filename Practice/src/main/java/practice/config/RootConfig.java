package practice.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
public class RootConfig {

	@Bean
	public DataSource dataSource() {
		HikariConfig hikariConfig=new HikariConfig();
		hikariConfig.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		hikariConfig.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:XE");
		hikariConfig.setUsername("practice");
		hikariConfig.setPassword("dlwnstjs");
		
		HikariDataSource dataSource=new HikariDataSource(hikariConfig);
		return dataSource;
	}
}

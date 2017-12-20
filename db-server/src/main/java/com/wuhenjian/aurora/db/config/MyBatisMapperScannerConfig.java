package com.wuhenjian.aurora.db.config;

import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 無痕剑
 * @date 2017/12/20 13:58
 */
@Configuration
@AutoConfigureAfter(MybatisConfig.class)
public class MyBatisMapperScannerConfig {

	@Bean(name = "mapperScannerConfigurer")
	public MapperScannerConfigurer mapperScannerConfigurer() {
		MapperScannerConfigurer msc = new MapperScannerConfigurer();
		msc.setSqlSessionFactoryBeanName("sqlSessionFactoryBean");
		msc.setBasePackage("com.wuhenjian.aurora.db.dao.sql");
		return msc;
	}
}

package com.wuhenjian.aurora.db.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import java.io.IOException;
import java.sql.SQLException;

/**
 * @author 無痕剑
 * @date 2017/12/15 14:48
 */
@Configuration
public class DatabaseConfig {

	@Value("${mysql.datasource.driver}")
	private String driverName;

	@Value("${mysql.datasource.url}")
	private String url;

	@Value("${mysql.datasource.password}")
	private String password;

	@Value("${mysql.datasource.username}")
	private String username;

	@Value("${mysql.datasource.pool.initial-size}")
	private int initialSize;

	@Value("${mysql.datasource.pool.min-idle}")
	private int minIdle;

	@Value("${mysql.datasource.pool.max-wait}")
	private int maxWait;

	@Value("${mysql.datasource.pool.max-idle}")
	private int maxIdle;

	@Value("${mysql.datasource.max-active}")
	private int maxActive;

	@Value("${mysql.datasource.time-between-eviction-runs-millis}")
	private long timeBetweenEvictionRunsMillis;

	@Value("${mysql.datasource.min-evictable-idle-time-millis}")
	private long minEvictableIdleTimeMillis;

	@Value("${mysql.datasource.validation-query}")
	private String validationQuery;

	@Value("${mysql.datasource.testWhileIdle}")
	private boolean testWhileIdle;

	@Value("${mysql.datasource.testOnBorrow}")
	private boolean testOnBorrow;

	@Value("${mysql.datasource.testOnReturn}")
	private boolean testOnReturn;

	@Value("${mysql.datasource.pool-prepared-statements}")
	private boolean poolPreparedStatements;

	@Value("${mysql.datasource.max-pool-prepared-statement-per-connection-size}")
	private int maxPoolPreparedStatementPerConnectionSize;

	@Value("${spring.datasource.connectionProperties}")
	private String connectionProperties;

	@Value("${druid.filters}")
	private String filters;

	@Value("${druid.logSlowSql}")
	private String logSlowSql;

	@Value("${mysql.datasource.typea-alias-package}")
	private String typeAliasesPackage;

	/** mybatis 配置路径 */
	@Value("${mybatis.config-location}")
	private String mybatisConfigLocation;

	/** mybatis mapper resource 路径 */
	@Value("${mybatis.mapper-locations}")
	private String mybatisMapperLocations;

	@Value("${pagehelper.dialect}")
	private String dialect;

	@Value("${pagehelper.offsetAsPageNum}")
	private String offsetAsPageNum;

	@Value("pagehelper.rowBoundsWithCount")
	private boolean rowBoundsWithCount;

	@Value("pagehelper.pageSizeZero")
	private boolean pageSizeZero;

	@Value("pagehelper.reasonable")
	private boolean reasonable;

	@Value("pagehelper.supportMethodsArguments")
	private boolean supportMethodsArguments;

	@Value("pagehelper.returnPageInfo")
	private boolean returnPageInfo;

	@Bean(name = "datasource")
	public DruidDataSource druidDataSource() throws SQLException {
		DruidDataSource dds = new DruidDataSource();
		//数据源设置
		dds.setDriverClassName(driverName);
		dds.setUrl(url);
		dds.setUsername(username);
		dds.setPassword(password);
		//连接池设置
		dds.setInitialSize(initialSize);
		dds.setMinIdle(minIdle);
		dds.setMaxActive(maxActive);
		dds.setMaxWait(maxWait);
		dds.setTimeBetweenConnectErrorMillis(timeBetweenEvictionRunsMillis);
		dds.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);
		dds.setValidationQuery(validationQuery);
		dds.setTestOnBorrow(testOnBorrow);
		dds.setTestOnReturn(testOnReturn);
		dds.setTestWhileIdle(testWhileIdle);
		dds.setPoolPreparedStatements(poolPreparedStatements);
		dds.setMaxPoolPreparedStatementPerConnectionSize(maxPoolPreparedStatementPerConnectionSize);
		//druid监控设置
		dds.setFilters(filters);
		dds.setConnectionProperties(connectionProperties);
		//返回结果
		return dds;
	}

	@Bean(name = "sqlSessionFactoryBean")
	public SqlSessionFactoryBean sqlSessionFactoryBean() throws IOException, SQLException {
		Resource mclResource = new ClassPathResource(mybatisConfigLocation);
		ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
		Resource[] mmlResources = resolver.getResources(mybatisMapperLocations);
		SqlSessionFactoryBean ssfb = new SqlSessionFactoryBean();
		ssfb.setDataSource(this.druidDataSource());
		ssfb.setConfigLocation(mclResource);
		ssfb.setMapperLocations(mmlResources);
		ssfb.setTypeAliasesPackage(typeAliasesPackage);
		//TODO PageHelper插件配置，配置文件连接路径
		return ssfb;
	}

	@Bean(name = "dataSourceTransactionManager")
	public DataSourceTransactionManager dataSourceTransactionManager() throws SQLException {
		return new DataSourceTransactionManager(this.druidDataSource());
	}
}

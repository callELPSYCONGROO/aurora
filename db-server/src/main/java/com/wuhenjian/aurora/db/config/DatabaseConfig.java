package com.wuhenjian.aurora.db.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.github.pagehelper.PageInterceptor;
import org.apache.ibatis.plugin.Interceptor;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

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

    @Value("${mysql.datasource.initial-size}")
    private int initialSize;

    @Value("${mysql.datasource.min-idle}")
    private int minIdle;

    @Value("${mysql.datasource.max-wait}")
    private int maxWait;

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

    @Value("${mysql.datasource.connection-properties}")
    private String connectionProperties;

    @Value("${druid.filters}")
    private String filters;

    @Value("${druid.logSlowSql}")
    private String logSlowSql;
    /** mybatis mapper.xml 路径 */
    @Value("${mybatis.mapper-locations}")
    private String mybatisMapperLocations;
    /** mybatis mapper.java 路径 */
    @Value("${mybatis.mapper-java-locations}")
    private String mybatisMapperJavaLocations;

    @Bean(name = "druidDataSource")
    public DruidDataSource druidDataSource() throws SQLException {
        DruidDataSource dds = new DruidDataSource();
        //数据源设置
        dds.setDriverClassName(this.driverName);
        dds.setUrl(this.url);
        dds.setUsername(this.username);
        dds.setPassword(this.password);
        //连接池设置
        dds.setInitialSize(this.initialSize);
        dds.setMinIdle(this.minIdle);
        dds.setMaxActive(this.maxActive);
        dds.setMaxWait(this.maxWait);
        dds.setTimeBetweenConnectErrorMillis(this.timeBetweenEvictionRunsMillis);
        dds.setMinEvictableIdleTimeMillis(this.minEvictableIdleTimeMillis);
        dds.setValidationQuery(this.validationQuery);
        dds.setTestOnBorrow(this.testOnBorrow);
        dds.setTestOnReturn(this.testOnReturn);
        dds.setTestWhileIdle(this.testWhileIdle);
        dds.setPoolPreparedStatements(this.poolPreparedStatements);
        dds.setMaxPoolPreparedStatementPerConnectionSize(this.maxPoolPreparedStatementPerConnectionSize);
        //druid监控设置
        dds.setFilters(this.filters);
        dds.setConnectionProperties(this.connectionProperties);
        //返回结果
        return dds;
    }

    @Bean(name = "sqlSessionFactoryBean")
    public SqlSessionFactoryBean sqlSessionFactoryBean() throws Exception {
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        Resource[] mmlResources = resolver.getResources(this.mybatisMapperLocations);
        Interceptor[] interceptors = {new PageInterceptor()};
        SqlSessionFactoryBean ssfb = new SqlSessionFactoryBean();
        ssfb.setDataSource(this.druidDataSource());//数据源
        ssfb.setMapperLocations(mmlResources);//mapper.xml文件路径
        ssfb.setPlugins(interceptors);
        return ssfb;
    }

    @Bean(name = "mapperScannerConfigurer")
    public MapperScannerConfigurer mapperScannerConfigurer() {
        MapperScannerConfigurer msc = new MapperScannerConfigurer();
        msc.setSqlSessionFactoryBeanName("sqlSessionFactoryBean");
        msc.setBasePackage(this.mybatisMapperJavaLocations);
        return msc;
    }

    @Bean(name = "dataSourceTransactionManager")
    public DataSourceTransactionManager dataSourceTransactionManager() throws SQLException {
        return new DataSourceTransactionManager(this.druidDataSource());
    }
}

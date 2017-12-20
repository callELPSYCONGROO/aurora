package com.wuhenjian.aurora.db.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.github.pagehelper.PageInterceptor;
import org.apache.ibatis.plugin.Interceptor;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

import javax.annotation.Resource;
import java.util.Properties;

/**
 * @author 無痕剑
 * @date 2017/12/20 13:54
 */
@Configuration
@EnableTransactionManagement
@AutoConfigureAfter(DruidDataSource.class)
@AutoConfigureBefore(MyBatisMapperScannerConfig.class)
public class MybatisConfig implements TransactionManagementConfigurer {

	@Value("${mybatis.mapper.mapper-locations}")
	private String mapperLocations;

	@Value("${mybatis.mapper.type-aliases-package}")
	private String typeAliasesPackage;

	@Value("${pagehelper.offset-as-page-num}")
	private String offsetAsPageNum;

	@Value("${pagehelper.row-bounds-with-count}")
	private String rowBoundsWithCount;

	@Value("${pagehelper.page-size-zero}")
	private String pageSizeZero;

	@Value("${pagehelper.reasonable}")
	private String reasonable;

	@Value("${pagehelper.support-methods-arguments}")
	private String supportMethodsArguments;

	@Value("${pagehelper.return-page-info}")
	private String returnPageInfo;

	@Resource(name = "druidDataSource")
	private DruidDataSource druidDataSource;

	@Bean(name = "sqlSessionFactoryBean")
	public SqlSessionFactoryBean sqlSessionFactoryBean() throws Exception {
		ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
		org.springframework.core.io.Resource[] mmlResources = resolver.getResources(this.mapperLocations);
		PageInterceptor pageInterceptor = new PageInterceptor();
		Properties properties = new Properties();
		properties.setProperty("offsetAsPageNum", this.offsetAsPageNum);
		properties.setProperty("rowBoundsWithCount", this.rowBoundsWithCount);
		properties.setProperty("reasonable", this.reasonable);
		properties.setProperty("supportMethodsArguments", this.supportMethodsArguments);
		properties.setProperty("returnPageInfo", this.returnPageInfo);
		pageInterceptor.setProperties(properties);
		Interceptor[] interceptors = {pageInterceptor};
		SqlSessionFactoryBean ssfb = new SqlSessionFactoryBean();
		ssfb.setDataSource(this.druidDataSource);//数据源
		ssfb.setMapperLocations(mmlResources);//mapper.xml文件路径
		ssfb.setTypeAliasesPackage(this.typeAliasesPackage);
		ssfb.setPlugins(interceptors);
		return ssfb;
	}

	@Bean("transactionManager")
	@Override
	public PlatformTransactionManager annotationDrivenTransactionManager() {
		return new DataSourceTransactionManager(this.druidDataSource);
	}
}

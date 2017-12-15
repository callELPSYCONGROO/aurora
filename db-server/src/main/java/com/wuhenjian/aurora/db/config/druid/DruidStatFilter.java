package com.wuhenjian.aurora.db.config.druid;

import com.alibaba.druid.support.http.WebStatFilter;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

/**
 * @author 無痕剑
 * @date 2017/12/15 16:41
 */
@WebFilter(filterName="druidWebStatFilter",urlPatterns="/*",
		initParams={
				@WebInitParam(name="exclusions",value="*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*")//忽略资源
		}
)
public class DruidStatFilter extends WebStatFilter {
}

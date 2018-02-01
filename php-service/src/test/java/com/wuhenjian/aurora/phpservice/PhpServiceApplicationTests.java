package com.wuhenjian.aurora.phpservice;

import com.wuhenjian.aurora.consumer.service.PhpProjectService;
import com.wuhenjian.aurora.utils.entity.dao.PhpProject;
import com.wuhenjian.aurora.utils.exception.BusinessException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PhpServiceApplicationTests {

	@Autowired
	private PhpProjectService phpProjectService;

	@Test
	public void contextLoads() {
		PhpProject p = new PhpProject();
		p.setAccountName("范德萨");
		p.setUpdateTime(new Date());
		p.setDescription("放到放到");
		p.setRepoName("方法");
		p.setCloneUrl("jdslkfhasif");
		p.setWatchersCount(21);
		p.setUpdatedAt(new Date());
		p.setGitUrl("fdsafasffaf");
		p.setSvnUrl("fdsdifjds930");
		p.setCreatedAt(new Date());
		p.setOpenIssuesCount(12);
		p.setStargazersCount(44);
		p.setForksCount(34);
		p.setLang("fsdf");
		p.setHomepage("fdsaasdasd");
		p.setDefaultBranch("fdf");
		p.setPpId(213L);

		List<PhpProject> list = null;
		try {
			list = phpProjectService.selectByModel(p);
		} catch (BusinessException e) {
			e.printStackTrace();
		}
		System.out.println("***********************");
		System.out.println(list);
		System.out.println("***********************");
		try {
			phpProjectService.updateByPrimaryKeySelective(p);
		} catch (BusinessException e) {
			e.printStackTrace();
		}
		System.out.println("***********************");
		try {
			phpProjectService.insertSelective(p);
		} catch (BusinessException e) {
			e.printStackTrace();
		}
		System.out.println("***********************");
	}

}

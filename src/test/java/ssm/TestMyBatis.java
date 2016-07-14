package ssm;


import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.bluemoon.demo.dao.util.Criteria;
import com.bluemoon.demo.dao.util.Sort;
import com.bluemoon.demo.model.User;
import com.bluemoon.demo.service.impl.UserServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath*:spring-mybatis.xml"})
@Transactional
public class TestMyBatis {
	private static Logger logger = Logger.getLogger(TestMyBatis.class);
	@Resource(name="userService")
	private UserServiceImpl userService;
	
	/**
	 * @Title:getUser
	 * @Desciption:TODO
	 * @param 
	 * @return void
	 */
	@Test
	public void getUser() {
		Criteria<User> criteria = new Criteria<User>();
		User user = new User();
		user.setUserName("文龙");
//		user.setUserId("3");
		criteria.setWhere(user);
		Sort sort1 = new Sort();
		sort1.setName("user_login_time");
		sort1.setType("desc");
		Sort sort2 = new Sort();
		sort2.setName("user_password");
		sort2.setType("desc");
		List<Sort> sortList = new ArrayList<Sort>();
		sortList.add(sort1);
		criteria.setSort(sortList);
		User userInfo = userService.getUser(criteria);
		System.out.println(userInfo.getUserId());
	}
	
//	@Test
//	public void addUser() {
//		User user = new User();
//		user.setUserId("asdwerxxg12sqqdgt2");
//		user.setUserName("wenlong");
//		user.setUserPasswd("test");
//		int id = service.addUser(user);
//		System.out.println(id);
//	}

//	@Test
//	public void getUser() {
//		String id = "asdwerxxg12sqqdgt";
//		User user = service.getUser(id);
//		System.out.println(user);
//	}
	
}

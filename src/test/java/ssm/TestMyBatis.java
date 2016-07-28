//package ssm;
//
//import java.lang.reflect.InvocationTargetException;
//import java.util.List;
//
//import javax.annotation.Resource;
//
//import org.apache.log4j.Logger;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.transaction.annotation.Transactional;
//import org.springframework.web.context.ContextLoader;
//import org.springframework.web.context.WebApplicationContext;
//
//import com.bluemoon.demo.dao.UserDao;
//import com.bluemoon.demo.dao.util.Criteria;
//import com.bluemoon.demo.model.User;
//import com.bluemoon.demo.service.impl.UserServiceImpl;
//
//@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
//@ContextConfiguration(locations = {"classpath*:spring-mybatis.xml"})
//@Transactional
//public class TestMyBatis {
//	private static Logger logger = Logger.getLogger(TestMyBatis.class);
//	@Resource(name="userService")
//	private UserServiceImpl userService;
//	
//	@Resource(name="userDao")
//	private UserDao userDao;
//	/**
//	 * @Title:getUser
//	 * @Desciption:TODO
//	 * @param 
//	 * @return void
//	 * @throws InvocationTargetException 
//	 * @throws IllegalArgumentException 
//	 * @throws IllegalAccessException 
//	 * @throws SecurityException 
//	 * @throws NoSuchMethodException 
//	 * @throws ClassNotFoundException 
//	 * @throws InstantiationException 
//	 */
////	@Test
////	public void getUser() {
////		Criteria<User> criteria = new Criteria<User>();
//////		User user = new User();
//////		user.setUserName("文龙");
////////		user.setUserId("3");
//////		criteria.setWhere(user);
//////		Sort sort1 = new Sort();
//////		sort1.setName("user_login_time");
//////		sort1.setType("desc");
//////		Sort sort2 = new Sort();
//////		sort2.setName("user_password");
//////		sort2.setType("desc");
//////		List<Sort> sortList = new ArrayList<Sort>();
//////		sortList.add(sort1);
//////		criteria.setSort(sortList);
////		User userInfo = userService.getUser(criteria);
////		System.out.println(userInfo.getUserId());
////	}
//	
////	@Test
////	public void addUser() {
////		User user = new User();
////		user.setUserId("asdwerxxg12sqqdgt2");
////		user.setUserName("wenlong");
////		user.setUserPasswd("test");
////		int id = service.addUser(user);
////		System.out.println(id);
////	}
////
////	@Test
////	public void getUser() {
////		String id = "asdwerxxg12sqqdgt";
////		User user = userService.getUser(id);
////		System.out.println(user);
////	}
//	
////	@Test
////	public void testDao() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, ClassNotFoundException, InstantiationException {
////		WebApplicationContext wac = ContextLoader.getCurrentWebApplicationContext();  
////		Object obj = wac.getBean("userDao");  
////		Class clazz = Class.forName("com.bluemoon.demo.service.impl.MapperFactory");
////		MapperFactory factory = (MapperFactory) clazz.newInstance();
////		MapperFactory factory1 = new MapperFactory();
////		UserDao mapper1 = mapperService.getUserDao();
////		Criteria<User> criteria = new Criteria<User>();
////		User userInfo = (User) userDao.findList(criteria);
////		UserDao mapper = factory.getUserDao();
////		List<User> userInfo1 = mapper.findList(criteria);
////		
//////		Select<UserRecord> select = new Select<UserRecord>(User.class);
//////		Object object = select.where(USER.USER_NAME.equest("wenlong")).fetch();
////		System.out.println(userInfo);
////	}
//	
//}

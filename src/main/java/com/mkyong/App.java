package com.mkyong;

import java.util.Date;
import org.hibernate.Session;
import com.mkyong.util.HibernateUtil;
import com.pdt.model.Eligible;
import com.pdt.model.EligibleList;
import com.mkyong.user.DBUser;
//import com.mkyong.user.Eligible;

public class App {
	public static void main(String[] args) {
		System.out.println("Maven + Hibernate + Oracle");
		Session session = HibernateUtil.getSessionFactory().openSession();

		session.beginTransaction();
		EligibleList eligibleList = new EligibleList();
		eligibleList.setFileName("xx");
		eligibleList.setRecordAmount("xxx");
		eligibleList.setUploadDate(new Date());
//		session.persist(eligibleList);
		session.save(eligibleList);
/*		Eligible eligible = new Eligible();
		eligible.setEligibleId(2);
		eligible.setCidCardNo(1);
		session.save(eligible);*/
/*		DBUser user = new DBUser();

		user.setUserId(5);
		user.setUsername("superman");
		user.setCreatedBy("system");
		user.setCreatedDate(new Date());

		session.save(user);*/
		session.getTransaction().commit();
	}
	
	public void  test() {
		System.out.println("Maven + Hibernate + Oracle");
		Session session = HibernateUtil.getSessionFactory().openSession();

		session.beginTransaction();
		DBUser user = new DBUser();

		user.setUserId(1);
		user.setUsername("superman");
		user.setCreatedBy("system");
		user.setCreatedDate(new Date());

		session.save(user);
		session.getTransaction().commit();
		
	}
}

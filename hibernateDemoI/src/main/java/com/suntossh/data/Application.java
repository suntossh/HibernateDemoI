package com.suntossh.data;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Application {

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.close();
	}

}

package com.javashitang;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author lilimin
 * @since 2021-03-21
 */
public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		UserDao userDao = context.getBean(UserDao.class);
		String str = userDao.getUser();
		System.out.println(str);
	}
}


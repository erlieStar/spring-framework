package com.javashitang.service;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

/**
 * @author lilimin
 * @since 2021-03-25
 */
@Service
public class UserServiceImpl implements UserService, ApplicationContextAware {

	private ApplicationContext context;

	@Override
	public String getUsername(String userId) {
		return userId;
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.context = applicationContext;
		System.out.println("UserServiceImpl " + context.getId());
	}
}

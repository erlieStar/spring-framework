package com.javashitang.controller;

import com.javashitang.service.UserService;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author lilimin
 * @since 2021-03-22
 */
@RestController
public class UserController implements ApplicationContextAware {

	@Resource
	private UserService userService;
	private ApplicationContext context;

	@RequestMapping("user")
	public String index(@RequestParam("userId") String userId) {
		return userService.getUsername(userId);
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.context = applicationContext;
		System.out.println("UserController " + context.getId());
	}
}

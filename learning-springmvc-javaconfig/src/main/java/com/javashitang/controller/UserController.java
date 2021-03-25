package com.javashitang.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author lilimin
 * @since 2021-03-22
 */
@RestController
public class UserController {

	@RequestMapping("user")
	public String index(@RequestParam("userId") String userId) {
		return "hello " + userId;
	}
}

package com.javashitang.controller;

import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * @author lilimin
 * @since 2021-03-22
 */
@RestController
public class UserController {

	@RequestMapping("user")
	public String index(@RequestParam("userId") String userId,
						@RequestHeader("token") String token,
						HttpServletRequest request,
						HttpServletResponse response) {
		return "userId " + userId + " token " + token;
	}
}

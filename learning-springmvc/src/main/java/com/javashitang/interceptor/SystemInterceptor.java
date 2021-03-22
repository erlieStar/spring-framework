package com.javashitang.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author lilimin
 * @since 2021-03-22
 */
public class SystemInterceptor extends HandlerInterceptorAdapter {

	Logger log = LoggerFactory.getLogger(SystemInterceptor.class);

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		request.setAttribute("request-starttime", System.currentTimeMillis());
		log.info("request enter:{}", request.getRequestURI());
		return true;
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
		Long startTime = (Long) request.getAttribute("request-starttime");
		if (startTime != null) {
			long cost = System.currentTimeMillis() - startTime;
			log.info("request cost:[" + request.getRequestURI() + ", "
					+ request.getQueryString() + "] " + cost);
		}
	}
}

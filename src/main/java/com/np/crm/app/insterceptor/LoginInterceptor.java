package com.np.crm.app.insterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 * 登录拦截器
 * @author zhiya.chai
 * 2016年7月20日 下午3:29:20
 */
public class LoginInterceptor extends HandlerInterceptorAdapter{

	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		logger.debug("LoginInterceptor.preHandle ...");
		boolean continueHandling = true;	// 是否继续处理
		if (handler instanceof HandlerMethod) {
			HandlerMethod method = (HandlerMethod) handler;
			WithoutLogin withoutLoginAnnotation = method.getMethodAnnotation(WithoutLogin.class);
			if (withoutLoginAnnotation != null) {
				return continueHandling;
			}
		}
		
		return continueHandling;
	}
}

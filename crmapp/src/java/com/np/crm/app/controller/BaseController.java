package com.np.crm.app.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;

/**
 * 基础Controller
 * @author zhiya.chai
 * 2016年7月20日 上午11:23:30
 */
@Controller
public class BaseController {

	protected Logger logger = LoggerFactory.getLogger(getClass());
	
	private ThreadLocal<HttpServletRequest> currentRequest = new ThreadLocal<HttpServletRequest>();
	private ThreadLocal<HttpServletResponse> currentResponse = new ThreadLocal<HttpServletResponse>();
	
	
	@ModelAttribute
	public void setHttpServletRequestAndResponse(HttpServletRequest request,HttpServletResponse response){
		currentRequest.set(request);
		currentResponse.set(response);
	}
	
	/**
	 * 获取request
	 * @return
	 * @return HttpServletRequest
	 * @author zhiya.chai
	 * 2016年7月6日 下午2:41:53
	 */
	public HttpServletRequest request() {
	    return currentRequest.get();
	}
	/**
	 * 获取response
	 * @return
	 * @return HttpServletResponse
	 * @author zhiya.chai
	 * 2016年7月6日 下午2:42:10
	 */
	public HttpServletResponse response(){
		return currentResponse.get();
	}
}

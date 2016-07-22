package com.np.crm.app.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.np.crm.app.domain.request.user.LoginRequest;
import com.np.crm.app.insterceptor.WithoutLogin;
import com.np.crm.common.enums.ErrorCode;
import com.np.crm.common.exception.ErrorCodeException;
import com.np.crm.common.response.Response;

/**
 * 用户接口
 * @author zhiya.chai
 * 2016年7月22日 上午9:51:29
 */
@RestController
@RequestMapping("/user")
public class UserController extends BaseController{

	/**
	 * 用户登录
	 * @param request
	 * @return
	 * @throws Exception
	 * @return Response
	 * @author zhiya.chai
	 * 2016年7月22日 上午10:04:23
	 */
	@WithoutLogin
	@RequestMapping(value = "/login" , method = RequestMethod.POST)
	public Response login(LoginRequest request) throws Exception{
		//判断传入参数是否为空
		if(StringUtils.isBlank(request.getUserName()) || StringUtils.isBlank(request.getPassword())){
			throw new ErrorCodeException(ErrorCode.SYSTEM_PARAMETERS_EMPTY);
		}
		//记录日志
		super.traceLog(this.getClass().getName(),"login", request.getSequence());
		//登录操作
		return Response.build()
				.setRetcode(ErrorCode.SUCCESS.getCode())
				.setMsg(ErrorCode.SUCCESS.getMessage());
	}
}

package com.np.crm.app.domain.request.user;

import com.np.crm.app.domain.request.BaseRequest;

/**
 * 用户登录参数
 * @author zhiya.chai
 * 2016年7月22日 上午10:00:13
 */
public class LoginRequest extends BaseRequest {

	private static final long serialVersionUID = -4847488868605891044L;
	
	private String userName;
	private String password;//前端页面MD5加密后传入后端
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}

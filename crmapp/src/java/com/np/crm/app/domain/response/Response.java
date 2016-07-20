package com.np.crm.app.domain.response;

/**
 * 返回前端数据对象
 * @author zhiya.chai
 * 2016年7月20日 下午3:00:37
 */
public class Response {

	/**
	 * 返回码
	 */
	private int retcode;
	/**
	 * 返回信息
	 */
	private String msg;
	/**
	 * 返回数据
	 */
	private Object data;
	
	public int getRetcode() {
		return retcode;
	}
	public Response setRetcode(int retcode) {
		this.retcode = retcode;
		return this;
	}
	public String getMsg() {
		return msg;
	}
	public Response setMsg(String msg) {
		this.msg = msg;
		return this;
	}
	public Object getData() {
		return data;
	}
	public Response setData(Object data) {
		this.data = data;
		return this;
	}
	public static Response build(){
		return new Response();
	}
	
	
}
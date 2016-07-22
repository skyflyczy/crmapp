package com.np.crm.app.domain.request;

import java.io.Serializable;

/**
 * 基础请求参数
 * @author zhiya.chai
 * 2016年7月22日 上午9:56:32
 */
public class BaseRequest implements Serializable{

	private static final long serialVersionUID = -295428223445577670L;
	
	private String sequence; //唯一标识字符串，用于记录行踪

	public String getSequence() {
		return sequence;
	}

	public void setSequence(String sequence) {
		this.sequence = sequence;
	}

}

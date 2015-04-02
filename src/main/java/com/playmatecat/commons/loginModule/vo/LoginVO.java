package com.playmatecat.commons.loginModule.vo;

public class LoginVO {
	/**单点登陆凭据**/
	private String ticket;
	
	/**需要最终跳转的地址**/
	private String url;

	public String getTicket() {
		return ticket;
	}

	public void setTicket(String ticket) {
		this.ticket = ticket;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	
}

package org.xander.common;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;

@ManagedBean(name="attributeUser")
@SessionScoped
public class attributeUserBean {

	public String nickname;

	public void attrListener(ActionEvent event){
		nickname = (String)event.getComponent().getAttributes().get("username");
	}
	
	public String outcome(){
		return "attributeResult";
	}
	
	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
}
package org.xander.common;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
 
@ManagedBean(name= "panelGridUser")
@SessionScoped
public class PanelGridBean implements Serializable{

    int number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
}
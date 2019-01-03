package com.gamebooks.lonewolf.actions;

import org.apache.struts2.ServletActionContext;

import java.io.IOException;
import com.gamebooks.lonewolf.enums.KaiDisciplinesEnum;
import javax.servlet.http.*;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class GetKaiDisciplinesAction extends ActionSupport {
		
	public String execute () throws IOException {
		
		HttpServletResponse response = (HttpServletResponse)ActionContext.getContext().get(ServletActionContext.HTTP_RESPONSE);
		response.getWriter().append(getKaiDisciplines());
		return NONE;
	}

	public String getKaiDisciplines() {
		StringBuffer kaiDisDropdownBuffer = new StringBuffer();
		kaiDisDropdownBuffer.append("<select name='kaidisciplines'>");
		
		for (KaiDisciplinesEnum discipline: KaiDisciplinesEnum.values()) {
			kaiDisDropdownBuffer.append( "<option value='"+discipline.name()+"'>"+discipline.name()+"</option>\n");
		}
		kaiDisDropdownBuffer.append("</select>");
		
		return kaiDisDropdownBuffer.toString();
	}
	
}

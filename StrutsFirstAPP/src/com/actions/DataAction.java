package com.actions;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.entity.Person;
import com.forms.PersonForm;
import com.repos.PersonDAO;

public class DataAction extends DispatchAction{

	@Override
	public ActionForward unspecified(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Action got invoked");

		 List<Person> list=PersonDAO.getPerson();
		 request.setAttribute("people", list);
       return mapping.findForward("success");
	}
  
	
	
	public ActionForward store(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
       System.out.println("Store got invoked");
		// TODO Auto-generated method stub
        PersonForm person=(PersonForm)form;
        request.setAttribute("sno", person.getSno());
        request.setAttribute("name", person.getCity());
        request.setAttribute("city", person.getName());
		return mapping.findForward("result");
	}
}

package com.actions;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.entity.Dept;

import com.forms.EmpForm;
import com.repos.JPARepository;
import com.repos.OrganizationDAO;

public class DeptAction extends Action{
	

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		EmpForm emp = (EmpForm) form;
		
		List<Dept> list=OrganizationDAO.getDept();
        for(Dept x:list)
        	JPARepository.getEntityManager().refresh(x);
	    emp.setDepartments(list);
     

        request.setAttribute("depts", list);
		return mapping.findForward("success");
	}
  
}

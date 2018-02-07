package com.wpx.springmvc.demo04.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.wpx.springmvc.demo04.dao.EmployeeDao;
import com.wpx.springmvc.demo04.vo.Employee;
/**
 * ������Դ post
 * ��ȡ��Դ get
 * ������Դ put
 * ɾ����Դ delete
 * 
 * @author wangpx
 */
@Controller
@RequestMapping("/spring-mvc/demo04")
public class EmployeeHandler {

	@Autowired
	private EmployeeDao employeeDao;
	/**
	 * 
	 * ��ʾ���пͻ���Ϣ
	 */
	@RequestMapping("/list")
	public String list(Map<String,Object> map){
		map.put("employees", employeeDao.getAll());
		return "demo04/list";
	}
	/**
	 * ��ӿͻ�
	 */
	public String add(Employee employee) {
		employeeDao.save(employee);
		return "demo04/list";
	}
	/**
	 * �޸Ŀͻ�
	 */
	public String update(Employee empolyee) {
		employeeDao.updateEmployee(empolyee);
		return "demo04/list";
	}
	/**
	 * ɾ���ͻ�
	 */
	public String detele(Integer id) {
		employeeDao.deleteEmployeeById(id);
		return "demo04/list";
	}
}

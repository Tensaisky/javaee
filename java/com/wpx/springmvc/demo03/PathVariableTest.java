package com.wpx.springmvc.demo03;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 通过PathVariable可以将URL中占位符参数绑定到控制处理方法中的入参中
 * @author wangpx
 */
@Controller
@RequestMapping("/spring-mvc/demo03")
public class PathVariableTest {
	
	@RequestMapping("/demo03/{id}")
	public void showPathVariable(@PathVariable("id") Integer id) {
		System.out.println("id  is "+ id);
	}
	
}

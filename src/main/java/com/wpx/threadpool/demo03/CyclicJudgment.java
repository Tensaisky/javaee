package com.wpx.threadpool.demo03;

import java.util.ArrayList;
import java.util.List;

/**
 * ��ԭʼ�ķ���ͨ�����ϵ�ѭ�����ж�
 * 
 * @author wangpx
 */
public class CyclicJudgment {

	private volatile static List list = new ArrayList<>();  

	public void add() {
		list.add("wangpx");
	}
	public int size() {
		
	}
	
}

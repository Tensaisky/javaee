package com.wpx.servlet.demo21;

import java.util.List;

/**
 * ���ڷ�ҳ����
 * 
 * @author wangpx
 */
public class PageBean {

	private int pageNum; //ҳ��
	private int currentPage; //��ǰҳ
	private int totalPage; //��ҳ��
	private int totalCount; //�ܼ�¼��
	private List<Customer> csList;//ÿҳ����
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public List<Customer> getCsList() {
		return csList;
	}
	public void setCsList(List<Customer> csList) {
		this.csList = csList;
	}
	
	
}

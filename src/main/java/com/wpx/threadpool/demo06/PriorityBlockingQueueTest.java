package com.wpx.threadpool.demo06;
/**
 * 
 * PriorityBlockingQueue:��һ�ֻ������ȼ�����������,
 * ���ȼ����ж�ͨ�����������Compator����������,Ҳ����˵������еĶ������ʵ��Comparae�ӿ�
 * ��ʵ��priorityBlockingQueueʱ,�ڲ������߳�ͬ�����õ����ǹ�ƽ��,��һ���޽����
 * 
 * @author wangpx
 */
public class PriorityBlockingQueueTest {

}
class Student implements Comparable<Student>{

	private int id;
	private String name;
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	@Override
	public int compareTo(Student student) {
		return this.id > student.id ? 1 :(this.id <student.id ? -1 :0);
	}
	
}
 
package com.wpx.test;
import java.util.Timer;
import java.util.TimerTask;


public class TimerTest {

	//3���ִ������
	public static void main(String[] args) {
		//�½���ҵ��
		Timer timer = new Timer();
		//ָ��ʱ����ҵ,3���ִ��,֮��ÿһ��ִ��һ��
		timer.schedule(new TimerTask() {
			
			@Override
			public void run() {
				System.out.println("Hello Timer ....");
			}
		}, 3000,1000);
	}
	
}

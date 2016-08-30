package chapter1602;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class ThirdThread {
	public static void main(String[] args) {
		ThirdThread rt=new ThirdThread();
		FutureTask<Integer> task=new FutureTask<Integer>(new Callable<Integer>() {

			@Override
			public Integer call() throws Exception {
				int i=0;
				for(;i<100;i++){
					System.out.println(Thread.currentThread().getName()+"ѭ������i��ֵ:"+i);
				}
				return i;
			}
		});
		for(int i=0;i<100;i++){
			System.out.println(Thread.currentThread().getName()+"ѭ������i��ֵ:"+i);
			if(i==20){
				//ʵ�ʻ�����callable���󴴽��������̵߳�
				new Thread(task, "�з���ֵ���߳�").start();
			}
		}
		try {
			System.out.println("���̵߳ķ���ֵ��"+task.get());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

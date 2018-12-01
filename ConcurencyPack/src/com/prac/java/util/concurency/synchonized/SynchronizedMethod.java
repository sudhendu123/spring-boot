package com.prac.java.util.concurency.synchonized;

public class SynchronizedMethod {

	public static void main(String[] args) {
		SynchronizedMethod s=new SynchronizedMethod();
		Thread t=new Thread() {
			public void run() {
				//SynchronizedMethod s=new SynchronizedMethod();
				s.add(1, 2);
			}
		};
		t.start();
		t.setName("t");
		
		Thread t1=new Thread() {
			public void run() {
				//SynchronizedMethod s=new SynchronizedMethod();
				s.add(1, 3);
			}
		};
		t1.start();
		t1.setName("t1");
	}
	
	public synchronized  void add(int a,int b) {
		a=a+b;
		System.out.println(a+":"+Thread.currentThread().getName());
		b=b+a;
		System.out.println(b+":"+Thread.currentThread().getName());
	}
	
}

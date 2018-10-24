package com.prac.java.util.concurency.executor.service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPool {
	
	
	public static void main(String[] args) {  
		 int processors = Runtime.getRuntime().availableProcessors();
		    System.out.println("CPU cores: " + processors);
		    ExecutorService executor = Executors.newCachedThreadPool();  
	        for (int i = 0; i < 10; i++) {  
	            Runnable worker = new WorkerThread1("" + i);  
	            executor.execute(worker);//calling execute method of ExecutorService  
	          }  
	        executor.shutdown();  
	        while (!executor.isTerminated()) {   }  
	  
	        System.out.println("Finished all threads");  
	    }  
}

class WorkerThread1 implements Runnable {  
   private String message;  
   public WorkerThread1(String s){  
       this.message=s;  
   }  
    public void run() {  
       System.out.println(Thread.currentThread().getName()+" (Start) message = "+message);  
       processmessage();//call processmessage method that sleeps the thread for 2 seconds  
       System.out.println(Thread.currentThread().getName()+" (End)");//prints thread name  
   }  
   private void processmessage() {  
       try {  Thread.sleep(2000);  } catch (InterruptedException e) { e.printStackTrace(); }  
   }  
}  

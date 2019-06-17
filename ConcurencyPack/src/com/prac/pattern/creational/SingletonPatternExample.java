package com.prac.pattern.creational;

//Lazily Initialized Inner Class Singleton (Bill Pugh singleton)
public class SingletonPatternExample {

	private SingletonPatternExample() {}
	
	// Inner class to provide instance of class 
	  private static class BillPughSingleton 
	  { 
		  private static final SingletonPatternExample single=new SingletonPatternExample();
	  }
	  
	  public static SingletonPatternExample getInstance() {
		  return BillPughSingleton.single;
	  }
}

/**
 * Note that, the inner class is not loaded until the getInstance()
 *  method is invoked for the first time. This solution is thread-safe and doesn’t 
 *  require any synchronization. It is the most efficient approach among all
 *   the singleton design pattern implementations.
 */ 

package com.atmecs.thread;

public class ThreadDemo {
	public static void main(String[] args) throws Exception {
		
		Thread t1=new Thread(() ->
				{
			       for(int i=0;i<=5;i++)
			       {
			    	   System.out.println("hi  "+Thread.currentThread().getPriority());
			    	   try {
						Thread.sleep(1000);
					} catch (Exception e) {
						e.printStackTrace();
					}
			       }
				},"Hi Thread");
		Thread t2=new Thread(() ->
		{
	       for(int i=0;i<=5;i++)
	       {
	    	   System.out.println("hello");
	    	   try {
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
	       }
		},"Hello Thread");
	t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		t1.start();
		try {
			Thread.sleep(300);
		} catch (Exception e) {
			e.printStackTrace();
		}
		t2.start();
		t1.join();
		t2.join();
		System.out.println(t1.isAlive());
		System.out.println("Bye");
		
	}

}

package com.atmecs.LogManager;


import org.apache.log4j.Logger;
//import org.apache.log4j.xml.DOMConfigurator;

class MyRunnable implements Runnable
{
    private Logger logger=null;
    public MyRunnable()
    {
    	//DOMConfigurator.configure(this.getClass().getClassLoader().getResource("log4j.properties"));
        logger =Logger.getLogger(MyRunnable.class);
    }
	@Override
	public void run() {
		
		logger.info("Important job running in MyRunnable"+Thread.currentThread().getName());
	}
	
}
public class TestThreads {
	public static void main(String[] args) {
		
		Thread[] worker=new Thread[3];
        MyRunnable r = new MyRunnable();

        for(int i=0;i<3;i++) {
           worker[i]=new Thread(r);
           worker[i].start();
        }
		
	}

}

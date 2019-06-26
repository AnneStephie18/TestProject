package com.atmecs.thread;

import org.apache.log4j.Logger;

class Generic<Z>
{public Logger log=Logger.getLogger(Generic.class);
	Z value;
	public void show()
	{
		log.info(value.getClass().getName());
	}
	
}
public class GenericDemo {
	static Logger log=Logger.getLogger(GenericDemo.class);
	public static void main(String[] args) {
		Generic<Object> obj=new Generic<>();
		obj.value='a';
		obj.show();
		String s="stephie";
	    log.info(s.valueOf(4));
	}

}

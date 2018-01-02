package com.Jonas.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.Jonas.open.Test.IRpcService;




public class Client {
	 public static void main(String[] args) throws InterruptedException { 
		 ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:motan_client.xml");
		 IRpcService service = (IRpcService) ctx.getBean("remoteService");
		 for (int i = 0; i < 100; i++) {	 
			 Thread.sleep(1000);
	         System.out.println(service.hello("motan"));
	         
		}
       
	 }
}

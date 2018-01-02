package com.Jonas.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.Jonas.open.Test.RpcService;




public class Client {
	 public static void main(String[] args) throws InterruptedException { 
		 ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:motan_client.xml");
		 RpcService service = (RpcService) ctx.getBean("remoteService");
		 for (int i = 0; i < 100; i++) {	 
			 Thread.sleep(10000);
	         System.out.println(service.hello("motan"));
	         
		}
       
	 }
}

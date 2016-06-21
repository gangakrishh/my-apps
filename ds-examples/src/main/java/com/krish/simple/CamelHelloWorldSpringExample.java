package com.krish.simple;

import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.spring.SpringCamelContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CamelHelloWorldSpringExample {

	public static void main(String[] args) throws Exception{
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/krish/simple/applicationContext.xml");
		CamelContext camelContext = SpringCamelContext.springCamelContext(appContext, false);
		try{
			ProducerTemplate template = camelContext.createProducerTemplate();
			camelContext.start();
			template.sendBody("activemq:test.queue", "Hell World");
		}finally{
			camelContext.stop();
		}
	}
}

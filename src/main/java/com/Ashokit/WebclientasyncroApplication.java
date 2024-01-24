package com.Ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.Ashokit.service.Newquote;

@SpringBootApplication
public class WebclientasyncroApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run=SpringApplication.run(WebclientasyncroApplication.class, args);
		
		Newquote bean=run.getBean(Newquote.class);
					bean.getQuotev2();
					
	}

}

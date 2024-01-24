package com.Ashokit.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

@Service
public class Newquote {
	
	private static final String QUOTE_ENDPOINT="https://type.fit/api/quotes";

	
	
	public void getQuotev1()
	{
		WebClient client=WebClient.create();
		
		System.out.println("*********Rest api call started...***************");
		
		
		client.get()
			.uri(QUOTE_ENDPOINT)
			
			.retrieve()
			.bodyToMono(String.class)
			.subscribe(Newquote::handleResponse);
		
		System.out.println("*********Rest api call ended...***************");

	}
	
	public static void handleResponse(String s)
	{
		System.out.println(s);
	}
	
	public void getQuotev2()
	{
		WebClient client=WebClient.create();
		System.out.println("****************Rest api call completed........************");
		
		Mono<String> bodyToMono=client.get()
				.uri(QUOTE_ENDPOINT)
				.retrieve()
				.bodyToMono(String.class);
				
		
		System.out.println(bodyToMono.block());
		
		System.out.println("****************Rest api call completed........************");
		
	}

}

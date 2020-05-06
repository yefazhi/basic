package com.qianlicode.basic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(locations = {"classpath:/app.xml"})
public class BasicApplication {

	public static void main(String[] args) {

		SpringApplication.run(BasicApplication.class, args);

		StringBuilder sb = new StringBuilder();
		sb.append("===============================================================");
		sb.append("\n========================  START SUCCESS！！ ===================");
		sb.append("\n===============================================================");
		System.out.println(sb.toString());
	}

}

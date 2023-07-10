package com.dubbo3.consumer	;

import java.util.Random;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

/**
 * @author Jackie Wang
 ** 项目名称：dubbo3学习
 * 类名称：DubboConsumerApplication  
 * 类描述：dubbo3学习
 * 创建时间：2022年8月15日 下午9:33:15  
 */
@SpringBootApplication
@ComponentScan(basePackages={"com.dubbo3"})
@ImportResource(locations = "classpath:consumer.xml")
public class DubboConsumerApplication implements WebServerFactoryCustomizer<ConfigurableServletWebServerFactory> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(DubboConsumerApplication.class,args);
	}

	public static int getRandomPort() {
		int portStart = 8000;
		int portEnd = 10000;
		Random r = new Random();
		int ra = r.nextInt(portEnd-portStart)+portStart;
		return ra;
		
	}

	public void customize(ConfigurableServletWebServerFactory factory) {
		// TODO Auto-generated method stub
		factory.setPort(getRandomPort());
	}

}

package com.dubbo3.provider;

import java.util.Random;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

import com.dubbo3.provider.DubboProviderApplication;

/**
 * @author Jackie Wang
 * 项目名称：dubbo-provider  
 * 类名称：DubboProviderApplication  
 * 类描述：dubbo3学习
 * 创建时间：2022年8月15日 下午8:18:27  
 */
@SpringBootApplication
@ComponentScan(basePackages={"com.dubbo3"})
@ImportResource(locations = "classpath:provider.xml")
public class DubboProviderApplication implements WebServerFactoryCustomizer<ConfigurableServletWebServerFactory>{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(DubboProviderApplication.class, args);
	}

	@Override
	public void customize(ConfigurableServletWebServerFactory factory) {
		// TODO Auto-generated method stub
		factory.setPort(getRandomPort());
	}
	
	public static int getRandomPort() {
		int portStart = 8000;
		int portEnd = 10000;
		Random r = new Random();
		int ra = r.nextInt(portEnd-portStart)+portStart;
		return ra;
		
	}
}

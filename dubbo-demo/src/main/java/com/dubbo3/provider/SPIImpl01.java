package com.dubbo3.provider;

import com.dubbo3.spi.SPIInterface;

/**
 * @author Jackie Wang
 * 项目名称：dubbo-provider  
 * 类名称：SPIImpl01  
 * 类描述：
 * 创建时间：2022年9月3日 下午1:57:43  
 */
public class SPIImpl01 implements SPIInterface{

	@Override
	public String sayHello(String message) {
		// TODO Auto-generated method stub
		return "message: "+message;
	}
	
}

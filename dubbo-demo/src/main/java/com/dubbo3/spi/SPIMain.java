package com.dubbo3.spi;

import java.util.ServiceLoader;

/**
 * @author Jackie Wang
 * 项目名称：dubbo-provider  
 * 类名称：SPIMain  
 * 类描述：
 * 创建时间：2022年9月3日 下午2:02:01  
 */

public class SPIMain {
	public static void main(String[] args) {
		ServiceLoader<SPIInterface> load = ServiceLoader.load(SPIInterface.class);
		for (SPIInterface spiInterface : load) {
			System.out.println(spiInterface.sayHello("你好,jackie"));
		}
	}
}

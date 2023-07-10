package com.dubbo3.provider.impl;

import org.springframework.stereotype.Service;

import com.dubbo3.service.*;

@Service("dubboService")
public class DubboServiceImpl implements DubboService{

	@Override
	public String sayHello(String name) {
		// TODO Auto-generated method stub
		return "hello,"+name;
	}
	
}

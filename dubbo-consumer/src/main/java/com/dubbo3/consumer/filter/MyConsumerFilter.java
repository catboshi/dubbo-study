package com.dubbo3.consumer.filter;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Activate;
import org.apache.dubbo.rpc.Filter;
import org.apache.dubbo.rpc.Invocation;
import org.apache.dubbo.rpc.Invoker;
import org.apache.dubbo.rpc.Result;
import org.apache.dubbo.rpc.RpcException;

import com.alibaba.dubbo.common.Constants;

/**
 * @author Jackie Wang
 * 项目名称：dubbo-consumer  
 * 类名称：MyConsumerFilter  
 * 类描述：
 * 创建时间：2022年8月31日 上午11:49:28  
 */
//@Activate(group = {Constants.PROVIDER,Constants.CONSUMER})
public class MyConsumerFilter implements Filter{

	@Override
	public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
		// TODO Auto-generated method stub
		URL url = invoker.getUrl();
		Class<?> interface1 = invoker.getInterface();
		String simpleName = interface1.getSimpleName();
		String serviceName = invocation.getServiceName();
		String methodName = invocation.getMethodName();
		
		System.out.println(url.toFullString());
		System.out.println(simpleName);
		System.out.println(serviceName);
		System.out.println(methodName);
		
		Result invoke = invoker.invoke(invocation);
		return invoke;
	}
}


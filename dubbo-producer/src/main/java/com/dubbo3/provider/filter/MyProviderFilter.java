package com.dubbo3.provider.filter;

import org.apache.dubbo.common.URL;
//import org.apache.dubbo.common.constants.CommonConstants;
import static org.apache.dubbo.common.constants.CommonConstants.PROVIDER;
import static org.apache.dubbo.common.constants.CommonConstants.CONSUMER;
import org.apache.dubbo.common.extension.Activate;
import org.apache.dubbo.rpc.*;

import com.alibaba.dubbo.common.Constants;
/**
 * @author Jackie Wang
 * 项目名称：dubbo-provider  
 * 类名称：MyProviderFilter  
 * 类描述：
 * 创建时间：2022年8月31日 上午10:23:25  
 */
//第一种配置filter方法
//@Activate(group = {Constants.PROVIDER,CommonConstants.CONSUMER})
@Activate(group = {PROVIDER,CONSUMER})
public class MyProviderFilter implements Filter{

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

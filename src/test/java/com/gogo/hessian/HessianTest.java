package com.gogo.hessian;

import org.junit.Test;

import com.caucho.hessian.client.HessianProxyFactory;


public class HessianTest {
	
	@Test
	public void test1() throws Exception {
		String url = "http://localhost:8480/hessian-demo/hessian";
		HessianProxyFactory factory = new HessianProxyFactory();
		BasicAPI basic = (BasicAPI) factory.create(BasicAPI.class, url);
		System.out.println(basic.hello());
	}

}

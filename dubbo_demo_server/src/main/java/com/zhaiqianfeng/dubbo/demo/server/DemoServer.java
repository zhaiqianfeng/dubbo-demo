/**
 * @author ZhaiQianfeng <zhaiqianfeng@163.com> 
 *
 * @webSite: http://www.zhaiqianfeng.com/blog/
 *
 * @gitHub:  https://github.com/zhaiqianfeng 
 */
package com.zhaiqianfeng.dubbo.demo.server;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 服务提供方实现
 */
public class DemoServer {
	public static void main(String[] args) {
		try {
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("server-config.xml");
			context.start();
			System.out.println("demo server has started");
			System.in.read();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

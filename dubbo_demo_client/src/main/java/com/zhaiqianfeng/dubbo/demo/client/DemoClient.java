/**
 * @author ZhaiQianfeng <zhaiqianfeng@163.com> 
 *
 * @webSite: http://www.zhaiqianfeng.com/blog/
 *
 * @gitHub:  https://github.com/zhaiqianfeng 
 */
package com.zhaiqianfeng.dubbo.demo.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zhaiqianfeng.dubbo.demo.api.IUser;

/**
 * 服务消费方实现
 */
public class DemoClient 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("client-config.xml");
    	context.start();
    	
    	IUser user=(IUser) context.getBean("userService");
    	String result=user.sayHello("James Zhai");
    	System.out.println(result);
    }
}

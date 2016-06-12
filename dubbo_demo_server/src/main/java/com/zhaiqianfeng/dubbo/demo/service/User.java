/**
 * @author ZhaiQianfeng <zhaiqianfeng@163.com> 
 *
 * @webSite: http://www.zhaiqianfeng.com/blog/
 *
 * @gitHub:  https://github.com/zhaiqianfeng 
 */
package com.zhaiqianfeng.dubbo.demo.service;

import com.zhaiqianfeng.dubbo.demo.api.IUser;

/**
 * 契约接口实现
 */
public class User implements IUser {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.zhaiqianfeng.dubbo.demo.api.IUser#sayHello(java.lang.String)
	 */
	@Override
	public String sayHello(String userName) {
		return String.format("Hello,%s!", userName);
	}

}

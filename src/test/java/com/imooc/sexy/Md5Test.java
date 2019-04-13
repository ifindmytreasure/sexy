package com.imooc.sexy;

import org.springframework.util.DigestUtils;

/**
 * Created by Unruly Wind on 2019/4/13/013.
 *
 * @author BlueMelancholy
 * @desc:
 */
public class Md5Test {
	public static void main(String[] args) {
		String s = "123456";
		String hex = DigestUtils.md5DigestAsHex(s.getBytes());
		System.out.println(hex);

		//非spring项目
//		String hex = DigestUtils.md5Hex(s);
//		System.out.printf(hex);
	}
}

package com.imooc.sexy;

import java.util.Base64;

/**
 * Created by Unruly Wind on 2019/4/13/013.
 *
 * @author BlueMelancholy
 * @desc:
 */
public class Base64Test {
	public static void main(String[] args) {
		String s = "123456";
		String encode = Base64.getEncoder().encodeToString(s.getBytes());
		System.out.println(encode);
		byte[] decode = Base64.getDecoder().decode(encode);
		System.out.println(new String(decode));
	}
}

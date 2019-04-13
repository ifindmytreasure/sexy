package com.imooc.sexy;

/**
 * Created by Unruly Wind on 2019/4/13/013.
 *
 * @author BlueMelancholy
 * @desc:
 */
public class EnumInterfaceTest {
	public static void main(String[] args) {
		Integer code = 1;
		//传统方法
//		PayStatusEnum payStatusEnum = PayStatusEnum.findByCode(1);
//		System.out.println(payStatusEnum);
		OrderDetailEnum orderDetailEnum = EnumUtil.findByCode(code, OrderDetailEnum.class);
		System.out.println(orderDetailEnum);
		PayStatusEnum payStatusEnum = EnumUtil.findByCode(code, PayStatusEnum.class);
		System.out.println(payStatusEnum);
	}
}

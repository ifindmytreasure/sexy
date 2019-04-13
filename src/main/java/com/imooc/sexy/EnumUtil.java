package com.imooc.sexy;

/**
 * Created by Unruly Wind on 2019/4/13/013.
 *
 * @author BlueMelancholy
 * @desc:
 */
public class EnumUtil {
	public static <T extends CodeEnum>T findByCode(Integer code,Class<T> tClass){
		for (T t : tClass.getEnumConstants()){
			if (code.equals(t.getCode())){
				return t;
			}
		}
		throw new RuntimeException("通过code查不到");
	}
}

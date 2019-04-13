package com.imooc.sexy;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Created by Unruly Wind on 2019/4/13/013.
 *
 * @author BlueMelancholy
 * @desc:
 */
@Getter
@AllArgsConstructor
public enum PayStatusEnum implements CodeEnum{
	WAIT(0, "等待支付"),
	SUCCESS(1, "支付成功"),
	;
	private Integer code;

	private String message;
	//通过code查询状态
	public static PayStatusEnum findByCode(Integer code) {
		for (PayStatusEnum value : PayStatusEnum.values()) {
			if (code.equals(value.getCode())) {
				return value;
			}
		}

		throw new RuntimeException("通过code查不到");
	}
}

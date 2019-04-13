package com.imooc.sexy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

/**
 * Created by Unruly Wind on 2019/4/13/013.
 *
 * @author BlueMelancholy
 * @desc:
 */
@Getter
@AllArgsConstructor
public enum OrderDetailEnum implements CodeEnum{
	NEW(0, "新订单"),
	FINISHED(1, "完结"),
	CANCEL(2, "已取消"),
	;
	private Integer code;

	private String message;
}

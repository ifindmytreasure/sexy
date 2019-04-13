package com.imooc.sexy;

import com.fasterxml.jackson.core.JsonParseException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Unruly Wind on 2019/4/13/013.
 *
 * @author BlueMelancholy
 * @desc:
 */
@ControllerAdvice
public class SexyExceptionHandler {
	@ExceptionHandler(value = JsonParseException.class)
	@ResponseBody
	public String handler(JsonParseException e){
		e.printStackTrace();
		return "json反序列化异常";
	}
}

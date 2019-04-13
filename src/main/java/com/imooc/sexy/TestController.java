package com.imooc.sexy;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Map;

/**
 * Created by Unruly Wind on 2019/4/13/013.
 *
 * @author BlueMelancholy
 * @desc:
 */
@RestController
public class TestController {
	@GetMapping("/test")
	public String test() throws IOException {
		new ObjectMapper().readValue("test", Map.class);
		return "暴躁老哥";
	}
}

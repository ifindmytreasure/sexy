package com.imooc.sexy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Unruly Wind on 2019/4/13/013.
 *
 * @author BlueMelancholy
 * @desc:
 */
public class LambdaTest {
	private static final Logger log = LoggerFactory.getLogger(LambdaTest.class);
	public static void main(String[] args) {

		new Thread(new Runnable() {
			@Override
			public void run() {
				log.info("传统方式开启线程");
			}
		}).start();
		new Thread(() -> log.info("lambda表达式开启线程")).start();

	}
}

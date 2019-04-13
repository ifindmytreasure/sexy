package com.imooc.sexy;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by Unruly Wind on 2019/4/13/013.
 *
 * @author BlueMelancholy
 * @desc:
 */
public class StreamTest {
	private static final Logger logger= LoggerFactory.getLogger(StreamTest.class);
	public static void main(String[] args) {
		//List<Order> 获取所有订单号，返回 List<Integer>
		List<Order> orderList = new ArrayList<>();
		orderList.add(new Order(97890, "慕课网"));
		orderList.add(new Order(12345, "廖师兄"));
		orderList.add(new Order(67890, "慕课网2"));
		orderList.add(new Order(67890, "慕课网2"));
		List<Integer> idList = new ArrayList<>();
		for (Order order : orderList) {
			idList.add(order.getId());
		}
		logger.info("传统遍历方式");
		System.out.println(idList);
		logger.info("stream方式");
		//这里的e指向id
		List<Integer> collect = orderList.stream()
				.map(Order::getId)
				.filter(e -> !e.equals(67890))
				.collect(Collectors.toList());
		System.out.println(collect);
		List<Order> collect1 = orderList.stream().sorted((o1, o2) -> o2.getId().compareTo(o2.getId())).collect(Collectors.toList());
		System.out.println(collect1);
	}
}

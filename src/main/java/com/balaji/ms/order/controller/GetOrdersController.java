package com.balaji.ms.order.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.balaji.ms.order.dto.Order;

@RestController
@RequestMapping("/orders")
public class GetOrdersController {
	
	@RequestMapping(method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<Order> getOrders()
	{
		List<Order> orderList=new ArrayList<Order>();
		
		Order o1=new Order();
		o1.setItemName("balaji");
		o1.setOrderId("bal123");

		Order o2=new Order();
		o2.setItemName("balaji Penamalli");
		o2.setOrderId("balPena123");
		
		orderList.add(o1);
		orderList.add(o2);
		
		return orderList;
	}

}

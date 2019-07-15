package com.sww.dubbo.api;


import com.sww.dubbo.model.OrderModel;

/**
 * OrderService
 * 订单服务接口
 */
public interface OrderService {
	/**
	 * 创建订单
	 * @param order
	 * @return
	 */
	String createOrder(OrderModel order);
	
	/**
	 * 查询订单信息
	 * @param orderNo
	 * @return
	 */
	OrderModel getOrder(String orderNo);
}


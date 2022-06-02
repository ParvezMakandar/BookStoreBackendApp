package com.example.demo.service;

import com.example.demo.dto.OrderDTO;
import com.example.demo.dto.ResponseDTO;
import com.example.demo.model.Order;

import java.util.List;

public interface IOrderService
{
    public Order insertOrder(OrderDTO orderdto);

    public List<Order> getAllOrderRecords();

    public Order getOrderRecord(Integer id);

//    public Order updateOrderRecord(Integer id, OrderDTO dto);
//
//    public Order deleteOrderRecord(Integer id);

    ResponseDTO orderStatusToCancel(Integer orderId, Integer userId);

    Order updateOrderRecord(Integer id, OrderDTO dto);

    Order deleteOrderRecord(Integer id);
}

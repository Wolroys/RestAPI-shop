package com.wolroys.services;

import com.wolroys.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class OrderService {

    private final OrderRepository orderRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

//    @Transactional
//    public void createOrder(String username, OrderDtoDetails orderDtoDetail){
//        Order order = new Order();
//        order.setUsername(username)
//                .setAddress(orderDtoDetail.getAddress())
//                .setPhoneNumber(order.getPhoneNumber())
//                .setStatus(OrderStatus.AWAIT_OF_PAYMENT);
//        //TODO
//        //Need a cart for totalPrice and for items
//    }
}

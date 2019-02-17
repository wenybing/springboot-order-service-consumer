package com.wenyb.controller;

import com.wenyb.bean.UserAddress;
import com.wenyb.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author wenyabing
 * @Date 2019/2/17 14:40
 */
@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("/init")
    public List<UserAddress> list(@RequestParam("uid") String userId) {
        return orderService.initOrder(userId);
    }
}

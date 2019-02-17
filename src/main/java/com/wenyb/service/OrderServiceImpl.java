package com.wenyb.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.wenyb.bean.UserAddress;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author wenyabing
 * @Date 2019/2/13 16:34
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Reference
    private UserService userService;

    @Override
    public List<UserAddress> initOrder(String s) {
        /**
         * 查询用户收货地址
         */
        List<UserAddress> userAddressList = userService.getUserAddressList("1");
        for (UserAddress userAddress : userAddressList) {
            System.out.println(userAddress.getUserAddress());
        }
        return userAddressList;
    }
}

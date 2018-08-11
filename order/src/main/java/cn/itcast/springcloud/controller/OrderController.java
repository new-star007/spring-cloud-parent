package cn.itcast.springcloud.controller;

import cn.itcast.springcloud.services.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    private OrderServiceImpl orderService;
    @RequestMapping("/getMemBerAll")
    public List getMemberAll(){
        return orderService.findAll();
    }
}

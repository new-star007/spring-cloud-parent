package cn.itcast.springcloud.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService{
    @Autowired
    private RestTemplate restTemplate;

    public List findAll(){
       return restTemplate.getForObject("http://service-member/findAll",List.class);
    }
}

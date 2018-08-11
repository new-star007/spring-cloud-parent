package cn.itcast.springcloud;

import cn.itcast.springcloud.services.OrderServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class OrderApp
{
    public static void main( String[] args )
    {
        SpringApplication.run(OrderApp.class,args);
    }
}

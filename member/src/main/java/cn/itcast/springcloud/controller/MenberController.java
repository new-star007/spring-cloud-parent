package cn.itcast.springcloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@RestController
public class MenberController {
    @RequestMapping("/findAll")
    @ResponseBody
    public List findAll(HttpServletResponse response){
        List list = new ArrayList();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        return list;
    }
}

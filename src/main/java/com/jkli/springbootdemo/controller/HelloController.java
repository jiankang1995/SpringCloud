package com.jkli.springbootdemo.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.actuate.metrics.CounterService;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/controller")
public class HelloController {
//    打开日志
    private final Logger logger = Logger.getLogger(getClass());
//      引入服务发现客户端
//    @Autowired
//    private DiscoveryClient client;

/*    @Qualifier("counterService")
    @Autowired
    private CounterService counterService;

    @RequestMapping("/helloCount")
    public String greet(){
        counterService.increment("jkli.hello.count");
        return counterService.toString();
    }*/

    @RequestMapping(value="/hello",method = RequestMethod.GET)
    public String index(){
//        使用log4j打印服务相关内容
//        ServiceInstance instance = client.getLocalServiceInstance();
//        logger.info("/hello,host:"+instance.getHost()+",service_id:"+instance.getServiceId());
        return "Hello!";
    }
}

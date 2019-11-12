package com.hwk.studyapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController	
public class TestController {

	@Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/searchservice/{a}/{b}",method = RequestMethod.GET)
    public String add(@PathVariable Integer a,@PathVariable Integer b)
    {
        System.out.println("app:studyappsone"+"//Service:"+client.getServices()+"//a:"+a+"//b:"+b);
        return "app:studyappsone"+"//Service:"+client.getServices()+"//a:"+a+"//b:"+b;
    }
    
}

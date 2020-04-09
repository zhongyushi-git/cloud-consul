package com.zys.cloud.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import javax.annotation.Resource;

@RestController
public class OrderConsulController {

    public static final String INVOKE_URL = "http://cloud-consul-provider";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/consul")
    public String paymentInfo(){
        String result = restTemplate.getForObject(INVOKE_URL+"/provider/consul",String.class);
        return result;
    }
}
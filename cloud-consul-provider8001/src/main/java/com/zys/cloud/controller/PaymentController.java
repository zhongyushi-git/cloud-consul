package com.zys.cloud.controller;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.UUID;

@RestController
@RequestMapping("/provider")
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/consul")
    public String paymentConsul(){
        return "consul message：服务端口号："+serverPort+"\t 现在时间："+ new Date().toString();
    }
}
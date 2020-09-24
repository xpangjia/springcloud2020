package com.site.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@Slf4j
public class OrderController {
//    public static final String PAYMENT_URL="http://localhost:8001";
//public static final String PAYMENT_URL="http://CLOUD-PAYMENT-SERVICE";
    public static final String INVOKE_URL="http://cloud-provider-payment";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/consul")
    public String paymentInfo(){
        return restTemplate.getForObject(INVOKE_URL + "/payment/consul/", String.class);
    }
}

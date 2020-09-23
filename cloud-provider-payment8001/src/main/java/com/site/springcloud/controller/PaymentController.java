package com.site.springcloud.controller;

import com.site.springcloud.entities.CommonResult;
import com.site.springcloud.entities.Payment;
import com.site.springcloud.service.PaymentService;
import lombok.extern.slf4j.XSlf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @PostMapping(value = "/payment/create")
    public CommonResult create(Payment payment){
        int result = paymentService.create(payment);

//        log.info("插入结果：" + result);

        if(result >0){
            return new CommonResult(200, "success", result);
        } else {
            return new CommonResult(444, "fail", null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult create(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);

//        log.info("插入结果：" + payment);
//
        if(payment != null){
            return new CommonResult(200, "success", payment);
        } else {
            return new CommonResult(444, "fail", null);
        }
    }
}

package cn.com.sk.springcloudorder.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/getOrder")
    public void getOrder(){
        System.out.println("getOrder");
    }
}

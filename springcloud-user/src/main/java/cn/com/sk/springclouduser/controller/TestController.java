package cn.com.sk.springclouduser.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {

    @Autowired
   private RestTemplate restTemplate;

    @GetMapping("/getTest")
    public void getTest(){
       restTemplate.getForObject("http://localhost:8094/getOrder",String.class);
    }
}

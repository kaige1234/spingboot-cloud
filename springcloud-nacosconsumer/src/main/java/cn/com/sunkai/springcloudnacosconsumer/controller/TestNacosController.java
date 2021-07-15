package cn.com.sunkai.springcloudnacosconsumer.controller;

import cn.com.sunkai.springcloudnacosconsumer.feign.TestFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestNacosController {

    @Autowired
    private TestFeign testFeign;

    @RequestMapping("/gets")
    public void gets(){
        testFeign.addCard();
    }
}

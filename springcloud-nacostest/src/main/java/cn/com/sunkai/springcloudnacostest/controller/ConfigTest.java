package cn.com.sunkai.springcloudnacostest.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RefreshScope//配置该注解可以动态刷新数据
@RestController
public class ConfigTest {
    @Value("${name}")
    private String name;


    @RequestMapping("/getTest")
    public String getTest(){
        return name;
    }
}

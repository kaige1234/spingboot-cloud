package cn.com.sunkai.springcloudnacosconsumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;


@FeignClient(value = "add")
public interface TestFeign {

    @RequestMapping("/getTest")
    void addCard();
}

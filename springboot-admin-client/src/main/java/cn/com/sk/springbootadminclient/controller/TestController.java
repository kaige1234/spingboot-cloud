package cn.com.sk.springbootadminclient.controller;

import cn.com.sk.springbootadminclient.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

@RestController
public class TestController {

    @GetMapping("get")
    public String get(){
        return "ddd";
    }

    private ExecutorService cacheThread = Executors.newCachedThreadPool();
    @GetMapping("getThread")
    public void getThread(){
        cacheThread.execute(
                new Runnable(){
                    @Override
                    public void run() {
                        System.out.println("dddddd");
                    }
                }
        );

    }


    @GetMapping("getTime")
    public String getTime() throws InterruptedException {
        List<User> userList = new ArrayList<>();
        while(true){
            User user = new User();
            user.setCode("sskkdd");
            userList.add(user);
            Thread.sleep(500);
            System.out.println("集合中的信息数量："+userList.size());
        }
    }

}

package com.mondris.demo.controllers.Httpurlconnection;

import com.mondris.demo.Service.HttpUrlConnectionDemo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class PostController {
    @Resource
    HttpUrlConnectionDemo httpUrlConnectionDemo;
    @GetMapping("/httpurlcon/posts")
    public String getPosts(){
        return httpUrlConnectionDemo.getPosts();
    }
}

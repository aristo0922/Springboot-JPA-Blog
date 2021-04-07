package com.cos.Blog.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


//spring이 com.cos.blog package 이하 스캔-> 특정 어노테이션이 붙은 클래스 파일 new  - >스프링 컨테이너에 관리.
@RestController
public class BlogControllerTest {
    @GetMapping("/test/hello")
    public String hello(){
        return " <h1>hello spring boot </h1>";
    }
}

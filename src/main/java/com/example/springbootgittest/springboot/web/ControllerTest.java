package com.example.springbootgittest.springboot.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerTest {
    //第1个方法
    @RequestMapping("hhh")
    public String TestDemo() {
        return "dsfhksdjflkdk第三方看来都是借口附近+++++";
    }

    //第二个方法
    @RequestMapping("aaa")
    public String TestDemo1() {
        return "+++++";
    }


}

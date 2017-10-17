package com.milestone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: liyl
 * @date: 2017/10/15 下午3:21
 * @since 1.0.0
 */
@RestController
public class HelloController {


    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name){
         return helloService.hi(name);
    }
}

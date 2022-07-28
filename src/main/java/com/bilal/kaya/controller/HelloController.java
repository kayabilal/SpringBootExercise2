package com.bilal.kaya.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class HelloController {


    @GetMapping(path="/hello")
    //@RequestMapping(path = "/hello",method = RequestMethod.GET)
    // 13 ve 14. satırdaki kodlar aynı şeyi ifade eder.ikiside kullanılabilir.Genelde getmapping kullanılır çünkü daha anlaşılır.
    // burda görüldüğü üzere @RequestMapping hem class hem de method seviyesinde kullanılabilir.
    public String sayHello(){
        return "Hello World";
    }
}

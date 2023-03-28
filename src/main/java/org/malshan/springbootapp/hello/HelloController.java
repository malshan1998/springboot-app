package org.malshan.springbootapp.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")   // this tells to execute the below method when a request comes to /hello URL
    public String sayHi() {
        // @RequestMapping only serves GET requests
        return "Hi";
    }
}

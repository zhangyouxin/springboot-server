package com.shinya.hello;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by yoxzhang on 21/03/2018.
 */
@RestController
public class HelloSpringboot {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "HelloSpringboot";
    }

    @RequestMapping(value = "/getName", method = GET)
    public String getName() {
        return "MyName";
    }

}

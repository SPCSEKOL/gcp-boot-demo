package com.home.nn.gcp.boot.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("getCentigradeTemp/{fahrenheit}")
    public String getCentigradeTemperature(@PathVariable("fahrenheit")float far) {
        float centigrade = (5*(far-32))/9;
        return String.valueOf(centigrade);
    }
}

package com.home.nn.gcp.boot.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.text.DecimalFormat;

@RestController
public class DemoController {

    @GetMapping("getCentigradeTemp/{fahrenheit}")
    public String getCentigradeTemperature(@PathVariable("fahrenheit")double far) {
        DecimalFormat df = new DecimalFormat("#.##");
        double centigrade = (5*(far-32))/9;
        return df.format(centigrade);
    }
}

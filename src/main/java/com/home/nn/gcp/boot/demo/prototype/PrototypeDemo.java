package com.home.nn.gcp.boot.demo.prototype;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PrototypeDemo {

    private static final Logger logger = LoggerFactory.getLogger(PrototypeDemo.class);
    private static int i=0;

    public PrototypeDemo() {
        i++;
    }

    public void getValue() {
        logger.info("Value from prototype bean:: "+i);
    }
}

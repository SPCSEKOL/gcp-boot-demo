package com.home.nn.gcp.boot.demo.singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SingletonDemo {

    private static final Logger logger = LoggerFactory.getLogger(SingletonDemo.class);
    private static int i=0;

    public SingletonDemo() {
        i++;
    }

    public void getValue() {
        logger.info("Value from singleton bean:: "+i);
    }
}

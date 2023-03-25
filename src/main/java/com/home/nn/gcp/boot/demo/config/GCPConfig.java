package com.home.nn.gcp.boot.demo.config;

import com.home.nn.gcp.boot.demo.prototype.PrototypeDemo;
import com.home.nn.gcp.boot.demo.singleton.SingletonDemo;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class GCPConfig {
    @Bean(name = "sd")
    public SingletonDemo createSingletonDemo() {
        return new SingletonDemo();
    }

    @Bean(name = "pd")
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public PrototypeDemo createPrototypeDemo() {
        return new PrototypeDemo();
    }
}

package com.handu.open.dubbo.monitor;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.handu" })
public class DubboMonitorApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(DubboMonitorApplication.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
    }
}
package com.lanrenspace.edu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Create by HeLongJun on 2022/2/12 18:13
 *
 * @author lanrenspace@163.com
 * @Description:
 */
@SpringBootApplication
@EnableEurekaServer
public class LanrenspaceCloudEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(LanrenspaceCloudEurekaServerApplication.class, args);
    }
}

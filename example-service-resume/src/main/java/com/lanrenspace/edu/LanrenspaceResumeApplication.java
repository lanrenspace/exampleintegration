package com.lanrenspace.edu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

/**
 * Create by HeLongJun on 2022/2/12 17:31
 *
 * @author lanrenspace@163.com
 * @Description:
 */
@SpringBootApplication
@EntityScan("com.lanrenspace.edu.pojo")
public class LanrenspaceResumeApplication {

    public static void main(String[] args) {
        SpringApplication.run(LanrenspaceResumeApplication.class, args);
    }
}

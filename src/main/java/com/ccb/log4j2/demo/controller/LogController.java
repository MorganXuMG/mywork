package com.ccb.log4j2.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {

    private final static Logger logger = LoggerFactory.getLogger(LogController.class);

    @GetMapping("/testLog")
    public String testLog() {
        logger.warn("testlogwarn");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        logger.info("testloginfo");
        return "testLog";
    }

    @GetMapping("/testLog2")
    public String testLog2() {
        logger.warn("testlogwarn2");
        logger.info("testloginfo2");
        return "testLog2";
    }

}

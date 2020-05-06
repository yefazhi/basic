package com.qianlicode.basic.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/****
 * 服务Controller
 */
@RestController
@RequestMapping("/app")
public class ApplicationController {

    @Value("${server.env}")
    private String env;

    /***
     * 服务心跳检测
     */
    @GetMapping("/env")
    public String env() {
        return env;
    }

    /***
     * 服务心跳检测
     */
    @GetMapping("/status")
    public String startUp() {
        return "success";
    }

    @GetMapping("/shutdown")
    public String shutdown() {
        return null;
    }
}

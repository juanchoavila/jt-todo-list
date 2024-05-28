package com.project.jt_todo_list.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PingController {

    private static final Logger log = LoggerFactory.getLogger(PingController.class);

    @GetMapping(value="/ping")
    public String ping() {
        log.info("Executing ping request");
        return "pong";
    }

}

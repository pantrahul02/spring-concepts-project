package org.example.controller;

import org.springframework.stereotype.Controller;

@Controller
public class DemoController {

    public String hello() {
        return "Hello DemoController....";
    }
}

package com.neuedu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FrameController {
    @GetMapping("/index")
    public String index(){
        return "index";
    }
}

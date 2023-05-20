package com.csi.training.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class landing {

    @GetMapping("/")
    public String returnLandingPage() {
        return "visitors/landing";
    }

}

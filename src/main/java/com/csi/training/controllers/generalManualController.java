package com.csi.training.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class generalManualController {

    @GetMapping("/generalManual")
    public String returnGeneralManualPage() {
        return "users/generalManual";
    }
}

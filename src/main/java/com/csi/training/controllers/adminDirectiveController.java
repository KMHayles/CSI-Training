package com.csi.training.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class adminDirectiveController {

    @GetMapping("/AD")
    public String returnAdminPage() {
        return "users/admin";
    }

}

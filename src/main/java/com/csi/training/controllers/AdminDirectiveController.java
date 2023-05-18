package com.csi.training.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminDirectiveController {

    @GetMapping("/AD")
    public String returnAdminPage() {
        return "users/admin";
    }

}

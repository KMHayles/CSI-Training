package com.csi.training.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class crimeSceneSOPController {

    @GetMapping("/crimeSceneSOP")
    public String returnCrimeSceneSOPPage() {
        return "users/crimeSceneSOP";
    }
}

package com.csi.training.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class texasPenalCodeController {

    @GetMapping("/TXpdf")
    public String returnTexasPenalPage() {
        return "users/texasPenalCode";
    }
}

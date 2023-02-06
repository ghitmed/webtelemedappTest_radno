package com.webtelemedapp.webtelemedapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DoctorController {

    @GetMapping("/addPatient")
    public String addPatient(Model model) {
        return "patientInput.html";
    }
}

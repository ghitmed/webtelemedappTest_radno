package com.webtelemedapp.webtelemedapp;


import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

import java.util.List;

@Controller
public class PatientController {
        List<UserReport> UserReportList = new ArrayList<>();

        /*public PatientController () {
            UserReportList.add (new UserReport (100, 100, 100, "01.01.2023.", "loše"));
            UserReportList.add (new UserReport ( 150, 150, 600, "01.01.2003.", "još gore"));
        }*/




        @GetMapping("/addNewReport")
        public String addNewRecord(String dtm1, int st1, int dt1, int  otk1, String opis1, Model model ) {
            UserReport report = new UserReport (dtm1, st1, dt1, otk1, opis1);
            UserReportList.add(report);
            return "redirect:showNewReport";
        }

        @GetMapping("/showNewReport")
        public String showNewReport(Model model) {
            model.addAttribute(UserReportList);
            return "Pacijent - popis zapisa.html";
        }
        @GetMapping("/showReport")
        public String showReport(Model model) {
            model.addAttribute(UserReportList);
            return "Doktor - pregled pojedinog pacijenta.htmll";
        }














}

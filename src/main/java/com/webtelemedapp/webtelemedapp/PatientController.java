package com.webtelemedapp.webtelemedapp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

import java.util.Date;
import java.util.List;

@Controller
public class PatientController {
        List<ReportTm> reportTmList = new ArrayList<>();

    @Autowired
    ReportTmRepository RpRepository;
        @GetMapping("/addNewReport")
        public String addNewRecord(String dtm1, int st1, int dt1, int  otk1, String opis1, Model model ) {
            ReportTm report = new ReportTm(dtm1, st1, dt1, otk1, opis1);
            reportTmList.add(report);
            return "redirect:showNewReport";
        }

        @GetMapping("/showNewReport")
        public String showNewReport(Model model) {
            model.addAttribute(reportTmList);
            return "pacijent_popis_zapisa.html";
        }
        @GetMapping("/showReport")
        public String showReport(Model model) {
            model.addAttribute(reportTmList);
            return "Doktor - pregled pojedinog pacijenta.htmll";
        }







    // treba testirati metoda za Izbor pacijenta

    @GetMapping("/selectUser")
    public String showTodos(long userId, Model model) {

        // add current user
        UserTm currUser = RpRepository.findById(userId).get().getUser();
        model.addAttribute("currUser", currUser);

        // add all todo for that user
        model.addAttribute(RpRepository.findByUserTm(currUser));
        return "pacijent_popis_zapisa.html";
    }


}

package com.webtelemedapp.webtelemedapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class DoctorController {

    List<User> userList = new ArrayList<>();
    public DoctorController() {
        userList.add(new User("Mirko", "Bozic", "31.12.1978.", "099987654", "mirko@mail.com", "lozinka", "987654312"));

    }
    @GetMapping("/addPatient")
    public String addPatient() {
        return "patientInput.html";
    }
}

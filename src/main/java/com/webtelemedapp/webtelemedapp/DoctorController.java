package com.webtelemedapp.webtelemedapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class DoctorController {

    User currentUser;
    List<User> userList = new ArrayList<>();

   /* public DoctorController(List<User> userList) {
        userList.add(new User("Mirko", "Božić", "09.06.1991.", "0917256847", "mirko@gmail.com", "12345", "126547852" ));
    }*/



    @GetMapping("/addNewUser")
    public String addNewUser(String ime1, String prezime1, String datumRodenja1,  String brojMobitela1, String email1, String lozinka1, String mbo1, Model model) {
        User newUser = new User (ime1, prezime1, datumRodenja1, brojMobitela1, email1, lozinka1, mbo1);
        userList.add (newUser);
        return "redirect:/listUsers";

    }
    @GetMapping("/showCreateUser")
    public String showCreateUser (Model model) {
        model.addAttribute (userList);
        return "Doktor - kreiranje novog pacijenta.html";

    }


    @GetMapping("/listUsers")
    public String listUsers(Model model) {
        model.addAttribute(userList);
        return "Doktor - dashboard.html";

    }



    @GetMapping("/showUser")
    public String showUser (Model model) {
        model.addAttribute (userList);
        return "Doktor - pregled pojedinog pacijenta.html";

    }

    @GetMapping("/login")
    public String login() {
        return "login.html";
    }

    @GetMapping("/loginProcess")
    public String login(String email, String password, Model model) {

        // find user in list
        User user = UserDAO.getUserByUsernameAndPassword(email, password);

        if(user != null) {
            System.out.println("User found: " + user);
            currentUser = user;
            if(user.getType() == 0)
                return "redirect:/addNewReport?userId=" + user.getId();
            else
                return "redirect:/listUsers";
        } else {
            model.addAttribute("userMessage","User not found!");
            return "login.html";
        }


    }

}









  /*  List<User> userList = new ArrayList<>();
    public DoctorController() {
        userList.add(new User("Mirko", "Bozic", "31.12.1978.", "099987654", "mirko@mail.com", "lozinka", "987654312"));

    }
    @GetMapping("/addPatient")
    public String addPatient() {
        return "Doktor - kreiranje novog pacijenta.html";
    }

    @GetMapping("/addPatient")
    public String addPatient(String title) {
        userList.add(new User(title));

        return "redirect:Doktor - kreiranje novog pacijenta.html";

    }*/


package com.webtelemedapp.webtelemedapp;

import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserDAO {
    static List<User> userList = new ArrayList<>();

    public UserDAO() {

        // Admin user
        User adm = new User("Damir", "Jamnić", "02.02.1983", "0916403440", "damir@gmail.com", "12345", "111222");
        adm.setType(1);
        userList.add(adm);

        // patients user
        userList.add(new User("Mirko", "Božić", "09.06.1991.", "0917256847", "mirko@gmail.com", "12345", "111222"));
        userList.add(new User("Damjan", "Znika", "01.01.1998.", "0912233444", "damjan@gmail.com", "123", "444555"));
        userList.add(new User("Goran", "Skendžić", "01.05.1990.", "0912223344", "goran@gmail.com", "123", "777333"));
        userList.add(new User("Danijel", "Hlad", "01.02.2000.", "0912223344", "danijel@gmail.com", "123", "222333"));

    }


    public List<User> getUserList() {
        return userList;
    }


    public List<User> getUserListPatients() {

        List<User> userListPatients = new ArrayList<>();

        for (User userLogin : userList) {
            if (userLogin.getType() == 0)
                userListPatients.add(userLogin);
        }
        return userListPatients;
    }

    public static User getUserByUsernameAndPassword(String email, String password) {
        User user = null;
        for (User userlogin : userList) {
            if (userlogin.getEmail().equals(email) &&
                    userlogin.getLozinka().equals(password))
                user = userlogin;
        }
        return user;
    }

    public User getUserById(int id) {
        User user = null;
        for (User userLogin : userList) {
            if (userLogin.getId() == id)
                user = userLogin;
        }
        return user;
    }
}

package com.webtelemedapp.webtelemedapp;

import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserDAO {
    static List<UserTm> userTmedList = new ArrayList<>();

    public UserDAO() {

        // Admin user
        UserTm adm = new UserTm("Damir", "Jamnić", "02.02.1983", "0916403440", "damir@gmail.com", "12345", "111222");
        adm.setType(1);
        userTmedList.add(adm);

        // patients user
        userTmedList.add(new UserTm("Mirko", "Božić", "09.06.1991.", "0917256847", "mirko@gmail.com", "12345", "111222"));
        userTmedList.add(new UserTm("Damjan", "Znika", "01.01.1998.", "0912233444", "damjan@gmail.com", "123", "444555"));
        userTmedList.add(new UserTm("Goran", "Skendžić", "01.05.1990.", "0912223344", "goran@gmail.com", "123", "777333"));
        userTmedList.add(new UserTm("Danijel", "Hlad", "01.02.2000.", "0912223344", "danijel@gmail.com", "123", "222333"));

    }

}

/*
    public List<UserTmed> getUserListPatients() {

        List<UserTmed> userTmedListPatients = new ArrayList<>();

        for (UserTmed userTmedLogin : userTmedList) {
            if (userTmedLogin.getType() == 0)
                userTmedListPatients.add(userTmedLogin);
        }
        return userTmedListPatients;
    }

    public static UserTmed getUserByUsernameAndPassword(String email, String password) {
        UserTmed userTmed = null;
        for (UserTmed userlogin : userTmedList) {
            if (userlogin.getEmail().equals(email) &&
                    userlogin.getLozinka().equals(password))
                userTmed = userlogin;
        }
        return userTmed;
    }

    public UserTmed getUserById(int id) {
        UserTmed userTmed = null;
        for (UserTmed userTmedLogin : userTmedList) {
            if (userTmedLogin.getId() == id)
                userTmed = userTmedLogin;
        }
        return userTmed;
    }
}


 */
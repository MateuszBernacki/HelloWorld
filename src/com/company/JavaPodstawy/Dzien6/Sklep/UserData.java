package com.company.JavaPodstawy.Dzien6.Sklep;

import java.util.ArrayList;
import java.util.List;

public class UserData {
    List<User> Users = new ArrayList<>();

    public UserData(List<User> users) {
        Users = users;
    }

    public List<User> getUsers() {
        return Users;
    }
}

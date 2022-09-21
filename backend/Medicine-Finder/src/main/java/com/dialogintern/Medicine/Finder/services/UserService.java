package com.dialogintern.Medicine.Finder.services;

import com.dialogintern.Medicine.Finder.daos.UserDao;
import com.dialogintern.Medicine.Finder.entitys.Role;
import com.dialogintern.Medicine.Finder.entitys.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public User registerNewUser(User user) {
        return userDao.save(user);
    }
    public void initRolesAndUser(){
        Role adminRole = new Role();
    }
}

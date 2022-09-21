package com.dialogintern.Medicine.Finder.services;

import com.dialogintern.Medicine.Finder.daos.RoleDao;
import com.dialogintern.Medicine.Finder.entitys.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    @Autowired
    private RoleDao roleDao;

    public Role createNewRole(Role role) {
        return roleDao.save(role);
    }
}

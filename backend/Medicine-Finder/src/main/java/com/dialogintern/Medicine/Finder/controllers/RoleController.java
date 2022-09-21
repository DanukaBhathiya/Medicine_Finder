package com.dialogintern.Medicine.Finder.controllers;

import com.dialogintern.Medicine.Finder.entitys.Role;
import com.dialogintern.Medicine.Finder.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping("api/v1//createNewRole")
@CrossOrigin

public class RoleController {

    @Autowired
    private RoleService roleService;

    @PostMapping({"/createNewRole"})
    public Role createNewRole(@RequestBody Role role) {
        return  roleService.createNewRole(role);
    }
}

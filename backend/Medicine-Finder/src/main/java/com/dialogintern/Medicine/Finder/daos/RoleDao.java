package com.dialogintern.Medicine.Finder.daos;

import com.dialogintern.Medicine.Finder.entitys.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleDao extends CrudRepository<Role, String> {
}

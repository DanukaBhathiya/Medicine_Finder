package com.dialogintern.Medicine.Finder.daos;

import com.dialogintern.Medicine.Finder.entitys.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends CrudRepository<User, String> {
}

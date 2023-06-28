package ru.gokey.PP312_SpringBoot.service;

import ru.gokey.PP312_SpringBoot.model.User;
import java.util.List;


public interface UserService {
    List<User> getAllUsers();
    void save(User user);
    User show(int id);
    void update(int id, User updateUser);
    void delete(int id);
    User isExistById(User user);
}
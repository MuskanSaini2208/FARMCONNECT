package com.farmconnect.dao;

import com.farmconnect.model.User;
import java.util.List;

public interface UserDAO {
    void addUser(User user);
    User getUser(int id);
    List<User> getAllUsers();
    void updateUser(User user);
    void deleteUser(int id);
}

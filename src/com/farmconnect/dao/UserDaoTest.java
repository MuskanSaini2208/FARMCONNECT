package com.farmconnect.dao;
import com.farmconnect.model.User;

public class UserDaoTest {
    public static void main(String[] args) {
        UserDAO userDAO = new UserDAOImpl();

        // 1. Test addUser()
        User newUser = new User(0, "F123", "Yashi", "12345", "farmer", "9876543210");
        userDAO.addUser(newUser);
        System.out.println("User added successfully.");

//        User addedUser = userDAO.getUser(newUser.getId()); // Retrieve by the ID returned from the database
//        if (addedUser != null) {
//            System.out.println("Retrieved User: " + addedUser.getUsername());
//        } else {
//            System.out.println("User not found.");
//        }

        // 2. Test getAllUsers()
        userDAO.getAllUsers().forEach(u -> System.out.println("User: " + u.getUsername()));

//        // 3. Test updateUser()
//        if (addedUser != null) {
//            addedUser.setUsername("farmerUpdated");
//            userDAO.updateUser(addedUser);
//            System.out.println("User updated successfully.");
//        }
//
//        // 4. Test deleteUser()
//        if (addedUser != null) {
//            userDAO.deleteUser(addedUser.getId());
//            System.out.println("User deleted successfully.");
//        }
    }
}

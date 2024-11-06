package com.farmconnect.model;

public class User {
    private int id;
    private String username;
    private String name;
    private String password;
    private String userType;
    private String mobile;

    // Constructor
    public User(int id, String username, String name, String password, String userType, String mobile) {
        this.id = id;
        this.username = username;
        this.name = (name != null && !name.isEmpty()) ? name : "Unknown";  // Default to 'Unknown' if name is not provided
        this.password = password;
        this.userType = (userType != null && !userType.isEmpty()) ? userType : "consumer";  // Default to 'consumer'
        this.mobile = (mobile != null && !mobile.isEmpty()) ? mobile : "0000000000";  // Default to '0000000000'
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}

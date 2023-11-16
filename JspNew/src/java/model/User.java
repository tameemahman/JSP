/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.UUID;

/**
 *
 * @author user
 */
public class User {

    private String uid;
    private String fullName;
    private String userName;
    private String password;
    private String email;

    public User() {
    }

    public User(String uid, String fullName, String userName, String password, String email) {
        this.uid = uid;
        this.fullName = fullName;
        this.userName = userName;
        this.password = password;
        this.email = email;
    }

//    public user(String fullName, String userName, String password, String email) {
//        this.fullName = fullName;
//        this.userName = userName;
//        this.password = password;
//        this.email = email;
//    }
    public String getUid() {
        UUID uuid = UUID.randomUUID();
        return uid.toString();
        
    }

    public void setUid(String uid) {

        this.uid = uid;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}

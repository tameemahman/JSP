/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author user
 */
public class Student {
     private int id;
    private String givenName;
    private String lastName;
    private String gender;
    private String subject;

    public Student() {
    }

    public Student(int id, String givenName, String lastName, String gender, String subject) {
        this.id = id;
        this.givenName = givenName;
        this.lastName = lastName;
        this.gender = gender;
        this.subject = subject;
    }

    public Student(String givenName, String lastName, String gender, String subject) {
        this.givenName = givenName;
        this.lastName = lastName;
        this.gender = gender;
        this.subject = subject;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    
    
}

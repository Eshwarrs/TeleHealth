/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.telehealth.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author 16055
 */

@Entity

public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(length = 100)
    private int UserId;
    @Column(length = 50)
    private String FirstName;
    @Column(length = 50)
    private String LastName;
    @Column(length = 1000)
    private String Address;
    @Column(length = 50)
    private String City;
    @Column(length = 20)
    private String StateId;
    @Column(length = 10)
    private String ZIP;
    @Column(length = 15)
    private String PhoneNumber;
    @Column(length = 10)
    private int Age;
    @Column(length = 10)
    private String Gender;
    @Column(length = 100)
    private String CreatedDate;
    private boolean IsActive;
    private boolean IsDoctor;
    @Column(length = 100)
    private String Photo;
    @Column(length = 50)
    private String Email;
    @Column(length = 50)
    private String Password;
    @Column(length = 1000)
    private String Specializations;
    @Column(length = 100)
    private String Experiance;
    @Column(length = 1000)
    private String Description;

    public User(int UserId, String FirstName, String LastName, String Address, String City, String State, String ZIP, String PhoneNumber, int Age, String Gender, String CreatedDate, boolean IsActive, boolean IsDoctor, String Photo, String Email, String Password, String Specializations, String Experiance, String Description) {
        this.UserId = UserId;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Address = Address;
        this.City = City;
        this.StateId = State;
        this.ZIP = ZIP;
        this.PhoneNumber = PhoneNumber;
        this.Age = Age;
        this.Gender = Gender;
        this.CreatedDate = CreatedDate;
        this.IsActive = IsActive;
        this.IsDoctor = IsDoctor;
        this.Photo = Photo;
        this.Email = Email;
        this.Password = Password;
        this.Specializations = Specializations;
        this.Experiance = Experiance;
        this.Description = Description;
    }

    public User(String FirstName, String LastName, String Address, String City, String State, String ZIP, String PhoneNumber, int Age, String Gender, String CreatedDate, boolean IsActive, boolean IsDoctor, String Photo, String Email, String Password, String Specializations, String Experiance, String Description) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Address = Address;
        this.City = City;
        this.StateId = State;
        this.ZIP = ZIP;
        this.PhoneNumber = PhoneNumber;
        this.Age = Age;
        this.Gender = Gender;
        this.CreatedDate = CreatedDate;
        this.IsActive = IsActive;
        this.IsDoctor = IsDoctor;
        this.Photo = Photo;
        this.Email = Email;
        this.Password = Password;
        this.Specializations = Specializations;
        this.Experiance = Experiance;
        this.Description = Description;
    }

    public User() {
    }

    public int getUserId() {
        return UserId;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getAddress() {
        return Address;
    }

    public String getCity() {
        return City;
    }

    public String getState() {
        return StateId;
    }

    public String getZIP() {
        return ZIP;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public int getAge() {
        return Age;
    }

    public String getGender() {
        return Gender;
    }

    public String getCreatedDate() {
        return CreatedDate;
    }

    public boolean isIsActive() {
        return IsActive;
    }

    public boolean isIsDoctor() {
        return IsDoctor;
    }

    public String getPhoto() {
        return Photo;
    }

    public String getEmail() {
        return Email;
    }

    public String getPassword() {
        return Password;
    }

    public String getSpecializations() {
        return Specializations;
    }

    public String getExperiance() {
        return Experiance;
    }

    public String getDescription() {
        return Description;
    }

    public void setUserId(int UserId) {
        this.UserId = UserId;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public void setState(String State) {
        this.StateId = State;
    }

    public void setZIP(String ZIP) {
        this.ZIP = ZIP;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public void setCreatedDate(String CreatedDate) {
        this.CreatedDate = CreatedDate;
    }

    public void setIsActive(boolean IsActive) {
        this.IsActive = IsActive;
    }

    public void setIsDoctor(boolean IsDoctor) {
        this.IsDoctor = IsDoctor;
    }

    public void setPhoto(String Photo) {
        this.Photo = Photo;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public void setSpecializations(String Specializations) {
        this.Specializations = Specializations;
    }

    public void setExperiance(String Experiance) {
        this.Experiance = Experiance;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    @Override
    public String toString() {
        return "User{" + "UserId=" + UserId + ", FirstName=" + FirstName + ", LastName=" + LastName + ", Address=" + Address + ", City=" + City + ", State=" + StateId + ", ZIP=" + ZIP + ", PhoneNumber=" + PhoneNumber + ", Age=" + Age + ", Gender=" + Gender + ", CreatedDate=" + CreatedDate + ", IsActive=" + IsActive + ", IsDoctor=" + IsDoctor + ", Photo=" + Photo + ", Email=" + Email + ", Password=" + Password + ", Specializations=" + Specializations + ", Experiance=" + Experiance + ", Description=" + Description + '}';
    }
    
    
    
    
}

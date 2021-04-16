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
public class DiseaseDetails {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 100)
    private int DiseaseId;
    @Column(length = 100)
    private String Disease_Name;
    private boolean IsActive;
    @Column(length = 50)
    private String Type;

    public DiseaseDetails(int DiseaseId, String Disease_Name, boolean IsActive, String Type) {
        this.DiseaseId = DiseaseId;
        this.Disease_Name = Disease_Name;
        this.IsActive = IsActive;
        this.Type = Type;
    }

    public DiseaseDetails(String Disease_Name, boolean IsActive, String Type) {
        this.Disease_Name = Disease_Name;
        this.IsActive = IsActive;
        this.Type = Type;
    }

    public DiseaseDetails() {
    }

    public int getDiseaseId() {
        return DiseaseId;
    }

    public void setDiseaseId(int DiseaseId) {
        this.DiseaseId = DiseaseId;
    }

    public String getDisease_Name() {
        return Disease_Name;
    }

    public void setDisease_Name(String Disease_Name) {
        this.Disease_Name = Disease_Name;
    }

    public boolean isIsActive() {
        return IsActive;
    }

    public void setIsActive(boolean IsActive) {
        this.IsActive = IsActive;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    @Override
    public String toString() {
        return "DiseaseDetails{" + "DiseaseId=" + DiseaseId + ", Disease_Name=" + Disease_Name + ", IsActive=" + IsActive + ", Type=" + Type + '}';
    }
    
    
}

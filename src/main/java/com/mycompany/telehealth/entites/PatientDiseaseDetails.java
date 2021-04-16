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
public class PatientDiseaseDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 100)
    private int PaiantDiseaseId;
    @Column(length = 100)
    private int PatientId;
    @Column(length = 100)
    private int DiseaseId;
    @Column(length = 50)
    private String Disease_Descriptrion;
    @Column(length = 50)
    private String PreviousDocuments;

    public PatientDiseaseDetails(int PaiantDiseaseId, int PatientId, int DiseaseId, String Disease_Descriptrion, String PreviousDocuments) {
        this.PaiantDiseaseId = PaiantDiseaseId;
        this.PatientId = PatientId;
        this.DiseaseId = DiseaseId;
        this.Disease_Descriptrion = Disease_Descriptrion;
        this.PreviousDocuments = PreviousDocuments;
    }

    public PatientDiseaseDetails(int PatientId, int DiseaseId, String Disease_Descriptrion, String PreviousDocuments) {
        this.PatientId = PatientId;
        this.DiseaseId = DiseaseId;
        this.Disease_Descriptrion = Disease_Descriptrion;
        this.PreviousDocuments = PreviousDocuments;
    }

    public PatientDiseaseDetails() {
    }

    public int getPaiantDiseaseId() {
        return PaiantDiseaseId;
    }

    public void setPaiantDiseaseId(int PaiantDiseaseId) {
        this.PaiantDiseaseId = PaiantDiseaseId;
    }

    public int getPatientId() {
        return PatientId;
    }

    public void setPatientId(int PatientId) {
        this.PatientId = PatientId;
    }

    public int getDiseaseId() {
        return DiseaseId;
    }

    public void setDiseaseId(int DiseaseId) {
        this.DiseaseId = DiseaseId;
    }

    public String getDisease_Descriptrion() {
        return Disease_Descriptrion;
    }

    public void setDisease_Descriptrion(String Disease_Descriptrion) {
        this.Disease_Descriptrion = Disease_Descriptrion;
    }

    public String getPreviousDocuments() {
        return PreviousDocuments;
    }

    public void setPreviousDocuments(String PreviousDocuments) {
        this.PreviousDocuments = PreviousDocuments;
    }

    @Override
    public String toString() {
        return "PatientDiseaseDetails{" + "PaiantDiseaseId=" + PaiantDiseaseId + ", PatientId=" + PatientId + ", DiseaseId=" + DiseaseId + ", Disease_Descriptrion=" + Disease_Descriptrion + ", PreviousDocuments=" + PreviousDocuments + '}';
    }
    
    
}

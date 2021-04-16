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
public class DoctorTimeSheetDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 100)
    private int TimeSheetId;
    @Column(length = 100)
    private int DoctorId;
    @Column(length = 100)
    private String AvilableDate;
    @Column(length = 100)
    private String AvilableTime;

    public int getTimeSheetId() {
        return TimeSheetId;
    }

    public void setTimeSheetId(int TimeSheetId) {
        this.TimeSheetId = TimeSheetId;
    }

    public int getDoctorId() {
        return DoctorId;
    }

    public void setDoctorId(int DoctorId) {
        this.DoctorId = DoctorId;
    }

    public String getAvilableDate() {
        return AvilableDate;
    }

    public void setAvilableDate(String AvilableDate) {
        this.AvilableDate = AvilableDate;
    }

    public String getAvilableTime() {
        return AvilableTime;
    }

    public void setAvilableTime(String AvilableTime) {
        this.AvilableTime = AvilableTime;
    }

    public DoctorTimeSheetDetails(int DoctorId, String AvilableDate, String AvilableTime) {
        this.DoctorId = DoctorId;
        this.AvilableDate = AvilableDate;
        this.AvilableTime = AvilableTime;
    }

    public DoctorTimeSheetDetails(int TimeSheetId, int DoctorId, String AvilableDate, String AvilableTime) {
        this.TimeSheetId = TimeSheetId;
        this.DoctorId = DoctorId;
        this.AvilableDate = AvilableDate;
        this.AvilableTime = AvilableTime;
    }

    @Override
    public String toString() {
        return "DoctorTimeSheetDetails{" + "TimeSheetId=" + TimeSheetId + ", DoctorId=" + DoctorId + ", AvilableDate=" + AvilableDate + ", AvilableTime=" + AvilableTime + '}';
    }
    
    
}

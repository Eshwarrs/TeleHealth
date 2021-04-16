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
public class AppointmentDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 100)
    private int appointment_ID;
    @Column(length = 100)
    private int PatientId;
    @Column(length = 100)
    private int DoctorId;
    @Column(length = 100)
    private String CreatedDate;
     @Column(length = 100)
    private String AppointmentDate;
    private boolean IsCanceled;
    @Column(length = 100)
    private String CanceledBy;
    @Column(length = 50)
    private String AppoinementType;

    public AppointmentDetails(int PatientId, int DoctorId, String CreatedDate, String AppointmentDate, boolean IsCanceled, String CanceledBy, String AppoinementType) {
        this.PatientId = PatientId;
        this.DoctorId = DoctorId;
        this.CreatedDate = CreatedDate;
        this.AppointmentDate = AppointmentDate;
        this.IsCanceled = IsCanceled;
        this.CanceledBy = CanceledBy;
        this.AppoinementType = AppoinementType;
    }

    public AppointmentDetails(int appointment_ID, int PatientId, int DoctorId, String CreatedDate, String AppointmentDate, boolean IsCanceled, String CanceledBy, String AppoinementType) {
        this.appointment_ID = appointment_ID;
        this.PatientId = PatientId;
        this.DoctorId = DoctorId;
        this.CreatedDate = CreatedDate;
        this.AppointmentDate = AppointmentDate;
        this.IsCanceled = IsCanceled;
        this.CanceledBy = CanceledBy;
        this.AppoinementType = AppoinementType;
    }

    public AppointmentDetails() {
    }

    public int getAppointment_ID() {
        return appointment_ID;
    }

    public void setAppointment_ID(int appointment_ID) {
        this.appointment_ID = appointment_ID;
    }

    public int getPatientId() {
        return PatientId;
    }

    public void setPatientId(int PatientId) {
        this.PatientId = PatientId;
    }

    public int getDoctorId() {
        return DoctorId;
    }

    public void setDoctorId(int DoctorId) {
        this.DoctorId = DoctorId;
    }

    public String getCreatedDate() {
        return CreatedDate;
    }

    public void setCreatedDate(String CreatedDate) {
        this.CreatedDate = CreatedDate;
    }

    public String getAppointmentDate() {
        return AppointmentDate;
    }

    public void setAppointmentDate(String AppointmentDate) {
        this.AppointmentDate = AppointmentDate;
    }

    public boolean isIsCanceled() {
        return IsCanceled;
    }

    public void setIsCanceled(boolean IsCanceled) {
        this.IsCanceled = IsCanceled;
    }

    public String getCanceledBy() {
        return CanceledBy;
    }

    public void setCanceledBy(String CanceledBy) {
        this.CanceledBy = CanceledBy;
    }

    public String getAppoinementType() {
        return AppoinementType;
    }

    public void setAppoinementType(String AppoinementType) {
        this.AppoinementType = AppoinementType;
    }

    @Override
    public String toString() {
        return "AppointmentDetails{" + "appointment_ID=" + appointment_ID + ", PatientId=" + PatientId + ", DoctorId=" + DoctorId + ", CreatedDate=" + CreatedDate + ", AppointmentDate=" + AppointmentDate + ", IsCanceled=" + IsCanceled + ", CanceledBy=" + CanceledBy + ", AppoinementType=" + AppoinementType + '}';
    }
   
}

package org.iit.cc.appointments.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "appointments")
public class Appointment {

    @Id
    private String id;
    private String patientId;
    private LocalDateTime plannedStartTime;
    private LocalDateTime plannedEndTime;
    private boolean overTime;
    private String status; // Scheduled, Rescheduled, Canceled, Completed
    private String symptomCondition;
    private String doctorId;
    private boolean doctorAvailable;

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public LocalDateTime getPlannedStartTime() {
        return plannedStartTime;
    }

    public void setPlannedStartTime(LocalDateTime plannedStartTime) {
        this.plannedStartTime = plannedStartTime;
    }

    public LocalDateTime getPlannedEndTime() {
        return plannedEndTime;
    }

    public void setPlannedEndTime(LocalDateTime plannedEndTime) {
        this.plannedEndTime = plannedEndTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSymptomCondition() {
        return symptomCondition;
    }

    public void setSymptomCondition(String symptomCondition) {
        this.symptomCondition = symptomCondition;
    }

    public boolean isDoctorAvailable() {return doctorAvailable;}

    public void setDoctorAvailable(boolean doctorAvailable) {this.doctorAvailable = doctorAvailable;}

    public String getDoctorId() {return doctorId;}

    public void setDoctorId(String doctorId) {this.doctorId = doctorId;}

    public boolean isOverTime() {return overTime;}

    public void setOverTime(boolean overTime) {this.overTime = overTime;}
}


package com.doctorapp.model;

public class Doctor {

    private String doctorName;
    private Integer doctorId;
    private String speciality;
    private double fees;
    private int ratings;
    private int experience;

    public Doctor() {

    }

    public Doctor(String doctorName, String speciality, double fees, int ratings, int experience) {
        this.doctorName = doctorName;
        this.speciality = speciality;
        this.fees = fees;
        this.ratings = ratings;
        this.experience = experience;
    }

    public Doctor(Integer doctorId, String doctorName, String speciality, double fees, int ratings, int experience) {
        this.doctorName = doctorName;
        this.doctorId = doctorId;
        this.speciality = speciality;
        this.fees = fees;
        this.ratings = ratings;
        this.experience = experience;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    public int getRatings() {
        return ratings;
    }

    public void setRatings(int ratings) {
        this.ratings = ratings;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "doctorName='" + doctorName + '\'' +
                ", doctorId=" + doctorId +
                ", speciality='" + speciality + '\'' +
                ", fees=" + fees +
                ", ratings=" + ratings +
                ", experience=" + experience +
                '}';
    }
}

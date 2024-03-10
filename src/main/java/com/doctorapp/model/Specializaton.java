package com.doctorapp.model;

public enum Specializaton {

    NEURO("NEUROLOGIST"),
    DERMA("DERMATOLOGIST"),
    ORTHO("ORTHOPEDICS"),
    RADIO("RADIOLOGY"),
    PEDIA("PEDIATRICIAN"),
    SURG("GENERAL SURGERY");

    private String speciality;
    Specializaton(String speciality){
        this.speciality=speciality;
    }

    public String getSpeciality() {
        return speciality;
    }
}

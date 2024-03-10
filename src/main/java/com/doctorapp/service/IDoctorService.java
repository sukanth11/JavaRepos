package com.doctorapp.service;


import com.doctorapp.exceptions.DoctorNotFoundException;
import com.doctorapp.exceptions.IdNotFoundException;
import com.doctorapp.model.Doctor;

import java.util.List;

public interface IDoctorService {
    void addDoctor(Doctor doctor);
    void updateDoctor(int doctorId,double fees);
    void deleteDoctor(int doctorId);
    Doctor getById(int doctorId) throws IdNotFoundException;
    List<Doctor> getAll();
    List<Doctor> getBySpeciality(String speciality) throws DoctorNotFoundException ;
    List<Doctor> getBySpecialityAndNameCon(String speciality, String doctorName)throws DoctorNotFoundException;
    List<Doctor> getBySpecialityAndExp(String speciality, int experience) throws DoctorNotFoundException;
    List<Doctor> getBySpecialityAndLessFees(String speciality, double fees)throws DoctorNotFoundException;
    List<Doctor> getBySpecialityAndRatings(String speciality, int ratings)throws DoctorNotFoundException;

}

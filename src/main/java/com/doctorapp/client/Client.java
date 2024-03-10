package com.doctorapp.client;

import com.doctorapp.exceptions.DoctorNotFoundException;
import com.doctorapp.model.Doctor;
import com.doctorapp.model.Specializaton;
import com.doctorapp.service.DoctorServiceImpl;
import com.doctorapp.service.IDoctorService;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        IDoctorService doctorService = new DoctorServiceImpl();
        Specializaton specialization = Specializaton.RADIO;
        String speciality  = specialization.getSpeciality();
        String special = Specializaton.RADIO.getSpeciality();

        Doctor doctor = new Doctor("prajwal", speciality,6000,7,10);

        doctorService.addDoctor(doctor);

        List<Doctor> doctors=doctorService.getAll();
        for (Doctor doctor1:doctors){
            System.out.println(doctor);
        }
        System.out.println("***********************");
        List<Doctor> doctorsBySpecialityAndLessFee=null;
        try {
            doctorsBySpecialityAndLessFee = doctorService.getBySpecialityAndLessFees("RADIOLOGY",2000);
        } catch (DoctorNotFoundException e) {
            throw new RuntimeException("Doctor by this speciality and fees not found");
        }
        for (Doctor doctor1:doctorsBySpecialityAndLessFee){
            System.out.println(doctor);
        }

        System.out.println("************************");
        List<Doctor> doctorsbysepcialityandexp= null;
        try {
            doctorsbysepcialityandexp = doctorService.getBySpecialityAndExp("GENERAL SURGERY",12);
        } catch (DoctorNotFoundException e) {
            throw new RuntimeException("Doctor by this speciality and experience not found");
        }
        for (Doctor doctor1:doctorsbysepcialityandexp){
            System.out.println(doctor);
        }
        System.out.println("------------------");

    }
}

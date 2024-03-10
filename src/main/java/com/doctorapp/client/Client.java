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
//        String speciality  = specialization.getSpeciality();
//        String special = Specializaton.RADIO.getSpeciality();
//        Doctor doctor = new Doctor("sukanth", speciality,5000,9,15);
//        Doctor doctor = new Doctor("kishor", speciality,1000,5,1);
//        Doctor doctor = new Doctor("prajwal", speciality,6000,7,10);
//        Doctor doctor = new Doctor("nikhil", speciality,5000,9,12);
//        doctorService.addDoctor(doctor)

//          Doctor doctor=new Doctor();
//          doctorService.updateDoctor(3,2000);

//          doctorService.deleteDoctor(4);

//        try {
//            System.out.println(doctorService.getById(3));;
//        } catch (IdNotFoundExcetion e) {
//            e.printStackTrace();
//        }

        List<Doctor> doctors=doctorService.getAll();
        for (Doctor doctor:doctors){
            System.out.println(doctor);
        }
        System.out.println("***********************");
        List<Doctor> doctorsBySpecialityAndLessFee=null;
        try {
            doctorsBySpecialityAndLessFee = doctorService.getBySpecialityAndLessFees("RADIOLOGY",2000);
        } catch (DoctorNotFoundException e) {
            throw new RuntimeException("Doctor by this speciality and fees not found");
        }
        for (Doctor doctor:doctorsBySpecialityAndLessFee){
            System.out.println(doctor);
        }

        System.out.println("************************");
        List<Doctor> doctorsbysepcialityandexp= null;
        try {
            doctorsbysepcialityandexp = doctorService.getBySpecialityAndExp("GENERAL SURGERY",12);
        } catch (DoctorNotFoundException e) {
            throw new RuntimeException("Doctor by this speciality and experience not found");
        }
        for (Doctor doctor:doctorsbysepcialityandexp){
            System.out.println(doctor);
        }


    }
}
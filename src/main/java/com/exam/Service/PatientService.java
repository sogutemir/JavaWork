package com.exam.Service;

import com.exam.Model.Patient;
import com.exam.Repository.PatientRepository;
import org.springframework.stereotype.Service;

@Service
public class PatientService {

    private PatientRepository patientRepository;

    public Patient getPatient(int patientId){
        return  patientRepository.findById(patientId).orElse(null);
    }
    public Patient addPatient(Patient patient) {
        return patientRepository.save(patient);
    }

    public void deletePatient(int patientId) {
        patientRepository.deleteById(patientId);
    }
}

package com.exam.Service;

import com.exam.Model.Doctor;
import com.exam.Repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {
    @Autowired
    private DoctorRepository doctorRepository;

    public List<Doctor> findByOfficeNo(int officeNo) {
        return doctorRepository.findByOfficeNo(officeNo);
    }
}

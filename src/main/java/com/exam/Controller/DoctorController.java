package com.exam.Controller;

import com.exam.Model.Doctor;
import com.exam.Service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @GetMapping("/{officeNo}")
    public List<Doctor> getDoctorsByOfficeNo(@PathVariable int officeNo) {
        return doctorService.findByOfficeNo(officeNo);
    }
}

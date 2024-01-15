package com.exam.Controller;

import com.exam.Model.Bus;
import com.exam.Model.Passenger;
import com.exam.Repository.BusRepository;
import com.exam.Repository.CompanyRepository;
import com.exam.Repository.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/terminal")
public class TerminalController {
    @Autowired
    private BusRepository busRepository;
    @Autowired
    private CompanyRepository companyRepository;
    @Autowired
    private PassengerRepository passengerRepository;

    @GetMapping("/buses")
    public List<Bus> getBuses() {
        return busRepository.findAll();
    }

    @GetMapping("/buses/{companyId}")
    public List<Bus> getBusesByCompanyId(@PathVariable Long companyId) {
        return busRepository.findByCompanyId(companyId);
    }

    @GetMapping("/bus/{id}")
    public Optional<Bus> getBus(@PathVariable Long id) {
        return busRepository.findById(id);
    }

    @GetMapping("/passengers/{busId}")
    public List<Passenger> getPassengersByBusId(@PathVariable Long busId) {
        return passengerRepository.findByBusId(busId);
    }

    @PostMapping("/passenger")
    public Passenger newPassenger(@RequestBody Passenger passenger) {
        return passengerRepository.save(passenger);
    }

    @DeleteMapping("/passenger/{id}")
    public String removePassenger(@PathVariable Long id) {
        passengerRepository.deleteById(id);
        return "Passenger removed with id: " + id;
    }
}

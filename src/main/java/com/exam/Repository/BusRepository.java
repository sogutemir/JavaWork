package com.exam.Repository;

import com.exam.Model.Bus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BusRepository extends JpaRepository<Bus, Long> {
    List<Bus> findByCompanyId(Long companyId);
}

package com.cg.moneyplant.repository;

import com.cg.moneyplant.entity.Experts;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExpertsRepository extends JpaRepository<Experts,Integer> {
    public List<Experts> findAllByspeciality(String speciality);
}

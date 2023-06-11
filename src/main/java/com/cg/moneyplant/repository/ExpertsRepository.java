package com.cg.moneyplant.repository;

import com.cg.moneyplant.entity.Experts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ExpertsRepository extends JpaRepository<Experts,Integer> {
//    @Query(value = "SELECT * FROM experts WHERE tags LIKE '% (:tag) %'")
    public List<Experts> findAllByTags(@Param("tags") String tags);
    public List<Experts> findAllByTitle(String title);
}

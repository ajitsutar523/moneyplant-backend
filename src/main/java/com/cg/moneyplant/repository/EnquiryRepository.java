package com.cg.moneyplant.repository;

import com.cg.moneyplant.entity.Enquiry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface EnquiryRepository extends JpaRepository<Enquiry,Integer> {
    @Query(value = "UPDATE enquiry SET message = :message WHERE id = :id",nativeQuery = true)
    public Integer updateEnquirySetMessageForId(@Param("id") Integer id,@Param("message") String message);


}

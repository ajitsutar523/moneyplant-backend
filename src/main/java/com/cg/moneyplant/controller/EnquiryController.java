package com.cg.moneyplant.controller;

import com.cg.moneyplant.entity.Enquiry;
import com.cg.moneyplant.entity.Experts;
import com.cg.moneyplant.service.IEnquiryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class EnquiryController {
    @Autowired
    private IEnquiryService enquiryService;
    @PostMapping("/enquiry")
    public ResponseEntity<Enquiry> insertEnquiry(
            @RequestBody Enquiry enquiry
            ) throws Exception{
        return new ResponseEntity<Enquiry>(enquiryService.insertEnquiry(enquiry), HttpStatus.OK);
    }
}

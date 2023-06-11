package com.cg.moneyplant.controller;

import com.cg.moneyplant.entity.Enquiry;
import com.cg.moneyplant.entity.Experts;
import com.cg.moneyplant.service.IEnquiryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class EnquiryController {
    @Autowired
    private IEnquiryService enquiryService;
    @PostMapping("/enquiry/{expertid}")
    public ResponseEntity<Enquiry> insertEnquiry(
            @PathVariable int expertid,
            @RequestBody Enquiry enquiry
            ) throws Exception{
        return new ResponseEntity<Enquiry>(enquiryService.insertEnquiry(expertid,enquiry), HttpStatus.OK);
    }
    @PutMapping("/enquiry/{enquiryId}/{message}")
    public ResponseEntity<String> updateEnquiry(
            @PathVariable String message,
            @PathVariable int enquiryId
    ) throws Exception{
        Integer res=enquiryService.updateEnquiryMessage(enquiryId,message);
        if(res==1)
            return ResponseEntity.ok("{Updated}");
        else
            return ResponseEntity.ok("{Failed}");
    }
}

package com.cg.moneyplant.controller;

import com.cg.moneyplant.entity.Enquiry;
import com.cg.moneyplant.entity.Experts;
import com.cg.moneyplant.service.IEnquiryService;
import com.cg.moneyplant.service.IExpertsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class ExpertsController {
    @Autowired
    private IExpertsService expertsService;
    @PostMapping("/experts")
    public ResponseEntity<Experts> insertExperts(
            @RequestBody Experts experts
    ) throws Exception{
        return new ResponseEntity<Experts>(expertsService.insertExpert(experts), HttpStatus.OK);
    }
    @PutMapping("/experts")
    public ResponseEntity<Experts> updateExperts(
            @RequestBody Experts experts
    ) throws Exception{
        return new ResponseEntity<Experts>(expertsService.updateExpert(experts), HttpStatus.OK);
    }

    @GetMapping("/expertsByTitle/{title}")
    public ResponseEntity<List<Experts>> findByTitle(
            @PathVariable String title
    ) throws Exception{
       return new ResponseEntity<List<Experts>>(expertsService.fingByTitle(title),HttpStatus.OK);
    }
    @GetMapping("/expertsByTags/{tag}")
    public ResponseEntity<List<Experts>> findByTags(
            @PathVariable String tag
    ) throws Exception{
        return new ResponseEntity<List<Experts>>(expertsService.findByTags(tag),HttpStatus.OK);
    }
    @GetMapping("/experts")
    public ResponseEntity<List<Experts>> GetAllExperts(
    ) throws Exception{
        return new ResponseEntity<List<Experts>>(expertsService.getAllExperts(),HttpStatus.OK);
    }


}

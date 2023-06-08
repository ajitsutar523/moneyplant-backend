package com.cg.moneyplant.service;

import com.cg.moneyplant.entity.Enquiry;

import java.util.List;

public interface IEnquiryService {
    public Enquiry insertEnquiry(Enquiry enquiry) throws Exception;
    public Enquiry updateEnquiry(Enquiry enquiry) throws Exception;


}

package com.cg.moneyplant.service;

import com.cg.moneyplant.entity.Enquiry;

import java.util.List;

public interface IEnquiryService {
    public Enquiry insertEnquiry(int expertid,Enquiry enquiry) throws Exception;
    public Integer updateEnquiryMessage(int enquiryId,String message) throws Exception;
    public Enquiry updateEnquiry(Enquiry enquiry) throws Exception;
    public List<Enquiry> getAllEnquiry() throws Exception;


}

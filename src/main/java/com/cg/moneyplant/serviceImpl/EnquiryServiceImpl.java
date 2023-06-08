package com.cg.moneyplant.serviceImpl;

import com.cg.moneyplant.entity.Enquiry;
import com.cg.moneyplant.repository.EnquiryRepository;
import com.cg.moneyplant.service.IEnquiryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnquiryServiceImpl implements IEnquiryService {
    @Autowired
    private EnquiryRepository enquiryDao;
    @Override
    public Enquiry insertEnquiry(Enquiry enquiry) throws Exception {
        if(enquiry==null) throw new Exception("Null Data");
        return enquiryDao.save(enquiry);
    }
    @Override
    public Enquiry updateEnquiry(Enquiry enquiry) throws Exception {
        if(enquiryDao.save(enquiry)==null) throw new Exception("Error Occured");
        return enquiry;
    }
}

package com.cg.moneyplant.serviceImpl;

import com.cg.moneyplant.entity.Enquiry;
import com.cg.moneyplant.repository.EnquiryRepository;
import com.cg.moneyplant.repository.ExpertsRepository;
import com.cg.moneyplant.service.IEnquiryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnquiryServiceImpl implements IEnquiryService {
    @Autowired
    private EnquiryRepository enquiryDao;
    @Autowired
    private ExpertsRepository expertDao;
    @Override
    public Enquiry insertEnquiry(int expertid,Enquiry enquiry) throws Exception {
        if(enquiry==null) throw new Exception("Null Data");
        enquiry.setExperts(expertDao.findById(expertid).get());
        return enquiryDao.save(enquiry);
    }
    @Override
    public Integer updateEnquiryMessage(int enquiryId,String message) throws Exception {
        return enquiryDao.updateEnquirySetMessageForId(enquiryId,message);
    }
}

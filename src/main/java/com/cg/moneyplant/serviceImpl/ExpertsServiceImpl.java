package com.cg.moneyplant.serviceImpl;

import com.cg.moneyplant.entity.Experts;
import com.cg.moneyplant.repository.ExpertsRepository;
import com.cg.moneyplant.service.IExpertsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ExpertsServiceImpl implements IExpertsService {

    @Autowired
    private ExpertsRepository expertdao;
    @Override
    public Experts insertExpert(Experts experts) throws Exception {
        if(experts==null) throw new Exception("Null Data");
        return expertdao.save(experts);
    }

    @Override
    public Experts updateExpert(Experts experts) throws Exception {
        if(expertdao.save(experts)==null) throw new Exception("Error Occured");
        return experts;
    }

    @Override
    public List<Experts> getAllExperts() throws Exception {
        return expertdao.findAll();
    }

    @Override
    public List<Experts> getSpecificExperts(String speciality) throws Exception {
        return expertdao.findAllByspeciality(speciality);
    }
}

package com.cg.moneyplant.service;

import com.cg.moneyplant.entity.Experts;
import com.cg.moneyplant.serviceImpl.ExpertsServiceImpl;

import java.util.List;

public interface IExpertsService {
    public Experts insertExpert(Experts experts) throws Exception;
    public Experts updateExpert(Experts experts) throws Exception;
    public List<Experts> getAllExperts() throws Exception;
    public List<Experts> getSpecificExperts(String speciality) throws Exception;
}

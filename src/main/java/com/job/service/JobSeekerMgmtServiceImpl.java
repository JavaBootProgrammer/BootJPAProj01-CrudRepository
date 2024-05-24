package com.job.service;

import com.job.repository.IJobSeekerRepository;
import com.job.entity.JobSeeker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service("jsService")
public class JobSeekerMgmtServiceImpl implements IJobSeekerMgmtService {
    @Autowired
    private IJobSeekerRepository jsRepo;

    @Override
    public String register(JobSeeker js) {

			System.out.println("jsRepo  obj class name(InMemory Proxy class name)::"+jsRepo.getClass());
			System.out.println("Proxy class implemented interfaces::"+ Arrays.toString(jsRepo.getClass().getInterfaces()));
			System.out.println("Proxy class methods::"+Arrays.toString(jsRepo.getClass().getDeclaredMethods()));


        //save the object
        JobSeeker savedJs = jsRepo.save(js);

        return "Job Seeker  obj saved(record inserted)  having the id value ::" + savedJs.getJsId();
    }
}
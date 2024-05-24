package com.job.service;

import com.job.repository.IJobSeekerRepository;
import com.job.entity.JobSeeker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service("jsService")
public class JobSeekerServiceImpl implements IJobSeekerService {
    @Autowired
    private IJobSeekerRepository jobSeekerRepository;

    @Override
    public String saveRecord(JobSeeker jobSeeker) {

			System.out.println("jsRepo  obj class name(InMemory Proxy class name)::"+ jobSeekerRepository.getClass());
			System.out.println("Proxy class implemented interfaces::"+ Arrays.toString(jobSeekerRepository.getClass().getInterfaces()));
			System.out.println("Proxy class methods::"+Arrays.toString(jobSeekerRepository.getClass().getDeclaredMethods()));

        //save the object
        JobSeeker jobSeekerRecord = jobSeekerRepository.save(jobSeeker);

        return "Job Seeker  obj saved(record inserted)  having the id value ::" + jobSeekerRecord.getJsId();
    }
}
package com.job.runner;

import com.job.service.IJobSeekerService;
import com.job.entity.JobSeeker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class CrudRepositoryTestRunner implements CommandLineRunner {
    @Autowired
    private IJobSeekerService jsService;

    @Override
    public void run(String... arg0) throws Exception {
        try {
            JobSeeker info = new JobSeeker("Anand", "BSC", 51.99f, 19899999L);
            String resultMsg = jsService.saveRecord(info);
            System.out.println(resultMsg);
        } catch (Exception e) {
            e.printStackTrace();


        }
    }
}
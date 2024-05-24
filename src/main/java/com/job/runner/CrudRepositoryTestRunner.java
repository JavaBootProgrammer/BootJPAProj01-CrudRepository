package com.job.runner;

import com.job.service.IJobSeekerMgmtService;
import com.job.entity.JobSeeker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class CrudRepositoryTestRunner implements CommandLineRunner {
    @Autowired
    private IJobSeekerMgmtService jsService;

    @Override
    public void run(String... arg0) throws Exception {
        try {
            JobSeeker info = new JobSeeker("karan", "B.tech", 81.99f, 19899999L);
            String resultMsg = jsService.register(info);
            System.out.println(resultMsg);
        } catch (Exception e) {
            e.printStackTrace();


        }
    }
}
package com.be.apptwo.common.model;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.be.apptwo.common.repo.JobRepository;

@Component
public class ModelDataInit implements CommandLineRunner {

    @Autowired
    JobRepository jobRepository;

    @Override
    public void run(String... args) throws Exception {
        List<Job> l = java.util.Arrays.asList(
                new Job("AD_PRES", "President", BigDecimal.valueOf(20000.0),  BigDecimal.valueOf(40000.0)),
                new Job("AD_VP", "Administration Vice President", BigDecimal.valueOf(15000.0),  BigDecimal.valueOf(30000.0)),
                new Job("AD_ASST", "Administration Assistant", BigDecimal.valueOf(3000.0),  BigDecimal.valueOf(6000.0)),
                new Job("ST_CLERK", "Stock Clerk", BigDecimal.valueOf(2000.0),  BigDecimal.valueOf(5000.0))
                );

        jobRepository.saveAll(l);

    }

}

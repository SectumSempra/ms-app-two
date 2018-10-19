package com.be.apptwo.common.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.be.apptwo.common.feignapi.AppOneFeignApi;
import com.be.apptwo.common.repo.JobRepository;

@Controller
public class AppTwoControllerImpl implements AppTwoController {

    @Autowired
    JobRepository jobRepository;

    @Autowired
    AppOneFeignApi appOneFeignApi;

    @Override
    public ResponseEntity< ? > jobListAll() {
        return new ResponseEntity<>(jobRepository.findAll(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity< ? > regionFeginListAll() {
        return appOneFeignApi.regionListAll();
    }

}

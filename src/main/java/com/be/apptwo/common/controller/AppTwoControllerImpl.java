package com.be.apptwo.common.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.be.apptwo.common.repo.JobRepository;

@Controller
public class AppTwoControllerImpl implements AppTwoController {

    @Autowired
    JobRepository jobRepository;

    @Override
    public ResponseEntity< ? > listAll() {
        return new ResponseEntity<>(jobRepository.findAll(), HttpStatus.OK);
    }

}

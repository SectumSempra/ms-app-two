package com.be.apptwo.common.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
public interface AppTwoController {

    @RequestMapping(value = "/job-list-all", method = RequestMethod.GET)
    public ResponseEntity< ? > listAll();

}

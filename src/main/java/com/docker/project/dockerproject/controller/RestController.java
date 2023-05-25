package com.docker.project.dockerproject.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/hello")
    public ResponseEntity<String> Hello(){

       return new ResponseEntity<String>("Hello World", HttpStatus.OK);

    }





}

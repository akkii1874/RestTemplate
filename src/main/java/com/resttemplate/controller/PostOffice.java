package com.resttemplate.controller;

import com.resttemplate.output.PostOfficeResponse;
import com.resttemplate.service.PostOfficeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/postal")
public class PostOffice {

    @Autowired
    PostOfficeService postOfficeService;

    /*@RequestMapping(method = RequestMethod.GET, value = "/byCity",
    consumes = MediaType.ALL_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)*/
    @GetMapping("/byCity")
    public ResponseEntity<PostOfficeResponse> getAllPostOffice(@RequestParam String city){

        PostOfficeResponse postOfficedata = postOfficeService.getAllPostOfficeByCity(city);

        return new ResponseEntity<>(postOfficedata, HttpStatus.OK);
    }
}

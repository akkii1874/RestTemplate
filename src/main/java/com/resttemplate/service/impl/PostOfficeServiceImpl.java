package com.resttemplate.service.impl;

import com.resttemplate.output.PostOfficeResponse;
import com.resttemplate.service.PostOfficeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PostOfficeServiceImpl implements PostOfficeService {

    @Autowired
    RestTemplate restTemplate;

    @Override
    public PostOfficeResponse getAllPostOfficeByCity(String cityValue) {

        //Store thr url
        String url = "https://api.postalpincode.in/postoffice/city";
        url = url.replace("city",cityValue);
        System.out.println("The url is "+url);

        //Get data in response entity
        ResponseEntity<PostOfficeResponse[]> postalResponseEntity =
                restTemplate.getForEntity(url, PostOfficeResponse[].class);

        //Get body of response which returns array and we have data in array[0]
        PostOfficeResponse[] postOfficeResponses = postalResponseEntity.getBody();


        return postOfficeResponses[0];
    }
}

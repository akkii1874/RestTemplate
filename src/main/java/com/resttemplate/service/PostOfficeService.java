package com.resttemplate.service;

import com.resttemplate.output.PostOffice;
import com.resttemplate.output.PostOfficeResponse;
import org.springframework.stereotype.Service;

@Service
public interface PostOfficeService {

    public PostOfficeResponse getAllPostOfficeByCity(String city);

}

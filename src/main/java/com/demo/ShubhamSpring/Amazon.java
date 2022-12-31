package com.demo.ShubhamSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class Amazon {
    @Autowired
    private AmazonConfiguration configuration;
    @RequestMapping("/amazon-dis")
    public AmazonConfiguration displayData(){
        return configuration;

    }
}

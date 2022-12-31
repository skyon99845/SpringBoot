package com.demo.ShubhamSpring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class Courses {
    @RequestMapping("/courses")
    public List<Course> displayData(){
        return Arrays.asList(
                new Course(1,"SHubham Kumar","Banglore"),
                new Course(2,"Ankit Kumar","Pune")
        );
    }
}

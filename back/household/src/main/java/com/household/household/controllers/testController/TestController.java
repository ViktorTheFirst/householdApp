package com.household.household.controllers.testController;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController


public class TestController {


    private final String testText = " A....maa....";


    public TestController() {
    }


    @GetMapping("/")
    public ResponseEntity<?> test() {


        System.out.println("TestController.test");
        return ResponseEntity.ok(testText);
    }

}

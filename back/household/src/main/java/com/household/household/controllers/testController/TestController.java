package com.household.household.controllers.testController;

import com.household.household.models.User;
import com.household.household.service.AuthService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


public class TestController {


    private final String testText = " A....maa....";
    private final AuthService authService;



    public TestController(AuthService authService) {
        this.authService = authService;
    }



    public ResponseEntity<?> test() {
//        try {
//            authService.registration(new User("lol","lol"));
//            return new ResponseEntity<String>("OK", HttpStatus.OK);
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
        return new ResponseEntity<String>("ok",HttpStatus.OK);
    }

}

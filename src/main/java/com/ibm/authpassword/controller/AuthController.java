package com.ibm.authpassword.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by THLiu on 5/21/2018.
 *
 */
@RestController
public class AuthController {

    @RequestMapping(value = "/oauth/api/auth", method = RequestMethod.GET)
    public String auth(){
        return "auth";
    }

}

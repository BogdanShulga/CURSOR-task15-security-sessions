package edu.cursor.springsecuritysessions.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MethodAuthorizeController {

    @PreAuthorize("hasRole('ROLE_SOME')")
    @GetMapping("/some/get/string")
    public String getSomeString() {
        return "Some String!";
    }
}

package com.umaralikhon.controller;

import com.umaralikhon.service.PasswordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/password")
public class PasswordController {
    private final PasswordService passwordService;

    @Autowired
    public PasswordController(PasswordService passwordService){
        this.passwordService = passwordService;
    }

    @GetMapping("/generate")
    public String generateFuckingPassword(@RequestParam Integer length){
        return "Generated password: " + passwordService.getGeneratedPassword(length);
    }
}

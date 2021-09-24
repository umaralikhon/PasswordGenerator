package com.umaralikhon.service;

import com.umaralikhon.passwordConfig.PasswordGenerateConfig;
import org.springframework.stereotype.Service;

@Service
public class PasswordService {
    public String getGeneratedPassword(int length){
        return PasswordGenerateConfig.getDataForPassword(length);
    }
}

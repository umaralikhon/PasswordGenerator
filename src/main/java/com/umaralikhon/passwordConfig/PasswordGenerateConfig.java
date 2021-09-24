package com.umaralikhon.passwordConfig;

import org.passay.CharacterRule;
import org.passay.EnglishCharacterData;
import org.passay.PasswordGenerator;

import java.util.Arrays;
import java.util.List;

public class PasswordGenerateConfig {
    private static List generateRandomPassword(){
        List rules = Arrays.asList(
                new CharacterRule(EnglishCharacterData.UpperCase, 1),
                new CharacterRule(EnglishCharacterData.LowerCase, 1),
                new CharacterRule(EnglishCharacterData.Digit, 1),
                new CharacterRule(SpecialSymbols.Special,1)
        );

        return rules;
    }

    public static String getDataForPassword(int length){
        PasswordGenerator generator = new PasswordGenerator();
        String password = generator.generatePassword(length, generateRandomPassword());
        return password;
    }
}

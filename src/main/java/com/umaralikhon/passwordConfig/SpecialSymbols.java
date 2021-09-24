package com.umaralikhon.passwordConfig;

import org.passay.CharacterData;

public enum SpecialSymbols implements CharacterData {
    Special("INSUFFICIENT_SPECIAL", "!\"#$%&'()*+-/:;<>?@[\\]^_{|}~");

    private final String errorCode;
    private final String characters;

    private SpecialSymbols(String errorCode, String characters){
        this.errorCode = errorCode;
        this.characters = characters;
    }

    public String getErrorCode(){
        return this.errorCode;
    }

    public String getCharacters(){
        return this.characters;
    }


}

package com.chicosoftware.calculadoraimc;

public class Palavra {

    public String reversal(String word) {
        String nomeRevertido = "";
        for (int i = 0; i < word.length(); i++) {
            char aChar = word.charAt(i);
            nomeRevertido = aChar + nomeRevertido;
        }
        return nomeRevertido;
    }
}

package com.dialogintern.Medicine.Finder.utils;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class IdCreator {
    // ADC-231456789
    private final Random RANDOM = new Random();
    private final String NUMERIC = "0123456789";
    private final String ALPHABET = "ABCDEFGHIJKLMOPQRSTUVEWXYZ";

    public String createId() {
        StringBuilder sb = new StringBuilder(4);
        int randomNumber = new Random().nextInt(16);
        for (int i = 0; i < randomNumber; i++) {
            int index = (int) (ALPHABET.length() * Math.random());
            sb.append(ALPHABET.charAt(index));
        }
        int indexNumber = generateDigit(8);
        return "C-" + sb.toString() + "-" + indexNumber;
    }

    private int generateDigit(int counter) {
        StringBuilder sb = new StringBuilder(counter);
        for (int i = 0; i < counter; i++) { // 2
            sb.append(NUMERIC.charAt(RANDOM.nextInt(NUMERIC.length()))); // 52
        }
        return Integer.parseInt(sb.toString());
    }
}

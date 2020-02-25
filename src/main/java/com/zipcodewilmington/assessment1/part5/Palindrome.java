package com.zipcodewilmington.assessment1.part5;

import com.zipcodewilmington.assessment1.part1.BasicStringUtils;

import java.util.List;

public class Palindrome {

    public Integer countPalindromes(String input){
        Integer count = 0;
        for(String substring : getAllSubStrings(input)) {
            if(isPalindrome(substring)) {
                count++;
            }
        }
        return count;
    }

    private boolean isPalindrome(String substring) {
        return BasicStringUtils.reverse(substring).equals(substring);
    }

    private List<String> getAllSubStrings(String input) {
        return null;
    }
}

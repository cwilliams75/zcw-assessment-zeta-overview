package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        // get first character
        Character firstCharacter = str.charAt(0);

        // get remaining characters; all characters after (and not including) first character
        String remainingCharacters = str.substring(1);

        // capitalize first character
        firstCharacter = Character.toUpperCase(firstCharacter);

        // add first character to remaining characters
        String result = firstCharacter + remainingCharacters;
        return result;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        String result = "";
        int lastIndexOfString = str.length();
        int counter = lastIndexOfString - 1;
        while (counter >= 0) {
            Character currentCharacter = str.charAt(counter);
            result = result + currentCharacter;
            counter = counter - 1;
        }
        return result;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse1(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.reverse();
        String result = stringBuilder.toString();
        return result;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        String reversed = reverse(str);
        String reversedThenCamelCased = camelCase(reversed);
        return reversedThenCamelCased;
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        int secondIndex = 1;
        int secondToLastIndex = str.length()-1;
        String result = str.substring(secondIndex, secondToLastIndex);
        return result;
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        return null;
    }
}

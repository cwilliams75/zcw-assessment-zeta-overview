package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicArrayUtils {
    /**
     * @param stringArray an array of String objects
     * @return the first element in the array
     */
    public static String getFirstElement(String[] stringArray) {
        int firstIndex = 0;
        String firstElement = stringArray[firstIndex];
        return firstElement;
    }

    /**
     * @param stringArray an array of String objects
     * @return the second element in the array
     */
    public static String getSecondElement(String[] stringArray) {
        int secondIndex = 1;
        String secondElement = stringArray[secondIndex];
        return secondElement;
    }

    /**
     * @param stringArray an array of String objects
     * @return the last element in the array
     */
    public static String getLastElement(String[] stringArray) {
        int length = stringArray.length;
        int lastIndex = length-1;
        String lastElement = stringArray[lastIndex];
        return lastElement;
    }

    /**
     * @param stringArray an array of String objects
     * @return the second to last element in the array
     */
    public static String getSecondToLastElement(String[] stringArray) {
        int length = stringArray.length;
        int secondToLastIndex = length-2;
        String secondToLastElement = stringArray[secondToLastIndex];
        return secondToLastElement;
    }
}

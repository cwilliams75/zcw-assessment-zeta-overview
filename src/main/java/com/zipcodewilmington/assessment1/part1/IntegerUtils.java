package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerUtils {
    /**
     * @param n integer value input by client
     * @return the sum of all integers between 0 and not including `n`
     */
    public static Integer getSumOfN(Integer n) {
        int sum = 0;// make a variable to store the sum
        int counter = 0;// make a variable to count the iterations
        while (counter <= n) { // continue increment until counter is equal to `n`
            sum = sum + counter; // add the counter to the sum
            counter = counter + 1; // increase the counter by 1
        }
        return sum;
    }

    /**
     * @param n integer value input by client
     * @return the product of all integers between 1 and not including `n`
     */
    public static Integer getProductOfN(Integer n) {
        int product = 1;
        int counter = 1;
        while(counter <= n) {
            product = product * counter;
            counter++;
        }
        return product;
    }

    /**
     * @param val integer value input by client
     * @return integer with identical digits in the reverse order
     */
    public static Integer reverseDigits(Integer val) {
        return null;
    }
}

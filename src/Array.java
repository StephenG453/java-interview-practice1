/*
Problem Statement:

Given an array of integers and a value, determine if there are any two integers
in the array whose sum is equal to the given value.
 */

public class Array {

    protected boolean isEqualToValue(int value, int[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int k = i + 1; k < array.length; k++) {
                if ((array[i] + array[k] == value)) {
                    System.out.println(array[i] + " + " + array[k] + " = " + value);
                    return true;
                }
            }
        }
        System.out.println("Nothing in this array added together = " + value);
        return false;
    }
}

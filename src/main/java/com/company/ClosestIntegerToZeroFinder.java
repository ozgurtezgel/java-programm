package com.company;

import java.util.List;

public class ClosestIntegerToZeroFinder {

    /**
     * The method finds the closest integer to zero. If there is a tie, the positive value is chosen.
     * If the list ist empty, zero is returned.
     * @param list list of integers
     * @return the closest integer to zero
     */
    public int findTheClosestIntegerToZero(List<Integer> list) throws EmptyListException{
        int closest = Integer.MAX_VALUE;
        if (list.isEmpty()) throw new EmptyListException("The list is empty");

        for (int number : list) {
            if (number > 0 && number <= Math.abs(closest)) {
                closest = number;
            }
            else if (number < 0 && (-number) < Math.abs(closest)) {
                closest = number;
            }
            else if (number == 0) {
                closest = number;
                break;
            }
        }
        return closest;
    }


}

package com.company;

import java.util.List;

public class ClosestIntegerToZeroFinder {

    /**
     * The method finds the closest number to zero. If there is a tie, the positive value is chosen.
     * If the numbers ist empty, zero is returned.
     * @param numbers list of numbers
     * @return the closest number to zero
     */
    public int findTheClosestIntegerToZero(List<Integer> numbers) throws IllegalArgumentException {
        int closest = Integer.MAX_VALUE;

        if (numbers.isEmpty()) {
            throw new IllegalArgumentException("The list is empty");
        }

        for (int number : numbers) {
            if (number > 0 && number <= Math.abs(closest)) {
                closest = number;
            } else if (number < 0 && (-number) < Math.abs(closest)) {
                closest = number;
            } else if (number == 0) {
                closest = number;
                break;
            }
        }
        return closest;
    }
}

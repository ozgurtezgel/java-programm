package com.company;

import java.util.List;

public class ClosestIntegerToZeroFinder {

    public int findTheClosestIntegerToZero(List<Integer> list) {
        int closest = Integer.MAX_VALUE;

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

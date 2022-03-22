package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(5);
        list.add(2);
        list.add(-1);
        list.add(2);
        list.add(-5);
        list.add(7);


        int result = findTheClosestIntegerToZero(list);
        System.out.println(result);

        list.add(1);
        int result2 = findTheClosestIntegerToZero(list);
        System.out.println(result2);
    }

    public static int findTheClosestIntegerToZero(List<Integer> list) {
        int closest = Integer.MAX_VALUE;

        for (int number:list) {
            if (number > 0 && number <= Math.abs(closest)) {
                closest = number;
            } else if (number < 0 && -number < Math.abs(closest)){
                closest = number;
            } else if (number == 0) {
                closest = number;
                break;
            }
        }
        return closest;
    }
}


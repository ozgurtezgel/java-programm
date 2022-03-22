package com.company;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ClosestIntegerToZeroFinderTest {

    @Test
    void findTheClosestIntegerToZero() {
        ClosestIntegerToZeroFinder closestIntegerToZeroFinder = new ClosestIntegerToZeroFinder();

        List<Integer> firstIntegerList = new ArrayList<>();
        firstIntegerList.add(7);
        firstIntegerList.add(5);
        firstIntegerList.add(2);
        firstIntegerList.add(-1);
        firstIntegerList.add(2);
        firstIntegerList.add(-5);
        firstIntegerList.add(7);

        assertEquals(-1, closestIntegerToZeroFinder.findTheClosestIntegerToZero(firstIntegerList));

        firstIntegerList.add(1);
        assertEquals(1, closestIntegerToZeroFinder.findTheClosestIntegerToZero(firstIntegerList));

        List<Integer> secondIntegerList = new ArrayList<>();
        secondIntegerList.add(11);
        secondIntegerList.add(-8);
        secondIntegerList.add(14);
        secondIntegerList.add(-4);
        secondIntegerList.add(7);
        assertEquals(-4, closestIntegerToZeroFinder.findTheClosestIntegerToZero(secondIntegerList));
        secondIntegerList.add(0);
        assertEquals(0,closestIntegerToZeroFinder.findTheClosestIntegerToZero(secondIntegerList));

    }
}
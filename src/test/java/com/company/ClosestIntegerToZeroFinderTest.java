package com.company;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ClosestIntegerToZeroFinderTest {


    @Test
    void findTheClosestIntegerToZeroFirstTest() {
        ClosestIntegerToZeroFinder closestIntegerToZeroFinder = new ClosestIntegerToZeroFinder();
        List<Integer> integerList = new ArrayList<>();
        integerList.add(7);
        integerList.add(5);
        integerList.add(2);
        integerList.add(-1);
        integerList.add(2);
        integerList.add(-5);
        integerList.add(7);
        assertEquals(-1, closestIntegerToZeroFinder.findTheClosestIntegerToZero(integerList));
    }

    @Test
    void findTheClosestIntegerToZeroSecondTest(){
        ClosestIntegerToZeroFinder closestIntegerToZeroFinder = new ClosestIntegerToZeroFinder();
        List<Integer> firstIntegerList = new ArrayList<>();
        firstIntegerList.add(2);
        firstIntegerList.add(-1);
        firstIntegerList.add(2);
        firstIntegerList.add(1);
        assertEquals(1, closestIntegerToZeroFinder.findTheClosestIntegerToZero(firstIntegerList));
    }

    @Test
    void findTheClosestIntegerToZeroThirdTest(){
        ClosestIntegerToZeroFinder closestIntegerToZeroFinder = new ClosestIntegerToZeroFinder();
        List<Integer> integerList = new ArrayList<>();
        integerList.add(11);
        integerList.add(-8);
        integerList.add(4);
        integerList.add(-4);
        integerList.add(7);
        assertEquals(4, closestIntegerToZeroFinder.findTheClosestIntegerToZero(integerList));
    }

    @Test
    void findTheClosestIntegerToZeroFourthTest(){   // test case for a list that includes 0
        ClosestIntegerToZeroFinder closestIntegerToZeroFinder = new ClosestIntegerToZeroFinder();
        List<Integer> integerList = new ArrayList<>();
        integerList.add(11);
        integerList.add(-8);
        integerList.add(4);
        integerList.add(0);
        assertEquals(0,closestIntegerToZeroFinder.findTheClosestIntegerToZero(integerList));
    }

    @Test
    void findTheClosestIntegerToZeroFifthTest(){ // test case for an empty list
        ClosestIntegerToZeroFinder closestIntegerToZeroFinder = new ClosestIntegerToZeroFinder();
        List<Integer> integerList = new ArrayList<>();
        try {
            assertEquals(0,closestIntegerToZeroFinder.findTheClosestIntegerToZero(integerList));
        } catch (EmptyListException e) {
            System.out.println(e.toString());
        }

    }
}
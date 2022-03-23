package com.company;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ClosestIntegerToZeroFinderTest {

    @Test
    @DisplayName("Test with an integer list, expected ok")
    void shouldFindTheClosestNumber() {
        // arrange
        ClosestIntegerToZeroFinder closestIntegerToZeroFinder = new ClosestIntegerToZeroFinder();
        List<Integer> integerList = List.of(7,5,2,-1,2,-5,7);

        // act & assert
        assertEquals(-1, closestIntegerToZeroFinder.findTheClosestIntegerToZero(integerList));
    }

    @Test
    @DisplayName("Test with two numbers with same value, one positive one negative, expected ok")
    void testWithTwoNumbersWithSameValueOnePositiveOneNegative() {
        // arrange
        ClosestIntegerToZeroFinder closestIntegerToZeroFinder = new ClosestIntegerToZeroFinder();
        List<Integer> firstIntegerList = List.of(2,-1,2,1);

        // act & assert
        assertEquals(1, closestIntegerToZeroFinder.findTheClosestIntegerToZero(firstIntegerList));
    }

    @Test
    @DisplayName("Test with two number with the same absolute, expected ok")
    void testWithTwoNumbersWithSameAbsoluteValue() {
        // arrange
        ClosestIntegerToZeroFinder closestIntegerToZeroFinder = new ClosestIntegerToZeroFinder();
        List<Integer> integerList = List.of(11,-8,4,-4,7);

        // act & assert
        assertEquals(4, closestIntegerToZeroFinder.findTheClosestIntegerToZero(integerList));
    }

    @Test
    @DisplayName("Test with zero in the list, expected ok")
    void testWithZeroInTheList() {
        // arrange
        ClosestIntegerToZeroFinder closestIntegerToZeroFinder = new ClosestIntegerToZeroFinder();
        List<Integer> integerList = List.of(11,-8,4,0);

        // act & assert
        assertEquals(0,closestIntegerToZeroFinder.findTheClosestIntegerToZero(integerList));
    }

    @Test
    @DisplayName("Test with an empty list, expected ok")
    void shouldThrowExceptionWithAnEmptyList() {
        // arrange
        ClosestIntegerToZeroFinder closestIntegerToZeroFinder = new ClosestIntegerToZeroFinder();
        List<Integer> integerList = new ArrayList<>();

        // act & assert
        assertThrows(IllegalArgumentException.class, () -> {closestIntegerToZeroFinder.findTheClosestIntegerToZero(integerList);},
                "IllegalArgumentException was expected");
    }
}
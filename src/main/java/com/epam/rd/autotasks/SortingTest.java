package com.epam.rd.autotasks;

import org.junit.Test;

import static org.junit.Assert.*;


public class SortingTest {

    Sorting sorting = new Sorting();

    @Test(expected = NullPointerException.class)
    public void testNullCase() {
        int[] array = null;

        try {
            sorting.sort(array);
        } catch (IllegalArgumentException e) {
            assertEquals("Array cannot be null", e.getMessage());
        }
    }


    @Test
    public void testEmptyCase() {
        int[] array = {};

        sorting.sort(array);

        assertEquals(0, array.length);
    }


    @Test
    public void testSingleElementArrayCase() {
        int[] array = {5};
        int[] expected = {5};

        sorting.sort(array);

        assertArrayEquals(expected, array);
    }

    @Test
    public void testSortedArraysCase() {
        int[] array = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};

        sorting.sort(array);

        assertArrayEquals(expected, array);
    }

    @Test
    public void testOtherCases() {
        int[] array = {1, 3, 5, 7, 9};
        int[] expected = {1, 3, 5, 7, 9};

        sorting.sort(array);

        assertArrayEquals(expected, array);
    }
}

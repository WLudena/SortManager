package com.sparta.wla;

import static org.junit.Assert.*;

import com.sparta.wla.sorters.BinaryTreeSorter;
import com.sparta.wla.sorters.BubbleSorter;
import com.sparta.wla.sorters.Sorter;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Unit test for simple App.
 */
public class SortTests {
    private Sorter sorter;
    private int[] arrayToSort;

    @Before
    public void setUp() {
        sorter = new BubbleSorter();
        arrayToSort = new int[]{3, 50, 42, 1, 6, 11, 11, 4};
    }

    @Test
    public void testArraySorted() {
        int[] sortedArray = sorter.getSortedArray(arrayToSort);
        Arrays.sort(arrayToSort);

        assertArrayEquals(sortedArray, arrayToSort);
    }

    @Test
    public void testArrayLength() {
        int[] sortedArray = sorter.getSortedArray(arrayToSort);
        assertEquals(sortedArray.length, arrayToSort.length);
    }

    @Test
    public void testArrayIsNotEmpty() {
        int[] sortedArray = sorter.getSortedArray(arrayToSort);
        assertFalse(sortedArray.length == 0);
    }

    @Test
    public void testNoNegativeValues() {
        int[] sortedArray = sorter.getSortedArray(arrayToSort);
        for (int i = 0; i < sortedArray.length; i++) {
            assertTrue(sortedArray[i] > 0);
        }
    }

    @Test
    public void testBinaryTree() {
        sorter = new BinaryTreeSorter();
        System.out.println(Arrays.toString(sorter.getSortedArray(arrayToSort)));
        System.out.println(sorter.toString());
    }
}

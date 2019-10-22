package com.sparta.wla;

import static org.junit.Assert.*;

import com.sparta.wla.sorters.BubbleSorter;
import com.sparta.wla.sorters.Sorter;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Unit test for simple App.
 */
public class SortTests
{
    private Sorter sorter;
    private int[] arrayToSort;

    @Before
    public void setUp(){
        sorter = new BubbleSorter();
        arrayToSort = new int[]{2, 4, 8, 34, 6, 23, 3, 6, 8};
    }

    @Test
    public void testArraySorted(){
        int[] sortedArray = sorter.getSortedArray(arrayToSort);
        Arrays.sort(arrayToSort);

        assertArrayEquals(sortedArray, arrayToSort);
//
//        for(int i = 0; i < sortedArray.length - 1; i++){
//            assertTrue(sortedArray[i] <= sortedArray[i+1]);
//        }
    }

    @Test
    public void testArrayLength(){
        int[] sortedArray = sorter.getSortedArray(arrayToSort);
        assertEquals(sortedArray.length,arrayToSort.length);
    }

    @Test
    public void testArrayIsNotEmpty(){
        int[] sortedArray = sorter.getSortedArray(arrayToSort);
        assertFalse(sortedArray.length == 0);
    }

    @Test
    public void testNoNegativeValues(){
        int[] sortedArray = sorter.getSortedArray(arrayToSort);
        for(int i = 0; i < sortedArray.length; i++){
            assertTrue(sortedArray[i] > 0);
        }
    }

    @Test
    public void testDuplicateValues(){

    }

    @Test
    public void testEmptyResult(){
        int[] sortedArray = sorter.getSortedArray(arrayToSort);

    }

    @Test
    public void rightSortingUsed(){

    }
}

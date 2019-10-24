package com.sparta.wla;

import com.sparta.wla.sorters.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.text.DecimalFormat;
import java.util.Arrays;

public class PerformanceTester {

    private int[] unsortedArray;
    private static int[] arrayToSort;

    @BeforeClass
    public static void clasSetUp(){
        RandomArrayGenerator random = new RandomArrayGenerator();
        arrayToSort = random.randomArray(100000);
    }

    @Before
    public void setUp(){
        unsortedArray = arrayToSort.clone();
    }

    @Test
    public void testBubbleSort(){
        System.out.println("*****" + Arrays.toString(unsortedArray));
        Sorter sorter = new BubbleSorter();
        long start = System.nanoTime();
        int[] sortedArray = sorter.getSortedArray(unsortedArray);
        long end = System.nanoTime();
        printResult(sorter.toString(),end-start,sortedArray);
    }

    @Test
    public void testMergeSort(){
        System.out.println("*****" + Arrays.toString(unsortedArray));
        Sorter sorter = new MergeSorter();
        long start = System.nanoTime();
        int[] sortedArray = sorter.getSortedArray(unsortedArray);
        long end = System.nanoTime();
        printResult(sorter.toString(),end-start,sortedArray);
    }

    @Test
    public void testQuickSort(){
        System.out.println("*****" + Arrays.toString(unsortedArray));
        Sorter sorter = new QuickSorter();
        long start = System.nanoTime();
        int[] sortedArray = sorter.getSortedArray(unsortedArray);
        long end = System.nanoTime();
        printResult(sorter.toString(),end-start,sortedArray);
    }

    private void printResult(String sorter, long time, int[] sortedArray){
        DecimalFormat decimalFormat = new DecimalFormat("###,###.####");
        System.out.println(sorter + ":");
        System.out.println(Arrays.toString(sortedArray));
        System.out.println("Time taken: "+ (decimalFormat.format(time) + " nano seconds"));
    }

}

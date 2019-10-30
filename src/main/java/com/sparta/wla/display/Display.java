package com.sparta.wla.display;

import com.sparta.wla.sorters.*;

import java.util.Arrays;
import java.util.RandomAccess;
import java.util.Scanner;

public class Display {

    public void displaySortedArray(int[] unsortedArray, int[] sortedArray, String sortType){
        System.out.println("Unsorted array: ");
        System.out.println(Arrays.toString(unsortedArray));
        System.out.println("Sorted using " + sortType);
        System.out.println("Sorted array: ");
        System.out.println(Arrays.toString(sortedArray));
    }
}

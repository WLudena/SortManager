package com.sparta.wla.manager;

import com.sparta.wla.display.Display;
import com.sparta.wla.sorters.*;

import java.util.Arrays;
import java.util.Scanner;

public class SortManager {


    public void sortArray(String sortType){
        int[] unsortedArray = createArray(20);
        Sorter sorter = SortFactory.getInstance(sortType);
        int[] sortedArray = sorter.getSortedArray(unsortedArray.clone());
        displaySortedArray(unsortedArray, sortedArray, sorter.toString());
    }
    private void displaySortedArray(int[] unsortedArray, int[] sortedArray, String sortType){
        Display displayManager = new Display();
        displayManager.displaySortedArray(unsortedArray, sortedArray, sortType);
    }

    private int[] createArray(int length){
        RandomArrayGenerator rand = new RandomArrayGenerator();
        return rand.randomArray(length);
    }
}

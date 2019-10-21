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


//    private RandomArrayGenerator randArray = new RandomArrayGenerator();
//    private int[] randomArray;
//
//    public void menu(){
//        System.out.println("Sorting algorithm");
//        Scanner scanner = new Scanner(System.in);
//        int input = scanner.nextInt();
//        System.out.println("Array length");
//        int arrayLength = scanner.nextInt();
//        randomArray = randArray.randomArray(arrayLength);
//        choices(input);
//    }
//    private void choices(int choice){
//        switch (choice){
//            case 1:
//                Sorter bubbleSort = new BubbleSorter();
//                System.out.println(Arrays.toString(randomArray));
//
//                System.out.println(Arrays.toString(bubbleSort.getSortedArray(randomArray)));
//                break;
//            case 2:
//                Sorter mergeSort = new MergeSorter();
//                System.out.println(Arrays.toString(randomArray));
//
//                System.out.println(Arrays.toString(mergeSort.getSortedArray(randomArray)));
//                break;
//            case 3:
//                Sorter quickSort = new QuickSorter();
//                System.out.println(Arrays.toString(randomArray));
//
//                System.out.println(Arrays.toString(quickSort.getSortedArray(randomArray)));
//                break;
//        }
//    }
}

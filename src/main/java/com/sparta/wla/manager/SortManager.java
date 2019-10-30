package com.sparta.wla.manager;

import com.sparta.wla.display.Display;
import com.sparta.wla.display.DisplayManager;
import com.sparta.wla.exceptions.SortLoaderException;
import com.sparta.wla.sorters.*;

public class SortManager {


    private DisplayManager displayManager = new DisplayManager();
    private SortLoader loader = new SortLoader();

    public void sortArray() {
        try {
            String sortType = displayManager.displayTerminalSortTypeRequest(loader.getSortersLocation());
            int arraySize = displayManager.displayTerminalArraySizeTypeRequest();

            int[] arrayToSort = createArray(arraySize);
            Sorter sorter = selectSorter(sortType);
            int[] sortedArray = sorter.getSortedArray(arrayToSort.clone());
            displaySortedArray(arrayToSort, sortedArray, sorter.toString());
        } catch (SortLoaderException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }

    private Sorter selectSorter(String sortType) throws SortLoaderException {
        return loader.getSorter(sortType);
    }

    private void displaySortedArray(int[] unsortedArray, int[] sortedArray, String sortType) {
        Display displayManager = new Display();
        displayManager.displaySortedArray(unsortedArray, sortedArray, sortType);
    }

    private int[] createArray(int length) {
        RandomArrayGenerator rand = new RandomArrayGenerator();
        return rand.randomArray(length);
    }
}

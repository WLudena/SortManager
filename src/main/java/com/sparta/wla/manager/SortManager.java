package com.sparta.wla.manager;

import com.sparta.wla.display.Display;
import com.sparta.wla.display.DisplayManager;
import com.sparta.wla.sorters.*;

public class SortManager {


    private DisplayManager displayManager = new DisplayManager();
    private SortLoader loader = new SortLoader();

//    public void sortArray(){
//        int[] unsortedArray = createArray(20);
//        Sorter sorter = SortFactory.getInstance();
//        int[] sortedArray = sorter.getSortedArray(unsortedArray.clone());
//        displaySortedArray(unsortedArray, sortedArray, sorter.toString());
//    }

    public void sortArray(){
        try{
            String sortType = displayManager.displayTerminalSortTypeRequest("C:\\Users\\Wilson Ludena\\IdeaProjects\\SortManager\\src\\main\\java\\com\\sparta\\wla\\sorters");
            int arraySize = displayManager.displayTerminalArraySizeTypeRequest();

//            int[] arrayToSort = createArray(arraySize);
//            Sorter sorter = SortFactory.getInstance();
//            int[] sortedArray = sorter.getSortedArray(arrayToSort.clone());
//            displaySortedArray(arrayToSort, sortedArray, sorter.toString());

        }catch(Exception e){

        }
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

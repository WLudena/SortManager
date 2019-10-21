package com.sparta.wla.sorters;

public class QuickSorter implements Sorter{

    @Override
    public int[] getSortedArray(int[] array){
        int endingIndex = array.length - 1;
        return quickSort(array,0,endingIndex);
    }

    public int[] quickSort(int[] array, int startingIndex, int endingIndex){
        if(startingIndex < endingIndex){
            int pivot = partition(array,startingIndex,endingIndex);
            quickSort(array,startingIndex,pivot-1);
            quickSort(array,pivot+1,endingIndex);
        }
        return array;
    }

    private int partition(int[] array, int startingIndex, int endingIndex){
        int pivot = array[endingIndex];
        int i = startingIndex-1;

        for(int j = startingIndex; j <= endingIndex-1;j++){
            if(array[j] < pivot){
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[endingIndex];
        array[endingIndex] = temp;

        return i+1;
    }

    @Override
    public String toString(){ return "Bubble Sorter";}
}

package com.sparta.wla.sorters;

public class BubbleSorter implements Sorter {

    @Override
    public int[] getSortedArray(int[] unsortedArray){
        int[] sorted = unsortedArray.clone();
        boolean isSwapped;

        do{
            isSwapped = false;
            for(int i = 0; i < sorted.length - 1; i++){
                if(sorted[i] > sorted[i+1]){
                    int temp = sorted[i];
                    sorted[i] = sorted[i+1];
                    sorted[i+1] = temp;
                    isSwapped = true;
                }
            }
        }while(isSwapped);
        return sorted;
    }

    @Override
    public String toString(){ return "Bubble Sorter";}
}

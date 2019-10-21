package com.sparta.wla.sorters;

import java.util.Arrays;

public class MergeSorter implements Sorter{

    private boolean initialPass;

    public int[] getSortedArray(int[] array) {
        if (array.length > 1) {
            int[] leftSide = Arrays.copyOfRange(array, 0, array.length/ 2);
            int[] rightSide = Arrays.copyOfRange(array, array.length / 2, array.length);
            getSortedArray(leftSide);
            getSortedArray(rightSide);
            mergedSortWorker(leftSide,rightSide,array);
        }
        return array;
    }

    private void mergedSortWorker(int[] leftSide, int[] rightSide, int[] array) {
        int iLeft = 0, iRight = 0, iMerged = 0;

        while(iLeft < leftSide.length && iRight < rightSide.length){
            if(leftSide[iLeft] > rightSide[iRight]){
                array[iMerged] = rightSide[iRight];
                iRight++;
            }else{
                array[iMerged] = leftSide[iLeft];
                iLeft++;
            }
            iMerged++;
        }
        System.arraycopy(leftSide,iLeft,array,iMerged,leftSide.length-iLeft);
        System.arraycopy(rightSide,iRight,array,iMerged,rightSide.length-iRight);
    }

    @Override
    public String toString(){ return "Merge Sorter";}
}

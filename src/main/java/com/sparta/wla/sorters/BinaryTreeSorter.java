package com.sparta.wla.sorters;

import com.sparta.wla.model.BinaryTreeSearch;

public class BinaryTreeSorter implements Sorter {
    @Override
    public int[] getSortedArray(int[] unsortedArray) {
        BinaryTreeSearch binaryTreeSearch = new BinaryTreeSearch(unsortedArray[0]);
        binaryTreeSearch.addElements(unsortedArray);
        return binaryTreeSearch.getSortedTreeAsc();
    }

    @Override
    public String toString(){
        return "Binary Tree Sorter";
    }
}

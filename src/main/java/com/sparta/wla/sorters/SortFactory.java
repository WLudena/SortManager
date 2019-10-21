package com.sparta.wla.sorters;

public class SortFactory {

    public  static Sorter getInstance(String sortType){
        if(sortType.equals("bubble")){
            return new BubbleSorter();
        } else if(sortType.equals("merge")){
           return new MergeSorter();
        } else if(sortType.equals("quick")){
            return new QuickSorter();
        }else{
            return null;
        }
    }
}

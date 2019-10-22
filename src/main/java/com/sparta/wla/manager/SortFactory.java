package com.sparta.wla.manager;

import com.sparta.wla.sorters.BubbleSorter;
import com.sparta.wla.sorters.MergeSorter;
import com.sparta.wla.sorters.QuickSorter;
import com.sparta.wla.sorters.Sorter;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class SortFactory {
    private static final String PATH = "resources/sort.properties";
    private static final String KEY = "sort";

    public static Sorter getInstance(){
        String sortType = null;

        try{
            Properties properties = new Properties();
            properties.load(new FileReader(PATH));
            sortType = properties.getProperty(KEY);
            Class selectedSorter = Class.forName(sortType);
            return selectedSorter.getDeclaredConstructor().newInstance();

        }catch (IOException e){
            System.out.println("Path not found!");
            e.printStackTrace();
        }
        return null;
    }
}

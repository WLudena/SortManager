package com.sparta.wla.manager;

import com.sparta.wla.sorters.BubbleSorter;
import com.sparta.wla.sorters.MergeSorter;
import com.sparta.wla.sorters.QuickSorter;
import com.sparta.wla.sorters.Sorter;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Properties;

public class SortFactory {
    private static final String PATH = "resources/sort.properties";
    private static final String KEY = "sort";

    public  static Sorter getInstance(){
        String sortType = null;

        try{
            Properties properties = new Properties();
//            FileReader reader = new FileReader(PATH);
//            properties.load(reader);
//            sortType = properties.getProperty("sort");
            properties.load(new FileReader(PATH));
            sortType = properties.getProperty(KEY);

        }catch (IOException e){
            System.out.println("Path now found!");
            e.printStackTrace();
        }

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

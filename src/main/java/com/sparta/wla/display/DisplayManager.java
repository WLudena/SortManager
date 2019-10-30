package com.sparta.wla.display;

import com.sparta.wla.manager.SortLoader;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class DisplayManager {
    private SortLoader loader = new SortLoader();
    private Scanner scanner = new Scanner(System.in);

    public String displayTerminalSortTypeRequest(String path){
        System.out.println("Sorters to use: ");
        String[] sortName  = getMenuItems(path);
        int sortType = scanner.nextInt();
        return sortName[sortType-1];
    }

    public int displayTerminalArraySizeTypeRequest(){
        System.out.println("Length of array");
        int sizeArray = scanner.nextInt();
        return sizeArray;
    }

    public void displayUnsortedArray(){

    }
    public void displaySortedArray(){

    }



    private String[] getMenuItems(String path){
        File dir = new File(path);
        String[] sortNames = dir.list();
        Arrays.sort(sortNames != null ? sortNames : new String[0]);
        int index = 1;

        for(String name : sortNames){
            if(!name.equals("Sorter.java")){    //Ignores the Sorter interface
                name = name.substring(0, name.indexOf('.'));
                System.out.println(index + ". " + name);
                index++;
            }
        }
        return sortNames;
    }

}

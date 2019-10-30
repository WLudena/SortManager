package com.sparta.wla.display;

import com.sparta.wla.exceptions.SortLoaderException;
import com.sparta.wla.manager.SortLoader;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DisplayManager {

    private SortLoader loader = new SortLoader();
    private Scanner scanner = new Scanner(System.in);

    public String displayTerminalSortTypeRequest(String path) throws SortLoaderException {
        System.out.println("Sorters to use: ");
        String[] sortName  = getMenuItems(path);
        try{
            int sortType = scanner.nextInt();
            return sortName[sortType - 1];
        }catch(Exception e){
            throw new SortLoaderException("Option not within bounds. Try again!");
        }
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
        String[] menuItems = filteredMenuItems(dir);

        Arrays.sort(menuItems != null ? menuItems : new String[0]);
        int index = 1;

        for(String name : menuItems){
            if(!name.equals("Sorter.java")){    //Ignores the Sorter interface
                name = name.substring(0, name.indexOf('.'));
                System.out.println(index + ". " + name);
                index++;
            }
        }
        return menuItems;
    }

    private String[] filteredMenuItems(File dir){
        List<String> initialNames = new ArrayList<>();
        for(String i : dir.list()){
            if(!i.equals("Sorter.java")){
                initialNames.add(i);
            }
        }
        int i = 0;
        String[] itemsNames = new String[initialNames.size()];

        for(String names : initialNames){
            itemsNames[i] = names;
            i++;
        }
        return itemsNames;
    }
}

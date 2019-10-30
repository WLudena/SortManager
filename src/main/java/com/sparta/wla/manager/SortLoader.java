package com.sparta.wla.manager;

import com.sparta.wla.exceptions.SortLoaderException;
import com.sparta.wla.sorters.Sorter;

import java.lang.reflect.InvocationTargetException;

public class SortLoader {

    private String name;
    private static final String SRC = "/src/main/java/";

    {
        String classPath = Sorter.class.getName();
        name = classPath.substring(0, classPath.lastIndexOf("."));
    }

    public String getSortersLocation() {
        String classPathStr = System.getProperty("user.dir");
        return (classPathStr + SRC + name.replace('.', '/'));
    }

    public Sorter getSorter(String sortType) throws SortLoaderException {
        try {
            String sorterName = name + "." + sortType.substring(0, sortType.lastIndexOf('.'));
            Class selectedSorter = Class.forName(sorterName);
            return (Sorter) selectedSorter.getDeclaredConstructor().newInstance();
        } catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new SortLoaderException("Cannot create a sorter");
        }
    }
}
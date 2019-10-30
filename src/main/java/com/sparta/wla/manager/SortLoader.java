package com.sparta.wla.manager;

import com.sparta.wla.sorters.Sorter;

import java.io.File;

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
}

package com.sparta.wla.manager;

import java.util.Random;

public class RandomArrayGenerator {

    public static int[] randomArray(int length){
        Random rand = new Random();
        int[] array = new int[length];

        for(int i = 0; i < length; i++){
            array[i] = rand.nextInt(length*10)+1;
        }
        return array;
    }
}

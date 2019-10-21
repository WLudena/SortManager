package com.sparta.wla.sorters;

import java.util.Random;

public class RandomArrayGenerator {

    private Random rand = new Random();

    public int[] randomArray(int length){
        int[] array = new int[length];
        for(int i = 0; i < length; i++){
            array[i] = rand.nextInt(1000);
        }
        return array;
    }
}

package com.syntexpro.bytecraft16.arraylist.sorting;

import java.io.File;
import java.io.IOException;

public class TextFileCreation {
    public static void main(String[] args) {

        try {
            File file = new File("src/com/syntexpro/bytecraft14_15/collections/arraylist/sorting/Sorting.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

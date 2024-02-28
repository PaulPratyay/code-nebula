package com.syntexpro.bytecraft18.hashmap;

import com.syntexpro.bytecraft5.loop.whileloop.FibonacciSeries;

import java.io.File;
import java.io.IOException;

public class TextFileCreation {
    public static void main(String[] args) {

        try {
            File file = new File("src/com/syntexpro/bytecraft18/hashmap/HashMap.txt");

            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

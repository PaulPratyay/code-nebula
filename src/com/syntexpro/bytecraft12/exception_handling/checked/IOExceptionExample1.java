package com.syntexpro.bytecraft12.exception_handling.checked;

import java.io.File;
import java.io.IOException;

public class IOExceptionExample1 {
    public static void main(String[] args) {

        File file = new File("src/com/syntexpro/bytecraft12/exception_handling/checked/Exception.text");

        try {
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException e) {
            System.out.println(e);
            System.out.println("Catch Block");
        }
        System.out.println("After try-catch block");
    }

    // If there is no exception thrown in 'try' block, then 'catch' block won't be executed;

}

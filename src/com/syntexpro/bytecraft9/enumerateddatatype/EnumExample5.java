package com.syntexpro.bytecraft9.enumerateddatatype;

public class EnumExample5 {

    public enum OperatingSystem {
        WINDOWS, MACOS, LINUX, ANDROID, IOS
    }

    public static void main(String[] args) {

        OperatingSystem[] operatingSystems = OperatingSystem.values();

        System.out.println("Well-known operating systems: ");
        for (OperatingSystem os : operatingSystems) {
            System.out.println(os);
        }
    }
}

package com.nicolas.lesson3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main2 {

    static class timer {
        static long t;

        static void start() {
            t = System.currentTimeMillis();
        }

        static void stopAndPrint() {
            System.out.println("time: " + (System.currentTimeMillis() - t));
        }
    }

}


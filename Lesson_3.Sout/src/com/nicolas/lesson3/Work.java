package com.nicolas.lesson3;

import java.io.FileInputStream;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collections;

public class Work {


    public static void main(String[] args) throws Exception{
        ArrayList<FileInputStream> ali = new ArrayList<>();
        ali.add(new FileInputStream("1.txt"));
        ali.add(new FileInputStream("2.txt"));
        ali.add(new FileInputStream("3.txt"));

        SequenceInputStream sin = new SequenceInputStream(Collections.enumeration(ali));
        int x;
        while ((x = sin.read()) != -1) {
            System.out.print((char) x);
        }

        sin.close();
    }
}

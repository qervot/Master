package com.nicolas.lesson3;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

            byte[] b = {1,2,3,4,5};
            ByteArrayInputStream in = new ByteArrayInputStream(b);

            int x;
            while ((x = in.read()) != -1) {
                System.out.print(x + " ");
            }

//            in.close();

            System.out.println();

            ByteArrayOutputStream out = new ByteArrayOutputStream();

            for (int i = 0; i < 50; i++) {
                out.write(i);
            }

//            out.close();

            System.out.println(Arrays.toString(out.toByteArray()));
        }
    }


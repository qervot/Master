package com.nicolas;

import java.util.ArrayList;

public class Main {
    public static void main1(String[] args) {
        Box boxStr1 = new Box("Java");
        Box boxStr2 = new Box("Home");

        //---------Много кода
        boxStr1.setObj(100);
        //---------Много кода

        String tempStr = "";
        if (boxStr1.getObj() instanceof String) {
            tempStr = (String) boxStr1.getObj();
        }

        System.out.println("tmpStr - " + tempStr);

        BoxGen<String> bgs = new BoxGen<>("Java");
        bgs.setObj("100");

        bgs.abc("sdfsdfsdfds", 558);

        String str = bgs.getObj();

        BoxGen<Integer> bgi = new BoxGen<>(12);
    }

    //region Че хотим
    class Animal {
    }

    class Bear implements Flyable, Sleepable {
    }

    class Bird implements Flyable {
    }

    class Cat implements Flyable, Sleepable {
    }

    interface Flyable {
    }

    interface Sleepable {
    }

    class GenClass<T extends Flyable & Sleepable> {

    }
    //endregion

    public static void main2(String[] args) {

        //GenClass<Bird> gcb;
        GenClass<Bear> gcb1;
        GenClass<Cat> gcb2;

        BoxN<Integer> bni = new BoxN<>(new Integer[]{1, 2, 3, 4});
        BoxN<Double> bnd = new BoxN<>(new Double[]{1d, 2d, 3d, 4d});

        System.out.println("bni: " + bni.avg());
        System.out.println("bnd: " + bnd.avg());
    }

    public static void main3(String[] args) {
        BoxN<Integer> bni1 = new BoxN<>(new Integer[]{1, 2, 3, 4});
        BoxN<Float> bni2 = new BoxN<>(new Float[]{1f, 2f, 3f, 4f});

        System.out.println(bni1.compare(bni2));
    }

    public static void main4(String[] args) {
        ArrayList<Integer> ali = new ArrayList<>();
        ali.add(2);
        ali.add(4);

        System.out.println(calcAvg(ali));

        printNumber(10);
        printNumber(5.0f);

        compareTwoBoxes(new BoxGen<Integer>(1), new BoxGen<Integer>(2));
    }

    public static void main(String[] args) {
        ArrayList<Integer> ali = new ArrayList<>();
        ArrayList<Number> aln = new ArrayList<>();

        copyElements(ali, aln);

    }

    public <T extends Comparable<T>> int compare(T t1, T t2) {
        return t1.compareTo(t2);
    }

    public static <T> void copyElements(ArrayList<? extends T> src, ArrayList<? super T> dst) {
        for (int i = 0; i < src.size(); i++) {
            dst.add(src.get(i));
        }

        src.clear();
    }

    public static void printNumber(Number n) {
        System.out.println(n);
    }

    public static double calcAvg(ArrayList<? extends Number> aln) {
        double d = 0d;
        for (int i = 0; i < aln.size(); i++) {
            //d += aln.get(i).doubleValue();
        }

        d /= aln.size();
        return d;
    }

    public static <T, T1> boolean compareTwoBoxes(BoxGen<T> b1, BoxGen<T1> b2) {
        return true;
    }
}

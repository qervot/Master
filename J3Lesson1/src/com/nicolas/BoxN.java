package com.nicolas;

public class BoxN<T extends Number> {
    T[] obj;

    public BoxN(T[] obj) {
        this.obj = obj;
    }

    public double avg() {
        double d = 0d;
        for (int i = 0; i < obj.length; i++) {
            d += obj[i].doubleValue();
        }

        d /= obj.length;
        return d;
    }

    public boolean compare (BoxN<?> another) {
        System.out.println(obj.getClass().getName());
        return Math.abs(avg() - another.avg()) < 0.0001f; //2.49999999999999999999
    }
}

package com.nicolas;

public class Box {

    private Object obj;

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public Box(Object obj) {
        this.obj = obj;
    }

    public void info() {
        System.out.println("Class " + obj.getClass().getSimpleName());
        System.out.println("Object: " + obj);
    }
}

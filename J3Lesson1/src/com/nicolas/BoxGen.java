package com.nicolas;

// T - тип данных
// E - элемент коллекции
// K - ключ
// V - значение
// N - числовые значения

public class BoxGen<T> {

    private T obj;
    T[] mas;
    Integer someInt;

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public BoxGen(T obj) {
        this.obj = obj;
        this.mas = mas;
    }

    public void abc(T someValue, Integer someInt) {
        this.obj = someValue;
        this.someInt = someInt;
    }

    public void info() {
        System.out.println("Class " + obj.getClass().getSimpleName());
        System.out.println("Object: " + obj);
    }
}

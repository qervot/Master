package com.nicolas;

public class GenCons {

    double db;

    public <T extends Number> GenCons(T ni) {
        db = ni.doubleValue();
    }

    public <G> GenCons(G ni) {

    }
}

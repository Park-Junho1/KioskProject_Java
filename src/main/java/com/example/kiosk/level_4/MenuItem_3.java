package com.example.kiosk.level_4;

public class MenuItem_3 {
    String name;
    double W;
    String description;

    protected MenuItem_3(String name, double W, String description) {
        this.name = name;
        this.W = W;
        this.description = description;
    }

    @Override
    public String toString() {
        return name + "  | W " + W + " | " + description;
    }
}
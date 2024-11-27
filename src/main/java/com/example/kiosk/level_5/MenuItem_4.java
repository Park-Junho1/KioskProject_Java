package com.example.kiosk.level_5;

public class MenuItem_4 {
    private String name;
    private double W;
    private String description;

    protected MenuItem_4(String name, double W, String description) {
        this.name = name;
        this.W = W;
        this.description = description;
    }

    @Override
    public String toString() {
        return name + "  | W " + W + " | " + description;
    }
}

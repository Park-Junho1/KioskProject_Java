package com.example.kiosk.level_3;

public class MenuItem_2 {
    String name;
    String W;
    String description;

    protected MenuItem_2(String name, String W, String description) {
        this.name = name;
        this.W = W;
        this.description = description;
    }

    @Override
    public String toString() {
        return name + "  | W " + W + " | " + description + "\n";
    }
}

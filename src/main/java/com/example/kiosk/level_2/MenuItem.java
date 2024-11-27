package com.example.kiosk.level_2;

public class MenuItem {
    String name;
    String W;
    String description;

    protected MenuItem(String name, String W, String description) {
        this.name = name;
        this.W = W;
        this.description = description;
    }

    @Override
    public String toString() {
        return name + "  | W " + W + " | " + description + "\n";
    }
}

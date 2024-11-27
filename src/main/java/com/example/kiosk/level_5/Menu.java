package com.example.kiosk.level_5;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private String category;
    private List<MenuItem_4> menuItems = new ArrayList<>();

    Menu(String category) {
        this.category = category;
    }

    public void addMenuItem(MenuItem_4 items) {
        menuItems.add(items);
    }

    public void displayMenu() {
        for (MenuItem_4 items : menuItems) {
            System.out.println(items.toString());
        }
    }

    public List<MenuItem_4> getMenuItems() {
        return menuItems;
    }

    public String getCategory() {
        return category;
    }
}
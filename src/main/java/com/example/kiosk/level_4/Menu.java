package com.example.kiosk.level_4;

import java.util.*;

public class Menu {
    String category;
    List<MenuItem_3> menuItems = new ArrayList<>();

    Menu (String category) {
        this.category = category;
    }

    public void addMenuItem (MenuItem_3 items) {
        menuItems.add(items);
    }

    public void displayMenu () {
        for (MenuItem_3 items : menuItems) {
            System.out.println(items.toString());
        }
    }

    public List<MenuItem_3> getMenuItems () {
        return menuItems;
    }
}

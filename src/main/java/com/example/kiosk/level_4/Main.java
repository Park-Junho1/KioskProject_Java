package com.example.kiosk.level_4;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Menu Burger = new Menu("Burgers");
        Burger.addMenuItem(new MenuItem_3("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        Burger.addMenuItem(new MenuItem_3("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        Burger.addMenuItem(new MenuItem_3("CheeseBurger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        Burger.addMenuItem(new MenuItem_3("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));
        Menu Drink = new Menu("Drinks");
        Menu Dessert = new Menu("Desserts");
        Kiosk kiosk = new Kiosk();
        kiosk.addMenu(Burger);
        kiosk.addMenu(Drink);
        kiosk.addMenu(Dessert);
        kiosk.start();
    }
}
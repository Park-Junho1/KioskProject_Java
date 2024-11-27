package com.example.kiosk.level_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Kiosk {
    List<Menu> category = new ArrayList<>();

    void start() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            for (int i = 0; i < category.size(); i++) {
                System.out.println((i + 1) + ". " + category.get(i).category);
            }
            System.out.println("0. 종료");
            int input = Integer.parseInt(br.readLine());
            Menu selectedCategory;
            if (input > 0 && input <= category.size()) {
                selectedCategory = category.get(input - 1);
                selectedCategory.displayMenu();
                System.out.println("0. 뒤로 가기");
            } else {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            while (true) {
                input = Integer.parseInt(br.readLine());
                if (input > 0 && input <= selectedCategory.getMenuItems().size()) {
                    MenuItem_3 selectedMenuItem = selectedCategory.getMenuItems().get(input - 1);
                    System.out.println(selectedMenuItem.toString());
                } else if (input == 0) {
                    break;
                }
            }
        }
        br.close();
    }

    void addMenu(Menu menu) {
        category.add(menu);
    }
}
package com.example.kiosk.level_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Kiosk {
    private List<Menu> category = new ArrayList<>();

    void start() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = 0;
        while (true) {
            for (int i = 0; i < category.size(); i++) {
                System.out.println((i + 1) + ". " + category.get(i).getCategory());
            }
            System.out.println("0. 종료");
            try {
                input = Integer.parseInt(br.readLine());
            } catch (NumberFormatException e) {
                System.out.println("숫자를 입력해주세요.");
                continue;
            }
            Menu selectedCategory;
            if (input > 0 && input <= category.size()) {
                selectedCategory = category.get(input - 1);
                selectedCategory.displayMenu();
                System.out.println("0. 뒤로 가기");
            } else if (input == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("존재하지 않는 목록입니다.");
                continue;
            }
            while (true) {
                try {
                    input = Integer.parseInt(br.readLine());
                } catch (NumberFormatException e) {
                    System.out.println("숫자를 입력해주세요.");
                    continue;
                }
                if (input > 0 && input <= selectedCategory.getMenuItems().size()) {
                    MenuItem_4 selectedMenuItem = selectedCategory.getMenuItems().get(input - 1);
                    System.out.println(selectedMenuItem.toString());
                } else if (input == 0) {
                    break;
                } else {
                    System.out.println("존재하지 않는 목록입니다.");
                }
            }
        }
        br.close();
    }

    void addMenu(Menu menu) {
        category.add(menu);
    }
}

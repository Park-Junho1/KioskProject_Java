package com.example.kiosk.level_2;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<MenuItem> menu = new ArrayList<>();
        for (int i = 0; i <= 3; i++) {
            String name = br.readLine();
            String W = br.readLine();
            String description = br.readLine();

            MenuItem item = new MenuItem(name, W, description);
            menu.add(item);
        }
        for (MenuItem item : menu) {
            System.out.printf(item.toString());
        }
        while(true) {
            int input = Integer.parseInt(br.readLine()) - 1;
            if (input == -1) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            System.out.println(menu.get(input));
        }
        br.close();
    }
}

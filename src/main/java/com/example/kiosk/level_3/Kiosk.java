package com.example.kiosk.level_3;
import com.example.kiosk.level_2.MenuItem;

import java.io.*;
import java.util.*;

public class Kiosk {
    private List<MenuItem_2> menuItems;
    Kiosk(List<MenuItem_2> menuItems)  {
        this.menuItems = menuItems;
    }
    void start() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (MenuItem_2 item : menuItems) {
            System.out.printf(item.toString());
        }
        while(true) {
            int input = Integer.parseInt(br.readLine()) - 1;
            if (input == -1) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            System.out.println(menuItems.get(input));
        }
        br.close();
    }
}


package com.example.kiosk.level_3;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<MenuItem_2> menuItems = new ArrayList<MenuItem_2>();
        for (int i = 0; i < 4; i++) {
            String name = br.readLine();
            String W = br.readLine();
            String description = br.readLine();

            menuItems.add(new MenuItem_2(name, W, description));
        }
        Kiosk kiosk = new Kiosk(menuItems);
        kiosk.start();
    }
}

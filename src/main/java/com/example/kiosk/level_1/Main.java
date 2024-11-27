package com.example.kiosk.level_1;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String Burger_1 = br.readLine();
        String Burger_2 = br.readLine();
        String Burger_3 = br.readLine();
        String Burger_4 = br.readLine();

        System.out.println("[ SHAKESHACK MENU ]");
        System.out.printf("1. %s  | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거\n", Burger_1);
        System.out.printf("2. %s  | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거\n", Burger_2);
        System.out.printf("3. %s  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거\n", Burger_3);
        System.out.printf("4. %s  | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거\n", Burger_4);
        System.out.println("0. 종료   | 종료");
        while (true) {
            int input = Integer.parseInt(br.readLine());
            if (input == 1) {
                System.out.printf("1. %s  | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거\n", Burger_1);
            } else if (input == 2) {
                System.out.printf("2. %s  | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거\n", Burger_2);
            } else if (input == 3) {
                System.out.printf("3. %s  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거\n", Burger_3);
            } else if (input == 4) {
                System.out.printf("4. %s  | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거\n", Burger_4);
            } else if (input == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 입력값 입니다.");
            }
        }
        br.close();
    }
}

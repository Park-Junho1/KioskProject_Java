package com.example.kiosk.level_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 키오스크에 들어갈 초기 데이터를 설정해준 후, 키오스크를 실행하는 클래스.
 */
public class Main {
    /**
     * @param args 커맨드 라인
     * @throws IOException 사용자 입력 중 예외 발생 시 throws
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 카테고리와 메뉴 항목 데이터 생성
        Menu Burger = new Menu("Burgers");
        Burger.addMenuItem(new MenuItem_4("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        Burger.addMenuItem(new MenuItem_4("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        Burger.addMenuItem(new MenuItem_4("CheeseBurger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        Burger.addMenuItem(new MenuItem_4("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));
        Menu Drink = new Menu("Drinks");
        Menu Dessert = new Menu("Desserts");

        // Kiosk 생성 및 위에서 만든 메뉴 추가
        Kiosk kiosk = new Kiosk();
        kiosk.addMenu(Burger);
        kiosk.addMenu(Drink);
        kiosk.addMenu(Dessert);

        // Kiosk 실행
        kiosk.start();
    }
}
package com.example.kiosk.level_5;

import java.util.ArrayList;
import java.util.List;

/**
 * 기본적으로 Kiosk의 카테고리. 상위 메뉴를 다룬다.
 * 각 상위 메뉴에 컬렉션으로 여러 메뉴 항목이 객체로 포함되어 다뤄진다.
 */
public class Menu {
    private String category;
    private List<MenuItem_4> menuItems = new ArrayList<>();

    /**
     * Menu 객체 생성
     *
     * @param category 카테고리 이름
     */
    Menu(String category) {
        this.category = category;
    }

    /**
     * 새로운 메뉴 항목 추가
     *
     * @param items 추가할 메뉴 항목
     */
    public void addMenuItem(MenuItem_4 items) {
        menuItems.add(items);
    }

    /**
     * MenuItem_4라는 자료형의 items라는 변수 선언.
     * menuItems 리스트를 선언된 items라는 변수로 순회 및 toString 메소드에 따라 출력
     */
    public void displayMenu() {
        for (MenuItem_4 items : menuItems) {
            System.out.println(items.toString());
        }
    }

    /**
     * 메뉴 항목 리스트 반환.
     *
     * @return 메뉴 항목 리스트
     */
    public List<MenuItem_4> getMenuItems() {
        return menuItems;
    }

    /**
     * 카테고리 이름 반환
     *
     * @return 카테고리 이름
     */
    public String getCategory() {
        return category;
    }
}
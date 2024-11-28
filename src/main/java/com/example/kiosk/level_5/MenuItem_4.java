package com.example.kiosk.level_5;

/**
 * 하위 메뉴에서의 개별 메뉴 항목을 다루는 클래스.
 */
public class MenuItem_4 {
    private String name;
    private double W;
    private String description;

    /**
     * MenuItem_4 객체 생성
     *
     * @param name        메뉴 이름
     * @param W           메뉴 가격
     * @param description 메뉴 설명
     */

    protected MenuItem_4(String name, double W, String description) {
        this.name = name;
        this.W = W;
        this.description = description;
    }

    /**
     * @return 메뉴 항목 정보 반환
     */
    @Override
    public String toString() {
        return name + "  | W " + W + " | " + description;
    }
}

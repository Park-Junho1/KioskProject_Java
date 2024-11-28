package com.example.kiosk.level_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Kiosk에서 메뉴를 관리하고 사용자와의 상호작용을 처리하는 로직을 담당한다.
 */
public class Kiosk {
    private List<Menu> category = new ArrayList<>();

    /**
     * Kiosk 시작 시, 메뉴를 사용자에게 표시하고 입력을 처리한다.
     * <p>
     * 메뉴 선택, 항목 선택, 프로그램 종료 등의 작업을 포함한다.
     * 입력이 잘못되었을 경우 적절한 오류 메시지를 출력한다.
     * </p>
     *
     * @throws IOException 입력 처리 중 예외 발생 시 throws
     */
    void start() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = 0;
        while (true) {
            // 상위 메뉴 출력
            for (int i = 0; i < category.size(); i++) {
                System.out.println((i + 1) + ". " + category.get(i).getCategory());
            }
            System.out.println("0. 종료");
            // input 입력 시 예외 판단.
            try {
                input = Integer.parseInt(br.readLine());
            } catch (NumberFormatException e) {
                System.out.println("숫자를 입력해주세요.");
                continue;
            }
            Menu selectedCategory;
            // 0일 경우, 종료. category에서 벗어난 숫자일 경우, 존재하지 않는 목록으로 continue.
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
                //하위 메뉴에서의 숫자 입력. 예외 발생시 catch 후 continue.
                try {
                    input = Integer.parseInt(br.readLine());
                } catch (NumberFormatException e) {
                    System.out.println("숫자를 입력해주세요.");
                    continue;
                }
                /*정해진 카테고리(Menu 객체의 주소값을 바탕)으로 하위 메뉴 리스트를 담당하는 Menu 객체를 반환.
                 * 상위 메뉴에 직접적인 정보가 없으므로, 메서드를 통해 객체 자체를 반환받아야 할 필요성이 있다.*/
                if (input > 0 && input <= selectedCategory.getMenuItems().size()) {
                    MenuItem_4 selectedMenuItem = selectedCategory.getMenuItems().get(input - 1);
                    System.out.println(selectedMenuItem.toString());
                } else if (input == 0) { // 0일경우 break.
                    break;
                } else { // 이외 입력 시 오류 문구 출력.
                    System.out.println("존재하지 않는 목록입니다.");
                }
            }
        }
        br.close();
    }

    /**
     * 새로운 메뉴 카테고리를 추가. (Menu class 형태의 객체여야 한다.)
     *
     * @param menu 추가할 메뉴 카테고리
     */
    void addMenu(Menu menu) {
        category.add(menu);
    }
}

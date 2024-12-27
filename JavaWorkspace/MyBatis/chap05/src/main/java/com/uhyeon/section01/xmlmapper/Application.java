package com.uhyeon.section01.xmlmapper;

import com.uhyeon.common.CategoryDTO;
import com.uhyeon.common.MenuAndCategoryDto;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ElementTestService elementTestService = new ElementTestService();
        do{
            System.out.println("=== 매퍼 element 테스트 메뉴 ===");
            System.out.println("1. <cache> 테스트");
            System.out.println("2. <resultMap> 서브 메뉴");
            System.out.println("3. <sql> 테스트");
            System.out.println("4. <insert> 서브 메뉴");
            System.out.print("메뉴 번호를 입력하세요: ");
            int no = sc.nextInt();
            switch (no) {
                case 1: elementTestService.selectCacheTest(); break;
                case 2: resultMapSubMenu(); break;
                case 3: elementTestService.selectSqlTest(); break;
                case 4: elementTestService.insertCategoryAndMenuTest(inputMenuAndCategory()); break;
            }
        } while (true);
    }

    private static void resultMapSubMenu() {

        Scanner sc = new Scanner(System.in);
        ElementTestService elementTestService = new ElementTestService();
        do {
            System.out.println("========== <resultMap> 서브 메뉴 ==========");
            System.out.println("1. <resultMap> 테스트");
            System.out.println("2. <constructor> 테스트");
            System.out.println("3. <association> 테스트");
            System.out.println("4. <collection> 테스트");
            System.out.print("메뉴 선택: ");
            int no = sc.nextInt();

            switch (no) {
                case 1: elementTestService.selectResultMapTest(); break;
                case 2: elementTestService.selectResultMapConstructorTest(); break;
                case 3: elementTestService.selectResultMapAssociationTest(); break;
                case 4: elementTestService.selectResultMapCollectionTest(); break;
            }
        } while (true);
    }

    private static MenuAndCategoryDto inputMenuAndCategory() {

        Scanner sc = new Scanner(System.in);

        System.out.print("신규 카테고리 이름: ");
        String categoryName = sc.next();

        System.out.print("등록 메뉴 이름: ");
        String menuName = sc.next();

        System.out.print("메뉴 가격: ");
        int menuPrice = sc.nextInt();

        System.out.print("판매 등록 여부<Y/N): ");
        String orderableStatus = sc.next();

        CategoryDTO category = new CategoryDTO();
        MenuAndCategoryDto menuAndCategory = new MenuAndCategoryDto();

        category.setName(categoryName);
        menuAndCategory.setCategory(category);
        menuAndCategory.setPrice(menuPrice);
        menuAndCategory.setName(menuName);
        menuAndCategory.setOrderableStatus(orderableStatus);

        return menuAndCategory;
    }
}

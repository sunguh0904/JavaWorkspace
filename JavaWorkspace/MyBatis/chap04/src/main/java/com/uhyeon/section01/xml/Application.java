package com.uhyeon.section01.xml;

import java.util.*;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("======== 바이마티스 동적 SQL ========");
            System.out.println("1. if 확인");
            System.out.println("2. choose(when, otherwise 확인)");
            System.out.println("3. foreach 확인");
            System.out.println("4. trim((where, set) 확인");
            System.out.println("9. 종료하기");
            System.out.println("===================================");
            System.out.print("메뉴 선택: ");
            int no = sc.nextInt();

            switch (no) {
                case 1: ifSubMenu(); break;
                case 2: chooseSubMenu(); break;
                case 3: foreachSubMenu(); break;
                case 4: trimSubMenu(); break;
                case 9:
                    System.out.println("프로그램을 종료 합니다."); return;
            }
        } while (true);
    }

    private static void ifSubMenu() {

        Scanner sc = new Scanner(System.in);

        MenuService menuService = new MenuService();

        do {
            System.out.println("=========== if 서브 메뉴 ===========");
            System.out.println("1. 금액에 맞는 추천 메뉴 목록 출력");
            System.out.println("2. 메뉴 이름 및 카테고리명으로 검색 후 메뉴 목록 출력");
            System.out.println("9. 이전 메뉴로");
            System.out.println("===================================");
            System.out.print("메뉴 번호 입력: ");
            int no = sc.nextInt();

            switch (no) {
                case 1: menuService.selectMenuByPrice(inputPrice()); break;
                case 2: menuService.searchMenu(InputSearchCriteria()); break;
                case 9: return;
            }
        } while (true);
    }

    private static int inputPrice() {

        Scanner sc = new Scanner(System.in);

        System.out.print("검색하실 각격의 최대 금액을 입력해 주세요: ");
        int price = sc.nextInt();

        return price;
    }

    private static SearchCriteria InputSearchCriteria() {

        Scanner sc = new Scanner(System.in);

        System.out.println("===================================");
        System.out.print("검색 기준을 입력해주세요(name or category): ");
        String condition = sc.next();

        System.out.println("===================================");
        System.out.print("검색어를 입력해주세요: ");
        String value = sc.next();

        return new SearchCriteria(condition, value);
    }

    private static void chooseSubMenu() {

        MenuService menuService = new MenuService();

        do {
            Scanner sc = new Scanner(System.in);

            System.out.println("===== choose 서브 메뉴 =====");
            System.out.println("1. 카테고리 상위 분류별 메뉴 보여주기(식사, 음료, 디저트)");
            System.out.println("9. 이전 메뉴로");
            System.out.print("메뉴 번호 입력: ");
            int no = sc.nextInt();

            switch (no) {
                case 1: menuService.searchMenuBySupCategory(inputSupCategory()); break;
                case 9: return;
            }
        } while (true);
    }

    private static SearchCriteria inputSupCategory() {

        Scanner sc = new Scanner(System.in);
        System.out.print("상위 분류를 입력해주세요(식사, 음료, 디저트): ");
        String value = sc.next();

        return new SearchCriteria("category", value);
    }

    private static void foreachSubMenu() {

        Scanner sc =new Scanner(System.in);

        MenuService menuService = new MenuService();

        do {
            System.out.println("===== foreach 서브 메뉴 =====");
            System.out.println("1. 랜덤한 메뉴 5개 추출 후 조회");
            System.out.println("9. 이전 메뉴로");
            System.out.println("============================");
            System.out.print("메뉴 입력: ");
            int no = sc.nextInt();

            switch (no) {
                case 1:menuService.searchMenuByRandomMenuCode(createRandomMenuCodeList()); break;
                case 9: return;
            }
        } while (true);
    }

    private static List<Integer> createRandomMenuCodeList() {

        Set<Integer> set = new HashSet<>();
        // 순서 유지x, 중복x

        while (set.size() < 5) {
            int temp =((int)(Math.random() * 23) + 1);
            set.add(temp);
        }

        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);

        return list;
    }

    private static void trimSubMenu() {

        Scanner sc = new Scanner(System.in);

        MenuService menuService = new MenuService();

        do {
            System.out.println("=========== trim 서브 메뉴 ===========");
            System.out.println("1. 검색 조건이 잇는 경우 메뉴코드로 조히, 단 없으면 전체 조회");
            System.out.println("2. 메뉴명 혹은 카테고리코드로 검색, 단 메뉴와 카테고리 둘 다 " +
                    "\n일치하는 경우도 검색하며, 검색조건이 없는 경우 전체 검색");
            System.out.println("3. 원하는 메뉴 정보만 수정");
            System.out.println("9. 이전 메뉴로");
            System.out.println("===================================");
            System.out.print("메뉴 번호 입력: ");
            int no = sc.nextInt();

            switch (no) {
                case 1: menuService.searchMenuByCodeOrSearchAll(inputAllOrOne()); break;
                case 2: menuService.searchMenuByNameOrCategory(inputSearchCriteriaMap()); break;
                case 3: menuService.modifyMenu(inputChangeInfo()); break;
                case 9: return;
            }
        } while (true);
    }

    private static SearchCriteria inputAllOrOne() {

        Scanner sc = new Scanner(System.in);

        System.out.print("검색 조건을 입력하시겠습니까?(예/아니오): ");
        boolean hasSearchValue = "예".equals(sc.nextLine());

        SearchCriteria searchCriteria = new SearchCriteria();

        if (hasSearchValue) {
            System.out.print("검색할 메뉴 코드 입력: ");
            String code = sc.nextLine();

            searchCriteria.setCondition("menuCode");
            searchCriteria.setValue(code);
        }
        return searchCriteria;
    }

    private static Map<String, Object> inputSearchCriteriaMap() {

        Scanner sc = new Scanner(System.in);

        System.out.print("검색 조건을 입력하세요(category/name/both/null): ");
        String condition = sc.next();

        Map<String, Object> criteria = new HashMap<>();

        if ("category".equals(condition)) {
            System.out.print("검색할 카테고리 코드 입력: ");
            int categoryValue = sc.nextInt();

            criteria.put("categoryValue", categoryValue);

        } else if ("name".equals(condition)) {
            System.out.print("검색할 이름 입력: ");
            String nameValue = sc.next();

            criteria.put("nameValue", nameValue);

        } else if ("both".equals(condition)){
            System.out.print("검색할 이름을 입력: ");
            String nameValue = sc.next();

            System.out.print("검색할 카테고리 코드 입력: ");
            int categoryValue = sc.nextInt();

            criteria.put("nameValue", nameValue);
            criteria.put("categoryValue", categoryValue);

        }
        return criteria;
    }

    private static Map<String, Object> inputChangeInfo() {

        Scanner sc = new Scanner(System.in);

        System.out.print("변경할 메뉴 코드를 입력하세요: ");
        int code = sc.nextInt();

        System.out.print("변경할 메뉴 이름을 입력하세요: ");
        sc.nextLine();
        String name = sc.next();

        System.out.print("변경할 카테고리 코드를 입력하세요: ");
        sc.nextLine();
        int categoryCode = sc.nextInt();

        System.out.print("판매 여부를 결정해주세요(Y/N): ");
        sc.nextLine();
        String orderableStatus = sc.next();

        Map<String, Object> criteria = new HashMap<>();
        criteria.put("code", code);
        criteria.put("name", name);
        criteria.put("categoryCode", categoryCode);
        criteria.put("orderableStatus", orderableStatus);

        return criteria;
    }
}
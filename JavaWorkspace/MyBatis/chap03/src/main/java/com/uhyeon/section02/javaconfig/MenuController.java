package com.uhyeon.section02.javaconfig;

import java.util.List;
import java.util.Map;

public class MenuController {

    /* 1. 사용자가 선택한 기능을 실행시켜주는 역할
    2. 사용자가 전달한 값을 정제 또는 새롭게 생성한 후에 필요한 서비스를 요청
    3. 서비스에서 전달받은 결과값에 따라서 성공/실패의 화면을 결정짓는 역할 */

    private final PrintResult printResult;

    private final MenuService menuService;

    public MenuController() {

        printResult = new PrintResult();

        menuService = new MenuService();
    }

    public void selectAllMenu() {
        /* 데이터 베이스 한 행에 담겨져 있는 정보를 dto에 매핑해서 여러 건의 메뉴를 조회하는 것이기 때문에
        리스트의 메뉴 디티오 타입으로 조회 */
        List<MenuDTO> menuList = menuService.selectAllMenu();

        if (menuList != null) {
            printResult.printMenuList(menuList);
        } else {
            printResult.printErrorMessage("selectList");
        }
    }

    public void selectMenuByCode(Map<String, String> parameter) {

        int code = Integer.parseInt(parameter.get("code"));

        MenuDTO menu = menuService.selectMenuByCode(code);

        if (menu != null) {
            printResult.printMenu(menu);
        } else {
            printResult.printErrorMessage("selectOne");
        }
    }

    public void registMenu(Map<String, String> parameter) {

        String name = parameter.get("name");
        int price = Integer.parseInt(parameter.get("price"));
        int categoryCode = Integer.parseInt(parameter.get("categoryCode"));
        // 3개 이상의 파라미터가 생기면 통상적으로 DTO에 보관해서 사용한다.

        MenuDTO menu = new MenuDTO();
        menu.setName(name);
        menu.setPrice(price);
        menu.setCategoryCode(categoryCode);

        if (menuService.registMenu(menu)) {
            printResult.printSuccessMessage("insert");
        } else {
            printResult.printErrorMessage("insert");
        }
    }

    public void modifyMenu(Map<String, String> parameter) {

        int code = Integer.parseInt(parameter.get("code"));
        String name = parameter.get("name");
        int price = Integer.parseInt(parameter.get("price"));
        int categoryCode = Integer.parseInt(parameter.get("categoryCode"));

        MenuDTO menu = new MenuDTO();
        menu.setCode(code);
        menu.setName(name);
        menu.setPrice(price);
        menu.setCategoryCode(categoryCode);

        if (menuService.modifyMenu(menu)) {
            printResult.printSuccessMessage("update");
        } else {
            printResult.printErrorMessage("update");
        }
    }

    public void deleteMenu(Map<String, String> parameter) {

        int code = Integer.parseInt(parameter.get("code"));

        if (menuService.deleteMenu(code)) {
            printResult.printSuccessMessage("delete");
        } else {
            printResult.printErrorMessage("delete");
        }
    }
}
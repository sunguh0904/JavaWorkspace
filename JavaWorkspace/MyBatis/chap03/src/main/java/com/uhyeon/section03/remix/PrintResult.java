package com.uhyeon.section03.remix;

import java.util.List;

public class PrintResult {
    public void printMenuList(List<MenuDTO> menuList) {
        for (MenuDTO menu : menuList) {
            System.out.println(menu);
        }
    }

    public void printErrorMessage(String errorCode) {

        String errorMessage = "";
        switch (errorCode) {
            case "select": errorMessage = "메뉴 목록 조회를 실패 하였습니다."; break;
            case "selectOne": errorMessage = "메뉴 조회를 실패 하였습니다."; break;
            case "insert": errorMessage = "신규 메뉴 등록을 실패 하였습니다."; break;
            case "update": errorMessage = "메뉴 수정을 실패 하였습니다."; break;
            case "delete": errorMessage = "메뉴 삭제를 실패 하였습니다."; break;
        }
        System.out.println(errorMessage);
    }

    public void printMenu(MenuDTO menu) {
        System.out.println(menu);
    }

    public void printSuccessMessage(String successCode) {

        String successMassage = "";
        switch (successCode) {
            case "insert": successMassage = "신규 메뉴 등록을 성공 하였습니다."; break;
            case "update": successMassage = "메뉴 수정을 성공 하였습니다."; break;
            case "delete": successMassage = "메뉴 삭제를 성공 하였습니다."; break;
        }

        System.out.println(successMassage);
    }
}

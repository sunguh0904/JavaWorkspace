package com.uhyeon.section02.javaconfig;

import org.apache.ibatis.annotations.*;

import java.util.List;

public interface MenuMapper {

    @Results(id="menuResultMap", value = {
            @Result(id = true, property = "code", column = "MENU_CODE"),
            @Result(property = "name", column = "MENU_NAME"),
            @Result(property = "price", column = "MENU_PRICE"),
            @Result(property = "categoryCode", column = "CATEGORY_CODE"),
            @Result(property = "orderableStatus", column = "ORDERABLE_STATUS")
    })

    @Select("SELECT MENU_CODE, MENU_NAME, MENU_PRICE, CATEGORY_CODE, ORDERABLE_STATUS\n" +
            "FROM TBL_MENU\n" +
            "WHERE ORDERABLE_STATUS = 'Y'\n" +
            "ORDER BY MENU_CODE")
    List<MenuDTO> selectAllMenu();


    @Select("SELECT *\n" +
            "FROM TBL_MENU\n" +
            "WHERE ORDERABLE_STATUS = 'Y'\n" +
            "AND MENU_CODE = #{ code }")
    @ResultMap("menuResultMap")
    // 위에 작성 된 @Results의 id를 이용해서 재사용 할 수 있다.
    MenuDTO selectMenuByCode(int code);


    // CRUD는 ResultMap이 필요없다.
    @Insert("INSERT INTO TBL_MENU (\n" +
            "MENU_NAME, MENU_PRICE, CATEGORY_CODE, ORDERABLE_STATUS\n" +
            ")\n" +
            "\n" +
            "VALUES (\n" +
            "#{ name }, #{ price }, #{ categoryCode }, 'Y'\n" +
            ")")
    int insertMenu(MenuDTO menu);

    @Update("UPDATE TBL_MENU\n" +
            "SET MENU_NAME = #{ name }, MENU_PRICE = #{ price }, CATEGORY_CODE = #{ categoryCode }\n" +
            "WHERE MENU_CODE = #{ code }")
    int updateMenu(MenuDTO menu);

    @Delete("DELETE FROM TBL_MENU\n" +
            "WHERE MENU_CODE = #{ code }")
    int deleteMenu(int code);
}
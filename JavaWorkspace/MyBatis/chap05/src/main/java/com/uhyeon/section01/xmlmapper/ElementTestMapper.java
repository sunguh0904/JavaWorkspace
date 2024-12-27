package com.uhyeon.section01.xmlmapper;

import com.uhyeon.common.CategoryAndMenuDTO;
import com.uhyeon.common.MenuAndCategoryDto;
import com.uhyeon.common.MenuDTO;

import java.util.List;

public interface ElementTestMapper {
    List<String> selectCacheTest();

    List<MenuDTO> selectResultMapTest();

    List<MenuDTO> selectResultMapConstructorTest();

    List<MenuAndCategoryDto> selectResultMapAssociationTest();

    List<CategoryAndMenuDTO> selectResultMapCollectionTest();

    List<MenuDTO> selectSqlTest();

    int insertNewCategory(MenuAndCategoryDto menuAndCategory);

    int insertNewMenu(MenuAndCategoryDto menuAndCategory);
}

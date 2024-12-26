package com.uhyeon.section01;

import org.apache.ibatis.annotations.Select;

public interface Mapper {
    @Select("SELECT CURDATE() FROM DUAL")
        // CURDATE: 현재 날짜를 조회하는 메소드

    java.util.Date selectSysdate();
    // 쿼리문을 식별하기 위한 식별자 역할을 하는 메소드
}

-- BUILD_IN_FUCTIONS

-- ASCII: 아스키 코드 값 추출
SELECT ASCII('A');

-- CHAR: 아스키 코드로 문자 추출
SELECT CHAR(65);

-- BIT_LENGTH: 할당된 비트 크기 반환 (1byte == 8bit)
SELECT BIT_LENGTH('pie');

-- CHAR_LENGTH: 문자열의 길이 반환
SELECT CHAR_LENGTH('pie');

-- LENGTH: 할당된 byte 크기 반환
SELECT LENGTH('pie');

SELECT 
    menu_name,
    BIT_LENGTH(menu_name),
    CHAR_LENGTH(menu_name),
    LENGTH(menu_name)
FROM
    tbl_menu;
    
-- CONCAT: 문자열을 이어붙임
SELECT CONCAT('호랑이', '기린', '판다');

-- CONCAT_WS: 구분자와 함께 문자열을 이어붙임 (구분자, 문자열1, 문자열2)
SELECT concat_ws('-', '2024', '2', '23');

-- ELT: 해당 위치의 문자열 반환 (위치, 문자열1, 문자열2)
SELECT ELT(1, 'java', 'python', 'mysql');

-- FIELD: 찾을 문자열 위치 반환 (찾을 문자열, 문자열1, 문자열2)
select field('java', 'java', 'python', 'mysql');
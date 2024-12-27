/*
DATA_TYPES

명시적 형변환
cast (expression as 데이터형식[(길이)])
convert (expression, 데이터형식[(길이)])

데이터 형식으로 가능한 것은 binary, char, date, datetime, decimal,
json, ime, sigend integer, unigned integer
*/
SELECT
	AVG(menu_price)
FROM tbl_menu;

-- SIGNED INTEGER: 음수, 0, 양수를 모두 포함하는 정수 값을 저장 가능
-- UNSIGNED INTERGER: 0, 양수를 포함하는 정수 값을 저장 가능
SELECT
	CAST(AVG(menu_price) AS SIGNED INTEGER) AS '평균 메뉴 가격'
FROM tbl_menu;

SELECT
	CONVERT(AVG(menu_price), SIGNED INTEGER) AS '평균 메뉴 가격'
FROM tbl_menu;

SELECT
	CONVERT(AVG(menu_price), SIGNED INTEGER) AS '평균 메뉴 가격'
FROM tbl_menu;

-- DATE
SELECT CAST('2024$12$24' AS DATE);
SELECT CAST('2024/12/24' AS DATE);
SELECT CAST('2024%12%24' AS DATE);
SELECT CAST('2024@12@24' AS DATE);

-- CONCAT(): 문자 연결 함수
SELECT
	CONCAT(CAST(menu_price AS char(5)), '원')
FROM tbl_menu;

-- 카테고리별 메뉴 가격 합계 구하기
SELECT
	category_code,
    CONCAT(CAST(SUM(menu_price) AS CHAR(10)), '원')
FROM tbl_menu
GROUP BY category_code;

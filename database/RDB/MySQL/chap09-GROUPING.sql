/*
GROUPING
GROUP BY: 특정 열의 값에 따라 그룹화하는 데 사용
HAVING: GROUP BY 절과 함께 사용행 하며 그룹에 대한 조건을 적용하는 데 사용
*/

-- 같은 값을 그룹화
SELECT
	category_code
FROM
	tbl_menu
GROUP BY category_code;

-- COUNT(): 컬럼의 수를 세는 함수
SELECT
	category_code,    
    COUNT(*)
FROM
	tbl_menu
GROUP BY category_code;

-- SUM(): 그룹화된 개수만큼 합산돼서 반환
SELECT
	category_code,
    SUM(menu_price)
FROM
	tbl_menu
GROUP BY category_code;

-- AVG(): 위에서 입력받은 금액 합계의 평균
SELECT
	category_code,
    AVG(menu_price)
FROM
	tbl_menu
GROUP BY category_code;

SELECT
	menu_price,
    category_code
FROM
	tbl_menu
GROUP BY
	menu_price,
    category_code;
    
-- 조건을 만족하는 카테고리 코드 그룹만 반환
SELECT
	menu_price,
    category_code
FROM
	tbl_menu
GROUP BY
	menu_price,
    category_code
-- WHERE 절은 그룹화 전 개별 행에 조건을 거는 것, HAVING 절은 그룹화 후 집계 결과에 대한 조건
HAVING category_code >= 5 AND category_code <= 8;

-- 그룹화한 합계와, 테이블 전체의 합계를 반환, 전체를 반환한 코드는 NULL로 반환
SELECT
	menu_price,
    category_code,
    SUM(menu_price)
FROM
	tbl_menu
GROUP BY
	menu_price,
    category_code;
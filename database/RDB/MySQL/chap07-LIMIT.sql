/*
LIMIT 이란?
SQL에서 결과로 반환되는 행(row)의 수를 제한하기 위해 사용되는 구문
대량의 데이터를 조회할 때 필요한 일부 데이터만 가져오거나, 페이징을 구현할 때 유용하게 사용
*/

/*
SELECT
	select_list
FROM
	table_name
LIMIT offset, row_count;

offset: 시작할 행의 번호 (인덱스 체계)
row_count: 이후 행부터 반환 받을 행의 갯수
*/

-- menu_price 값을 2번 컬럼부터 5번 컬럼까지 반환
SELECT
	menu_code,
    menu_name,
    menu_price
FROM
	tbl_menu
ORDER BY
	menu_price DESC
LIMIT 1, 4;

-- 상위 5줄의 컬럼만 반환
SELECT
	menu_code,
    menu_name,
    menu_price
FROM
	tbl_menu
ORDER BY
	menu_price DESC,
    menu_name
LIMIT 5;
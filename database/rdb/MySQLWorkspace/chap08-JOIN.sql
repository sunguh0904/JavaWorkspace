-- 별칭을 사용할 때 AS 뒤에 별칭명 작성

SELECT
	menu_code as code,
    menu_name as name,
    menu_price as price
FROM
	tbl_menu
ORDER BY
	price;
    
-- 테이블은 별칭을 사용할 때 AS 명시하지됨않아도 됨 
SELECT
	category_code,
    menu_name
FROM
	tbl_menu a
ORDER BY
	a.category_code,
    a.menu_name;
    
/*
INNER JOIN
두 테이블의 교집합을 반환하는 SQL JOIN 유형

ON을 활용한 JOIN
컬럼명이 같거나 다를 경우 ON으로 서로 연관있는 컬럼에 대한 조건을 작성하여 JOIN
*/
SELECT
	a.menu_name,
    b.category_name
FROM
	tbl_menu a
-- 테이블 a와 테이블 b를 JOIN 하면서 테이블 a의 카테고리 코드와 테이블 b의 카테고리 코드가 같은 것을 합침
INNER JOIN tbl_category b ON a.category_code = b.category_code;

/*
USING을 활용한 JOIN
컬럼명이 같을 경우 USING으로 서로 연관있는 컬럼에 대한 조건을 작성하여 JOIN
*/
SELECT
	a.menu_name,
    b.category_code
FROM
	tbl_menu a
-- 테이블 a와 b를 JOIN하여 카테고리의 코드가 같은것 끼리 매칭 후 SELECT절 반환
JOIN tbl_category b USING (category_code);

/*
LEFT JOIN
왼쪽 테이블의 모든 레코드와 오른쪽 테이블에서 일치하는 레코드를 반환하는 SQL JOIN 유형
*/
SELECT
	a.category_name,
    b.menu_name
FROM
	tbl_category a
-- 카테고리 테이블 a의 모든 레코드와, 카테고리 코드(category_code)가 일치하는 tbl_menu b의 레코드들을 LEFT JOIN
LEFT JOIN tbl_menu b ON a.category_code = b.category_code;

/*
RIGHT JOIN
오른쪽 테이블의 모든 레코드와 왼쪽 테이블에서 일치하는 레코드를 반환하는 SQl JOIN 유형
*/
SELECT
	a.menu_name,
    b.category_name
FROM
	tbl_menu a
RIGHT JOIN tbl_category b ON a.category_code = b.category_code;

/*
CROSS JOIN
두 테이블의 모든 가능한 조합을 반환하는 SQL JOIN 유형
*/
SELECT
	a.menu_name,
    b.category_name
FROM
	tbl_menu a
-- 테이블 메뉴 a와 b의 모든 레코드를 합쳐 값 반환
CROSS JOIN tbl_category b;

/*
SELF JOIN
같은 테이블 내에서 행과 행 사이의 관계를 차기 위해 사용되는 SQL JOIN 유형
카테고리별 대분류 확인을 위한 SELF JOIN 조회
*/
SELECT
	a.category_name,
    b.category_name
FROM
	tbl_category a
JOIN tbl_category b ON a.ref_category_code = b.category_code
WHERE
	a.ref_category_code IS NOT NULL;
    
-- JOIN 알고리즘
/*
NESTED LOOP JOIN
큰 테이블의 각 행에 대해 작은 테이블을 반복적으로 검색하며, 조인 조건에 맞는 행을 찾음
인덱스가 잘 구성되어 있는 작은 테이블에 유리하며, 전체 행을 스캔할 필요가 없을 때 효율적
결론: 두 테이블 중 하나가 상대적으로 작을 때 효과, 작은 테이블 조회 유리
*/
SELECT /* + no_hash_join(a) */
	a.menu_name,
    b.category_code
FROM
	tbl_menu a
JOIN tbl_category b ON a.category_code = b.category_code;

/*
HASH JOIN
두 테이블이 모두 크고, 테이블 간 등가 조인(EQUAL JOIN)이 일어날 때 효과
먼저 한 ㅌ이블의 데이터를 읽어 해시 테이블을 생성하고, 다른 테이블을 읽으며 해시 테이블과 매칭되는 데이터를 찾음
큰 테이블 조회 유리
*/
SELECT /* + hash_join(a) */
/*
주석처럼 보이지만 해당 부분이 힌트절로 실행
SELECT 옆에 사용해야 가능
a 라는 별칭을 가진 테이블에 대해 HASH_JOIN 사용
*/
	a.menu_name,
    b.category_name
FROM
	tbl_menu a
JOIN tbl_category b ON a.category_code = b.category_code;
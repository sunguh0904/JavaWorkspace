SELECT
	category_code
FROM
	tbl_menu
WHERE
	menu_name = '민트미역국';
    
SELECT
	menu_code,
    menu_name,
    menu_price,
    category_code,
    orderable_status
FROM
	tbl_menu;
    
SELECT
	menu_code,
    menu_name,
    menu_price,
    category_code,
    orderable_status
FROM
	tbl_menu
WHERE
-- 서브쿼리에서 조회한 category_code 값이 메인 쿼리의 조건(category_code)에 동적으로 반영
	category_code = (
		SELECT
			category_code
		FROM
			tbl_menu
		WHERE
			menu_name = '민트미역국'
		);
        
SELECT
	COUNT(*) 'count'
FROM
	tbl_menu
GROUP BY
	category_code;
    
-- FROM 절에 사용된 서브쿼리는 반드시 별칭이 있어야함
SELECT
	MAX(count)
FROM (
	SELECT
		COUNT(*) 'count'
	FROM
		tbl_menu
	GROUP BY
		category_code
	) AS countmenu;
    
-- 카테고리 코드 4번의 평균 반환
SELECT
	AVG(menu_price)
FROM
	tbl_menu
WHERE
	category_code = 4;

-- 카테고리별 평균 가격보다 높은 가격의 메뉴 조회
SELECT
	menu_code,
    menu_name,
    menu_price,
    category_code,
    orderable_status
FROM
	tbl_menu a
-- WHERE 절 안에 서브쿼리 사용
WHERE menu_price > (
	SELECT
		AVG(menu_price)
	FROM
		tbl_menu
	WHERE category_code = a.category_code
    );
    
/*
EXISTS
조회 결과가 있을 때 ture 아니면 false 반환
*/
-- 메뉴가 있는 카테고리 조회
SELECT
	category_name
FROM
	tbl_category a
WHERE EXISTS (
	SELECT 1
    FROM tbl_menu b
    WHERE b.category_code = a.category_code
    )
ORDER BY 1;

/*
CTE(common table expressions)
파생 테이블과 비슷한 개념이며 코드의 가독성과 재사용성을 위해 파생 테이블 대신 사용
FROM 절에서만 사용
*/
WITH
	menucate AS (
		SELECT
			menu_name,
            category_name
		FROM
			tbl_menu a
		JOIN tbl_category b ON a.category_code = b.category_code
        )
SELECT * FROM menucate
ORDER BY menu_name;
/*
SET_OPERATORS
*/

/*
UNION
두 개 이상의 SELECT 절의 결과를 결합하여 중복된 레코드를 제거 후 반환
*/
SELECT * FROM tbl_menu
WHERE category_code = 10
UNION
SELECT * FROM tbl_menu
WHERE menu_price < 9000 AND category_code <> 10;

/*
UNION ALL
중복된 레코드를 제거하지 않고 모두 반환
*/
SELECT * FROM tbl_menu
WHERE category_code = 10
UNION ALL
SELECT * FROM tbl_menu
WHERE menu_price < 9000 AND category_code <> 10;

/*
INTERSECT
두 SELECT 절의 결과 중 공통되는 레코드만 반환
(MySQL은 제공하지 않음, 하지만 INNER JOIN 또는 IN 연산자를 활용해서 구현 가능)
*/
SELECT a.* FROM tbl_menu a
INNER JOIN (
	SELECT * FROM tbl_menu
    WHERE menu_price < 9000) b ON (a.menu_code = b.menu_code)
WHERE a.category_code = 10;

-- IN 사용
SELECT * FROM tbl_menu
WHERE category_code = 10 AND
	menu_code IN (
		SELECT
			menu_code
		FROM
			tbl_menu
		WHERE menu_price < 9000
	);
    
/*
MINUS
첫 번째 SELECT 절의 결과에서 두 번째 SELECT 절의 결과가 포함하는 레코드를 제외하고 반환
(MySQL은 MINUs를 제공하지 않음, LEF JOIN을 활용해서 구현 가능)
*/
SELECT a.* FROM tbl_menu a
LEFT JOIN (
	SELECT * FROM tbl_menu
    WHERE menu_price < 9000
    ) b ON (a.menu_code = b.menu_code)
WHERE b.menu_code IS NULL AND a.category_code = 10;
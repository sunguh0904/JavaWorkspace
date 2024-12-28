/*
DML(Data Manipulation Language)
데이터 조작언어, 테이블에 값을 삽입하거나 수정, 삭제하는 SQL의 한 부분
*/

-- INSERT: 새로운 커럼 추가하는 구문
SELECT * FROM tbl_menu;
-- 첫 번째 파라미터는 오토인크리먼트라 null 값으로 넣어주면 됨
INSERT INTO tbl_menu VALUES (null, '바나나해장국', 8500, 4, 'Y');

/*
NUlL 허용 가능한(nullable) 컬럼이나 AUTO_INCREMENT가 있는 컬럼을 제외한
INSERT 하고싶은 데이터 컬럼을 지정해서 INSERT 가능
*/
INSERT INTO tbl_menu (menu_name, menu_price, category_code, orderable_status)
VALUES ('초콜릿죽', 6500, 7, 'Y');

SELECT * FROM tbl_menu;

-- 컬럼을 명시하면 INSERT 시 데이터의 순서를 바꾸는 것도 가능
INSERT INTO tbl_menu (orderable_status, category_code, menu_price, menu_name)
VALUES ('N', 5, 6500, '파라지옥볶음');

SELECT * FROM tbl_menu;

INSERT INTO tbl_menu VALUES
(null, '참치맛아이스크림', 1700, 12, 'y'),
(null, '멸치맛아이스크림', 1500, 11, 'y'),
(null, '소시지맛커피', 2500, 8, 'y');

SELECT * FROM tbl_menu;

-- UPDATE: 테이블에 기록된 컬럼의 값을 수정하는 구문
SELECT * FROM tbl_menu
WHERE menu_name = '바나나해장국';

INSERT INTO tbl_menu VALUES
(28, '취두부된장찌개', 6000, 4, 'y');

SELECT * FROM tbl_menu;

UPDATE tbl_menu
SET menu_name = '양상추젤라또'
WHERE menu_code = 28;

SELECT * FROM tbl_menu;

-- 서브쿼리로 UPDATE 또는 DELETE 시 자기자신 테이블의 데이터를 사용하면 에러 발생
UPDATE tbl_menu
SET category_code = 6
WHERE menu_code = 22;

SELECT * FROM tbl_menu;

UPDATE tbl_menu
SET category_code = 6
WHERE menu_code = (
	SELECT menu_code
    FROM (
		SELECT menu_code
        FROM tbl_menu
        WHERE menu_name = '바나나해장국'
	) tmp
);

SELECT * FROM tbl_menu;

-- DELETE: 테이블의 컬럼을 삭제하는 구문
-- 메뉴 가격이 낮은 두 개의 컬럼 삭제
DELETE FROM tbl_menu
ORDER BY menu_price
LIMIT 2;

-- WHERE 절을 활용한 컬럼 삭제
DELETE FROM tbl_menu
WHERE menu_code = 28;

SELECT * FROM tbl_menu;

SHOW VARIABLES LIKE 'sql_safe_update';

DELETE FROM tbl_menu;

-- 세이프 업데이트 모드 비활설화
SET sql_safe_updates = 0;

-- 세이프 업데이트 모드 활성화
SET sql_safe_updates = 1;

/*
REPLACE:
INSERT 시 PRIMARY KEY 또는 UNIQUE KEY가 중복이 발생할 수 있다면
REPLACE를 통해 중복된 데이터를 덮을 수 있음 (권장되지는 않음)
*/
SELECT * FROM tbl_menu;

REPLACE tbl_menu
SET
	menu_code = 2,
    menu_name = '우럭스무디',
    menu_price = 2500,
	category_code = 5,
    orderable_status = 'n';
    
SELECT * FROM tbl_menu;
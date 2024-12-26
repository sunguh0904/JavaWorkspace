/*
VIEW:
SELECT 쿼리문을 저장한 객체로 가상 테이블이라고 불림
데이터를 쉽게 읽고 이해할 수 있도록 돕는 동시에 원본 데이터의 보안을 유지하는 데 도움이 됨
*/

CREATE VIEW hansik AS
    SELECT 
        *
    FROM
        tbl_menu
    WHERE
        category_code = 4;
        
SELECT 
    *
FROM
    hansik;
    
-- 메뉴 테이블에 추가를 해도 뷰에서 확인이 가능
INSERT INTO tbl_menu VALUES
(NULL, '식혜맛국밥', 5500, 4, 'y');

/*
VIEW에는 AUTO_INCREMENT가 없지만 베이스 테이블에 AUTO_INCREMENT가 걸려 있으면
VIEW에서도 자동으로 AUTO_INCREMENT가 적용되어
NULL 값을 넣어도 자동으로 AUTO_INCREMENT가 됨
*/
INSERT INTO hansik VALUES
(NULL, '식혜맛국밥', 5500, 4, 'y');

-- 뷰에서 추가, 수정, 삭제를 해도 베이스 테이블에도 수정이 됨
UPDATE hansik 
SET 
    menu_name = '버터만국밥',
    menu_price = 5700
WHERE
    menu_code = 99;
    
/*
VIEW로 DML 명령어 조작이 불가능한 경우
1. VIEW 정의에 포함되지 않은 컬럼을 조작하는 경우
2. VIEW에 포함되지 않은 컬럼 중에 베이스가 되는 테이블 컬럼이 NOT NULL 제약조건이 지정된 경우
3. 산술 표현식이 정의된 경우
5. DISTINCT를 포함한 경우
6. 그룹함수나 GROUP BY 절을 포함한 경우
*/

-- VIEW 삭제
DROP VIEW hansik;

/*
OR REPLACE OPTION:
테이블을 드롭하지 않고 기존의 VIEW를 새로운 VIEW로 쉽게 다룰 수 있음
*/
CREATE OR REPLACE VIEW hansik AS
SELECT
	menu_code AS '메뉴코드',
    menu_name AS '메뉴명',
    category_name '카테고리명'
FROM tbl_menu a
JOIN tbl_category b on a.category_code = b.category_code
WHERE b.category_name = '한식';

SELECT 
    *
FROM
    hansik;
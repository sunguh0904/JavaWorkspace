/*
TRANSACTION:
데이터 베이스에서 한번에 수행되는 작업의 단위
시작, 진행, 종료 단계를 가지며, 만약 중간에 오류가 발생하면 롤백
MySQL은 기본적으로 자동 커밋 설정이 되어있어 롤백을 하기 위해서는 자동 커밋을 해제해 주어야 함
*/

-- AutoCommit 활성화
SET autocommit = 1;
-- 또는
SET autocommit = ON;

-- AutoCommit 비활성화
SET autocommit = 0;
-- 또는
SET autocommit = OFF;

SHOW VARIABLES LIKE 'autocommit';

START TRANSACTION;

SELECT * FROM tbl_menu;

INSERT INTO tbl_menu VALUES
(null, '허니김치탕수육', 8500, 4, 'y');

SELECT * FROM tbl_menu;

COMMIT;

UPDATE tbl_menu
SET menu_name = '할라피뇨아메리카노'
WHERE menu_code = 22;

SELECT * FROM tbl_menu;

ROLLBACK;

SELECT * FROM tbl_menu;

DELETE FROM tbl_menu
WHERE menu_code = 22;

SELECT * FROM tbl_menu;

COMMIT;

ROLLBACK;

SELECT * FROM tbl_menu;
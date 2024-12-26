/*
DDL(Data Definition Language):
데이터베이스의 테이블을 정의하거나 수정하는 데 사용되는 SQL의 한 부분
*/

/*
CREATE: 테이블 생성을 위한 구문

컬럼 설정 방법:
column_name, data_type(length), [not null], [auto_increment], column_constraint
*/

-- tb1 이름의 테이블이 존재하지 않으면 생성
CREATE TABLE IF NOT EXISTS tb1 (
	pk INT PRIMARY KEY,
    fk INT,
    col1 VARCHAR(255),
    CHECK(col1 IN ('y', 'n'))
-- 기본 스토리지 엔진으로 설정이 되어있어, 명시하지 않아도 자동으로 설정
) ENGINE = InnoDB;

-- 테이블 구조 확인 명령어
DESCRIBE tb1;

INSERT INTO tb1 VALUES
(1, 20, 'y');

SELECT * FROM tb1;

/*
AUTO_INCREMENT:
insert 시 primary key에 해당하는 컬럼에 자동으로 중복되지 않는 번호를 발생시켜 저장할 수 있음
컬럼 번호순으로 중복되지 않게 자동으로 넘어감
*/
CREATE TABLE IF NOT EXISTS tb2 (
	pk INT AUTO_INCREMENT PRIMARY KEY,
    fk INT,
    col1 VARCHAR(255),
    CHECK(col1 IN ('y', 'n'))
);

DESCRIBE tb2;

INSERT INTO tb2 VALUES
(null, 10, 'y');

SELECT * FROM tb2;

/*
ALTER:
테이블에 추가, 변경, 수정, 삭제할 때 ALTER 명령어 사용
*/

-- 컬럼 추가
ALTER TABLE tb2
-- ADD COLUMN col2 INT NOT NULL;
-- column 생략 가능
ADD col2 INT NOT NULL;

DESCRIBE tb2;

-- 컬럼 삭제
ALTER TABLE tb2
DROP col2;

DESCRIBE tb2;

-- 컬럼 수정
ALTER TABLE tb2
CHANGE fk change_fk INT NOT NULL;

DESCRIBE tb2;

-- MODIFY: 컬럼의 정의를 재정의 (PRIMARY KEY 제거)
ALTER TABLE tb2
MODIFY pk INT;

DESCRIBE tb2;

ALTER TABLE tb2
DROP PRIMARY KEY;

DESCRIBE tb2;

-- PRIAMRY KEY 추가
ALTER TABLE tb2
ADD PRIMARY KEY(pk);

DESCRIBE tb2;
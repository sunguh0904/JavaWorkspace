/*
CONSTRAINTS:
제약 조건으로 테이블에 데이터가 입력되거나 수정될 때 규칙 정의
*/

-- NOT NULL
CREATE TABLE IF NOT EXISTS user_notNull (
    user_no INT NOT NULL,
    user_id VARCHAR(255) NOT NULL,
    user_pwd VARCHAR(255) NOT NULL,
    user_name VARCHAR(255) NOT NULL,
    gender VARCHAR(3),
    phone VARCHAR(255) NOT NULL,
    email VARCHAR(255)
);

INSERT INTO user_notNull VALUES
(1, 'user01', 'pass01', '홍길동', '남', '010-1234-5678', 'hong123@gmail.com'),
(2, 'user02', 'pass02', '유관순', '여', '010-2345-6789', 'yoo123@gmail.com');

DELETE FROM user_notNull 
WHERE
    user_no = 3;
    
SET sql_safe_updates = 1;
    
SELECT 
    *
FROM
    user_notNull;
    
-- NOT NULL 제약조건 에러 발생(NULL 값 적용)
INSERT INTO user_notNull VALUES
(3, 'user03', NULL, '이순신', '남', '010-3456-7891', 'lee123@gmail.com');

-- UNIQUE: 중복 값을 허용하지 않는 제약조건
CREATE TABLE IF NOT EXISTS user_unique (
	-- 단일 유니크 생성
    user_no INT NOT NULL UNIQUE,
    user_id VARCHAR(255) NOT NULL,
    user_pwd VARCHAR(255) NOT NULL,
    user_name VARCHAR(255) NOT NULL,
    gender VARCHAR(3),
    phone VARCHAR(255) NOT NULL,
    email VARCHAR(255),
    -- 이렇게도 설정 가능
    UNIQUE(phone)
);

INSERT INTO user_unique VALUES
(1, 'user01', 'pass01', '홍길동', '남', '010-1234-5678', 'hong123@gmail.com'),
(2, 'user02', 'pass02', '유관순', '여', '010-2345-6789', 'yoo123@gmail.com');

SELECT 
    *
FROM
    user_unique;
    
-- UNIQUE 제약조건 에러 발생
INSERT INTO user_unique VALUES
(3, 'user02', 'pass03', '이순신', '남', '010-2345-6789', 'lee123@gmail.com');

/*
PRIMARY KEY:
테이블에 대한 식별자 역할 (한 컬럼씩 구분하는 역할)
PRIMARY KEY = NOT NULL + UNIQUE (제약조건의 의미)
한 테이블당 한 개만 설정할 수 있음
한 개 컬럼에 설정할 수도 있고, 여러 개의 컬럼을 묶어 설정할 수 있음
*/
CREATE TABLE IF NOT EXISTS user_primarykey (
    user_no INT PRIMARY KEY,
    user_id VARCHAR(255) NOT NULL,
    user_pwd VARCHAR(255) NOT NULL,
    user_name VARCHAR(255) NOT NULL,
    gender VARCHAR(3),
    phone VARCHAR(255) NOT NULL,
    email VARCHAR(255)
);

INSERT INTO user_primarykey VALUES
(1, 'user01', 'pass01', '홍길동', '남', '010-1234-5678', 'hong123@gmail.com'),
(2, 'user02', 'pass02', '유관순', '여', '010-2345-6789', 'yoo123@gmail.com');

SELECT 
    *
FROM
    user_primarykey;
    
-- PRIMARY KEY 제약조건 에러 발생 (NULL 값 적용)
INSERT INTO user_primarykey VALUES
(NULL, 'user03', 'pass03', '이순신', '남', '010-2345-6789', 'lee123@gmail.com');

INSERT INTO user_primarykey VALUES
(2, 'user03', 'pass03', '이순신', '남', '010-2345-6789', 'lee123@gmail.com');

/*
FOREIGN KEY:
참조(reference)된 다른 테이블에서 제공하는 값만 사용할 수 있음
FOREIGN KEY 제약조건에 의해 테이블 간의 관계가 형성, 제공되는 값 외에는 NULL을 사용할 수 있음
*/
CREATE TABLE IF NOT EXISTS user_grade (
    grade_code INT NOT NULL UNIQUE,
    grade_name VARCHAR(255) NOT NULL
);

INSERT INTO user_grade VALUES
(10, '일반회원'),
(20, '우수회원'),
(30, '특별회원');

SELECT 
    *
FROM
    user_grade;
    
CREATE TABLE IF NOT EXISTS user_foreignkey (
    user_no INT PRIMARY KEY,
    user_id VARCHAR(255) NOT NULL,
    user_pwd VARCHAR(255) NOT NULL,
    user_name VARCHAR(255) NOT NULL,
    gender VARCHAR(3),
    phone VARCHAR(255) NOT NULL,
    email VARCHAR(255),
    grade_code INT,
    FOREIGN KEY (grade_code)
        REFERENCES user_grade (grade_code)
);

INSERT INTO user_foreignkey VALUES
(1, 'user01', 'pass01', '홍길동', '남', '010-1234-5678', 'hong123@gmail.com', 10),
(2, 'user02', 'pass02', '유관순', '여', '010-2345-6789', 'yoo123@gmail.com', 20);

SELECT 
    *
FROM
    user_foreignkey;
    
DESCRIBE user_foreignkey;

-- 특정 테이블의 제약조건에 대한 정보 확인
SELECT * FROM information_schema.table_constraints WHERE table_name = 'user_foreignkey';

-- 제약 조건 삭제
ALTER TABLE user_foreignkey DROP FOREIGN KEY user_foreignkey_ibfk_1;

-- CHECK: 제약조건 위반할 시 허용하지 않는 제약조건
CREATE TABLE IF NOT EXISTS user_check (
    user_no INT AUTO_INCREMENT PRIMARY KEY,
    user_name VARCHAR(255) NOT NULL,
    gender VARCHAR(3) CHECK (gender IN ('남' , '여')),
    age INT CHECK (age >= 19)
);

INSERT INTO user_check VALUE
(NULL, '홍길동', '남', 25),
(NULL, '이순신', '남', 33);

SELECT 
    *
FROM
    user_check;
    
-- gender 컬럼 CHECK 제약조건 에러 발생
INSERT INTO user_check VALUES
(NULL, '아중근', '남성', 27);

-- age 컬럼 CHECK 제약조건 에러 발생
INSERT INTO user_check VALUES
(NULL, '유관순', '여', 17);

/*
DEFAULT:
컬럼에 NULL 대신 기본 값 사용
컬럼 타입이 date일때 current_date만 가능
컬럼 타입이 datetime일때 current_time과 current_timestamp, now() 모두 사용 가능
*/
CREATE TABLE IF NOT EXISTS tbl_country (
	country_code INT AUTO_INCREMENT PRIMARY KEY,
    country_name VARCHAR(255) DEFAULT '한국',
    pupulation VARCHAR(255) DEFAULT '0명',
    add_day DATE DEFAULT (CURRENT_DATE),
    add_time DATETIME DEFAULT (CURRENT_TIME)
);

SELECT 
    *
FROM
    tbl_country;
    
DESCRIBE tbl_country;

INSERT INTO tbl_country VALUES
(NULL, DEFAULT, DEFAULT, DEFAULT, DEFAULT);

DROP TABLE tbl_country;
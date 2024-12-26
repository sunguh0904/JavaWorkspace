/*
INDEX
*/

-- DECIMAL(사용가능한 숫자 길이, 소수점 아래 자리 길이)
CREATE TABLE phone (
	phone_code INT PRIMARY KEY,
    phone_name VARCHARACTER(100),
    phone_price DECIMAL(10, 2)
);

INSERT INTO phone VALUES
(1, 'GalaxyS24', 1200000),
(2, 'IPhone', 1400000),
(3, 'GalaxyZfold5', 2300000);

SELECT 
    *
FROM
    phone;
    
EXPLAIN SELECT 
    *
FROM
    phone
WHERE phone_name = 'GalaxyS24';

-- 인덱스 생성
CREATE INDEX idx_name
ON phone (phone_name);

SHOW INDEX FROM phone;

-- 복합 인덱스 생성 (두 개의 컬럼을 하나의 인덱스로 묶음)
CREATE INDEX idx_name_price
ON phone (phone_name, phone_price);

SELECT 
    *
FROM
    phone
WHERE
    phone_name = 'IPhone';
    
EXPLAIN SELECT 
    *
FROM
    phone
WHERE
    phone_name = 'IPhone';
    
/*
인덱스 최적화(재구성)
인덱스가 파편화되었거나, 데이터의 대부분이 변경된 경우 유용
인덱스의 성능을 개선하고, 디스크 공간을 더 효율적으로 사용하게 함
단, 재구서하는 동안 테이블은 잠겨있을 수 있음 (주의해서 수행)
ALTER TABLE 명령어를 사용해서 재구성
*/
ALTER TABLE phone DROP INDEX idx_name;
ALTER TABLE phone ADD INDEX idx_name(phone_name);

-- OPTIMIZE를 이용한 최적화
OPTIMIZE TABLE phone;

-- 인덱스를 삭제하는 방법: 인덱스이름 ON 테이블이름
DROP INDEX idx_name ON phone;

SHOW INDEX FROM phone;
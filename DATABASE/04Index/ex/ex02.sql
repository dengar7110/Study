-- sakila 데이터 베이스 사용

SELECT * FROM `customer`;

-- PK 를 통한 조회
-- customer_id 컬럼이 3인 행 조회 : const
EXPLAIN SELECT  * FROM `customer` WHERE `customer_id` = 3;

-- PK 를 범위로 조회
-- customer_id 컬럼이 10 이하인 행 조회 : range
EXPLAIN SELECT * FROM `customer` WHERE `customer_id` <= 10;

-- 인덱스가 없는 컬럼
-- active 가 1 인 행 조회 : all
EXPLAIN SELECT * FROM `customer` WHERE `active` = 1;

-- 인덱스가 있는 컬럼 조회
-- last_name 이 SMITH 인 행 조회 : ref
EXPLAIN SELECT * FROM `customer` WHERE `last_name` = 'SMITH';

-- 인덱스, 걸린 컬럼 LIKE 조건
EXPLAIN SELECT * FROM `customer` WHERE `last_name` LIKE 'A%'; -- range
EXPLAIN SELECT * FROM `customer` WHERE `last_name` LIKE '%A'; -- all
EXPLAIN SELECT * FROM `customer` WHERE `last_name` LIKE '%A%'; -- all

SELECT * FROM `film`;

SELECT * FROM `film` WHERE `length` < 50;

-- length 인덱스 추가
ALTER TABLE `film` ADD INDEX `idx_length` (`length`);

-- index 추가 후 실행 계획
EXPLAIN SELECT * FROM `film` WHERE `length` < 50; -- range
EXPLAIN SELECT * FROM `film` WHERE `length` < 100; -- all : 결과 비율이 많은 경우 full scan

-- index 지우기
ALTER TABLE `film` DROP INDEX `idx_length`;

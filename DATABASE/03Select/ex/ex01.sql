SELECT * FROM `city` LIMIT 50;

-- 범위 지정
-- 101 번째부터 50개 조회
SELECT * FROM `city` LIMIT 100, 50;

-- 포함된 문자열 조회
-- C로 시작하는 도시 이름 조회
SELECT * FROM `city` WHERE `city` LIKE 'C%';

-- C로 긑나는 도시 이름 조회
SELECT * FROM `city` WHERE `city` LIKE '%C';

-- C가 포함된 도시 이름 조회
SELECT * FROM `city` WHERE `city` LIKE '%C%';

-- 대소문자 구분
SELECT * FROM `city` WHERE `city` LIKE binary('%C%');

-- 정렬 하기
-- country_id 을 기준으로 정렬
SELECT * FROM `city` ORDER BY `country_id`;

-- 내림차순
SELECT * FROM `city` ORDER BY `country_id` DESC;

-- 도시 이름 내림차순 조회
SELECT * FROM `city` ORDER BY `city` DESC;

-- C 로  시작하는 도시를 country_id 로 오름차순으로 정렬해서 10개 조회
-- 필터링해서 행 줄이고, 정렬해서 잘라 낸다.
SELECT * FROM  `city` WHERE `city` LIKE '%C%' ORDER BY `county_id` LIMIT 10;

-- 컬럼의 값들을 조합해서 문자열로 조회
-- concat 함수
SELECT concat('Hello','World');

-- 도시이름 : .... 나라코드 : ....
SELECT concat('도시이름 : ', `city` , '나라코드 : ', `county_id`) AS `결과` FROM `city`;



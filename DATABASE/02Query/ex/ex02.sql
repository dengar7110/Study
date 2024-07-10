DESC `user`;

-- 조회하기

-- 모든 행 조회
SELECT * FROM `user`;

-- 특정컬럼 조회
SELECT `name`, `yyyymmdd`, `email` FROM `user`;

-- 컬럼명 별명 붙이기
SELECT `name` AS `이름`, `hobby` AS `취미`, `email` FROM `user`;

-- 중복제거
-- 동명 이인 제외 이름 조회
SELECT DISTINCT `name` FROM `user`;

-- 행 개수 조회
SELECT count(*) FROM `user`;
SELECT count(1) AS `count` FROM `user`;

-- 조건 조회
-- id 가 3인 행 조회
SELECT * FROM `user` WHERE `id` = 3;

-- 이름이 김바다인 사용자 생년월일 조회
SELECT `yyyymmdd` FROM `user` WHERE `name` = '김바다';

-- 이름이 김인규가 아닌 사용자 조회
SELECT * FROM `user` WHERE `name` != '김인규';

-- 날짜 시간 조건
-- 행 저장 시간이 2024-07-09 20:31:10 이후인 행 조회
SELECT * FROM `user` WHERE `createdAt` > '2024-07-09 20:31:10';

-- 이름이 김인규인 사용자의 행 개수 조회
SELECT count(*) FROM `user` WHERE `name` = '김인규';

-- 자기소개가 없는 행 조회 (introduce NULL 인 행 조회)
SELECT * FROM `user` WHERE `introduce` IS NULL;

-- 자기소개가 있는 행 조회 (introduce NULL 이 아닌 행 조회)
SELECT * FROM `user` WHERE `introduce` IS NOT NULL;

-- 조건이 여러가지인 경우

-- 이름이 김인규 이면서, 취미가 코딩인 행 조회
SELECT * FROM `user` WHERE `name` = '김인규' AND `hobby` = '코딩';

-- id가 3이거나 id가 4인 행 조회
SELECT * FROM `user` WHERE `id` = 3 OR `id` = 4;  

-- 하나의 컬럼에 대해서 일치하는 여러 값 조건
SELECT * FROM `user` WHERE `id` IN (3, 4, 1);

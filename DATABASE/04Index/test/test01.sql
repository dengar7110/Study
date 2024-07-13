-- 1. 실행 계획 확인
-- 아래와 같은 예시의 데이터의 조회가 가장 많이 이루어진다.

-- 이정재가 작성한 리뷰 리스트
-- 별점이 3.0 이하의 별점 중 이병헌이 작성한 리뷰 리스트 
-- 교촌치킨의 리뷰내용이 있는 리뷰 리스트
-- 가게별 별점 평균

-- 해당하는 쿼리를 작성해서 실행계획을 확인해 보세요.

EXPLAIN SELECT * FROM `review` WHERE `userName` = '이정재';
EXPLAIN SELECT * FROM `review` WHERE `point` <= 3.0 AND `userName` = '이병헌';
EXPLAIN SELECT * FROM `review` WHERE `storeName` = '교촌치킨' AND `review` IS NOT NULL;
EXPLAIN SELECT `storeName`, avg(`point`) FROM `review` GROUP BY `storeName`;


-- 2. index 설정
-- 해당 쿼리의 성능 향상을 위한 index 를 설정하고, 실행 계획을 통해서 결과를 확인해 보세요.
ALTER TABLE `review` ADD INDEX `idx_userName` (`userName`);
ALTER TABLE `review` ADD INDEX `idx_point` (`point`);
ALTER TABLE `review` DROP INDEX `idx_point`;
ALTER TABLE `review` ADD INDEX `idx_storeName` (`storeName`);

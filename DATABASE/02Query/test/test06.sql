-- 1. 데이터 삭제
-- id가 22인 리뷰 행을 삭제하세요.

SELECT * FROM `review`;

SELECT * FROM `review` WHERE `id` = 22; 

DELETE FROM `review` WHERE `id` = 22;

-- 2. 조건 삭제
-- 이정재의 리뷰중 2점 미만의 리뷰를 삭제하세요.

SELECT `review` FROM `review` WHERE `userName` = '이정재' AND `point` < 2;

DELETE `review` FROM `review` WHERE `userName` = '이정재' AND `point` < 2;

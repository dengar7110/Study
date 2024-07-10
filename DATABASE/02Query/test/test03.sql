-- 1. 전체 성적 출력
-- SELECT 쿼리를 이용해서 전체 행을 조회하세요.
-- 결과 행 개수

-- 27

SELECT * FROM `score`;

-- 2. 컬럼명 붙이기
-- 아래와 같이 컬럼명을 변경해서 전체 행을 조회하세요.
-- 이름	과목	성적
-- 유재석	국어	80
-- 유재석	영어	80
-- 유재석	수학	80
-- 조세호	국어	80

-- 결과 행 개수

-- 27

SELECT `name`AS `이름`, `subject` AS `과목`, `score` AS `성적` FROM `score`;

-- 3. 특정 학생 성적
-- 유재석의 성적 정보를 조회하세요.
-- 연도, 학기, 고사이름, 과목, 성적 정보만 조회하세요.
-- year	semester	term	subject	score
-- 2021	1	중간고사	국어	80
-- 2021	1	중간고사	영어	90

-- 결과 행 개수

-- 9

SELECT `year`, `semester`, `term`, `subject`, `score` FROM `score` WHERE `name` = '유재석';

-- 4. 연도 조건
-- 2020년 이상인 연도의 성적 정보의 전체 필드를 조회하세요.
-- 결과 행 개수

-- 18

SELECT * FROM `score` WHERE `year` >= 2020;

-- 5. 복합 조건
-- 2020년 1학기 중간고사 성적 정보의 전체 필드를 조회하세요.
-- 결과 행 개수

-- 9

SELECT * FROM `score` WHERE `year` = 2020 AND `semester` = 1 AND `term` = '중간고사';

-- 6. 개수 세기
-- 유재석의 90점 이상 성적의 개수를 조회하세요.
-- 실행 결과

-- 7

SELECT count(*) FROM `score` WHERE `name` = '유재석' AND `score` >= 90;

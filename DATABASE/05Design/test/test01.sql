-- 1. 성적 테이블 나누기
-- 성적관리 테이블에 학생의 이름정보만 포함되어 있다.
-- 동명이인을 구분하고, 학생의 추가 정보를 저장 하려고 하면, 아래와 같이 같은 정보가 누적해서 저장된다.
-- phoneNumber - 학생 전화 번호
-- email - 학생 이메일 주소
-- dreamJob - 학생 장래희망
-- id	name	phoneNumber	email	dreamJob	year	semester	term	subject	score
-- 1	유재석	01000001111	mc_u@naver.com	프로그래머	2020	1	중간고사	국어	80
-- 2	유재석	01000001111	mc_u@naver.com	프로그래머	2020	1	중간고사	영어	95
-- 3	유재석	01000001111	mc_u@naver.com	프로그래머	2020	1	중간고사	수학	90
-- 4	조세호	01011110000	mrjo@gmail.com	모델	2020	1	중간고사	국어	85
-- 5	조세호	01011110000	mrjo@gmail.com	모델	2020	1	중간고사	영어	90
-- 6	조세호	01011110000	mrjo@gmail.com	모델	2020	1	중간고사	수학	70
-- 테이블 관리가 좀더 효율적이도록 테이블을 나누어서 설계하세요.

CREATE TABLE `student` (
	`id` INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `name` VARCHAR(32) NOT NULL,
    `phoneNumber` VARCHAR(16) NOT NULL,
    `email` VARCHAR(16) NOT NULL,
    `dreamJob` VARCHAR(16) NOT NULL,
    `createdAt` TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    `updatedAt` TIMESTAMP DEFAULT CURRENT_TIMESTAMP
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


CREATE TABLE `new_score` (
	`id` INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `studentId` INT NOT NULL, -- 외래키
    `year` INT NOT NULL,
    `semester` TINYINT NOT NULL,
    `term` CHAR(4) NOT NULL,
    `subject` VARCHAR(16) NOT NULL,
    `score` TINYINT NOT NULL,
    `createdAt` TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
	`updatedAt` TIMESTAMP DEFAULT CURRENT_TIMESTAMP
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

DESC `student`;
DESC `new_score`;

-- 2. Insert
-- 위에 표에 표시된 데이터를 나누어진 테이블에 저장하세요.

INSERT INTO `student`
(`name`, `phoneNumber`, `email`, `dreamJob`)
VALUES
('유재석', '01000001111', 'mc_u@naver.com', '프로그래머'),
('조세호', '01011110000', 'mrjo@gmail.com', '모델');

INSERT INTO `new_score`
(`studentId`, `year`, `semester`, `term`, `subject`, `score`)
VALUES
(1 ,'2020', 1, '중간고사', '국어', 80),
(1 ,'2020', 1, '중간고사', '영어', 95),
(1 ,'2020', 1, '중간고사', '수학', 90),
(2 ,'2020', 1, '중간고사', '국어', 85),
(2 ,'2020', 1, '중간고사', '영어', 90),
(2 ,'2020', 1, '중간고사', '수학', 70);

SELECT * FROM `student`;
SELECT * FROM `new_score`;

-- 3. 성적 출력
-- 조세호의 성적을 아래와 같은 형태로 조회하세요.
-- year	 semester term  subject	  score
-- 2020		1	 중간고사   국어       85
-- 2020		1	 중간고사   영어       90
-- 2020		1	 중간고사   수학       70

-- 조세호의 primary key 값 조회
SELECT * FROM `student` WHERE `name` = '조세호';
-- studentId 값이 2인 행 조회
SELECT `year`, `semester`, `term`, `subject`, `score` FROM `new_score` WHERE `studentId` = 2;


SELECT * FROM `user`;

-- 독서가 취미인 사용자 조회
-- LIKE 쿼리는 성능의 문제
SELECT * FROM `user` WHERE `hobby` LIKE '%독서%';

-- 이름, 생년월일, 자기 소개, 이메일
CREATE TABLE `new_user` (
	`id` INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `name` VARCHAR(16) NOT NULL,
    `yyyymmdd` CHAR(8) NOT NULL,
    `email` VARCHAR(32) NOT NULL,
    `introduce` TEXT,
    `createdAt` TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    `updatedAt` TIMESTAMP DEFAULT CURRENT_TIMESTAMP
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- 취미
CREATE TABLE `hobby` (
	`id` INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `userId` INT NOT NULL,  -- 외래키
    `hobby` VARCHAR(16) NOT NULL,
    `createdAt` TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    `updatedAt` TIMESTAMP DEFAULT CURRENT_TIMESTAMP 
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `new_user`
(`name`, `yyyymmdd`, `email`, `introduce`)
VALUES
('김인규', '19991108', 'lecture@hagulu.com', '안녕하세요 제 소개 입니다'),
('김바다', '20190104', 'bada@gmail.com', '나랑 놀아줄 집사 모집');

SELECT * FROM `new_user`;
-- 김인규 - 독서, 노래, 영화
-- 김바다 - 사냥하기,물먹기

INSERT INTO `hobby`
(`userId`, `hobby`)
VALUES
(1, '독서'),
(1, '노래'),
(1, '영화'),
(2, '사냥하기'),
(2, '물먹기');

SELECT * FROM `hobby`;

-- 취미가 독서인 사용자 이름, 이메일 조회
SELECT * FROM `hobby` WHERE `hobby` = '독서';
SELECT `name`, `email` FROM `new_user` WHERE `id` = 1;



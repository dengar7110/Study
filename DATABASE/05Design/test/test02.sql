-- 1. 리뷰 테이블 나누기
-- 리뷰테이블에 가게의 이름만 저장되어 있다.
-- 가게 정보를 추가로 저장 하면 아래와 같이 저장이 된다.
-- id	store	phoneNumber	address	businessNumber	introduce	menu	userName	point	review
-- 1	교촌치킨	02-000-0000	서울시 서초구	111-111-1111	항상 맛있는 닭을 선사 합니다.	오리지날 콤보	이병헌	4.5	콤보는 항상 진리입니다.
-- 2	BHC	02-111-0000	서울시 서초구	111-222-1111	전지현씨 BHC	핫후라이드	전지현	5	NULL
-- 3	BHC	02-111-0000	서울시 서초구	111-222-1111	전지현씨 BHC	뿌링클	이정재	3.5	내가 뿌링끌 상인가?
-- 4	버거킹	02-222-1111	서울시 서초구	333-222-12222	맥도날드 가지말고 여기로와요	와퍼세트	이병헌	4.0	패티 너무 좋아요
-- 5	교촌치킨	02-000-0000	서울시 서초구	111-111-1111	항상 맛있는 닭을 선사 합니다.	오리지날 콤보	맛있으면짖는개	4.5	왈왈왈!! 왈왈!
-- 6	BHC	02-111-0000	서울시 서초구	111-222-1111	전지현씨 BHC	뿌링클	전지현	5	NULL
-- 추가 저장 정보

-- 가게 전화 번호 (phoneNumber)
-- 가게 주소 (address)
-- 가게 사업자번호 (businessNumber)
-- 가게 소개(introduce)
-- 중복데이터를 줄이고 효율적인 방법으로 테이블을 나누어서 설계하세요.

-- 가게 정보
CREATE TABLE `store` (
	`id` INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `store` VARCHAR(32) NOT NULL,
    `phoneNumber` VARCHAR(16) NOT NULL,
    `address` VARCHAR(64) NOT NULL,
    `businessNumber` VARCHAR(32) NOT NULL,
    `introduce` TEXT,
    `createdAt` TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    `updatedAt` TIMESTAMP DEFAULT CURRENT_TIMESTAMP
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

DROP TABLE `new_review`;

-- 리뷰 정보
CREATE TABLE `new_review` (
	`id` INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `storeId` INT NOT NULL,
    `menu` VARCHAR(32) NOT NULL,
    `userName` VARCHAR(32) NOT NULL,
    `point` DECIMAL(2, 1) DEFAULT 3.5,
	`review` VARCHAR(256),
	`createdAt` TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    `updatedAt` TIMESTAMP DEFAULT CURRENT_TIMESTAMP
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

DROP TABLE `new_review`;

DESC `store`;
DESC `new_review`;


-- 2. Insert
-- 위에 표에 표시된 데이터를 나누어진 테이블에 저장하세요.

INSERT INTO `store`
(`store`, `phoneNumber`, `address`, `businessNumber`, `introduce`)
VALUES
('교촌치킨', '02-000--0000', '서울시 서초구', '111-111-1111', '항상 맛있는 닭을 선사 합니다.'),
('BHC', '02-111-0000', '서울시 서초구', '111-222-1111', '전지현씨 BHC'),
('버거킹', '02-222-1111', '서울시 서초구', '333-222-12222', '맥도날드 가지말고 여기로와요');

SELECT * FROM `store`;

INSERT INTO `new_review`
(`storeId`, `menu`, `userName`, `point`, `review`)
VALUES
(1 ,'오리지날 콤보', '이병헌', 4.5, '콤보는 항상 진리입니다.'),
(2, '핫후라이드', '전지현', 5, NULL),
(2, '뿌링클', '이정재', 3.5, '내가 뿌링클 상인가?'),
(3, '와퍼세트', '이병헌', 4.0, '패티가 너무 좋아요'),
(1, '오리지날 콤보', '맛있으면 짖는 개', 4.5, '왈왈왈!! 왈왈!'),
(2, '뿌링클', '전지현', 5, NULL);

SELECT * FROM `new_review`;

-- 3. 리뷰 출력
-- 교촌치킨의 리뷰 리스트를 아래와 같은 형태로 조회하세요.
-- menu	userName	point	review
-- 오리지날 콤보	이병헌	4.5	콤보는 항상 진리입니다.
-- 오리지날 콤보	맛있으면짖는개	4.5	왈왈왈!! 왈왈!

SELECT * FROM `store` WHERE `name` = '교촌치킨';
SELECT `menu`, `userName`, `point`, `review` FROM `new_review` WHERE `storeId` = 1; 

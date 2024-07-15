-- 1. 부동산 매물 테이블 만들기
-- 공인중개사에서 등록한 부동산(real estate) 매물을 관리하는 테이블들을 설계하고 만드세요.
-- 여러개의 공인중개사 (realtor) 사무실이 있고, 공인중개사에서 등록한 매물정보들이 저장된다.
-- 저장되어야할 컬럼은 아래와 같다.
-- 공인중개 사무실 이름 (office)
-- 공인중개 사무실 연락처 (phoneNumber)
-- 공인중개 사무실 주소(address)
-- 공인증개 등급 (grade)
-- '프리미엄중개사' 또는 '안심중개사' 또는 '일반중개사'
-- 매물 주소(address)
-- 매물 면적(area)
-- 평방 미터
-- 거래 종류 (type)
-- '매매' 또는 '전세' 또는 '월세'
-- 거래 가격 (price)
-- 단위 만원
-- 매매인경우 거래 가격 의미
-- 전세 혹은 월세 인경우 보증금을 의미
-- 월세 (rentPrice)
-- 단위 만원
-- 매매 또는 전세인경우 값 없음

CREATE TABLE `realtor` (
	`id` INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `office` VARCHAR(16) NOT NULL,
    `phoneNumber` VARCHAR(16) NOT NULL,
    `address` VARCHAR(64) NOT NULL,
    `grade` VARCHAR(8) NOT NULL,
    `createdAt` TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    `updatedAt` TIMESTAMP DEFAULT CURRENT_TIMESTAMP
    )ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE `real_estate` (
	`id` INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `realtorId` INT NOT NULL,
    `address` VARCHAR(64) NOT NULL,
    `area` INT NOT NULL,
    `type` CHAR(2) NOT NULL,
    `price` INT NOT NULL,
    `rentPrice` INT,
	`createdAt` TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    `updatedAt` TIMESTAMP DEFAULT CURRENT_TIMESTAMP
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

DROP TABLE `realtor`;
DROP TABLE `real_estate`;

-- 2. 정보 입력
-- 생성한 테이블에 아래 정보를 적절히 저장하세요.
-- id	office	phoneNumber	address	grade	address	area	type	price	rentPrice
-- 1	황금 부동산	02-300-2000	서울시 서초구	안심중개사	레미얀 레이크 아파트 301동 905호	84	전세	40000	NULL
-- 2	대박 공인중개사	02-000-7777	서울시 동작구	일반중개사	레알편한세상 시티 505동 101호	110	매매	120000	NULL
-- 3	황금 부동산	02-300-2000	서울시 서초구	안심중개사	롱데캐슬 101동 402호	87	월세	20000	200
-- 4	황금 부동산	02-300-2000	서울시 서초구	안심중개사	슼뷰 오피스텔 1210호	55	월세	10000	100
-- 5	대박 공인중개사	02-000-7777	서울시 동작구	일반중개사	푸르지용 리버 203동 804호	123	매매	170000	NULL
	
INSERT INTO `realtor` 
(`office`, `phoneNumber`, `address`, `grade`)
VALUES
('황금부동산', '02-300-2000', '서울시 서초구', '안심중개사'),
('대박 공인중개사', '02-000-7777', '서울시 동작구', '일반중개사');

SELECT * FROM `realtor`;

INSERT INTO `real_estate`
(`realtorId`, `address`, `area`, `type`, `price`, `rentPrice`)
VALUES
(1, '레미얀 레이크 아파트 301동 905호', 84, '전세', 40000, NULL),
(2, '레알편한세상 시티 505동 101호', 110, '매매', 120000, NULL),
(1, '롱데캐슬 101동 402호', 87, '월세', 20000, 200),
(1, '슼뷰 오피스텔 1210호', 55, '월세', 10000, 100),
(2, '푸르지용 리버 203동 804호', 123, '매매', 170000, NULL);

SELECT * FROM `real_estate`;

-- 3. 매물 찾기
-- 황금 부동산의 월세 매물의 아래 정보를 조회하세요.
-- 매물 주소, 보증금, 월세

SELECT * FROM `realtor` WHERE `office` = '황금부동산';
SELECT * FROM `real_estate` WHERE `realtorId` = 1 AND `type` = '월세';

-- 4. 옵션 리스트
-- 매물의 옵션정보를 저장하는 테이블을 만드세요
-- 옵션 종류
-- 에이컨, 세탁기, 냉장고, 옷장
-- 매물 정보와 연결되도록 테이블을 설계하세요.

-- 옵션 테이블
-- 매물에 대한 외래키
-- 에어컨, 세탁기, 냉장고, 옷장, 식기세척기, 스타일러, 가스레인지, 전자레인지
CREATE TABLE `option` (
	`id` INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `realEstateId` INT NOT NULL,
    `option` VARCHAR(8) NOT NULL,	-- 세탁기
	`createdAt` TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    `updatedAt` TIMESTAMP DEFAULT CURRENT_TIMESTAMP
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

DROP TABLE `option`;

INSERT INTO `option` 
(`realEstateId`, `option`)
VALUES
(5, '에어컨'),
(5, '냉장고'),
(5, '가스레인지'),
(3, '세탁기'),
(3, '에어컨');


-- 홍당무 마켓
-- 중고거래 서비스
-- 제목, 가격, 제품 설명, 제품 사진, 작성자 닉네임, 작성자 매너 온도, 판매자 프로필 사진

-- 판매자 정보
-- 닉네임, 매너온도(0 ~ 99.9), 프로필 사진
CREATE TABLE `seller` (
	`id` INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `nickname` VARCHAR(32) NOT NULL,
    `temperature` DECIMAL(3, 1) DEFAULT 36.5,
    `profileImage` VARCHAR(128),
    `createdAt` TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    `updatedAt` TIMESTAMP DEFAULT CURRENT_TIMESTAMP
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- 제품 정보
-- 제목, 가격, 설명 사진
CREATE TABLE `used_goods` (
	`id` INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `sellerId` INT NOT NULL,
    `title` VARCHAR(64) NOT NULL,
    `price` INT NOT NULL,
    `description` TEXT NOT NULL,
    `image` VARCHAR(128),
	`createdAt` TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    `updatedAt` TIMESTAMP DEFAULT CURRENT_TIMESTAMP
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

DESC `seller`;
DESC `used_goods`;

INSERT INTO `seller`
(`nickname`, `temperature`, `profileImage`)
VALUES
('마로비', 36.6, 'https://cdn.pixabay.com/photo/2024/04/17/17/02/box-8702500_640.jpg'),
('아메리카노', 48.2, NULL),
('동네주민', 29.0, 'https://cdn.pixabay.com/photo/2022/05/16/11/01/pugs-7200102_640.png'),
('네고왕', 36.5, NULL),
('하구루', 36.5, 'https://cdn.pixabay.com/photo/2024/01/13/00/46/raccoon-8504925_640.png');

SELECT * FROM `seller`;

INSERT INTO `used_goods`
(`sellerId`, `title`, `price`, `description`, `image`)
VALUES
(5, '플스5 팝니다', 300000, '쿨거래 하실분 연락주세요!', 'https://cdn.pixabay.com/photo/2020/10/15/07/45/playstation-5656248_640.jpg'),
(5, '원피스 팝니다', 200000, '살이 빠져서 사이즈가 안맞아서 팝니다', 'https://cdn.pixabay.com/photo/2015/06/10/13/23/clothesline-804812_640.jpg'),
(3, '후라다 여성지갑 팝니다', 450000, '오늘 선물하려고 샀는데 헤어졌어요', 'https://cdn.pixabay.com/photo/2015/01/01/20/48/advertising-586130_640.jpg'),
(2, '바퀴벌레 잡아주세요ㅠ', 5000, '제발 좀 잡아주세요 날아 다녀요 ㅠㅠ', NULL);

SELECT * FROM `used_goods`;

-- 하구루 닉네임 사용자의 등록 상품 조회
SELECT * FROM `seller` WHERE `nickname` = '하구루';

SELECT * FROM `used_goods` WHERE `sellerId` = 5;



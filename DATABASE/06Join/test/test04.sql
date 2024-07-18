-- 1. 테이블 생성
-- 위 데이터를 기반으로 테이블을 설계하고 생성하세요.
-- 중복되는 데이터가 저장 되지 않도록 table을 적절히 나누어서 설계 하세요.
-- hint ) 가수 (singer), 앨범 (album), 노래 (music) 테이블로 나누세요.
-- 자동으로 증가하는 id를 만드세요.
-- 생성시간과, 업데이트 시간을 관리하는 컬럼을 포함하세요.

-- title , playTime, lyricist, composer
CREATE TABLE `music` (
	`id` INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `albumId` INT NOT NULL,
    `title` VARCHAR(64) NOT NULL,
    `playTime` INT NOT NULL,
    `lyricist` VARCHAR(64) NOT NULL,
    `composer` VARCHAR(64) NOT NULL,
    `createdAt` TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    `updatedAt` TIMESTAMP DEFAULT CURRENT_TIMESTAMP
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- name, debut, agency
CREATE TABLE `singer` (
	`id` INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	`name` VARCHAR(64) NOT NULL,
    `debut`	INT NOT NULL,
    `agency` VARCHAR(64) NOT NULL,
	`createdAt` TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    `updatedAt` TIMESTAMP DEFAULT CURRENT_TIMESTAMP
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- title, releaseDate, tracks
CREATE TABLE `album` (
	`id` INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `singerId` INT NOT NULL,
	`title` VARCHAR(64) NOT NULL,
    `releaseDate` TIMESTAMP NOT NULL,
    `tracks` INT NOT NULL,
	`createdAt` TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    `updatedAt` TIMESTAMP DEFAULT CURRENT_TIMESTAMP
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- 2. 데이터 저장
-- 생성된 테이블에 위 데이터를 모두 insert 하세요.
INSERT INTO `singer` 
(`name`, `debut`, `agency`)
VALUES
('성시경', 2000, '에스케이재원'),
('AKMU', 2014, 'YG엔터테인먼트'),
('아이유', 2008, '이담엔터테인먼트');

INSERT INTO `music` 
(`albumId`, `title`, `playTime`, `lyricist`, `composer`)
VALUES
(1, '거리에서', 279, '윤종신', '윤종신'),
(1, '그리운 날엔', 250, '심재희', '김형석'),
(1, '바람, 그대', 250, '이미나', '하림'),
(2, '여기 내 맘속에', 250, '이미나', '유희열'),
(2, '안녕 나의 사랑', 257, '유희열', '성시경'),
(3, '어떻게 이별까지 사랑하겠어, 널 사랑하는 거지', 290, '이찬혁', '이찬혁'),
(4, 'DINOSAUR', 240, '이찬혁', '이찬혁'),
(4, 'MY DARLING	', 225, '이찬혁', '이찬혁'),
(5, 'Blueming', 217, '아이유', '이종훈'),
(5, 'Love poem', 258, '아이유', '이종훈'),
(6, '밤편지', 253, '아이유', '김희원'),
(6, '팔레트', 217, '아이유', '아이유');

INSERT INTO `album`
(`singerId`, `title`, `releaseDate`, `tracks`)
VALUES
(1, 'The Ballads', '2006-10-10', 16),
(1, '여기, 내 맘속에...', '2008-06-12', 11),
(2, '항해', '2019-09-25', 10),
(2, 'SUMMER EPISODE', '2017-07-20', 4),
(3, 'Love poem', '2019-11-18', 6),
(3, 'Palette', '2017-04-21', 6);

DROP TABLE `music`;
DROP TABLE `singer`;
DROP TABLE `album`;

-- 3. 발매일 조건
-- 2010년대에 발매된 노래를 출력하세요.
-- 출력 컬럼은 아래 표를 참고 하세요.
-- 출력 결과

-- title	composer	title
-- 어떻게 이별까지 사랑하겠어, 널 사랑하는 거지	이찬혁	항해
-- DINOSAUR	이찬혁	SUMMER EPISODE
-- MY DARLING	이찬혁	SUMMER EPISODE
-- Blueming	이종훈	Love poem
-- Love poem	이종훈	Love poem
-- 밤편지	김희원	Palette
-- 팔레트	아이유	Palette

SELECT music.title, music.composer, album.title 
FROM `music`
JOIN `album` ON music.albumId = album.Id
WHERE album.releaseDate > '2010-01-01' AND album.releaseDate < '2020-01-01';

-- 4. 가수별 총 노래 수
-- 가수별 노래 개수를 출력하세요.
-- 2005년 이전 데뷔 가수는 제외 하세요.
-- 노래 수 내림 차순으로 출력하세요.
-- 출력 컬럼은 아래 표를 참고 하세요.
-- name	debut	count
-- 아이유	2008	4
-- AKMU	2014	3

SELECT singer.name, singer.debut, count(*) `music`
FROM `singer` 
JOIN `album` ON singer.id = album.singerId
JOIN `music` ON album.id = music.albumId
WHERE singer.debut > 2005
GROUP BY singer.name, singer.debut
ORDER BY `music` DESC;


-- 5. AKMU 노래
-- AKMU 노래를 모두 출력하세요.
-- 출력 컬럼은 아래 표를 참고 하세요.
-- name	title	playTime	album title
-- AKMU	어떻게 이별까지 사랑하겠어, 널 사랑하는 거지	290	항해
-- AKMU	DINOSAUR	240	SUMMER EPISODE
-- AKMU	MY DARLING	225	SUMMER EPISODE

SELECT singer.name, music.title, music.playTime, album.title AS `album title` 
FROM `singer`
JOIN `album` ON singer.id = album.singerId
JOIN `music` ON album.id = music.albumId
WHERE singer.name = 'AKMU';

-- 6. 기간내의 노래
-- 2008년 부터 10년 동안 발매된 노래를 출력하세요.
-- 단 재생시간이 4분 이상인 노래만 출력하세요.
-- 출력 컬럼은 아래 표를 참고 하세요.
-- title	name	playTime	album title
-- 여기 내 맘속에	성시경	250	여기, 내 맘속에...
-- 안녕 내 사랑	성시경	257	여기, 내 맘속에...
-- DINOSAUR	AKMU	240	SUMMER EPISODE
-- 밤편지	아이유	253	Palette

SELECT music.title, singer.name, music.playTime, album.title AS `album title`
FROM `singer` 
JOIN `album` ON singer.id = album.singerId
JOIN `music` ON album.id = music.albumId
WHERE album.releaseDate >= '2008-01-01' 
	AND album.releaseDate < '2019-01-01'
	AND music.playTime >= 240;

-- 7. 앨범별 총 재생 시간
-- 앨범별 총 재생시간을 출력하세요.
-- 재생시간이 470초과 인 것만 출력하세요.
-- 재생시간 오름 차순으로 출력하세요.
-- 출력 컬럼은 아래 표를 참고 하세요.
-- name	title	tracks	playTime
-- 아이유	Love poem	6	475
-- 성시경	여기, 내맘속에...	11	507
-- 성시경	The Ballads	16	779

SELECT singer.name, album.title, album.tracks, sum(music.playTime) AS `playTime` 
FROM `singer`
JOIN `album` ON singer.id = album.singerId
JOIN `music` ON album.id = music.albumId
GROUP BY singer.name, album.title, album.tracks
HAVING `playTime` > 470
ORDER BY `playTime`;




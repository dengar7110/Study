-- 1. 테이블 생성
-- 위 데이터를 기반으로 테이블을 설계하고 생성하세요.
-- 중복되는 데이터가 저장 되지 않도록 table을 적절히 나누어서 설계 하세요.
-- 자동으로 증가하는 id를 만드세요.
-- 생성시간과, 업데이트 시간을 관리하는 컬럼을 포함하세요.

CREATE TABLE `company` (
	`id` INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `name` VARCHAR(32) NOT NULL,
    `business` VARCHAR(32) NOT NULL,
    `scale` VARCHAR(8) NOT NULL,
    `headcount` INT NOT NULL,
    `createdAt` TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    `updatedAt` TIMESTAMP DEFAULT CURRENT_TIMESTAMP
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

DROP TABLE `recruit`;

CREATE TABLE `recruit` (
	`id` INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	`companyId` INT NOT NULL,
    `position` VARCHAR(64) NOT NULL,
    `responsibilities` VARCHAR(128) NOT NULL,
    `qualification` TEXT NOT NULL,
    `type` VARCHAR(8) NOT NULL,
    `region` VARCHAR(16) NOT NULL,
    `salary` INT NOT NULL,
    `deadline` TIMESTAMP NOT NULL,
	`createdAt` TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    `updatedAt` TIMESTAMP DEFAULT CURRENT_TIMESTAMP
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- 2. 데이터 저장
-- 생성된 테이블에 위 데이터를 모두 insert 하세요.

INSERT INTO `company`
(`name`, `business`, `scale`, `headcount`)
VALUES
('Cacao', '인터넷 포털', '대기업', 2848),
('Rine', '모바일 무선', '대기업', 1138),
('NG소프트', '컨텐츠 게임	', '중견기업', 4430),
('쿠퐁', '쇼핑몰', '중견기업', 5350),
('Naber', '인터넷 포털', '대기업', 4048),
('우와한형제들', '소프트웨어 솔루션', '중견기업', 926);


INSERT INTO `recruit` 
(`companyId`, `position`, `responsibilities`, `qualification`, `type`, `region`, `salary`, `deadline`)
VALUES
(1, '안드로이드 개발자', '메신저 앱 개발', 'kotlin 경력 3년 이상', '정규직', '성남시 분당구', 7300, '2026-03-13'),
(1, '안드로이드 개발자', '쇼핑 서비스 개발', 'kotlin 경력 3년 이상', '정규직', '성남시 분당구', 6300, '2026-04-04'),
(1, '웹 back-end 개발자', '이모티콘 샵 API 서버 개발', 'spring 경력 3년 이상', '정규직', '성남시 분당구', 7000, '2026-03-28'),
(2, '아이폰 앱 개발자', '메신져 앱 개발', 'RxSwift 개발 경력 3년 이상', '정규직', '성남시 분당구', 7600, '2026-04-01'),
(2, '웹 back-end 개발자', 'Rine 포스팅 기능 API 개발', 'spring 개발 경력 3년 이상', '정규직', '성남시 분당구', 6600, '2026-03-29'),
(3, '게임 개발자', '게임 개발', 'Unreal Engine 개발 5년 이상	정규직', '정규직', '성남시 분당구', 8400, '2026-04-20'),
(3, '모바일 게임 개발자', '리뉘쥐 모바일 게임 개발', 'Unreal Engine 개발 가능자', '계약직', '성남시 분당구', 8500, '2026-04-05'),
(4, '웹 back-end 개발자', '오픈마켓 웹 개발', 'spring 개발 가능자', '정규직', '서울시 송파구', 8100, '2026-05-02'),
(4, '웹 front-end 개발자', '오픈마켓 웹 개발', 'react 개발 가능자', '계약직', '서울시 송파구', 9000, '2026-04-10'),
(5, '웹 back-end 개발자', 'Naber 메일 기능 개발', 'spring 개발 경력 5년 이상', '계약직', '성남시 분당구', 9800, '2026-04-20'),
(5, '동영상 플레이어 개발자', '네이버TV 플레이어 개발', '동영상 코덱 기술 개발가능자', '정규직', '성남시 분당구', 7800, '2026-05-01'),
(5, '웹 front-end 개발자', 'Now 웹 개발', 'Vue.js 개발 가능자', '정규직', '성남시 분당구', 7000, '2026-04-15'),
(6, '웹 back-end 개발자', '인트라넷 개발	spring', 'spring 개발경력 3년이상', '계약직', '서울시 송파구', 8800, '2026-04-15'),
(6, '웹 back-end 개발자', '라이브 API 개발', 'spring 개발경력 3년이상', '정규직', '서울시 송파구', 8200, '2026-05-12');

select * from `company`;
select * from `recruit`;

TRUNCATE TABLE `recruit`;

-- 3. 연봉순 정렬
-- 연봉을 기준으로 내림 차순으로 정렬해서 조회하세요.
-- 조회 컬럼은 아래 표를 참고 하세요.
-- 조회 결과

SELECT company.name, recruit.position, recruit.qualification, recruit.type, recruit.salary
FROM `company` JOIN `recruit`
ON company.id = recruit.companyId
ORDER BY recruit.salary DESC;




-- name	position	qualification	type	 salary
-- Naber	웹 back-end 개발자	spring 개발 경력 5년 이상	계약직	9800
-- 쿠퐁	웹 front-end 개발자	react 개발 가능자	계약직	9000
-- 우와한형제들	웹 back-end 개발자	spring 개발경력 3년이상	계약직	8800
-- NG소프트	모바일 게임 개발자	Unreal Engine 개발 가능자	계약직	8500
-- NG소프트	게임 개발자	Unreal Engine 개발 5년 이상	정규직	8400
-- .		
-- .		
-- 4. 복합 조건
-- 대기업 정규직 연봉 7000만원 이상의 공고를 연봉이 높은 순으로 3개만 조회하세요.
-- 조회 결과

-- name	scale	position	qualification	type	salary
-- Naber	대기업	동영상 플레이어 개발자	동영상 코덱 기술 개발 가능자	정규직	7800
-- Rine	대기업	아이폰 앱 개발자	RxSwift 개발 결력 3년 이상	정규직	7600
-- Cacao	대기업	안드로이드 개발자	kotlin 경력 3년 이상	정규직	7300

SELECT company.name, company.scale, recruit.position, recruit.qualification, recruit.type, recruit.salary
FROM `company` 
JOIN `recruit` ON company.id = recruit.companyId
WHERE company.scale = '대기업' and recruit.type= '정규직' AND recruit.salary >= 7000
ORDER BY recruit.salary DESC
LIMIT 3; 


-- 5. 기업별 공고 수
-- 조회 결과

-- 마감일이 2026년 5월 이전인, 기업별 정규직 공고 수를 조회하세요.
-- 공고 수 내림 차순으로 조회하세요.
-- name	count	business	headcount
-- Cacao	3	인터넷 포털	2848
-- Rine	2	무선 모바일	1138
-- NG소프트	1	컨텐츠 게임	4430
-- Naber	1	인터넷 포털	4048

SELECT company.name, count(*) AS `count`, company.business, company.headcount
FROM `company`JOIN `recruit`
ON company.id = recruit.companyId
WHERE recruit.deadline < '2026-05-01 00:00:00' AND recruit.type = '정규직'
GROUP BY company.id
ORDER BY `count` DESC;


-- 6. 근무형태 별 평균 연봉
-- 중견기업의 근무 형태별 평균연봉을 구하여 조회하세요.
-- 조회 결과

-- type	salery
-- 정규직	8233.3334
-- 계약직	8766.6667

SELECT recruit.type, avg(recruit.salary)
FROM `company` JOIN `recruit`
ON company.id = recruit.companyId
WHERE company.scale = '중견기업'
GROUP BY recruit.type;


-- 7. 기업별 평균 연봉
-- 기업별 평균 연봉을 구하세요.
-- 단, 근무 지역이 성남시 분당구 이고 평균 연봉이 7000 이상만 조회하세요.
-- 사원수를 기준으로 내림차순으로 조회하세요.
-- 조회 결과

-- name	salery	scale	headcount
-- NG소프트	8450.000	중견기업	4430
-- Naber	8200.000	대기업	4048
-- Rine	7100.000	대기업	1138

SELECT company.name, avg(recruit.salary) AS `average`, company.scale, company.headcount
FROM `company` JOIN `recruit`
ON company.id = recruit.companyId
WHERE recruit.region = '성남시 분당구'
GROUP BY company.id HAVING `average` >= 7000
ORDER BY company.headcount DESC;





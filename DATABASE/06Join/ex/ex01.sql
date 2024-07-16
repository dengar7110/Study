SELECT * FROM `seller`;

SELECT * FROM `used_goods`;

-- Join
SELECT * FROM `seller` JOIN `used_goods` ON seller.id = used_goods.sellerId;

-- 하구루 닉네임을 가진 사용자가 작성한 행 조회
SELECT seller.nickname, seller.temperature, used_goods.title, used_goods.price 
FROM `seller`
JOIN `used_goods`
ON seller.id = used_goods.sellerId
WHERE seller.nickName = '하구루'
ORDER BY used_goods.price;


-- 테이블 별명
SELECT S.nickname, U.title, U.price
FROM `seller` AS `S`
JOIN `used_goods` AS `U`
ON S.id = U.sellerId;

-- INNER JOIN
-- 기본 JOIN : 대응 되는 행들만 조회

-- OUTER JOIN
-- LEFT JOIN
-- FROM 뒤에 오는 테이블이 기준
-- 해당 테이블의 모든 행 조회
-- 대응 되는 행이 있으면 연결해서 조회
-- 없으면 해당 컬럼은 NULL

SELECT *
FROM `seller`
LEFT JOIN `used_goods`
ON seller.id = used_goods.sellerId;


-- RIGHT JOIN
-- JOIN 뒤에 오는 테이블이 기준
-- 해당 테이블의 모든행 조회
-- 대응되는 행이 있으면 연결해서 조회
-- 없으면 해당 컬럼은 NULL

SELECT *
FROM `seller`
RIGHT JOIN `used_goods`
ON seller.id = used_goods.sellerId;






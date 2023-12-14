-- 코드를 입력하세요
SELECT 
    A.CAR_ID
FROM CAR_RENTAL_COMPANY_CAR AS A
    INNER JOIN CAR_RENTAL_COMPANY_RENTAL_HISTORY AS B ON A.CAR_ID = B.CAR_ID
WHERE A.CAR_TYPE = '세단'
AND DATE_FORMAT(B.START_DATE, '%m') = '10'
GROUP BY A.CAR_ID
ORDER BY A.CAR_ID DESC
;
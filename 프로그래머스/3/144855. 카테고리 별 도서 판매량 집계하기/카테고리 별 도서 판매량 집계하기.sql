-- 코드를 입력하세요
SELECT 
    CATEGORY,
    SUM(SALES) AS TOTAL_SALES
FROM BOOK B
    INNER JOIN BOOK_SALES S ON B.BOOK_ID = S.BOOK_ID
WHERE SALES_DATE LIKE '2022-01%'
GROUP BY CATEGORY
ORDER BY CATEGORY ASC
;
    
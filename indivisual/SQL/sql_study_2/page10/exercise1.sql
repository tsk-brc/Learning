-- 日付ごとの合計金額のうち、2000円を超えるデータのみを取得してください

SELECT SUM(price), purchased_at
FROM purchases
GROUP BY purchased_at
HAVING SUM(price) > 2000
;
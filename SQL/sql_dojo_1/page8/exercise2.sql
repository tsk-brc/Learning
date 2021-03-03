-- 日ごとの売上額とその日付を取得してください
SELECT purchased_at, SUM(price) AS "売上額"
FROM sales_records
LEFT JOIN items
ON sales_records.item_id = items.id
GROUP BY purchased_at
ORDER BY purchased_at ASC;
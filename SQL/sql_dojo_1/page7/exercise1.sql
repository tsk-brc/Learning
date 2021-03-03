-- 売れた数が多い上位5商品のIDと名前、個数を取得してください
SELECT items.id, items.name, count(*) AS sell_sum
FROM sales_records
LEFT JOIN items
ON sales_records.item_id = items.id
GROUP BY items.id, items.name
ORDER BY sell_sum DESC
LIMIT 5;
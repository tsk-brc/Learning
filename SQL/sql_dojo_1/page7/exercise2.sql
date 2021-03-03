-- このサイトの総売上と総利益を取得してください
SELECT SUM(price) AS "総売上",
       SUM(price - cost) AS "総利益"
FROM sales_records
LEFT JOIN items
ON sales_records.item_id = items.id;
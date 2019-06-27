-- グレーパーカーより売上額が高い商品の指定されたデータを取得してください
SELECT items.id,items.name, SUM(price) AS '売上額'
FROM sales_records
LEFT JOIN items
ON sales_records.item_id = items.id
GROUP BY items.id,items.name
HAVING '売上額' > (
  SELECT SUM(price)
  FROM sales_records
  LEFT JOIN items
  ON sales_records.item_id = items.id
  WHERE items.name = 'グレーパーカー'
  )
;
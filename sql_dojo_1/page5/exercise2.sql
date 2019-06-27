-- 「グレーパーカー」より利益が高い商品を取得してください
SELECT name AS "名前",
       price - cost AS "利益"
FROM items
WHERE price <= 7000
AND "利益" > (
  SELECT price - cost
  FROM items
  WHERE name = 'グレーパーカー'
);
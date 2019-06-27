-- 「グレーパーカー」より値段が高い商品の名前と値段を取得してください
SELECT name, price
FROM items
WHERE price >(
  SELECT price
  FROM items
  WHERE name = 'グレーパーカー'
);


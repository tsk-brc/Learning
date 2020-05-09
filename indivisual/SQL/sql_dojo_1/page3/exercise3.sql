-- 名前の一部に「シャツ」を含む商品の、全てのカラムの値を取得してください
SELECT *
FROM items
WHERE name LIKE '%シャツ%';
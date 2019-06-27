-- 各商品あたりの利益が上位5件の商品の名前と利益を取得してください
SELECT name AS "名前",
       price - cost AS "利益"
FROM items
ORDER BY "利益" DESC
LIMIT 5;
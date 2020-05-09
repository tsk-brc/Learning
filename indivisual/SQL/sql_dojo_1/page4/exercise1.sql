-- 全商品の名前、値段、利益を取得してください
SELECT name AS "名前",
       price AS "値段",
       price - cost AS "利益"
FROM items;
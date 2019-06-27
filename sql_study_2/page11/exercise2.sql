-- キャラクターごとにグループ化し、priceカラムの合計と、character_nameを取得してください
-- ただし、WHEREでcategoryが「雑費」であるレコードから集計してください

SELECT SUM(price), character_name
FROM purchases
WHERE category = "雑費"
GROUP BY character_name
;
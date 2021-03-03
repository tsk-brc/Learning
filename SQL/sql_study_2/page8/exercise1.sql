-- purchased_atとcharacter_nameごとの合計金額を取得してください

SELECT SUM(price), purchased_at, character_name
FROM purchases
GROUP BY purchased_at, character_name
;

-- purchased_atとcharacter_nameごとにお金を使った回数を取得してください

SELECT COUNT(*), purchased_at, character_name
FROM purchases
GROUP BY purchased_at, character_name
;

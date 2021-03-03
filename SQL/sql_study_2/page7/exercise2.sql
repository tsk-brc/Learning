-- purchased_atごとのお金を使った数を取得してください

SELECT COUNT(*), purchased_at
FROM purchases
GROUP BY purchased_at
;
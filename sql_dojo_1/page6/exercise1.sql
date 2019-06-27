-- 商品ごとに商品のid、売れた個数を取得してください
SELECT item_id, COUNT(*)
FROM sales_records
GROUP BY item_id;
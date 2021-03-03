-- 売れた数が多い上位5商品のidと個数を取得してください
SELECT item_id, COUNT(*) AS sell_sum
FROM sales_records
GROUP BY item_id
ORDER BY sell_sum DESC
LIMIT 5;
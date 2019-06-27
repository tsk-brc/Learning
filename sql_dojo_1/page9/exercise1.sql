-- 10個以上購入したユーザーIDとユーザー名、購入した商品の数を取得してください
SELECT users.id, users.name, COUNT(*) AS '購入数'
FROM sales_records
LEFT JOIN users
ON sales_records.user_id = users.id
GROUP BY users.id, users.name
HAVING '購入数' >= 10;
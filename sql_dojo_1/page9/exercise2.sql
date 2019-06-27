-- 「サンダル」を購入したユーザーのidと名前を取得してください
SELECT users.id, users.name
FROM sales_records
LEFT JOIN users
ON sales_records.user_id = users.id
LEFT JOIN items
ON sales_records.item_id = items.id
WHERE items.name = 'サンダル';
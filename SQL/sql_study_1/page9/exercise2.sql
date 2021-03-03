-- 「FROM purchases」のあとにコードを追加し、nameカラムが「プリン」を含まないデータを取得してください

SELECT *
FROM purchases
WHERE NOT name LIKE "%プリン%";
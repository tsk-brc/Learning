-- 20代未満の男性ユーザーを全て取得してください
SELECT *
FROM users
WHERE age < 20
AND gender = 0;
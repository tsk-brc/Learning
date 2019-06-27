-- character_nameが「にんじゃわんこ」であるデータの数を取得してください

SELECT COUNT(*)
FROM purchases
WHERE character_name = "にんじゃわんこ"
;
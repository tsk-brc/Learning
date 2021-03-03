SELECT name
FROM players
WHERE goals > (
　-- この下にウィルの得点数を取得するSQL文を書いてください
  SELECT goals
  FROM players
  WHERE name = "ウィル"
)
;
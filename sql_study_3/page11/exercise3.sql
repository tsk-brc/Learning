SELECT countries.name AS "国名",
       AVG(players.goals) AS "平均得点"
FROM players
JOIN countries
ON countries.id = players.country_id
GROUP BY countries.name;
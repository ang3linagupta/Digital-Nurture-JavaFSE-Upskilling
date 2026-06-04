SELECT title
FROM Events
WHERE event_id IN (
SELECT event_id
FROM Sessions
GROUP BY event_id
HAVING COUNT(*)=(
SELECT MAX(cnt)
FROM(
SELECT COUNT(*) cnt
FROM Sessions
GROUP BY event_id
)x
)
);
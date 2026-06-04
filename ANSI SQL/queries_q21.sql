SELECT
u.full_name,
COUNT(*) total_feedback
FROM Users u
JOIN Feedback f
ON u.user_id=f.user_id
GROUP BY u.user_id
ORDER BY total_feedback DESC
LIMIT 5;
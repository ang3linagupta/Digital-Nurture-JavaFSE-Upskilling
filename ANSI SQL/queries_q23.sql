SELECT
DATE_FORMAT(
registration_date,
'%Y-%m'
) month,
COUNT(*) total
FROM Registrations
WHERE registration_date>=
CURDATE()-INTERVAL 12 MONTH
GROUP BY month
ORDER BY month;
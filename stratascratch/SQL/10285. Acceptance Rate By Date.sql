/*
ID:         10285
Problem:    Acceptance Rate By Date
Difficulty: Medium
Company:    Facebook
URL:        https://platform.stratascratch.com/coding/10285-acceptance-rate-by-date?python=
*/

WITH
    sent
    AS
    (
        SELECT *
        FROM fb_friend_requests
        WHERE action = 'sent'
    ),
    accepted
    AS
    (
        SELECT *
        FROM fb_friend_requests
        WHERE action = 'accepted'
    )

SELECT s.date, COUNT(a.action)::FLOAT/COUNT(s.*) as percentage_acceptance
FROM sent s
LEFT JOIN accepted a
ON s.user_id_receiver = a.user_id_receiver
GROUP BY s.date
ORDER BY s.date
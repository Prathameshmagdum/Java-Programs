select protocol, sum ( CASE WHEN name='traffic-in' THEN type ELSE 0 END) As traffic_in, sum (CASE WHEN name='traffic_out' THEN type ELSE 0 END) As traffic_out
from traffic
GROUP BY protocol
HAVING SUM(CASE WHEN name='traffic_in' THEN type ELSE 0 END)>SUM(CASE WHEN name='traffic_out' THEN type ELSE 0 END)
ORDER BY protocl ASC;
select distinct num ConsecutiveNums
from (
    select num, lag(num, 1) over (order by id) prevValue, lead(num, 1) over (order by id) nextValue
    from Logs
) t
where prevValue = num and num = nextValue

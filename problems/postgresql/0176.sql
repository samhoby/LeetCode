select (
    select distinct salary
    from Employee
    order by salary desc
    offset 1
    limit 1
) as SecondHighestSalary;

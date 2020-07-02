select i.id, i.summary, i.description, l.name
from issues i
join issueslists l on i.issueslist_id = l.id;

select i.id, i.summary, i.description, u.firstname, u.lastname
from issues i
join users u on i.user_id_assignedto = u.id;

select u.firstname, u.lastname, count(*) as issues_number
from users u
join issues i on u.id = i.user_id_assignedto
group by i.user_id_assignedto



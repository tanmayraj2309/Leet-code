# Write your MySQL query statement below
select s.student_id,s.student_name,sub.subject_name,
count(e.subject_name) as attended_exams

from Students as s
cross join   # ye do table ko join kr rhe saara data 
Subjects as sub

left join
Examinations as e
on s.student_id = e.student_id AND sub.subject_name=e.subject_name
GROUP BY s.student_id, s.student_name,sub.subject_name
ORDER BY s.student_id,sub.subject_name
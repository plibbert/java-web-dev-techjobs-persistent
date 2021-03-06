## Part 1: Test it with SQL

--id int
--employer varchar(255)
--name varchar(255)
--skills varchar(255)

## Part 2: Test it with SQL
SELECT name
FROM Employer
WHERE location = "St. Louis City";

## Part 3: Test it with SQL

DROP TABLE job;

## Part 4: Test it with SQL

SELECT name, description
FROM Skill
LEFT JOIN Job_skills ON Skill.id, job_skills.skills_id
WHERE jobs_id = IS NOT NULL
ORDER BY name ASC;

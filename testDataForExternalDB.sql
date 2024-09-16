insert into bonuscalc.employee (name, base_salary, is_hired)
values ('Jan Kowalski', 3000, 1),
       ('Aleksander Nowak', 1500, 1),
       ('Patrycja Rogalska', 2500, 1),
       ('Kamil Wojcieszyn', 2000, 0),
       ('Józef Chwałek', 5000, 0),
       ('Magdalena Robaczewska', 4500, 1),
       ('Iwona Tonta', 1000, 0);

insert into bonuscalc.work_done (employee_id, date, time_in_minutes, additional)
values (1, '2024-09-16', 90, 0),
       (1, '2024-09-16', 90, 1),
       (2, '2024-09-16', 14, 1),
       (2, '2024-09-16', 67, 1),
       (3, '2024-09-16', 90, 0),
       (3, '2024-09-16', 20, 1),
       (5, '2024-09-16', 23, 1),
       (5, '2024-09-16', 30, 1),
       (6, '2024-09-16', 12, 0);
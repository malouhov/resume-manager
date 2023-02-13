INSERT INTO Companies (id, name) VALUES (101, 'Sber');
INSERT INTO Companies (id, name) VALUES (102, 'Yandex');

INSERT INTO Tags (id, name) VALUES (201, 'super');
INSERT INTO Tags (id, name) VALUES (202, 'good');

INSERT INTO Responses (id, company_id, vacancy, description, send, status)
VALUES (10, 101, 'developer', 'java junior', '2023-02-11', 1);
INSERT INTO Responses (id, company_id, vacancy, description, send, status)
VALUES (11, 101, 'developer', 'java junior', '2023-02-11', 1)
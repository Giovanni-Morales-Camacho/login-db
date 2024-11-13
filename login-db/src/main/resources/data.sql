INSERT INTO app_usuario (username, password, role) VALUES ('user2', '$2a$10$uioWgiRiHRhA9erLswW9He39EV3PBcVd4wdmNcDsq1N3WHhvgHA8q', 'USER');
INSERT INTO app_usuario (username, password, role) VALUES ('user1', '$2a$10$qKo4xv3RUlx8R8HQt0Pq7uI/xVJ687vDkG5XYb.QtJoRBEgXGqEzi', 'USER');
INSERT INTO app_usuario (username, password, role) VALUES ('adm1', '$2a$10$qKo4xv3RUlx8R8HQt0Pq7uI/xVJ687vDkG5XYb.QtJoRBEgXGqEzi', 'ADMIN');
/* al ejecutarse el main van a crear usuarios con contraseñas encriptadas
ID      CONTRASEÑA      ENCRIPTACIÓN
user2   password123 
user1   123             $2a$10$qKo4xv3RUlx8R8HQt0Pq7uI/xVJ687vDkG5XYb.QtJoRBEgXGqEzi
*/
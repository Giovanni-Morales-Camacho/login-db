CREATE TABLE IF NOT EXISTS app_usuario (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL,
    password VARCHAR(100) NOT NULL,
    role VARCHAR(20) NOT NULL
);
 /* el dato de la tabla se escribió 'app_usuario' porque así fue definida en el "model" */
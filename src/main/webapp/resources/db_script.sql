DROP TABLE IF EXISTS employees;

CREATE TABLE employees (
  id     BIGINT NOT NULL AUTO_INCREMENT,
  age    INTEGER,
  name   VARCHAR(255),
  salary DECIMAL,
  PRIMARY KEY (id)
)
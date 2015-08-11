DROP TABLE IF EXISTS books;

CREATE TABLE books (
  id             BIGINT NOT NULL AUTO_INCREMENT,
  name           VARCHAR(255),
  code           VARCHAR(25),
  price          VARCHAR(5),
  authors        VARCHAR(255),
  isbn           VARCHAR(25),
  publisher      VARCHAR(255),
  published_date DATE,
  PRIMARY KEY (id)
)
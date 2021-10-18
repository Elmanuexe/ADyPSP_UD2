CREATE TABLE COUNTRY (
    id   INTEGER      NOT NULL AUTO_INCREMENT,
    name VARCHAR(128),
    PRIMARY KEY (id)
);

CREATE TABLE PRODUCT (
    id   INTEGER      NOT NULL AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    price REAL        NOT NULL,
    image TEXT,
    description TEXT,
    PRIMARY KEY (id)
);

CREATE TABLE tb_catalog (
        ID BIGINT PRIMARY KEY AUTO_INCREMENT,
        Name VARCHAR(255) NULL,
        Price INT NULL
);

CREATE TABLE tb_vehicle (
        ID BIGINT PRIMARY KEY AUTO_INCREMENT,
        Name VARCHAR(255) NULL,
        Model VARCHAR(255) NULL,
        Year INTEGER NULL,
        catalog_id BIGINT NULL,
        FOREIGN KEY (catalog_id) REFERENCES tb_catalog(ID)
);
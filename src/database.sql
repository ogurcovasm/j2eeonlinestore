CREATE TABLE category (
    id     INTEGER NOT NULL,
    name   VARCHAR2(45)
);

ALTER TABLE category ADD CONSTRAINT category_pk PRIMARY KEY ( id );

CREATE TABLE customer (
    id            INTEGER NOT NULL,
    name          VARCHAR2(100),
    email         VARCHAR2(45),
    phone         VARCHAR2(45),
    address       VARCHAR2(100),
    cc_number     VARCHAR2(19)
);

ALTER TABLE customer ADD CONSTRAINT customer_pk PRIMARY KEY ( id );

CREATE TABLE customer_order (
    id                    INTEGER NOT NULL,
    amount                NUMBER(6, 2),
    date_created          TIMESTAMP WITH LOCAL TIME ZONE,
    confirmation_number   INTEGER,
    customer_id           INTEGER NOT NULL
);

ALTER TABLE customer_order ADD CONSTRAINT customer_order_pk PRIMARY KEY ( id );

CREATE TABLE product (
    id            INTEGER NOT NULL,
    name          VARCHAR2(45),
    price         NUMBER(6, 2),
    description   CLOB,
    last_update   TIMESTAMP WITH LOCAL TIME ZONE,
    category_id   SMALLINT NOT NULL
);

ALTER TABLE product ADD CONSTRAINT product_pk PRIMARY KEY ( id );

CREATE TABLE relation_6 (
    product_id          INTEGER NOT NULL,
    customer_order_id   INTEGER NOT NULL,
    quantity            INTEGER
);

ALTER TABLE relation_6 ADD CONSTRAINT relation_6_pk PRIMARY KEY ( product_id,
                                                                  customer_order_id );

ALTER TABLE customer_order
    ADD CONSTRAINT customer_order_customer_fk FOREIGN KEY ( customer_id )
        REFERENCES customer ( id );

ALTER TABLE product
    ADD CONSTRAINT product_category_fk FOREIGN KEY ( category_id )
        REFERENCES category ( id );

ALTER TABLE relation_6
    ADD CONSTRAINT relation_6_customer_order_fk FOREIGN KEY ( customer_order_id )
        REFERENCES customer_order ( id );

ALTER TABLE relation_6
    ADD CONSTRAINT relation_6_product_fk FOREIGN KEY ( product_id )
        REFERENCES product ( id );
CREATE TABLE FORUM_CATEGORIES (
ID INT,
CONSTRAINT ID_PK PRIMARY KEY (ID),
TITLE VARCHAR(64),
DESCRIPTION NVARCHAR2(200),
DATE_CATEGORY TIMESTAMP,
IP VARCHAR(20)
);
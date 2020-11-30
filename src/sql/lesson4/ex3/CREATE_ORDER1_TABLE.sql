CREATE TABLE ORDER1 (
  ID NUMBER CHECK(ID <= 10000),
  CONSTRAINT ORDER1_ID PRIMARY KEY(ID),
  USER_ID NUMBER UNIQUE,
  ROOM_ID NUMBER UNIQUE,
  DATE_FROM TIMESTAMP,
  DATE_TO TIMESTAMP,
  MONEY_PAID NUMBER(12,2)
);
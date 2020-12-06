CREATE TABLE SUPPLIERS (
SUPPLIERS_ID NUMBER,
CONSTRAINT SUPPLIERS_ID_PK PRIMARY KEY(SUPPLIERS_ID),

COMPANY_NAME NVARCHAR2(50),
CONTACT_NAME NVARCHAR2(50),
CONTACT_TITLE NVARCHAR2(50),
ADDRESS NVARCHAR2(50),
CITY NVARCHAR2(50),
REGION NVARCHAR2(50),
POSTAL_CODE NVARCHAR2(50),
COUNTRY NVARCHAR2(50),
PHONE NVARCHAR2(20),
FAX NVARCHAR2(20),
HOME_PAGE NVARCHAR2(100)
);
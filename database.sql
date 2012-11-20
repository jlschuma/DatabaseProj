--DROP TABLES
DROP TABLE CustomerPayment;
DROP TABLE CustomerBillItems;
DROP TABLE SpecialOrderItems;
DROP TABLE SpecialOrder;
DROP TABLE VendorBillItems;
DROP TABLE VendorBill;
DROP TABLE StoreItem;
DROP TABLE Merchandise;
DROP TABLE Vendor;
DROP TABLE CustomerBill;
DROP TABLE CustomerBillingCycle;
DROP TABLE CustomerAccount;
DROP TABLE Staff;
DROP TABLE Store;

--DROP SEQUENCE
DROP SEQUENCE staff_seq;
DROP SEQUENCE vendor_seq;
DROP SEQUENCE customer_confirmation_seq;
DROP SEQUENCE merch_seq;
DROP SEQUENCE storeitem_seq;
DROP SEQUENCE store_seq;
DROP SEQUENCE customerbillcycle_seq;
DROP SEQUENCE customerbill_seq;
DROP SEQUENCE specialorder_seq;
DROP SEQUENCE vendorbill_seq;
DROP SEQUENCE customeraccount_seq;

--CREATE TABLES
CREATE TABLE Store(
id INT PRIMARY KEY,
phoneNumber VARCHAR(13) NOT NULL,
address VARCHAR(128) NOT NULL,
name VARCHAR(128));

CREATE TABLE Staff(
id INT PRIMARY KEY, 
storeID INT NOT NULL,
salary FLOAT NOT NULL, 
phoneNumber VARCHAR(13) NOT NULL,
name VARCHAR(128) NOT NULL, 
age INT NOT NULL, 
gender CHAR NOT NULL, 
title VARCHAR(4) NOT NULL, 
department VARCHAR(128) NOT NULL, 
address VARCHAR(128) NOT NULL,
CONSTRAINT staff_storeid_fk FOREIGN KEY(storeID) REFERENCES Store(id));

CREATE TABLE Vendor(
id INT PRIMARY KEY,
name VARCHAR(128) NOT NULL,
phoneNumber VARCHAR(13) NOT NULL,
address VARCHAR(128) NOT NULL);

CREATE TABLE Merchandise(
id INT PRIMARY KEY, 
name VARCHAR(128) NOT NULL, 
description VARCHAR(248) NOT NULL,
vendorID INT NOT NULL,
vendorPrice FLOAT NOT NULL,
CONSTRAINT merch_fk FOREIGN KEY(vendorID) REFERENCES Vendor(id));

CREATE TABLE StoreItem(
storeID INT, 
merchandiseID INT,
quantity INT NOT NULL, 
price FLOAT NOT NULL,
CONSTRAINT storeitem_pk PRIMARY KEY(storeID, merchandiseID),
CONSTRAINT storeid_fk FOREIGN KEY(storeID) REFERENCES store(id), 
CONSTRAINT storeitmerch_fk FOREIGN KEY(merchandiseID) REFERENCES Merchandise(id));

CREATE TABLE CustomerAccount(
id INT PRIMARY KEY,
ssn VARCHAR(12),
name VARCHAR(128) NOT NULL,
dob DATE,
gender VARCHAR(1),
phoneNumber VARCHAR(12),
address VARCHAR(128));

CREATE TABLE CustomerBillingCycle(
id INT PRIMARY KEY,
customerID INT NOT NULL,
startDate DATE NOT NULL,
endDate DATE NOT NULL,
status VARCHAR(12) NOT NULL,
CONSTRAINT cbill_cusid_fk FOREIGN KEY(customerID) REFERENCES CustomerAccount(id));

CREATE TABLE CustomerBill(
id INT PRIMARY KEY,
dateTime DATE,
storeID INT NOT NULL,
staffID INT NOT NULL,
customerBillCycleID INT NOT NULL,
CONSTRAINT cb_storeid_fk FOREIGN KEY(storeID) REFERENCES Store(id), 
CONSTRAINT cb_staffid_fk FOREIGN KEY(staffID) REFERENCES Staff(id),
CONSTRAINT cb_cusid_fk FOREIGN KEY(customerBillCycleID) REFERENCES CustomerBillingCycle(id));

CREATE TABLE CustomerBillItems(
customerBillId INT NOT NULL,
merchandiseID INT NOT NULL,
quantity INT NOT NULL,
price FLOAT NOT NULL,
CONSTRAINT pub_cb_pk PRIMARY KEY(customerBillID, merchandiseID),
CONSTRAINT cbi_cusbil_fk FOREIGN KEY(customerBillID) REFERENCES CustomerBill(id), 
CONSTRAINT cbi_staffid_fk FOREIGN KEY(merchandiseID) REFERENCES Merchandise(id));

CREATE TABLE SpecialOrder(
id INT PRIMARY KEY,
dateTime DATE,
storeID INT NOT NULL,
staffID INT NOT NULL,
customerID INT NOT NULL,
CONSTRAINT or_storeid_fk FOREIGN KEY(storeID) REFERENCES Store(id), 
CONSTRAINT or_staffid_fk FOREIGN KEY(staffID) REFERENCES Staff(id),
CONSTRAINT or_cusid_fk FOREIGN KEY(customerID) REFERENCES CustomerAccount(id));

CREATE TABLE SpecialOrderItems(
specialOrderID INT NOT NULL,
merchandiseID INT NOT NULL,
quantity INT NOT NULL,
price FLOAT NOT NULL,
status VARCHAR(12) NOT NULL,
CONSTRAINT pub_so_pk PRIMARY KEY(specialOrderID, merchandiseID),
CONSTRAINT ori_cusbil_fk FOREIGN KEY(specialOrderId) REFERENCES SpecialOrder(id), 
CONSTRAINT ori_staffid_fk FOREIGN KEY(merchandiseID) REFERENCES Merchandise(id));

CREATE TABLE VendorBill(
id INT PRIMARY KEY,
dateTime DATE,
storeID INT NOT NULL,
staffID INT NOT NULL,
vendorId INT NOT NULL,
paymentInformation VARCHAR(248),
confirmationCode VARCHAR(128),
CONSTRAINT vb_vendorid_fk FOREIGN KEY(vendorID) REFERENCES Vendor(id), 
CONSTRAINT vb_storeid_fk FOREIGN KEY(storeID) REFERENCES Store(id), 
CONSTRAINT vb_staffid_fk FOREIGN KEY(staffID) REFERENCES Staff(id));

CREATE TABLE VendorBillItems(
vendorBillID INT NOT NULL,
merchandiseID INT NOT NULL,
quantity INT NOT NULL,
price FLOAT NOT NULL,
CONSTRAINT pub_vb_pk PRIMARY KEY(vendorBillID, merchandiseID),
CONSTRAINT vbi_cusbil_fk FOREIGN KEY(vendorBillID) REFERENCES VendorBill(id), 
CONSTRAINT vbii_staffid_fk FOREIGN KEY(merchandiseID) REFERENCES Merchandise(id));

CREATE TABLE CustomerPayment(
customerBillCycleID INT NOT NULL,
staffID INT NOT NULL,
paidDate DATE NOT NULL,
paymentInformation VARCHAR(248),
confirmationCode VARCHAR(128),
CONSTRAINT pub_cp_pk PRIMARY KEY(customerBillCycleID, staffID, confirmationCode),
CONSTRAINT customerpayid_fk FOREIGN KEY(customerBillCycleID) REFERENCES CustomerBillingCycle(id),
CONSTRAINT customerpaystaffid_fk FOREIGN KEY(staffID) REFERENCES Staff(id));

--SEQUENCES
CREATE SEQUENCE staff_seq MINVALUE 0 START WITH 0;
CREATE SEQUENCE vendor_seq MINVALUE 0 START WITH 0;
CREATE SEQUENCE customer_confirmation_seq MINVALUE 0 START WITH 0;
CREATE SEQUENCE merch_seq MINVALUE 0 START WITH 0;
CREATE SEQUENCE store_seq MINVALUE 0 START WITH 0;
CREATE SEQUENCE storeitem_seq MINVALUE 0 START WITH 0;
CREATE SEQUENCE customerbill_seq MINVALUE 0 START WITH 0;
CREATE SEQUENCE specialorder_seq MINVALUE 0 START WITH 0;
CREATE SEQUENCE vendorbill_seq MINVALUE 0 START WITH 0;
CREATE SEQUENCE customeraccount_seq MINVALUE 0 START WITH 0;
CREATE SEQUENCE customerbillcycle_seq MINVALUE 0 START WITH 0;

--INSERTS
INSERT INTO Vendor(id, name, phoneNumber, address)
VALUES(vendor_seq.nextval, 'Vend A', '919-111-1111','101 Way');
INSERT INTO Vendor(id, name, phoneNumber, address)
VALUES(vendor_seq.nextval, 'Vend B', '919-111-1111','101 Way');
INSERT INTO Vendor(id, name, phoneNumber, address)
VALUES(vendor_seq.nextval, 'Vend C', '919-111-1111','101 Way');
INSERT INTO Vendor(id, name, phoneNumber, address)
VALUES(vendor_seq.nextval, 'Vend D', '919-111-1111','101 Way');

INSERT INTO Merchandise(id, name, description, vendorID)
VALUES(merch_seq.nextval, 'The Help', 'Book about Ladies that were Nannies', 1);
INSERT INTO Merchandise(id, name, description, vendorID)
VALUES(merch_seq.nextval, 'The Basics of Human Interaction', 'Textbook for HCI Course', 1);
INSERT INTO Merchandise(id, name, description, vendorID)
VALUES(merch_seq.nextval, 'Dictionary', 'Contains all the words in the English Language', 2);
INSERT INTO Merchandise(id, name, description, vendorID)
VALUES(merch_seq.nextval, 'Super Mario Brothers', 'Story of the Plumbers', 3);

INSERT INTO Store(id, phoneNumber, address, name)
VALUES(store_seq.nextval, '919-555-1212', 'Blah Blah Way 1', 'Store');
INSERT INTO Store(id, phoneNumber, address, name)
VALUES(store_seq.nextval, '919-555-1212', 'Blah Blah Way 2', 'Store');
INSERT INTO Store(id, phoneNumber, address, name)
VALUES(store_seq.nextval, '919-555-1212', 'Blah Blah Way 3', 'Store');
INSERT INTO Store(id, phoneNumber, address, name)
VALUES(store_seq.nextval, '919-555-1212', 'Blah Blah Way 4', 'Warehouse');

INSERT INTO Staff(id, storeID, salary, phoneNumber, name, age, gender, title, department, address)
VALUES(staff_seq.nextval, 1, 10000, '919-555-1212', 'Eric Lumpkin', 22, 'M', 'Mr.', 'Billing', '911 Parners Way, Cary, NC');
INSERT INTO Staff(id, storeID, salary, phoneNumber, name, age, gender, title, department, address)
VALUES(staff_seq.nextval, 1, 20000, '919-555-1213', 'Jessica Schumaker', 22, 'F', 'Mrs.', 'Franchise Manager', '912 Parners Way, Cary, NC');
INSERT INTO Staff(id, storeID, salary, phoneNumber, name, age, gender, title, department, address)
VALUES(staff_seq.nextval, 1, 30000, '919-555-1215', 'Charon Miller', 22, 'F', 'Ms.', 'Manager', '914 Parners Way, Cary, NC');
INSERT INTO Staff(id, storeID, salary, phoneNumber, name, age, gender, title, department, address)
VALUES(staff_seq.nextval, 1, 40000, '919-555-1215', 'Brittany Johnson', 22, 'F', 'Ms.', 'Sales', '914 Parners Way, Cary, NC');
INSERT INTO Staff(id, storeID, salary, phoneNumber, name, age, gender, title, department, address)
VALUES(staff_seq.nextval, 1, 50000, '919-555-1216', 'Ting Yu', 22, 'M', 'Mr.', 'Stocking', '915 Parners Way, Cary, NC');

INSERT INTO StoreItem(storeID, merchandiseID, quantity, price)
VALUES(1, 3, 1, 2.13);
INSERT INTO StoreItem(storeID, merchandiseID, quantity, price)
VALUES(1, 1, 2, 2.23);
INSERT INTO StoreItem(storeID, merchandiseID, quantity, price)
VALUES(1, 2, 3, 2.33);
INSERT INTO StoreItem(storeID, merchandiseID, quantity, price)
VALUES(2, 1, 4, 2.43);
INSERT INTO StoreItem(storeID, merchandiseID, quantity, price)
VALUES(2, 4, 5, 2.53);

INSERT INTO CustomerAccount(id, ssn, name, dob, gender, phoneNumber, address)
VALUES(customeraccount_seq.nextval, '123-34-2222', 'Mike', NULL, 'M', '333-333-3333', '101 Way');
INSERT INTO CustomerAccount(id, ssn, name, dob, gender, phoneNumber, address)
VALUES(customeraccount_seq.nextval, '123-34-2222', 'May', to_date('2003/05/03 21:02:44', 'yyyy/mm/dd hh24:mi:ss'), 'F', '333-333-3333', '101 Way');
INSERT INTO CustomerAccount(id, ssn, name, dob, gender, phoneNumber, address)
VALUES(customeraccount_seq.nextval, '123-34-2222', 'Carlee', to_date('2003/05/03 21:02:44', 'yyyy/mm/dd hh24:mi:ss'), 'F', '333-333-3333', '101 Way');
INSERT INTO CustomerAccount(id, ssn, name, dob, gender, phoneNumber, address)
VALUES(customeraccount_seq.nextval, '123-34-2222', 'Owen', to_date('2003/05/03 21:02:44', 'yyyy/mm/dd hh24:mi:ss'), 'M', '333-333-3333', '101 Way');

INSERT INTO CustomerBillingCycle(id, customerID, startDate, endDate, status) 
VALUES(customerbillcycle_seq.nextval, 1, to_date('2012/05/01', 'yyyy/mm/dd'), to_date('2012/05/30', 'yyyy/mm/dd'), 'open'); 
INSERT INTO CustomerBillingCycle(id, customerID, startDate, endDate, status) 
VALUES(customerbillcycle_seq.nextval, 1, to_date('2012/04/01', 'yyyy/mm/dd'), to_date('2012/04/30', 'yyyy/mm/dd'), 'paid'); 
INSERT INTO CustomerBillingCycle(id, customerID, startDate, endDate, status) 
VALUES(customerbillcycle_seq.nextval, 1, to_date('2012/03/01', 'yyyy/mm/dd'), to_date('2012/03/30', 'yyyy/mm/dd'), 'late'); 
INSERT INTO CustomerBillingCycle(id, customerID, startDate, endDate, status) 
VALUES(customerbillcycle_seq.nextval, 1, to_date('2012/02/01', 'yyyy/mm/dd'), to_date('2012/02/28', 'yyyy/mm/dd'), 'billed');

INSERT INTO CustomerBill(id, dateTime, storeID, staffID, customerBillCycleID) 
VALUES(customerbill_seq.nextval, to_date('2003/05/03 21:02:44', 'yyyy/mm/dd hh24:mi:ss'), 1, 1, 3);
INSERT INTO CustomerBill(id, dateTime, storeID, staffID, customerBillCycleID) 
VALUES(customerbill_seq.nextval, to_date('2003/05/03 21:02:44', 'yyyy/mm/dd hh24:mi:ss'), 1, 1, 3);
INSERT INTO CustomerBill(id, dateTime, storeID, staffID, customerBillCycleID) 
VALUES(customerbill_seq.nextval, to_date('2003/05/03 21:02:44', 'yyyy/mm/dd hh24:mi:ss'), 1, 1, 3);
INSERT INTO CustomerBill(id, dateTime, storeID, staffID, customerBillCycleID) 
VALUES(customerbill_seq.nextval, to_date('2003/05/03 21:02:44', 'yyyy/mm/dd hh24:mi:ss'), 1, 1, 3);

INSERT INTO CustomerBillItems(customerBillID, merchandiseID, quantity, price) 
VALUES(1, 1, 2, 4.55);
INSERT INTO CustomerBillItems(customerBillID, merchandiseID, quantity, price) 
VALUES(1, 2, 2, 4.55);
INSERT INTO CustomerBillItems(customerBillID, merchandiseID, quantity, price) 
VALUES(2, 2, 2, 4.55);
INSERT INTO CustomerBillItems(customerBillID, merchandiseID, quantity, price) 
VALUES(3, 1, 2, 4.55);
INSERT INTO CustomerBillItems(customerBillID, merchandiseID, quantity, price) 
VALUES(3, 2, 3, 4.55);

INSERT INTO SpecialOrder(id, dateTime, storeID, staffID, customerID) 
VALUES(specialorder_seq.nextval, to_date('2003/05/03 21:02:44', 'yyyy/mm/dd hh24:mi:ss'), 1, 1, 3);
INSERT INTO SpecialOrder(id, dateTime, storeID, staffID, customerID) 
VALUES(specialorder_seq.nextval, to_date('2003/05/03 21:02:44', 'yyyy/mm/dd hh24:mi:ss'), 1, 1, 3);
INSERT INTO SpecialOrder(id, dateTime, storeID, staffID, customerID) 
VALUES(specialorder_seq.nextval, to_date('2003/05/03 21:02:44', 'yyyy/mm/dd hh24:mi:ss'), 1, 1, 3);
INSERT INTO SpecialOrder(id, dateTime, storeID, staffID, customerID) 
VALUES(specialorder_seq.nextval, to_date('2003/05/03 21:02:44', 'yyyy/mm/dd hh24:mi:ss'), 1, 1, 3);

INSERT INTO SpecialOrderItems(specialOrderId , merchandiseID, quantity, price, status) 
VALUES(1, 1, 2, 4.55, 'open');
INSERT INTO SpecialOrderItems(specialOrderId , merchandiseID, quantity, price, status) 
VALUES(1, 2, 2, 4.55, 'ordered');
INSERT INTO SpecialOrderItems(specialOrderId , merchandiseID, quantity, price, status) 
VALUES(2, 2, 2, 4.55, 'arrived');
INSERT INTO SpecialOrderItems(specialOrderId , merchandiseID, quantity, price, status) 
VALUES(3, 1, 2, 4.55, 'open');
INSERT INTO SpecialOrderItems(specialOrderId , merchandiseID, quantity, price, status) 
VALUES(3, 2, 3, 4.55, 'ordered');

INSERT INTO VendorBill(id, dateTime, storeID, staffID, vendorID, paymentInformation, confirmationCode) 
VALUES(vendorbill_seq.nextval, to_date('2003/05/03 21:02:44', 'yyyy/mm/dd hh24:mi:ss'), 1, 1, 3, 'mastercard', 'AE25');
INSERT INTO VendorBill(id, dateTime, storeID, staffID, vendorID, paymentInformation, confirmationCode) 
VALUES(vendorbill_seq.nextval, to_date('2003/05/03 21:02:44', 'yyyy/mm/dd hh24:mi:ss'), 1, 1, 3, 'check', '23F1');
INSERT INTO VendorBill(id, dateTime, storeID, staffID, vendorID, paymentInformation, confirmationCode) 
VALUES(vendorbill_seq.nextval, to_date('2003/05/03 21:02:44', 'yyyy/mm/dd hh24:mi:ss'), 1, 1, 3, 'money order', 'BC99');
INSERT INTO VendorBill(id, dateTime, storeID, staffID, vendorID, paymentInformation, confirmationCode) 
VALUES(vendorbill_seq.nextval, to_date('2003/05/03 21:02:44', 'yyyy/mm/dd hh24:mi:ss'), 1, 1, 3, 'cash', 'EAB2');

INSERT INTO VendorBillItems(vendorBillID, merchandiseID, quantity, price) 
VALUES(1, 1, 2, 4.55);
INSERT INTO VendorBillItems(vendorBillID, merchandiseID, quantity, price) 
VALUES(1, 2, 2, 4.55);
INSERT INTO VendorBillItems(vendorBillID, merchandiseID, quantity, price) 
VALUES(2, 1, 2, 4.55);
INSERT INTO VendorBillItems(vendorBillID, merchandiseID, quantity, price) 
VALUES(3, 1, 2, 4.55);
INSERT INTO VendorBillItems(vendorBillID, merchandiseID, quantity, price) 
VALUES(3, 2, 3, 4.55);

INSERT INTO CustomerPayment(customerBillCycleID, staffID, paidDate, paymentInformation, confirmationCode)
VALUES(1, 1, to_date('2003/05/06 11:15:32', 'yyyy/mm/dd hh24:mi:ss'), 'mastercard 3332 3333 2222 3333', customer_confirmation_seq.nextval);
INSERT INTO CustomerPayment(customerBillCycleID, staffID, paidDate, paymentInformation, confirmationCode)
VALUES(2, 1, to_date('2003/05/06 11:15:32', 'yyyy/mm/dd hh24:mi:ss'), 'cash', customer_confirmation_seq.nextval);
INSERT INTO CustomerPayment(customerBillCycleID, staffID, paidDate, paymentInformation, confirmationCode)
VALUES(3, 1, to_date('2003/05/06 11:15:32', 'yyyy/mm/dd hh24:mi:ss'), 'check', customer_confirmation_seq.nextval);
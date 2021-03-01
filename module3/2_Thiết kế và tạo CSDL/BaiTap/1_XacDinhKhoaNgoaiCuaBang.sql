use testing;

CREATE table Customers(
	customer_number INT(30) PRIMARY KEY,
    fullname varchar(30) NOT NULL,
    address varchar(50) NOT NULL,
    email varchar(50),
    phone int(10) NOT NULL
);

CREATE table Accounts(
	
	account_number INT(11) NOT NULL,
    account_type VARCHAR(20) NOT NULL,
    date_Open DATE NOT NULL,
    balance int(10) NOT NULL
);

ALTER TABLE accounts
	ADD COLUMN customer_number INT(11) NOT NULL;

ALTER TABLE Accounts
	DROP account_number;
    
ALTER TABLE accounts
	ADD COLUMN account_number INT(11) NOT NULL;
	

ALTER TABLE Accounts
	ADD PRIMARY KEY (account_number);
    
ALTER TABLE accounts
	ADD CONSTRAINT id_transfer
    foreign key (customer_number)
    REFERENCES Customers(customer_number);
    
CREATE table Transactions(
	tran_number INT(10) NOT NULL,
    account_number INT(11) NOT NULL,
    date_tran DATE NOT NULL,
	amounts INT(15) NOT NULL,
    descriptions varchar(200)
);

ALTER TABLE Transactions
	ADD PRIMARY KEY (tran_number);
    







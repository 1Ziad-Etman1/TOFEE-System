

-- CREATE TABLE IF NOT EXISTS UsersData (
--     id text PRIMARY KEY,
--     name text NOT NULL,
--     username text NOT NULL,
--     email text NOT NULL,
--     password text NOT NULL,
--     phoneNum text NOT NULL,
--     address text NOT NULL,
--     type text NOT NULL
--  );

-- INSERT INTO UsersData VALUES('u1', 'Ziad' , 'Z-Etman', 'engziad90@gmail.com', '11223344', '01533252626',  'Giza-Cairo', 'client');
-- INSERT INTO UsersData VALUES('u2', 'Rahma', 'RU', 'rahmakhaled827@gmail.com', '12345678', '01223232323', 'Egypt-Cairo', 'client');
-- INSERT INTO UsersData VALUES('u3', 'M.Sherif', 'EliotAnderson', 'ELliotsalem3@gmail.com', '13571357', '01554545456', 'Egypt-Cairo', 'client');
-- INSERT INTO UsersData VALUES('u4', 'Amal', 'A-M-M', 'amalmohamedm7.7@gmail.com', '12345633', '01223232353', 'Egypt-Cairo', 'client');
-- INSERT INTO UsersData VALUES('u5', 'A.Taymour', 'Timo', 'arahman.taymour@gmail.com', '13571347', '01554545425', 'Egypt-Cairo', 'client');
-- INSERT INTO UsersData VALUES('u6', 'Ahmed' , 'Abo7meed', 'ahmed1111@gmail.com', '11223388', '01533252655',  'Egypt-Cairo', 'client');
-- INSERT INTO UsersData VALUES ('u7', 'Lina', 'LinaHassan', 'linahassan@gmail.com', 'password123', '01234567890', 'Egypt-Cairo', 'client');
-- INSERT INTO UsersData VALUES ('u8', 'Mohamed', 'MoSalah', 'mosalah@yahoo.com', 'mosalah123', '01112223334', 'Egypt-Giza', 'client');
-- INSERT INTO UsersData VALUES ('u9', 'Sarah', 'SaraAhmed', 'saraahmed@gmail.com', 'saraahmed123', '01010101010', 'Egypt-Cairo', 'client');
-- INSERT INTO UsersData VALUES ('u10', 'Hassan', 'HassanMohamed', 'hassan.mohamed@gmail.com', 'hassan123', '01555555555', 'Egypt-Alexandria', 'client');
-- INSERT INTO UsersData VALUES ('u11', 'Fatma', 'FatmaKhaled', 'fatma.khaled@hotmail.com', 'fatma123', '01234567890', 'Egypt-Giza', 'client');
-- INSERT INTO UsersData VALUES ('u12', 'Youssef', 'YoussefAli', 'youssef.ali@gmail.com', 'youssef123', '01111111111', 'Egypt-Cairo', 'client');
-- INSERT INTO UsersData VALUES ('u13', 'Nada', 'NadaAshraf', 'nada.ashraf@yahoo.com', 'nada123', '01000000000', 'Egypt-Cairo', 'client');
-- INSERT INTO UsersData VALUES ('u14', 'Karim', 'KarimFawzy', 'karim.fawzy@gmail.com', 'karim123', '01234567890', 'Egypt-Giza', 'client');
-- INSERT INTO UsersData VALUES ('u15', 'Shereen', 'ShereenKhaled', 'shereen.khaled@gmail.com', 'shereen123', '01555555555', 'Egypt-Cairo', 'client');
-- INSERT INTO UsersData VALUES ('u16', 'Ali', 'AliHassan', 'ali.hassan@hotmail.com', 'ali123', '01111111111', 'Egypt-Alexandria', 'client');
-- INSERT INTO UsersData VALUES ('u17', 'Nour', 'NourAli', 'nour.ali@gmail.com', 'nour123', '01000000000', 'Egypt-Cairo', 'client');
-- INSERT INTO UsersData VALUES ('u18', 'Omar', 'OmarMahmoud', 'omar.mahmoud@yahoo.com', 'omar123', '01234567890', 'Egypt-Giza', 'client');
-- INSERT INTO UsersData VALUES ('u19', 'Mai', 'MaiHassan', 'mai.hassan@gmail.com', 'mai123', '01555555555', 'Egypt-Cairo', 'client');
-- INSERT INTO UsersData VALUES ('u20', 'Khaled', 'KhaledAhmed', 'khaled.ahmed@hotmail.com', 'khaled123', '01111111111', 'Egypt-Cairo', 'client');
-- INSERT INTO UsersData VALUES ('u21', 'Hoda', 'HodaAli', 'hoda.ali@gmail.com', 'hoda123', '01000000000', 'Egypt-Alexandria', 'client');
-- INSERT INTO UsersData VALUES ('u22', 'Karima', 'KarimaMahmoud', 'karima.mahmoud@yahoo.com', 'karima123', '01234567890', 'Egypt-Giza', 'client');
-- INSERT INTO UsersData VALUES ('u23', 'Mahmoud', 'MahmoudKhaled', 'mahmoud.khaled@gmail.com', 'mahmoud123', '01555555555', 'Egypt-Cairo', 'client');
-- INSERT INTO UsersData VALUES ('u24', 'Rana', 'RanaAhmed', 'rana.ahmed@hotmail.com', 'rana123', '01111111111', 'Egypt-Cairo', 'client');
-- INSERT INTO UsersData VALUES ('u25', 'Yara', 'YaraAli', 'yara.ali@gmail.com', 'yara123', '01000000000', 'Egypt-Alexandria', 'client');





-- CREATE TABLE IF NOT EXISTS Items (
--     id text PRIMARY KEY,
--     name text NOT NULL,
--     categoryName text NOT NULL,
--     brand text NOT NULL,
--     price REAL NOT NULL,
--     seal_loose text NOT NULL,
--     discountPercentage REAL NOT NULL,
--     amountInStores REAL NOT NULL,
--     loyalPoints INTEGER NOT NULL,
--     description text NOT NULL
--  );

-- INSERT INTO Items (id, name, categoryName, brand, price, seal_loose, discountPercentage, amountInStores, loyalPoints, description) VALUES 
-- ('i1', 'Chocolate Bar', 'Chocolate', 'Hersheys', 2.50, 'Sealed', 0, 100, 10, 'A classic Hersheys milk chocolate bar.'),
-- ('i2', 'Gummy Bears', 'Gummies', 'Haribo', 1.99, 'Loose', 0, 50, 5, 'A bag of fruity gummy bears.'),
-- ('i3', 'Jelly Beans', 'Jelly Beans', 'Jelly Belly', 4.99, 'Sealed', 10, 25, 5, 'A box of assorted Jelly Belly jelly beans.'),
-- ('i4', 'Sour Patch Kids', 'Sour Candies', 'Sour Patch', 1.50, 'Loose', 0, 75, 7, 'A bag of sour gummy candies.'),
-- ('i5', 'M&Ms', 'Chocolate', 'Mars', 1.99, 'Sealed', 0, 200, 20, 'A bag of colorful M&Ms.'),
-- ('i6', 'Licorice', 'Candy', 'Twizzlers', 1.25, 'Loose', 0, 100, 10, 'A pack of Twizzlers licorice candy.'),
-- ('i7', 'Lollipops', 'Hard Candy', 'Dum-Dums', 0.25, 'Loose', 0, 500, 5, 'A bag of assorted Dum-Dums lollipops.'),
-- ('i8', 'Snickers Bar', 'Chocolate', 'Snickers', 2.25, 'Sealed', 5, 50, 5, 'A classic Snickers candy bar.'),
-- ('i9', 'Kit Kat Bar', 'Chocolate', 'Kit Kat', 1.99, 'Sealed', 0, 150, 15, 'A Kit Kat candy bar.'),
-- ('i10', 'Skittles', 'Candy', 'Skittles', 1.99, 'Sealed', 0, 100, 10, 'A bag of Skittles candy.'),
-- ('i11', 'Reeses Cups', 'Chocolate', 'Reeses', 2.50, 'Sealed', 0, 75, 7, 'A pack of Reeses peanut butter cups.'),
-- ('i12', 'Starburst', 'Candy', 'Starburst', 1.50, 'Sealed', 0, 150, 15, 'A pack of Starburst fruit chews.'),
-- ('i13', 'Airheads', 'Candy', 'Airheads', 0.99, 'Loose', 0, 200, 20, 'A pack of Airheads candy.'),
-- ('i14', 'Nerds', 'Candy', 'Nerds', 1.25, 'Loose', 0, 100, 10, 'A box of Nerds candy.'),
-- ('i15', 'Jawbreakers', 'Hard Candy', 'Ferrara', 0.50, 'Loose', 0, 300, 3, 'A bag of Ferrara jawbreakers.'),
-- ('i16', 'Tootsie Rolls', 'Chocolate', 'Tootsie Roll', 0.99, 'Loose', 0, 200, 20, 'A bag of Tootsie Rolls.'),
-- ('i17', 'Swedish Fish', 'Gummies', 'Swedish Fish', 1.25, 'Loose', 0, 100, 10, 'A bag of Swedish Fish gummies.'),
-- ('i18', 'Butterfinger Bar', 'Chocolate', 'Butterfinger', 2.25, 'Sealed', 0, 50, 5, 'A classic Butterfinger candy bar.'),
-- ('i19', 'Milky Way Bar', 'Chocolate', 'Milky Way', 2.25, 'Sealed', 0, 75, 7, 'A classic Milky Way candy bar.'),
-- ('i20', 'Three Musketeers Bar', 'Chocolate', 'Three Musketeers', 2.25, 'Sealed', 0, 100, 10, 'A classic Three Musketeers candy bar.');

-- INSERT INTO Items (id, name, categoryName, brand, price, seal_loose, discountPercentage, amountInStores, loyalPoints, description) VALUES 
-- ('i21', 'Sour Belts', 'Sour Candies', 'Trolli', 1.99, 'Loose', 0, 50, 5, 'A pack of Trolli sour belts.'),
-- ('i22', 'Pop Rocks', 'Candy', 'Pop Rocks', 0.99, 'Loose', 0, 100, 10, 'A pack of Pop Rocks candy.'),
-- ('i23', 'Laffy Taffy', 'Candy', 'Laffy Taffy', 1.50, 'Sealed', 0, 75, 7, 'A pack of Laffy Taffy candy.'),
-- ('i24', 'Jolly Ranchers', 'Hard Candy', 'Jolly Rancher', 1.25, 'Loose', 0, 100, 10, 'A pack of Jolly Ranchers hard candy.'),
-- ('i25', 'Twix Bar', 'Chocolate', 'Twix', 2.25, 'Sealed', 0, 75, 7, 'A classic Twix candy bar.'),
-- ('i26', 'Milky Cream', 'Chocolate', 'Cadbury', 3.50, 'Sealed', 15, 25, 2, 'A Cadbury chocolate bar.'),
-- ('i27', 'Life Savers', 'Hard Candy', 'Life Savers', 0.99, 'Loose', 0, 200, 20, 'A pack of Life Savers hard candy.'),
-- ('i28', 'Gummy Worms', 'Gummies', 'Albanese', 1.99, 'Loose', 0, 50, 5, 'A pack of Albanese gummy worms.'),
-- ('i29', 'Almond Joy Bar', 'Chocolate', 'Almond Joy', 2.25, 'Sealed', 0, 100, 10, 'A classic Almond Joy candy bar.'),
-- ('i30', 'Mounds Bar', 'Chocolate', 'Mounds', 2.25, 'Sealed', 0, 50, 5, 'A classic Mounds candy bar.'),
-- ('i31', 'Hersheys Kisses', 'Chocolate', 'Hersheys', 1.50, 'Sealed', 0, 150, 15, 'A bag of Hersheys Kisses chocolate.'),
-- ('i32', 'Hersheys Miniatures', 'Chocolate', 'Hersheys', 2.50, 'Sealed', 0, 75, 7, 'A bag of Hersheys Miniatures chocolate.'),
-- ('i33', 'Nestle Crunch Bar', 'Chocolate', 'Nestle', 2.25, 'Sealed', 0, 100, 10, 'A classic Nestle Crunch candy bar.'),
-- ('i34', 'Reeses Pieces', 'Chocolate', 'Reeses', 1.99, 'Sealed', 0, 150, 15, 'A bag of Reeses Pieces candy.'),
-- ('i35', 'Sour Punch Straws', 'Sour Candies', 'Sour Punch', 1.50, 'Loose', 0, 75, 7, 'A pack of Sour Punch Straws.'),
-- ('i36', 'Good & Plenty', 'Candy', 'Good & Plenty', 0.99, 'Loose', 0, 200, 20, 'A pack of Good & Plenty candy.'),
-- ('i37', 'Hersheys Cookies n Creme', 'Chocolate', 'Hersheys', 2.50, 'Sealed', 0, 75, 7, 'A Hersheys Cookies n Creme candy bar.'),
-- ('i38', 'SweeTarts', 'Candy', 'SweeTarts', 1.25, 'Loose', 0, 100, 10, 'A pack of SweeTarts candy.'),
-- ('i39', 'Skittles', 'Candy', 'Skittles', 1.99, 'Sealed', 0, 150, 15, 'A pack of Skittles candy.'),
-- ('i40', 'Starburst', 'Candy', 'Starburst', 1.50, 'Sealed', 0, 100, 10, 'A pack of Starburst candy.');



-- CREATE TABLE Categories (
--     id TEXT PRIMARY KEY,
--     name TEXT NOT NULL,
--     items TEXT NOT NULL
-- );

-- INSERT INTO Categories (id, name, items) VALUES 
-- ('c1', 'Chocolate', 'i1,i5,i8,i9,i11,i18,i19,i20,i25,i26,i31,i32,i33'),
-- ('c2', 'Gummies', 'i2,i7,i17,i28,i29'),
-- ('c3', 'Jelly Beans', 'i3'),
-- ('c4', 'Sour Candies', 'i4,i21,i35'),
-- ('c5', 'Hard Candy', 'i7,i15,i24,i27'),
-- ('c6', 'Candy', 'i6,i12,i13,i14,i22,i23,i30,i36,i38'),
-- ('c7', 'Discounted Items', 'i8,i13,i26,i19');



-- CREATE TABLE orders (
--     id TEXT PRIMARY KEY,
--     clientID TEXT REFERENCES UsersData(id),
--     address TEXT NOT NULL,
--     items TEXT NOT NULL,
--     itemsAmounts TEXT NOT NULL,
--     paymentMethods TEXT NOT NULL,
--     paymentAmounts TEXT NOT NULL,
--     price REAL NOT NULL
-- );

-- INSERT INTO orders VALUES 
-- ('o1', 'c1', '123 Main St', 'i1,i2', '2,3', 'cash,loyaltyPoints', '5.47,3', 8.47),
-- ('o2', 'c2', '456 Elm St', 'i3,i4,i5', '1,2,1', 'loyaltyPoints,giftVoucher', '8.55,4', 12.55),
-- ('o3', 'c3', '789 Oak St', 'i6,i7,i8,i9', '2,1,3,1', 'cash', '19.32', 19.32),
-- ('o4', 'c4', '321 Pine St', 'i10,i11', '4,2', 'giftVoucher', '11.85', 11.85),
-- ('o5', 'c5', '654 Maple St', 'i12,i13,i14', '3,1,2', 'loyaltyPoints,giftVoucher', '12.93,4', 16.93),
-- ('o6', 'c1', '987 Cedar St', 'i15,i16,i17,i18', '2,2,1,3', 'cash,loyaltyPoints,giftVoucher', '10.79,7,6', 23.79),
-- ('o7', 'c2', '654 Birch St', 'i19,i20', '3,2', 'cash,giftVoucher', '7.57,7', 14.57);


-- SELECT * FROM UsersData;
-- SELECT * FROM Categories;
-- SELECT * FROM Items;
SELECT * FROM orders;

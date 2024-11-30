-- tüm müşteriler
SELECT * FROM my_company_db.categories;


SELECT * FROM my_company_db.products;

SELECT * FROM my_company_db.customers;

SELECT * FROM my_company_db.orders;

SELECT * FROM my_company_db.shippings;



SELECT * FROM my_company_db.customers;   -- SOLDAKI TABLO A
SELECT * FROM my_company_db.orders;      -- SAGDAKI TABLO B

/*
SELECT KOLONLARI_SEC
FROM SOLDAKI_TABLO_A A
JOIN SAGDAKI_TABLO_B B
ON ŞART
*/

-- default varsayılan JOIN -- INNNER JOIN aynıdır. Kesişim kümesidir. İki tablodaki ortak kayıtları getirir.
SELECT *
FROM my_company_db.customers -- SOLDAKI TABLO
JOIN my_company_db.orders  -- SAGDAKI TABLO
ON customers."CUSTOMER_ID" = orders."CUSTOMER_ID";


-- default varsayılan JOIN -- INNNER JOIN aynıdır. Kesişim kümesidir. İki tablodaki ortak kayıtları getirir.
SELECT *
FROM my_company_db.customers -- SOLDAKI TABLO
        INNER JOIN my_company_db.orders  -- SAGDAKI TABLO
              ON customers."CUSTOMER_ID" = orders."CUSTOMER_ID";

-- Kolonları seçtik
SELECT customers."CUSTOMER_ID", customers."FIRST_NAME", customers."LAST_NAME",        orders."CUSTOMER_ID",  orders."ORDER_BRANCH"
FROM my_company_db.customers -- SOLDAKI TABLO
         INNER JOIN my_company_db.orders  -- SAGDAKI TABLO
                    ON customers."CUSTOMER_ID" = orders."CUSTOMER_ID";


-- Tablolar için lakap kullanıyoruz
SELECT cus."CUSTOMER_ID", cus."FIRST_NAME", cus."LAST_NAME",        ord."CUSTOMER_ID",  ord."ORDER_BRANCH"
FROM my_company_db.customers cus
         INNER JOIN my_company_db.orders ord
                    ON cus."CUSTOMER_ID" = ord."CUSTOMER_ID";

-- Kolonlar için lakap kullanıyoruz
SELECT cus."CUSTOMER_ID" c_cusid,  cus."FIRST_NAME", cus."LAST_NAME",        ord."CUSTOMER_ID"  o_cusid   ,  ord."ORDER_BRANCH"
FROM my_company_db.customers cus
         INNER JOIN my_company_db.orders ord
                    ON cus."CUSTOMER_ID" = ord."CUSTOMER_ID";


-- Tablolar ve Kolonlar için lakap kullanıyoruz
SELECT c."CUSTOMER_ID" c_cusid,  c."FIRST_NAME" c_fname, c."LAST_NAME" c_lname,        o."CUSTOMER_ID"  o_cusid,  o."ORDER_BRANCH" o_branch
FROM my_company_db.customers c
INNER JOIN my_company_db.orders o
ON c."CUSTOMER_ID" = o."CUSTOMER_ID";


-- Tablolar ve Kolonlar için lakap kullanıyoruz
SELECT c."CUSTOMER_ID" c_cusid,  c."FIRST_NAME" c_fname, c."LAST_NAME" c_lname,        o."CUSTOMER_ID"  o_cusid,  o."ORDER_BRANCH" o_branch
FROM my_company_db.customers c
         INNER JOIN my_company_db.orders o
                    ON c."CUSTOMER_ID" = o."CUSTOMER_ID";



-- Yasi 20 den küçük müşteriler
SELECT * FROM my_company_db.customers
WHERE "AGE" < 20;


-- Sipariş tutarı 4000'den büyük olanları getir.
SELECT * FROM my_company_db.orders
WHERE "AMOUNT" > 4000;


-- Tutarı 4000'den büyük olan siparişleri getir.    Müşteri bilgileriyle birlikte listele.
SELECT *
FROM my_company_db.customers -- SOLDAKI TABLO
JOIN my_company_db.orders  -- SAGDAKI TABLO
ON customers."CUSTOMER_ID" = orders."CUSTOMER_ID"
WHERE "AMOUNT" > 4000;

-- Kaç müşterimiz var?
SELECT COUNT(*) FROM  my_company_db.customers;

-- Kaç tane sipariş var?
SELECT COUNT(*) FROM  my_company_db.orders;

-- LEFT JOIN ile
SELECT *
FROM my_company_db.customers -- SOLDAKI TABLO    1008 KAYIT
LEFT JOIN my_company_db.orders -- SAGDAKI TABLO  4 KAYIT
ON customers."CUSTOMER_ID" = orders."CUSTOMER_ID";

-- RIGHT JOIN ile
SELECT *
FROM my_company_db.customers -- SOLDAKI TABLO
         RIGHT JOIN my_company_db.orders -- SAGDAKI TABLO
                   ON customers."CUSTOMER_ID" = orders."CUSTOMER_ID";



-- LEFT JOIN ile ŞART ekledik. Sadece eşleşen siparişleri listele.
SELECT *                                           --      şimdi               gelecek
FROM my_company_db.customers            -- SOLDAKI TABLO  1008 kayıt var.     100.000
         LEFT JOIN my_company_db.orders -- SAGDAKI TABLO   4   kayıt var.   2.000.000
ON customers."CUSTOMER_ID" = orders."CUSTOMER_ID"
WHERE  orders."CUSTOMER_ID" > 0;



-- RIGHT JOIN ile ŞART ekledik. Sadece eşleşen siparişleri listele.
SELECT *
FROM my_company_db.customers             -- SOLDAKI TABLO   1008 kayıt var.     100.000
         RIGHT JOIN my_company_db.orders -- SAGDAKI TABLO    4   kayıt var.   2.000.000
                    ON customers."CUSTOMER_ID" = orders."CUSTOMER_ID"
WHERE  orders."CUSTOMER_ID" > 0;

-- FULL OUTER JOIN ile FULL JOIN aynıdır. Postgres için.
SELECT c."CUSTOMER_ID", c."FIRST_NAME" fname, c."LAST_NAME" lname,        o."CUSTOMER_ID", o."ORDER_BRANCH", o."ORDER_DATE", o."AMOUNT"
FROM my_company_db.customers c            -- SOLDAKI TABLO   1008 kayıt var.
FULL OUTER JOIN my_company_db.orders o    -- SAGDAKI TABLO    4   kayıt var.
ON c."CUSTOMER_ID" = o."CUSTOMER_ID";


-- FULL OUTER JOIN ile FULL JOIN aynıdır. Postgres için.
SELECT c."CUSTOMER_ID", c."FIRST_NAME" fname, c."LAST_NAME" lname,        o."CUSTOMER_ID", o."ORDER_BRANCH", o."ORDER_DATE", o."AMOUNT"
FROM my_company_db.customers c            -- SOLDAKI TABLO   1008 kayıt var.
         FULL JOIN my_company_db.orders o    -- SAGDAKI TABLO    4   kayıt var.
                         ON c."CUSTOMER_ID" = o."CUSTOMER_ID";




-- LEFT JOIN ile SOLDAKI TABLOyu ekledik ama SAĞDAKİ EŞLEŞENLERİ ÇIKARDIK. Elimize gereksiz satırlar kaldı.
-- SOL TABLODA - SAĞ İLE EŞLEŞMEYEN KAÇ TANE KAYIT VAR?
-- HENÜZ ALIŞVERİŞ YAPMAMIŞ MÜŞTERİLER
SELECT *
FROM my_company_db.customers            -- SOLDAKI TABLO  1008 kayıt var.
         LEFT JOIN my_company_db.orders -- SAGDAKI TABLO   4   kayıt var.
                   ON customers."CUSTOMER_ID" = orders."CUSTOMER_ID"
WHERE  orders."CUSTOMER_ID" IS NULL;



-- LEFT JOIN ile SOLDAKI TABLOyu ekledik ama SAĞDAKİ EŞLEŞENLERİ ÇIKARDIK. Elimize gereksiz satırlar kaldı.
-- SOL TABLODA - SAĞ İLE EŞLEŞMEYEN KAÇ TANE KAYIT VAR?
-- HENÜZ ALIŞVERİŞ YAPMAMIŞ MÜŞTERİLER
SELECT COUNT(*)
FROM my_company_db.customers            -- SOLDAKI TABLO  1008 kayıt var.
         LEFT JOIN my_company_db.orders -- SAGDAKI TABLO   4   kayıt var.
                   ON customers."CUSTOMER_ID" = orders."CUSTOMER_ID"
WHERE  orders."CUSTOMER_ID" IS NULL;




-- RIGHT JOIN ile SAĞ TABLODA - SOL İLE EŞLEŞMEYEN KAÇ TANE KAYIT VAR?
SELECT *
FROM my_company_db.customers            -- SOLDAKI TABLO  1008 kayıt var.
         RIGHT JOIN my_company_db.orders -- SAGDAKI TABLO   4   kayıt var.
                   ON customers."CUSTOMER_ID" = orders."CUSTOMER_ID"
WHERE  customers."CUSTOMER_ID" IS NULL;


-- RIGHT JOIN ile SAĞ TABLODA - SOL İLE EŞLEŞMEYEN KAÇ TANE KAYIT VAR?
SELECT COUNT(*)
FROM my_company_db.customers            -- SOLDAKI TABLO  1008 kayıt var.
         RIGHT JOIN my_company_db.orders -- SAGDAKI TABLO   4   kayıt var.
                    ON customers."CUSTOMER_ID" = orders."CUSTOMER_ID"
WHERE  customers."CUSTOMER_ID" IS NULL;



-- FULL OUTER JOIN ile FULL JOIN KESİŞMEYEN ORTAK OLMAYAN KAYITLAR.
SELECT c."CUSTOMER_ID", c."FIRST_NAME" fname, c."LAST_NAME" lname,        o."CUSTOMER_ID", o."ORDER_BRANCH", o."ORDER_DATE", o."AMOUNT"
FROM my_company_db.customers c            -- SOLDAKI TABLO   1008 kayıt var.
FULL OUTER JOIN my_company_db.orders o    -- SAGDAKI TABLO    4   kayıt var.
ON c."CUSTOMER_ID" = o."CUSTOMER_ID"
WHERE  c."CUSTOMER_ID" IS NULL     OR      o."CUSTOMER_ID"  IS NULL;



-- FULL OUTER JOIN ile FULL JOIN KESİŞMEYEN ORTAK OLMAYAN KAYITLAR.


CREATE VIEW my_company_db.KESISEN_ORTAK_KAYITLAR  AS
SELECT cus."CUSTOMER_ID" c_cusid,  cus."FIRST_NAME", cus."LAST_NAME",        ord."CUSTOMER_ID"  o_cusid   ,  ord."ORDER_BRANCH"
FROM my_company_db.customers cus
JOIN my_company_db.orders ord
ON cus."CUSTOMER_ID" = ord."CUSTOMER_ID";

SELECT  * FROM my_company_db.KESISEN_ORTAK_KAYITLAR;








-- LEFT JOIN ile VIEW
CREATE VIEW my_company_db.LEFT_JOIN_CUSTOMER_ORDER AS
SELECT  cus."CUSTOMER_ID" c_cusid,  cus."FIRST_NAME", cus."LAST_NAME",        ord."CUSTOMER_ID"  o_cusid   ,  ord."ORDER_BRANCH"
FROM my_company_db.customers cus
LEFT JOIN my_company_db.orders ord
ON cus."CUSTOMER_ID" = ord."CUSTOMER_ID";

SELECT * FROM  my_company_db.LEFT_JOIN_CUSTOMER_ORDER;



-- RIGHT JOIN ile VIEW
CREATE VIEW my_company_db.RIGHT_JOIN_CUSTOMER_ORDER AS
SELECT  cus."CUSTOMER_ID" c_cusid,  cus."FIRST_NAME", cus."LAST_NAME",        ord."CUSTOMER_ID"  o_cusid   ,  ord."ORDER_BRANCH"
FROM my_company_db.customers cus
RIGHT JOIN my_company_db.orders ord
ON cus."CUSTOMER_ID" = ord."CUSTOMER_ID";

SELECT * FROM  my_company_db.LEFT_JOIN_CUSTOMER_ORDER;

SELECT * FROM  my_company_db.RIGHT_JOIN_CUSTOMER_ORDER;



-- VIEW ISIMLERINDE VIEW EKINI KULLANMAK DAHA IYIDIR
CREATE VIEW my_company_db.VIEW_RIGHT_JOIN_CUSTOMER_ORDER AS
SELECT  cus."CUSTOMER_ID" c_cusid,  cus."FIRST_NAME", cus."LAST_NAME",        ord."CUSTOMER_ID"  o_cusid   ,  ord."ORDER_BRANCH"
FROM my_company_db.customers cus
         RIGHT JOIN my_company_db.orders ord
                    ON cus."CUSTOMER_ID" = ord."CUSTOMER_ID";



-- VIEW ISIMLERINDE VIEW EKINI KULLANMAK DAHA IYIDIR
CREATE VIEW my_company_db.VIEW_LEFT_JOIN_CUSTOMER_ORDER AS
SELECT  cus."CUSTOMER_ID" c_cusid,  cus."FIRST_NAME", cus."LAST_NAME",        ord."CUSTOMER_ID"  o_cusid   ,  ord."ORDER_BRANCH"
FROM my_company_db.customers cus
         LEFT JOIN my_company_db.orders ord
                   ON cus."CUSTOMER_ID" = ord."CUSTOMER_ID";


SELECT * FROM  my_company_db.VIEW_LEFT_JOIN_CUSTOMER_ORDER;


SELECT * FROM  my_company_db.VIEW_RIGHT_JOIN_CUSTOMER_ORDER;



-- INDEX HIZLI ARAMA YAPMAK ICINDIR
SELECT * FROM my_company_db.customers;



-- INDEX ONCESI SORGU TAMAMLANMA ZAMAN MALIYETI Query complete 00:00:00.077
SELECT * FROM my_company_db.customers
WHERE "EMAIL" = 'fpavlikrr@bloglines.com';


-- INDEX OLUSTURMA
CREATE INDEX INDEX_CUSTOMER_EMAIL
    ON my_company_db.customers ("EMAIL");


-- INDEX SONRASI SORGU TAMAMLANMA ZAMAN MALIYETI Query complete 00:00:00.045
SELECT * FROM my_company_db.customers
WHERE "EMAIL" = 'fpavlikrr@bloglines.com';


-- INDEX SILME
DROP INDEX my_company_db.INDEX_CUSTOMER_EMAIL;



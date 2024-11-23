-- tüm müşteriler
SELECT *
FROM my_company_db.customers;

-- tüm müşteriler secilen kolonların sırasını biz belirliyoruz
SELECT "CUSTOMER_ID", "FIRST_NAME", "LAST_NAME", "COUNTRY", "AGE"
FROM my_company_db.customers;

-- AS as   lakap tamkma ad kullanımı tabloda
SELECT c."CUSTOMER_ID", c."FIRST_NAME", c."LAST_NAME", c."AGE", c."COUNTRY"
FROM my_company_db.customers AS c;

SELECT c."CUSTOMER_ID", c."FIRST_NAME", c."LAST_NAME", c."AGE", c."COUNTRY"
FROM my_company_db.customers as c;

SELECT c."CUSTOMER_ID", c."FIRST_NAME", c."LAST_NAME", c."AGE", c."COUNTRY"
FROM my_company_db.customers c;


-- MAX yasi en büyük ve MIN en küçük olan müşteri
SELECT MAX("AGE"), MIN("AGE"), SUM("AGE"), COUNT("AGE"), AVG("AGE")
FROM my_company_db.customers;


-- Müşteri isilerini A'dan Z'ye inceler.
SELECT MAX("FIRST_NAME"), MIN("FIRST_NAME")
FROM my_company_db.customers;




-- ŞARTLI SORGU yasi 22'den büyük olanlar
SELECT *
FROM my_company_db.customers
WHERE "AGE" > 22;


-- ŞARTLI SORGU - en küçük kişiyi bul ve kolonlarıyla birlikte göster.
SELECT MIN("AGE")
FROM my_company_db.customers;

SELECT *
FROM my_company_db.customers
WHERE "AGE" = 22;


SELECT *
FROM my_company_db.customers
WHERE "AGE" = (
    SELECT MIN("AGE")
    FROM my_company_db.customers
);


SELECT *
FROM my_company_db.customers
ORDER BY "AGE" LIMIT 1;


-- kac tane musterimiz var.
SELECT COUNT(*)
FROM my_company_db.customers;

SELECT COUNT(*) AS MUSTERI_SAYISI
FROM my_company_db.customers;

SELECT COUNT(*) MUSTERI_SAYISI
FROM my_company_db.customers;

SELECT COUNT(*) "MUSTERI SAYISI"
FROM my_company_db.customers;

-- ülkesi TR olanların sayısı
SELECT COUNT(*) "MUSTERI SAYISI"
FROM my_company_db.customers
WHERE "COUNTRY" = 'TR';

SELECT *
FROM my_company_db.customers;

-- Kac tane tekil ulke var?
SELECT COUNT(DISTINCT "COUNTRY")
FROM my_company_db.customers;

-- Her ülkeden kaç kişi var?
SELECT "COUNTRY", COUNT(*)
FROM my_company_db.customers
GROUP BY "COUNTRY" ;


SELECT *
FROM my_company_db.customers;


-- Her ülkeden kaç kişi var? Müsşteri sayısına göre en büyükten küçüğe doğru sırala.
SELECT "COUNTRY", COUNT(*) TOTAL_CUSTOMER_COUNT
FROM my_company_db.customers
GROUP BY "COUNTRY"
ORDER BY TOTAL_CUSTOMER_COUNT DESC;

SELECT "COUNTRY", COUNT(*)
FROM my_company_db.customers
GROUP BY "COUNTRY"
ORDER BY COUNT(*) DESC;


-- Her ülkede kaç kişi var? Sırala ve sayısı 30'dan çok olanları al sadece.
SELECT "COUNTRY", COUNT(*) CUSTOMER_COUNT
FROM my_company_db.customers
GROUP BY "COUNTRY"
HAVING COUNT(*) > 30
ORDER BY CUSTOMER_COUNT DESC ;


--
-- Her ülkede kaç kişi var? Testen sırala ve sayısı 30'dan çok olan ve yaşı 25'ten büyük olan müşterileri gruplayıp göster.
SELECT "COUNTRY", COUNT(*) CUSTOMER_COUNT
FROM my_company_db.customers
WHERE "AGE" > 25
GROUP BY "COUNTRY"
HAVING COUNT(*) > 30
ORDER BY CUSTOMER_COUNT DESC ;


-- Çoklu şart - Seçilen ülkeleri listele
SELECT * FROM my_company_db.customers
WHERE
    "COUNTRY" = 'TR' OR
    "COUNTRY" = 'DE' OR
    "COUNTRY" = 'CA' OR
    "COUNTRY" = 'RU' ;


SELECT * FROM my_company_db.customers
WHERE
    "COUNTRY" IN ('TR' , 'DE',  'CA',  'RU') ;


-- çoklu şart olmayanlar

SELECT * FROM my_company_db.customers
WHERE
    "COUNTRY" NOT IN ('TR' , 'DE',  'CA',  'RU') ;


-- Yasi 18 VE (AND) 26 arası olanları getir.
SELECT * FROM my_company_db.customers
WHERE  "AGE" >18  AND "AGE" < 26;



-- Yasi 18 VE (AND) 26 arası olanları getir. 18 VE 26 da dahil.
SELECT * FROM my_company_db.customers
WHERE  "AGE" >17  AND "AGE" < 27;

SELECT * FROM my_company_db.customers
WHERE  "AGE" >= 18  AND "AGE" <= 26;


SELECT * FROM my_company_db.customers
WHERE  "AGE" BETWEEN  18 AND 26;

-- Yasi 18 VE 26 OLMAYANLAR!
SELECT * FROM my_company_db.customers
WHERE "AGE" NOT BETWEEN  18 AND 26;


-- Secilen isimlere göre listele
SELECT * FROM my_company_db.customers
WHERE "FIRST_NAME" = 'Ahmet';


-- Secilen harflerle başlayanları getir.
SELECT * FROM my_company_db.customers
WHERE "FIRST_NAME" LIKE 'Er%';


-- Secilen harflerle bas kısmı önemli değil sonunda er olması şartı var, onları getir.
SELECT * FROM my_company_db.customers
WHERE "FIRST_NAME" LIKE '%er';

-- İçinde sadece er geçenleri getir.
SELECT * FROM my_company_db.customers
WHERE "FIRST_NAME" LIKE '%er%';


-- İçinde  e geçenleri getir ama h geçenleri getirme!
SELECT * FROM my_company_db.customers
WHERE "FIRST_NAME" LIKE '%e%' AND "FIRST_NAME" NOT LIKE '%h%';


ALTER TABLE IF EXISTS my_company_db.orders
    ADD FOREIGN KEY ("ORDER_ID")
        REFERENCES my_company_db.products ("PRODUCT_ID") MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID;
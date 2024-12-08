# REAL ESTATE 

Real Estate Project Version 1.0.0

## Installation DB

### MySQL
```
CREATE SCHEMA `companydb` DEFAULT CHARACTER SET utf8 COLLATE utf8_bin ;
```

### PostgreSQL

```
CREATE DATABASE companydb
    WITH
    OWNER = postgres
    ENCODING = 'UTF8'
    LOCALE_PROVIDER = 'libc'
    CONNECTION LIMIT = -1
    IS_TEMPLATE = False;
```

### Property - Mülk Varlık (Ev, Arsa, Dükkan)

- id 
- propertyName
- title
- description
- type
- location
- price
---
- bedroom
- bathroom
- area

### Buyer - Alıcı

- id
- firstName
- lastName
- email
- phone
- username
- password
- rating


### Seller - Alıcı

- id
- firstName
- lastName
- email
- phone
- username
- password

### Agent - Emlakçı

- id
- firstName
- lastName
- email
- phone
- username
- password
- rating
- officeAddress


<hr/>

### Software Info

Java 23 <br>
Hibernate 6 <br> 
MySQL 9 <br>
PostgreSQL 17 <br> 

## License

[Real Estate Company](https://mimaraslan.com)
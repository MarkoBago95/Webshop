# Webshop



#postgresql local database

CREATE DATABASE product;

CREATE TABLE products (


	id serial4 NOT NULL,
	code varchar(10) NOT NULL,
	name varchar(100) NOT NULL,
	pricehrk numeric NOT NULL,
	priceeur numeric NOT NULL,
	description varchar(500) NOT NULL,
	isavailable bool NOT NULL,
	CONSTRAINT product_pkey PRIMARY KEY (id)
	
	
);

#spring-boot
clone this repository to your local disk

set your application properties to connect your local database or server port 

run as spring boot application (I'm using eclipse ide)

#postman payloads examples


#save 
POST localhost:8080/product/save
{
    
    "name":"Nike shoes",
    "code":"4567897891",
    "priceHrk":499.95,
    "description":"Men's nike shoes",
    "isAvailable":false

}
#update
PUT localhost:8080/product/update
{

    "id":1,
    "name":"Nike shoes",
    "code":"4567897891",
    "priceHrk":499.95,
    "priceEur":66.42,
    "description":"Men's Nike shoes",
    "isAvailable":false

}
#getall
GET localhost:8080/product/getall

#getone/{id}<-id number
GET localhost:8080/product/getone/1

#delete/{id} 
DELETE localhost:8080/product/delete/1


Note:
I didn't have time to research more about postresql in the docker container so I used psql localy.

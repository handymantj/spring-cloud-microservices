# Project Title
ทำ Microservices ด้วย Spring Cloud Netflix OSS

## Getting Started
อธิบายวิธีการรัน Projects บน Local Machine

### Prerequisites
* Java 8
* Maven
* Internet connection
* Config repository ("https://github.com/handymantj/microservices-config.git" you can use this or copy to your own repository)

### Installing
เปิดโปรเจค ด้วย IDE ตามถนัด รัน maven คำสั่ง spring-boot:run ทีละโปรเจคตามลำดับต่อไปนี้
	1. config-server 
	2. eureka-server 
	3. zuul-server
	4. auth-server 
	5. promotion-service
	6. order-service

### running test
http:localhost:8761
(eureka-service) รูปภาพแสดงเมื่อทุก service สามารถ start ได้อย่างถูกต้อง
![eureka](https://user-images.githubusercontent.com/29037349/50541167-58a8b580-0bd2-11e9-8f69-e273f7e8c97c.png)

## Acknowledgments
*	ขอบคุณพี่บอมที่มอบความรู้และจุดประกายไฟ
* 	ขอบคุณพี่ปิเก้ที่แชร์เรื่องนี้






# Microservices Demo with Spring Cloud
ทำ Microservices ด้วย Spring Cloud Netflix OSS
![system](https://user-images.githubusercontent.com/29037349/50545928-3b66fc00-0c51-11e9-8d0f-c2ad2357d422.png)

## Getting Started
อธิบายวิธีการรัน Projects บน Local Machine (localhost)

### Prerequisites
* Java 8
* Maven
* Internet connection (for Maven to download artifacts and bootstrap configurations at Github)
* Config repository ("https://github.com/handymantj/microservices-config.git" you can use this or copy config files to your own repository)

### Installing
เปิดโปรเจค ด้วย IDE หรือเปิดด้วย Console รันคำสั่ง <br /> 
```
mvn spring-boot:run 
```
รันทีละโปรเจคตามลำดับต่อไปนี้ <br />
	1. config-server  <br />
	2. eureka-server <br />
	3. zuul-server  <br />
	4. auth-server  <br />
	5. promotion-service <br />
	6. order-service <br />

### Running Test
http:localhost:8761
(eureka-service) รูปภาพแสดงเมื่อทุก service สามารถ start ได้อย่างถูกต้อง
![eureka](https://user-images.githubusercontent.com/29037349/50541167-58a8b580-0bd2-11e9-8f69-e273f7e8c97c.png)

## Acknowledgments
*	ขอบคุณพี่บอมที่มอบความรู้และจุดประกายไฟ
* 	ขอบคุณพี่ปิเก้ผู้เริ่มต้นแชร์เรื่อง Spring Cloud - Microservices






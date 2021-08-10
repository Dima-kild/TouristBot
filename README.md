TASK:

Необходимо создать web приложение по управлению собственным туристическим телеграм ботом.

1) Телеграм бот выдает пользователю справочную информацию о введенном городе. Например, пользователь вводит: «Москва»,
   чат-бот отвечает: «Не забудьте посетить Красную Площадь. Ну а в ЦУМ можно и не заходить)))».
2) Данные о городах должны храниться в базе данных.
3) Управлять данными о городах (добавлять новые города и информацию о них, изменять и удалять любую информацию)
   необходимо через REST WebService. Используемые технологии: SpringBoot, SpringMVC, SpringData, Hibernate, Java не ниже
   1.8. Для сборки проекта использовать Maven. Исходный код приложения должен быть залит на GitHub, в файле readme
   указать, что необходимо для запуска (в том числе имя телеграм бота и его токен). На выполнение даем одну рабочую
   неделю.


Запуск 

Версия Java 11
-создать Schema "thelper";
 Указать информацию о БД в application.properties:
-spring.datasource.url;
-spring.datasource.username;
-spring.datasource.password;  
-server.port= (в моем приложение 8097), вы можете выбрать свой;
-Имя бота: YourBestTouristBot; 
-Токен бота: 1861726467:AAEfuZ7bUYjD5kV3ZeL785gvPoC14idh_8Q;
Вся информация в application.properties.

REST web-service:

GET http://localhost:8097/api/cities
Accept: application/json

###

POST http://localhost:8097/api/cities
Content-Type: application/json
{
"name": "Нью-Йорк",
"info": "сходите на статую свободы"
}

###

PUT http://localhost:8097/api/cities/id
Content-Type: application/json
{
"name": "Нью-Йорк",
"info": "сходите в централ парк"
}

###

DELETE http://localhost:8097/api/cities/id

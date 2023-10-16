# Rocketseat | Java Event

+ Repo for the ToDo List project developed during the Java Week at [Rocketseat](https://www.rocketseat.com.br/), usind Java, Spring Boot, H2 Database and Basic Authorization.
<br/>

## Deploy

+ [Render](https://render.com/)
+ https://rocketseat-todolist-e78w.onrender.com

<br/>

## Requests
`
GET /tasks
`
+ Returns tasks.
```
curl --location 'http://localhost:8080/tasks/' \
--header 'Authorization: Basic dXNlcnRlc3Q6MTIzNDU2'
```
<br/>

`
POST /users/
`
+ Adds a new user.
```
curl --location 'http://localhost:8080/users/' \
--header 'Content-Type: application/json' \
--data '{
    "name": "user test",
    "username": "usertest",
    "password": "123456"
}'
```
<br/>

`
POST /tasks/
`
+ Adds a new task.
```
curl --location 'http://localhost:8080/tasks/' \
--header 'Content-Type: application/json' \
--header 'Authorization: Basic dXNlcnRlc3Q6MTIzNDU2' \
--data '{
    "description": "Tarefa exemplo",
    "title": "titulo exemplo",
    "priority": "alta",
    "startAt": "2023-10-16T12:30:00",
    "endAt": "2023-10-16T12:35:00"
}'
```
<br/>

`
PUT /tasks/{id}
`
+ Updates a task.
```
curl --location --request PUT 'http://localhost:8080/tasks/3232e4d3-465c-4f71-9561-ec9965c02f2c' \
--header 'Content-Type: application/json' \
--header 'Authorization: Basic Z2lzZWxsZXRlY2g6MTIzNDU2' \
--data '  {
        "title": "titulo exemplo titulo exemplotitulo exemplotitulo exemplo titulo exemplo titulo exemplo"
    }'
```
<br/>

>## Technologies 🧰

<p align="left">
<img alt="Java" src="https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white" height="27" /> 
<img alt="SpringBoot" src="https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white" height="27" />
</p>

<br/>

## 

<div align="center">
<p>Made with ❤️ by Giselle Ferreira.</p>
  <p>
    <a href="https://linkedin.com/in/giselleferreiras" target="_blank" >
      <img align="center" height="35" src="https://cdn-icons-png.flaticon.com/512/174/174857.png" alt="Giselle Ferreira Linkedin" />
    </a>
    <a href="https://instagram.com/giselletech" target="_blank" >
      <img align="center" height="35" src="https://upload.wikimedia.org/wikipedia/commons/thumb/a/a5/Instagram_icon.png/1200px-Instagram_icon.png" alt="Giselle Ferreira Instagram" />
    </a>
  </p>
</div>


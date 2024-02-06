<h1 align="center">
    Micro serviço envio de email
</h1>

```javascript
@Autor Johnny Carvaho
@Date 2024
```

## Principais tecnologias utilizadas: <br/>
<p>
    <img align="center" alt="Java" height="30" width="40" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original-wordmark.svg" />
    <img align="center" alt="Spring" height="30" width="40" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/spring/spring-original-wordmark.svg" />
    <img align="center" alt="RabbitMQ" height="30" width="40" src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/rabbitmq/rabbitmq-original.svg"/>RabbitMQ
    <img align="center" alt="Gmail" height="30" width="40" src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/google/google-original.svg"/>Gmail
</p>

## Resumo do projeto

Este é um projeto que faz parte do [projeto de cadastro de usuário microservices](https://github.com/JohnnyCarvalho/user-microservices) para aperfeiçoamento das habilidades em Java, utilizando a arquitetura de micro serviços. Nessa aplicação irei implementar um serviço envio de e-mail e comunicação com um broker, o qual ele vai ler a mensagem enviada pelo outro microserviço e executar o envio do e-mail, bem como salvar no banco de dados.
Esse projeto será executado em etapas, a começar pelos 2 microservices back-end e finalizando com a implementação do front-end em Angular:

## Possíveis status das etapas do projeto
####
<img align="center" height="20" width="20" src="https://github.com/JohnnyCarvalho/email-microservices/blob/master/email-services/assets/loading.gif"> - Em andamento.<br>
<img align="center" height="20" width="20" src="https://github.com/JohnnyCarvalho/email-microservices/blob/master/email-services/assets/ok.png"> - Concluído.


## Projeto geral
- <img align="center" height="20" width="20" src="https://github.com/JohnnyCarvalho/email-microservices/blob/master/email-services/assets/loading.gif"> <b>Front end</b>
- <img align="center" height="20" width="20" src="https://github.com/JohnnyCarvalho/email-microservices/blob/master/email-services/assets/ok.png"> <b>Microcervices email</b>
- <img align="center" height="20" width="20" src="https://github.com/JohnnyCarvalho/email-microservices/blob/master/email-services/assets/ok.png"> <b>Microcervices register-user</b>


## Como executar o projeto

### Front End (Quando tiver concluído)
Para que o código funcione corretamente deve-se ser instalados as seguintes ferramentas:
- Node em <a>https://nodejs.org/en/download/</a>

Certifique-se de que o ```npm``` foi instalado junto, geralmente ele é instalado jundo com o node, para isso de o seguinte comando no terminal
````
npm --v
````
Após a instalação e configuração do Node, deve-se instalar as seguintes ferramentas através do terminal:
- Angular CLI 
```
npm i @angular/cli
```
- Angular Material 
```
ng add @angular/material
```

### Back End
<img align="center" height="20" width="20" src="https://github.com/JohnnyCarvalho/email-microservices/blob/master/email-services/assets/ok.png"> - Criar repositório GitHub.<br>
<img align="center" height="20" width="20" src="https://github.com/JohnnyCarvalho/email-microservices/blob/master/email-services/assets/ok.png"> - Criar projeto Spring.<br>
<img align="center" height="20" width="20" src="https://github.com/JohnnyCarvalho/email-microservices/blob/master/email-services/assets/ok.png"> - Criar banner para o projeto.<br>
<img align="center" height="20" width="20" src="https://github.com/JohnnyCarvalho/email-microservices/blob/master/email-services/assets/ok.png"> - Criar arquitetura de pastas.<br>
<img align="center" height="20" width="20" src="https://github.com/JohnnyCarvalho/email-microservices/blob/master/email-services/assets/ok.png"> - Criar entidades do projeto.<br>
<img align="center" height="20" width="20" src="https://github.com/JohnnyCarvalho/email-microservices/blob/master/email-services/assets/ok.png"> - Criar services para salvar no banco.<br>
<img align="center" height="20" width="20" src="https://github.com/JohnnyCarvalho/email-microservices/blob/master/email-services/assets/ok.png"> - Criar criar função sendEmail dentro da services.<br>
<img align="center" height="20" width="20" src="https://github.com/JohnnyCarvalho/email-microservices/blob/master/email-services/assets/ok.png"> - Criar repository.<br>
<img align="center" height="20" width="20" src="https://github.com/JohnnyCarvalho/email-microservices/blob/master/email-services/assets/ok.png"> - Criar dtos de request e response (se necessário) para o projeto.<br>
<img align="center" height="20" width="20" src="https://github.com/JohnnyCarvalho/email-microservices/blob/master/email-services/assets/ok.png"> - Criar consumers para conectar ao serviço de filas CloudAMQP e consumeir as mensagens.<br>
<img align="center" height="20" width="20" src="https://github.com/JohnnyCarvalho/email-microservices/blob/master/email-services/assets/ok.png"> - Criar pasta config com as configurações necessárias do projeto.<br>
<img align="center" height="20" width="20" src="https://github.com/JohnnyCarvalho/email-microservices/blob/master/email-services/assets/ok.png"> - Criar implementar as rotas necessárias na ```application.properties.yml``` utilizando variáveis de ambiente para acessar.<br>
<img align="center" height="20" width="20" src="https://github.com/JohnnyCarvalho/email-microservices/blob/master/email-services/assets/loading.gif"> - Criar testes unitários.<br>
<img align="center" height="20" width="20" src="https://github.com/JohnnyCarvalho/email-microservices/blob/master/email-services/assets/loading.gif"> - Criar testes de integração.<br>


## Passos executar projeto
Primeiro, deve-se ter em sua máquina instalados uma ide que sua preferência e também o JDK para poder rodar projetos Java. Dito isto, os passos aqui citados serão considerando como IDE de desenvolvimento o IntelliJ.

No arquivo ```application.properties.yml``` deve observar que há dados que sãi injetados através de variáveis de ambiente, isso deve ser feito em cada máquina, isso serve para segurança do projeto, e é uma boa prática de desenvolvimento. O arquivo em questão é este:

```Java
//Configuração para o H2 Database
#spring.datasource.url=jdbc:h2:mem:sstconfigurations
#spring.datasource.driverClassName=org.h2.Driver
#spring.datasource.username=sa
#spring.datasource.password=sa
#spring.h2.console.enabled=true
#spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
server.port=8082
//Configuração para o MySQL Database
spring.datasource.url=${DB_URL}
spring.datasource.username=${DB_USER_NAME}
spring.datasource.password=${DB_PSW}
spring.datasource.driverClassName=com.mysql.cj.jdbc.Driver
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect

//Connect with rabbitMq
spring.rabbitmq.addresses=${RABBIT_URL}
broker.queue.email.name=default.email

//Send email
spring.mail.host=smtp.gmail.com
spring.mail.port=${EMAIL_PORT}
spring.mail.username=${EMAIL_USER_NAME}
spring.mail.password=${EMAIL_PSW}
spring.mail.properties.mail.smtp.auth=true
spring.mail.properties.mail.smtp.starttls.enable=true

```
Feito isto, o passo para subir o projeto é simples, basta criar essa variáveis de ambiente, no IntelliJ seria assim:

1. Edit configurations <br>
![image](https://github.com/JohnnyCarvalho/user-microservices/assets/66291657/37ecd102-5ad6-42bd-957d-0dfa8685fa78)
2. Modify options <br>
![image](https://github.com/JohnnyCarvalho/user-microservices/assets/66291657/ac8caf9a-ecbe-4efd-9242-8eedd4eddce4)
3. Operating System habilitar Envinronment Variables <br>
![image](https://github.com/JohnnyCarvalho/user-microservices/assets/66291657/2c00a97c-443f-4525-bc6d-168f2b35f00a) <br>

Feito esses passos, é só colocar os valores de acordo com o ```application.properties.yml```, por exemplo DB_URL insere o valor da url do banco, e assim sucessivamente.

## Conectando com o CloudAMQP (Message Broker)
Para se conectar, é necessário primeiramente ter uma conta no serviço, o link é este
* <b>[Create acount in CloudAMQP](https://www.cloudamqp.com/)</b>

Depois disso, deve criar uma instancia com o nome ```notification```, em seguida, deve entrar ba instancia e copiar a Url em ```AMQP Details``` e colar essa url na variável de ambiente referenta a ```${RABBIT_URL}```.

Feito isso, a aplicação já deverá estar conectando com o ClouAMQP e ao tentar salvar um usuário utilizando o [microservices de cadastro de usuário](https://github.com/JohnnyCarvalho/user-microservices) deve aparecer no log.info da sua IDE uma mensagem semelhante a essa:
```Java
2024-02-06T11:35:08.876-03:00  INFO 20577 --- [ntContainer#0-1] c.e.e.consumers.EmailConsumer            : The email body is: com.emailservice.emailservices.entities.Email@4e52f8ee
And user email is: jhonny10bruna@gmail.com
```
Em seguida, verifique a caixa de e-mail que você inseriu no momento da criação do usuário, deve aparecer uma mensagem do remetente johnnycarvalhodev@gmail.com dizendo:
```javascript
Welcome to the user registration system sr <seu nome>!
```

<h1 align="center">
    Gif do projeto rodando
</h1>

<p align="center">
<img align="center" height="620" width="980" src="https://github.com/JohnnyCarvalho/user-microservices/blob/master/backend/register-user-api/assets/GifDoProjeto.gif">
</p>



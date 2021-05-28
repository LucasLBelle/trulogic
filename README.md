# Microservice Trulogic

## Microsservice used to processed a list of playersTO according to its type and receives as resultTO the proper action took.
---
### 🚧  Project Status 🚧
🚀 First version released at 27/05/2021.

---
### Requirements
Before get started, please bear in mind the required tools:
- [Java JDK_11](https://www.oracle.com/java/technologies/javase/jdk11-archive-downloads.html)
- [Git](https://git-scm.com)
- [Maven](https://maven.apache.org/download.cgi)

It would be suitable if your IDE comes with Spring support tools as [Spring Tool Suite](https://spring.io/tools)
and [Lombok](https://projectlombok.org/download) also already installed in your IDE.

---

### 🎲 Setting your environment

```bash
# Clone the repository
$ git clone git@github.com:LucasLBelle/trulogic.git

GitHub: https://github.com/LucasLBelle/trulogic.git

# Preparing Kafka in Windows 10 Desktop
- Download binary from https://www.apache.org/dyn/closer.cgi?path=/kafka/2.8.0/kafka_2.12-2.8.0.tgz
- Unzip kafka_2.12-2.8.0.tgz into C:/kafka dir
- Edit ./config/zookeeper.properties file to: dataDir=C:/kafka/zookeeper-data
- Edit ./config/server.properties file to: log.dirs=C:/kafka/kafka-logs
- at Powershell runs:
$ cd ./kafka
$ .\bin\windows\zookeeper-server-start .\config\zookeeper.properties
$ .\bin\windows\kafka-server-start .\config\server.properties

```
---

### 🎲 Runnig the service

```bash
# Execute o software no terminal/cmd
$ cd target
$ java -jar trulogic-1.0.0.jar
```

### The server starts at port:9000
### Access H2 client at http://localhost:9000/h2-ui/
### Access the Swagger documentation
http://localhost:9000/swagger-ui.html#/

---
### 🛠 Technologies

- [Java](https://www.java.com/pt_BR/)
- [Maven](https://maven.apache.org/)
- [Git](https://git-scm.com)
- [Spring Boot](https://spring.io/projects/spring-boot)
- [H2 DB](https://www.h2.com/)
- [Swagger](https://swagger.io/)
- [Swagger-ui](https://swagger.io/tools/swagger-ui/)
- [Kafka](https://kafka.apache.org//)

---
### Author
---
##### Name: Lucas Loures Bueno Belle
##### Email: lucas.l.belle@gmail.com
##### GitHub Profile: LucasLBelle
---

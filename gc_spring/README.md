# GCARNAB JAVA SPRING REPOSITORY

---

By GCARNAB <a href='https://github.com/gcarnab'> <img src='https://avatars.githubusercontent.com/u/15156604?v=4' width="50"/></a>

---
## Contents

1. **crudh2** : folder containing a CRUD web app using Spring Boot with Maven and H2 in memory DB
2. **gc_graphql** : older containing a simple app using GraphQL

## Resources 
* OFFICIAL DOCS : https://spring.io/projects/spring-boot/
* OFFICIAL GUIDES :
    - https://spring.io/guides/gs/rest-service/
* REST CRUD H2 : https://www.javaguides.net/2020/04/spring-boot-h2-jpa-hibernate-restful-crud-api-tutorial.html
* CRUD
    - https://www.baeldung.com/spring-boot-crud-thymeleaf
    - https://github.com/eugenp/tutorials/tree/master/spring-boot-modules/spring-boot-crud
    - https://www.baeldung.com/thymeleaf-in-spring-mvc
* CRUD 
    - https://javatechonline.com/spring-boot-mvc-crud-example/

## Video Tutorial Spring Boot
- https://www.youtube.com/watch?v=CMHiCpuZq6M
-

## Tutorial

**What are the steps to develop a Spring Boot MVC CRUD**

1. Set Up Your Development Environment
Make sure you have the following tools installed:
- Java Development Kit (JDK): Download and install JDK.
- Integrated Development Environment (IDE): You can use VSCode, Eclipse ... 
2. Create a starter Project
- While creating Starter Project select Dependencies : ‘Spring Web’, ‘Spring Data JPA’...
3. Create Entity (model) class
4. Create Repository Interface for DB access
In order to access the database programmatically, we need to create one Repository Interface that will extend any Repository Interface provided by Spring Data JPA such as JpaRepository, CrudRepository, PagingAndSortingRepository etc
5. Create Service Interface & Service Impl classes
6. Create Controller class
7. Create pages for view

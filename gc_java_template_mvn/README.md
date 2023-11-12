# GCARNAB MAVEN JAVA PROJECT TEMPLATE
___

By GCARNAB <a href='https://github.com/gcarnab'> <img src='https://avatars.githubusercontent.com/u/15156604?v=4' width="50"/></a>
___

## Description

This project is an example of a Maven template for a Java project.


## Maven plugins

- maven-clean-plugin: questo plugin pulisce la directory di build del progetto.
- maven-resources-plugin: questo plugin copia i file di risorse nella directory di build del progetto.
- maven-compiler-plugin: questo plugin compila il codice Java del progetto.
- maven-surefire-plugin: questo plugin esegue i test unitari del progetto.
- maven-jar-plugin: questo plugin crea un JAR file del progetto.
- maven-install-plugin: questo plugin installa il JAR file del progetto nel repository locale di Maven.
- maven-deploy-plugin: questo plugin distribuisce il JAR file del progetto in un repository remoto.
- maven-site-plugin: questo plugin genera la documentazione del progetto. (https://maven.apache.org/plugins/maven-site-plugin/usage.html)
- maven-project-info-reports-plugin: questo plugin genera vari rapporti sulla configurazione del progetto.
- maven-javadoc-plugin: Generate Javadoc for the project. (https://maven.apache.org/plugins/maven-javadoc-plugin/usage.html)

## Maven plugin usage

```shell
> mvn clean
> mvn compile
> mvn test
> mvn package
> mvn install
> mvn deploy
> mvn site
> mvn site:run  (start up the site in Jetty)
> mvn javadoc:javadoc
```


## Resources

- https://maven.apache.org/plugins/index.html
- https://mvnrepository.com/
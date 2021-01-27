# wildfly-bootable

This repository is an example how to build simple [Wildfly Bootable](https://docs.wildfly.org/21/Bootable_Guide.html) java project

In order to build and run this project:
- clone or download this repository into some subdirectory
- run maven command: `mvn clean package wildfly-jar:package wildfly-jar:run` - this command builds the project, downloads WIldFly server and run application on it
- navigate to [http://localhost:8080/](http://localhost:8080/) in your browser

You should see startup page with two links on it.

---
This application is also an example of bug in Primefaces mentioned in some question on Stack Overflow --> [click this link for details](https://stackoverflow.com/questions/65910832/primefaces-pajax-listener-is-not-being-called-while-simple-fajax-is-working?noredirect=1#comment116544349_65910832)

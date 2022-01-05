**Bootstrapp**

En esta carpeta se encuentran herramientas para facilitar el levantado del entorno en local

**docker**

En esta carpeta hay un fichero docker-compose que levantará los servicios de infraestructura necesarios para el proyecto en local. 
Para utilizarlo hay que ejecutar en consola el comando docker-compose up -d
Se levantarán los siguientes servicios:
- consul
- postgres
- mongo
- keycloak (Dependiente de postgres)
- redis
- zookeeper
- kafka (Dependiente de zookeeper)
- zipkin

si no interesan todos basta con lanzar docker-compose y el nombre de los servicios. Por ejemplo: docker-compose -d consul redis zipkin

para pararlo docker-compose down

**Properties**

En esta carpeta hay un fichero de properties junto con una macro bat.
Para utilizarlo solo hay que poner las propiedades de los microservicios en el fichero de properties y ejecutar la macro
Se requiere que el servicio de consul esté levantado en el puerto 8500 en local
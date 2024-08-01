# Dockerfile para el servicio books
FROM openjdk:17-jdk-slim

# Copia el archivo JAR al contenedor
COPY target/books-1.0-SNAPSHOT.jar /app/books-app.jar

# Define el directorio de trabajo
WORKDIR /app

# Expone el puerto en el que la aplicación escuchará
EXPOSE 8080

# Comando para ejecutar la aplicación
CMD ["java", "-jar", "books-app.jar"]

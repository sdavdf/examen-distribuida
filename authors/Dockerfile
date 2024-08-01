# Dockerfile para el servicio authors
FROM openjdk:17-jdk-slim

# Copia el archivo JAR al contenedor
COPY target/authors-1.0-SNAPSHOT.jar /app/authors-app.jar

# Define el directorio de trabajo
WORKDIR /app

# Expone el puerto en el que la aplicación escuchará
EXPOSE 9090

# Comando para ejecutar la aplicación
CMD ["java", "-jar", "authors-app.jar"]

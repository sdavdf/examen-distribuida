# Dockerfile para el servicio web
FROM openjdk:17-jdk-slim

# Copia el archivo JAR al contenedor
COPY target/web-1.0-SNAPSHOT.jar /app/web-app.jar

# Define el directorio de trabajo
WORKDIR /app

# Expone el puerto en el que la aplicación escuchará
EXPOSE 8081

# Comando para ejecutar la aplicación
CMD ["java", "-jar", "web-app.jar"]

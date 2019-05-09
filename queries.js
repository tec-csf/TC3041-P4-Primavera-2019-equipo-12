

// Iniciar un contenedor con InfluxDB

// DENTRO DE LA CARPETA DONDE VAMOS A TRABAJAR
docker run --name influxdb15 -d -p 8086:8086 -v C:/influxdb influxdb


// Copiar el dataset al contenedor

docker cp data.txt influxdb:/

// Conectarse al bash del contenedor

docker exec -it influxdb15 bash

// Importar el dataset en InfluxDB

influx -import -path= data.txt -precision=s

// Conectarse al shell de InfluxDB

influx

// Ejecutar consultas

USE IOT_database

SHOW SERIES

SHOW FIELD KEYS 

SELECT * FROM "house_temperature" LIMIT 5

SELECT *::field FROM "refrigerator_temperature" LIMIT 5

SELECT "degrees" FROM "refrigerator_temperature" WHERE "location" = 'Colima' ORDER BY time DESC

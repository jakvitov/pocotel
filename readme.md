# Proof of concept for Open Telemetry
This repository contains a small application, which serves tough Rest API. Main goal is to experiment with OTEL and different tracing capabilities of today's widely used enterprise tech stack.
## Application
In src can be found simple demo Kotlin & Spring Boot application, which monitors traces to Open Telementry collector.

## External services
External services including OTEL Collector, Jaeger, DB, Redis, Elasitc etc. can be found in directory tools. 
Each service is setup trough docker-compose file. 

Main properties are set for my home server runnig on raspberry1.local. If you want to run this yourself, you must change its ip or setup according dns record.
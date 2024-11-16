#!/bin/zsh

# Script to run locally and debug OTEL agent with given application
application="$PWD/build/libs/$(ls -l ./build/libs | grep "SNAPSHOT.jar$" | awk '{print $9}')"
agent="$PWD"


export OTEL_RESOURCE_ATTRIBUTES=service.name=spring_otel_demo_1,service.version=0.0.1-SNAPSHOT
#export OTEL_TRACES_EXPORTER=otlp
export OTEL_EXPORTER_OTLP_ENDPOINT=http://localhost:4318

java -javaagent:./tools/otel/agent/opentelemetry-javaagent.jar -jar $application

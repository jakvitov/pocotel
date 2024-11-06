#!/bin/zsh

# Script to run locally and debug OTEL agent with given application
application="$PWD/build/libs/$(ls -l ./build/libs | grep "SNAPSHOT.jar$" | awk '{print $9}')"
agent="$PWD"


export OTEL_RESOURCE_ATTRIBUTES=service.name=spring_otel_demo_1,service.version=0.0.1-SNAPSHOT
export OTEL_TRACES_EXPORTER=otlp
export OTEL_METRICS_EXPORTER=otlp
export OTEL_LOGS_EXPORTER=otlp
export OTEL_EXPORTER_OTLP_COMPRESSION=gzip
export OTEL_EXPORTER_OTLP_ENDPOINT=http://raspberry1.local:4317
export OTEL_EXPORTER_OTLP_METRICS_TEMPORALITY_PREFERENCE=DELTA
export OTEL_EXPORTER_OTLP_METRICS_DEFAULT_HISTOGRAM_AGGREGATION=BASE2_EXPONENTIAL_BUCKET_HISTOGRAM

java -javaagent:./tools/otel/agent/opentelemetry-javaagent.jar -jar $application

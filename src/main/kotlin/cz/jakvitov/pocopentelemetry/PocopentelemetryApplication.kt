package cz.jakvitov.pocopentelemetry

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PocopentelemetryApplication

fun main(args: Array<String>) {
	runApplication<PocopentelemetryApplication>(*args)
}

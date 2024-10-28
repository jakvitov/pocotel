package cz.jakvitov.pocopentelemetry.controller

import cz.jakvitov.pocopentelemetry.dto.ErrorReason
import cz.jakvitov.pocopentelemetry.dto.ErrorResponse
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.core.Ordered
import org.springframework.core.annotation.Order
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler

@ControllerAdvice
class ErrorHandler {

    val logger: Logger = LoggerFactory.getLogger(ErrorHandler::class.java)

    @ExceptionHandler(Throwable::class)
    @Order(Ordered.LOWEST_PRECEDENCE)
    fun handleException(e: Throwable): ResponseEntity<ErrorResponse> {
        logger.error(e.message, e)
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(ErrorResponse(e.javaClass.toString(), e.message ?: "Message not found.", ErrorReason.APPLICATION))
    }

}
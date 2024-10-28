package cz.jakvitov.pocopentelemetry.dto

data class ErrorResponse(val exception: String, val message: String, val reason: ErrorReason) {
}
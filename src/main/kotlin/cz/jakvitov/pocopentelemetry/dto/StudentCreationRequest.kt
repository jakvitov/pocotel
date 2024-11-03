package cz.jakvitov.pocopentelemetry.dto

import java.math.BigDecimal
import java.time.LocalDate

class StudentCreationRequest(
    var firstName: String,
    var lastName: String,
    var birthDate: LocalDate,
    var averageGrade: BigDecimal) {


}
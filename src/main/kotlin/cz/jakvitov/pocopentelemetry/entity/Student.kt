package cz.jakvitov.pocopentelemetry.entity

import cz.jakvitov.pocopentelemetry.dto.StudentCreationRequest
import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import java.math.BigDecimal
import java.time.LocalDate

@Table(value = "student")
data class Student(@Id val id: Long?, val name: String, val surname: String, val born: LocalDate, val averageGrade: BigDecimal) {

    constructor(request: StudentCreationRequest) : this(null, request.firstName, request.lastName, request.birthDate, request.averageGrade)

}
package cz.jakvitov.pocopentelemetry.dto

import cz.jakvitov.pocopentelemetry.entity.Student
import cz.jakvitov.pocopentelemetry.util.AgeUtils

data class StudentDataResponseDto(val name: String, val surname: String, val age: Int, val averageGrade: Double) {
    constructor(student: Student) : this(student.name, student.surname, AgeUtils.getAge(student.born), student.averageGrade.toDouble())
}
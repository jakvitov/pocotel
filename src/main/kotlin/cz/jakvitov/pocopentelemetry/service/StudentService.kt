package cz.jakvitov.pocopentelemetry.service

import cz.jakvitov.pocopentelemetry.dto.GetAllStudentsResponse
import cz.jakvitov.pocopentelemetry.dto.StudentDataResponseDto
import cz.jakvitov.pocopentelemetry.repository.StudentRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class StudentService {

    @Autowired
    lateinit var studentRepository: StudentRepository

    fun getAllStudentsResponse() : GetAllStudentsResponse {
        val students = studentRepository.findAll()
        return GetAllStudentsResponse(students.map { StudentDataResponseDto(it) })
    }

}
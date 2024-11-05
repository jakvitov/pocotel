package cz.jakvitov.pocopentelemetry.service

import cz.jakvitov.pocopentelemetry.dto.GetStudentsResponse
import cz.jakvitov.pocopentelemetry.dto.StudentCreationRequest
import cz.jakvitov.pocopentelemetry.dto.StudentDataResponseDto
import cz.jakvitov.pocopentelemetry.entity.Student
import cz.jakvitov.pocopentelemetry.repository.StudentRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class StudentService {

    @Autowired
    private lateinit var studentRepository: StudentRepository

    fun getAllStudentsResponse() : GetStudentsResponse {
        val students = studentRepository.findAll()
        return GetStudentsResponse(students.map { StudentDataResponseDto(it) })
    }

    fun getTopStudents(n: Int): GetStudentsResponse {
        val students = studentRepository.getTopStudents(n)
        return GetStudentsResponse(students.map { StudentDataResponseDto(it) })
    }

    fun saveStudent(student: StudentCreationRequest) {
        studentRepository.save(Student(student))
    }

    fun deleteStudent(id: Long) {
        studentRepository.deleteById(id);
    }
}
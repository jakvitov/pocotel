package cz.jakvitov.pocopentelemetry.controller

import cz.jakvitov.pocopentelemetry.dto.GetAllStudentsResponse
import cz.jakvitov.pocopentelemetry.service.StudentService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/student")
class StudentController {

    @Autowired
    lateinit var studentService: StudentService

    @GetMapping("/all")
    fun getAllStudents(): ResponseEntity<GetAllStudentsResponse> {
        return ResponseEntity.ok(studentService.getAllStudentsResponse())
    }

}
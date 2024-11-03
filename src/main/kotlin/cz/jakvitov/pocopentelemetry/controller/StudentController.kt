package cz.jakvitov.pocopentelemetry.controller

import cz.jakvitov.pocopentelemetry.dto.GetStudentsResponse
import cz.jakvitov.pocopentelemetry.dto.StudentCreationRequest
import cz.jakvitov.pocopentelemetry.entity.Student
import cz.jakvitov.pocopentelemetry.service.StudentService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/student")
class StudentController {

    @Autowired
    lateinit var studentService: StudentService

    @GetMapping("/all")
    fun getAllStudents(): ResponseEntity<GetStudentsResponse> {
        return ResponseEntity.ok(studentService.getAllStudentsResponse())
    }

    @GetMapping("/top/{n}")
    fun getTopStudents(@PathVariable("n") n: Int): ResponseEntity<GetStudentsResponse> {
        return ResponseEntity.ok(studentService.getTopStudents(n))
    }

    @PostMapping("/new")
    fun saveStudent(@RequestBody student: StudentCreationRequest): ResponseEntity<String> {
        studentService.saveStudent(student)
        return ResponseEntity.ok("OK")
    }

}
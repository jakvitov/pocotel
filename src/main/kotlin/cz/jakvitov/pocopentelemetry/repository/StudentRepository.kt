package cz.jakvitov.pocopentelemetry.repository

import cz.jakvitov.pocopentelemetry.entity.Student
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface StudentRepository : CrudRepository<Student, Long> {
}
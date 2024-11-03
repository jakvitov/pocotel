package cz.jakvitov.pocopentelemetry.repository

import cz.jakvitov.pocopentelemetry.entity.Student
import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface StudentRepository : CrudRepository<Student, Long> {

    @Query("select * from Student s order by s.average_grade limit :n")
    fun getTopStudents(n: Int): List<Student>

}
package cz.jakvitov.pocopentelemetry.util

import java.time.LocalDate
import java.time.temporal.ChronoUnit

class AgeUtils {

    companion object {
        fun getAge(born: LocalDate): Int {
            return ChronoUnit.YEARS.between(born, LocalDate.now()).toInt()
        }
    }

}
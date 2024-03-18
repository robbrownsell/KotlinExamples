package foo.bar.kotlinexamples.domain

import java.util.*

data class Person(val firstName: String, val surname: String, val isHuman: Boolean = true, val id: UUID = UUID.randomUUID()) {
    var age: Int = 0
}

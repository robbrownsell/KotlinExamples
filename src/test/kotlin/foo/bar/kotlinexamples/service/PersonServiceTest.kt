package foo.bar.kotlinexamples.service

import foo.bar.kotlinexamples.domain.Person
import org.junit.jupiter.api.Test
import io.kotest.matchers.shouldBe

class PersonServiceTest {

    @Test
    fun `it should add People to the list of people`() {
        // given
        val personService = PersonService()

        // when
        personService.addPerson(Person(firstName = "Jane", surname = "Green"))
        personService.addPerson(Person(firstName = "Ian", surname = "Green", isHuman = false))

        // then
        val people = personService.findPeople("Green")
        people.size shouldBe 2
    }

    @Test
    fun `it should find people`() {
        // given
        val personService = PersonService()

        // when
        personService.addPerson(Person(firstName = "Jane", surname = "Green"))
        personService.addPerson(Person(firstName = "Ian", surname = "Green", isHuman = false))

        // then
        val people = personService.findPeople("Green")
        people.size shouldBe 2
    }

}

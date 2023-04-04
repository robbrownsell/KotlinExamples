package foo.bar.kotlinexamples

import foo.bar.kotlinexamples.domain.Person
import foo.bar.kotlinexamples.service.PersonService

fun main() {

    val personService = PersonService()

    personService.addPerson(Person(firstName = "Jane", surname = "Smith"))
    personService.addPerson(Person(firstName = "Ian", surname = "Smith", isHuman = false))

    personService.findPeople("Smith").onEach { person ->
        println("Found person ${person.firstName} ${person.surname}")
    }.also { people ->
        println("Found ${people.size} people")
    }
}

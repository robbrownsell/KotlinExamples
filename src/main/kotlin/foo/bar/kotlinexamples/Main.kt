package foo.bar.kotlinexamples

import foo.bar.kotlinexamples.domain.Person
import foo.bar.kotlinexamples.service.PersonService

fun main() {

    //1. Create a PersonService
    //2. Add some people to the list of people - show named parameters
    //3. Find people with the surname Smith
    //4. Demonstrate scope functions (with, apply, let, run, also) https://kotlinlang.org/docs/scope-functions.html#function-selection
    //5. Optional parameters
    //6. show tests - it naming and kotest matchers

    val personService = PersonService()


    personService.addPerson(Person(firstName = "Jane", surname = "Smith"))
    personService.addPerson(Person(firstName = "Ian", surname = "Smith", isHuman = false))


    personService.findPeople("Smith").onEach { person ->
        println("Found person ${person.firstName} ${person.surname}")
    }.also { people ->
        println("Found ${people.size} people")
    }



    println(personService.greeting("Rob"))
}

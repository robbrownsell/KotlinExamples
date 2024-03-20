package foo.bar.kotlinexamples

import foo.bar.kotlinexamples.domain.Person
import foo.bar.kotlinexamples.service.PersonService
import foo.bar.kotlinexamples.service.greeting


fun main() {

    // show gradle build
    //1. Create a PersonService (show service and Person data class)
    //2. Add some people to the list of people - show named parameters, show with scope function for adding
    //3. Find people with the surname Smith
    //4. Demonstrate scope functions (with, apply, let, run, also) https://kotlinlang.org/docs/scope-functions.html#function-selection
    //5. Named parameters + Optional parameters
    //6. extension functions
    //7. when statement
    //8. double bang to force null
    //9. show tests - it naming and kotest matchers
    //10. show classless function
    //11. collections
    //12. show run catching
    //13. lambda

    val personService = PersonService()

    personService.addPerson(Person(surname = "Smith", firstName = "Rob"))
    personService.addPerson(Person(surname = "Brown", firstName = "Rob", isHuman = false))

    personService.apply {
        addPerson(Person(surname = "Smith", firstName = "Jo"))
        addPerson(Person(surname = "Smith", firstName = "Mike"))
    }

    with(personService.findPeopleWithSurname("Smith").first()) {
        println("First name: $firstName, Surname: $surname, isHuman: $isHuman")
    }

    val myNumber = 10
    myNumber.myDivider(2).also {
        println(it)

    }

    val javaVersion = "50"

    when(javaVersion) {
        "5" -> "Generics"
        "6" -> "Annotations"
        "7" -> "Try with resources"
        "8" -> "Lambdas"
        else -> "Unknown"
    }.also {
        println("feature of Java $javaVersion was $it")
    }

    val myInt: Int = 10
    myInt.myDivider(0).also {
        println(it)
    }


    greeting().also {
        println(it)
    }

    val adder: (Int, Int) -> Int = { a, b -> a + b }


    adder(1, 2).also {
        println(it)
    }

}

fun Int.myDivider(divider: Int): Int {
    runCatching {
        return this / divider
    }
    return -1
}

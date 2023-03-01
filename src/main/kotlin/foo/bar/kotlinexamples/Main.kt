package foo.bar.kotlinexamples

import foo.bar.kotlinexamples.service.PeopleService

fun main() {

    PeopleService().findPeople("Smith").onEach { person ->
        println("Found person ${person.firstName} ${person.surname}")
    }
}
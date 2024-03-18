package foo.bar.kotlinexamples.service

import foo.bar.kotlinexamples.domain.Person

class PersonService {

    private val people: MutableList<Person> = setUpPeople()

    fun findPeople(surname: String) = people.filter { person -> person.surname == surname }


    fun addPerson(surname: Person) {
        people.add(surname)
    }

    fun greeting(name: String = "You") = "Hello $name, and welcome to Kotlin!!!"

    private fun setUpPeople(): MutableList<Person> = mutableListOf(Person("Rob", "Smith"), Person("Jo", "Bloggs"))

}

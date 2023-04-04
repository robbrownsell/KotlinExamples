package foo.bar.kotlinexamples.service

import foo.bar.kotlinexamples.domain.Person

class PersonService {

    private val people: MutableList<Person> = setUpPeople()

    fun findPeople(surname: String): List<Person> {
        return people.filter { person -> person.surname == surname }
    }

    fun addPerson(surname: Person) {
        people.add(surname)
    }

    private fun setUpPeople(): MutableList<Person> = mutableListOf(Person("Rob", "Smith"), Person("Jo", "Bloggs"))

}

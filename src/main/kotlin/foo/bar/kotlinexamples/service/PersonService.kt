package foo.bar.kotlinexamples.service

import foo.bar.kotlinexamples.domain.Person

class PersonService {

    private val people: MutableList<Person> = setUpPeople()
    private val peopleMap: MutableMap<String, Person> = mutableMapOf()

    fun addPerson(surname: Person) {
        people.add(surname)
    }

    fun findPeopleWithSurname(surname: String) = people.filter { it.surname == surname }


    private fun setUpPeople(): MutableList<Person> = mutableListOf(Person("Rob", "Smith"), Person("Jo", "Bloggs"))

}

package foo.bar.kotlinexamples.service

import foo.bar.kotlinexamples.domain.People

class PeopleService {

    private val people: List<People> = setUpPeople()

    fun findPeople(surname: String): List<People> {
        return people.filter { person -> person.surname == surname }
    }

    private fun setUpPeople(): List<People> = listOf(People("Rob", "Smith"), People("Jo", "Bloggs"))

}
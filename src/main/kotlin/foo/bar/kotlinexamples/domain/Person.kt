package foo.bar.kotlinexamples.domain


data class Person(val firstName: String, val surname: String, val isHuman: Boolean = true) {
    var age: Int = 0
}

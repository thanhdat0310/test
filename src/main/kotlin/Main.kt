fun sayHello(greeting: String, vararg itemToGreet: String){
    itemToGreet.forEach { itemToGreet->
        println("$greeting $itemToGreet")
    }
}
fun greetPerson(greeting: String = "thanh", name : String = "dat") = println("$greeting $name")
fun main()  {
   /*val interestingThings = arrayOf("ta", "thanh", "dat")
    sayHello(greeting = "hi", itemToGreet = *interestingThings)*/
    val person = Person()

    person.printInfo()

}

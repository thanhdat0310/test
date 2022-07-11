class Person (val firstName: String = "Peter",val lastName: String = "Parker"){
    var nickname: String? = null
    set(value){
        field = value
        println("nickname moi la $value")
    }
    get(){

        return field
    }
    fun printInfo(){
        val nicknametoPrint = nickname ?: "no nickname"
        println("$firstName ($nicknametoPrint) $lastName")
    }
}asd asd asd asd 
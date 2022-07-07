interface PersoninfoProvider{
    fun printInfo(person: Person)
}
class BasicinfoProvider : PersoninfoProvider{
    override fun printInfo(person: Person) {
        println("printInfo")

    }
}
fun main(){
    val provider = BasicinfoProvider()

}
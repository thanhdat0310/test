interface PersoninfoProvider{
    val providerInfo: String
    fun printInfo(person: Person) {
        println(providerInfo)
        person.printInfo()
    }
    
}
interface SessionInfoProvider{
    fun getSessionId() :String
}
open class BasicinfoProvider : PersoninfoProvider, SessionInfoProvider{
    override val providerInfo: String
        get() = "BasicinfoProvider"
    open val sessionIdPrefix = "session"
    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("anythings")
    }
    override fun getSessionId(): String {
        return sessionIdPrefix
    }


}

fun main(){
    val provider = object :PersoninfoProvider{
        override val providerInfo: String
            get() = "New Info Provider"
        fun getSessionId() = "id"
    }
    provider.printInfo(Person())
    provider.getSessionId()
    checkTypes(provider)
}
fun checkTypes(infoProvider: PersoninfoProvider){
    if (infoProvider !is SessionInfoProvider){
        println("not a session info provider")
    }
    else
    {
        println("is a session info provider")
        infoProvider.getSessionId()
    }
}
class FancyInfoProvider : BasicinfoProvider(){
    override val sessionIdPrefix: String
        get() = "Fancy session"
    override val providerInfo: String
        get() = super.providerInfo

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("Fancy info")
    }
}
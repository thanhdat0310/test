import java.util.UUID

enum class EntityType{
    HELP,EASY, MEDIUM, HARD;
    fun getFormattedName() = name.toLowerCase().capitalize()
}
object EntityFactory{
    fun create(type : EntityType)   : Entity {

        val id = UUID.randomUUID().toString()
        val name = when(type){
            EntityType.EASY -> type.name
            EntityType.MEDIUM -> type.getFormattedName()
            EntityType.HARD -> "hard"
            EntityType.HELP -> type.getFormattedName()
        }
        return when(type){
            EntityType.EASY -> Entity.Easy(id, name)
            EntityType.MEDIUM -> Entity.Medium(id, name)
            EntityType.HARD -> Entity.Hard(id, name, mutiplier = 2f)
            EntityType.HELP -> TODO()
        }
    }
}
sealed class Entity(){
    object Help: Entity(){
        val name ="help"
    }
    data class Easy(val id: String, val name: String): Entity()
    data class Medium(val id: String, val name: String): Entity()
    data class Hard(val id: String, val name: String, val mutiplier: Float): Entity()
}


fun main(){
    val entity = EntityFactory.create(EntityType.EASY )
    println(entity)
    val mediumEntity = EntityFactory.create(EntityType.MEDIUM)
    println(mediumEntity)
    val hardEntity = EntityFactory.create(EntityType.HARD)
    println(hardEntity )
}
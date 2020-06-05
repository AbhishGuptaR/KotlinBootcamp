package func.myapp

abstract class aquariumFish{
    abstract val color: String
}

interface fishAction{
    fun eat()
}

class Shark: aquariumFish(), fishAction{
    override val color = "gray"
    override  fun eat(){
        println("Eat Shark")
    }
}

class Goldfish: aquariumFish(), fishAction{
    override val color = "gold"
    override fun eat(){
        println("Goldfish eat")
    }
}
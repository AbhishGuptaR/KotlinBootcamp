import java.util.*

fun randomDay(): String {
    val week = arrayOf("Mon","Tue","Wed","Thur","Fri","Sat")
    return week[Random().nextInt(week.size)]
}

fun whatFood(day : String): String{
    var food = ""
    when(day){
        "Mon" -> food = "pellets"
        "Tue" -> food = "flakes"
        "Wed" -> food = "planktons"
        "Thur" -> food = "flies"
        "Fri" -> food = "worms"
        "Sat" -> food = "meat"
        else -> food = "nothing"
    }
    return food
}

fun conciseFoodFun(day : String) : String{
    return when(day){
        "Mon" -> "Flies"
        else -> "nothing"
    }
}

fun fishFood() {
    val getDay = randomDay()
    val food = whatFood(getDay)
    val conFood = conciseFoodFun(getDay)
    println("Today is $getDay and the fish eats $food")
    println("The day is $getDay and the fish eats $conFood")
}

fun swim(speed: String = "fast"){
    println("Speed of swimming - $speed ")
}

fun isTooHot(temperature: Int) = temperature > 30

fun isDirty(dirty: Int) = dirty > 30

fun isSunday(day: String) = day == "Sat"

fun shouldChangeWater(day : String, temp : Int = 22, dirty : Int = 32) :Boolean {
    return when{
        isTooHot(temp) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true
        else -> false
    }
}

fun main(args: Array<String>){
    //https://codelabs.developers.google.com/codelabs/kotlin-bootcamp-functions/#4
    // Part - 1
//    println("Hello ${args[0]}")
//    val isUnit = println("this is a statement")
//    println(isUnit)
//    val temperature = 10
//    val iShot = if(temperature > 50) true else false
//    println(iShot)
//    val message = "The water is ${ if(temperature <10) "cold" else "hot"}"
//    println(message)
    // Part - 2
//    fishFood()
    //Part - 3
//    swim()
//    swim("slow")
//    swim(speed = "ultra fast")
    //Part - 4
//    println("Change water: ${shouldChangeWater(randomDay())}")
    //Part - 5
//    val decoration= listOf("rock", "pagoda", "plastic plant", "alligator", "flowerpot")
//    val eager = decoration.filter { it[0]=='p' }
//    println("Eager: $eager")
//    val filtered=decoration.asSequence().filter { it[0]=='p' }
//    println("Filtered : $filtered")
//    val newList = filtered.toList()
//    println("NewList: $newList")
//    val decoMap = decoration.asSequence().map {
//        println("access: $it")
//        it
//    }
//    println("lazy: $decoMap")
//    println("-------")
//    println("first: ${decoMap.first()}")
//    println("-------")
//    println("All: ${decoMap.toList()}")
//    val decoMap2 = decoration.asSequence().filter { it[0]=='p' }.map {
//        println("access: $it")
//        it
//    }
//    println("------Filtered Lazy Map-------")
//    println(decoMap2.toList())
    //Part - 6
    var dirtyLevel = 30
    var lambdaFunc = {dirty: Int -> dirty/2}
    println(lambdaFunc(dirtyLevel))
    var cleanLambda: (Int) -> Int = {dirty -> dirty/2}
    println(cleanLambda(dirtyLevel))
    //learn more about lambda function in detail


}
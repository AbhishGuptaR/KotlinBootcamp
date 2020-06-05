package Example

data class Fish(val name: String)

fun myWith(name: String,block: String.() -> Unit){
    name.block()
}

fun fishExamples(){
    val fish = Fish("splashy")
    myWith(fish.name){
        println(capitalize())
    }
}

fun runExample(){
//    val runnable = object: Runnable{
//        override fun run(){
//            println("I'm a runnable")
//        }
//    }
//    JavaRun.runNow(runnable)

    JavaRun.runNow{
        println("I'm a runnable")
    }
}

fun main(){
    fishExamples()
}
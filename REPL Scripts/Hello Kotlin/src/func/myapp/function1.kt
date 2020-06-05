package func.myapp

class Aquarium(var length: Int =20,var width: Int = 20,var height: Int = 20){
//    var width:Int = width
//    var height:Int = length
//    var length:Int = height

    init {
        println("Init executing")
    }

    constructor(numberofFish: Int) : this() {
        val tank = numberofFish * 2000 * 1.1
        height = (tank / (length * width)).toInt()
    }

    var volume:Int
        get() = width * height * length / 1000
        set(value) {
         height = (value * 1000) / (width * length)
        }

    fun printSize(){
        println("The height is $height cm")
        println("The width is $width cm")
        println("The length is $length cm")

        println("Volume: $volume")
    }



}

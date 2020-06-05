package func.myapp

import DataClass.Decor
import Example.labelledBreak
import Example.testAnnotation
import Generics.*
import Generics.Aquarium

fun buildAquarium(){
//    val myAquarium = Aqurarium()
//    myAquarium.printSize()
//    myAquarium.height = 40
//    myAquarium.printSize()


//    val myAquarium = Aquarium(length = 40)
//    myAquarium.printSize()
//    val myAquarium2 = Aquarium(width = 40, height =100)
//    myAquarium2.printSize()

//    val myAquarium = Aquarium(numberofFish = 20)
//    myAquarium.printSize()
//    myAquarium.volume=70
//    myAquarium.printSize()

}

fun colorAquarium(){
    val shark = Shark()
    val goldfish = Goldfish()

    println("The color of shark is ${shark.color}")
    shark.eat()
    println("The color of goldfish is ${goldfish.color}")
    goldfish.eat()
}

fun makeDecor(){
    val aquaDecor1 = Decor("Granite")
    println(aquaDecor1)
    val aquaDecor2= Decor("Slate")
    println(aquaDecor2)
    val aquaDecor3 = Decor("Slate")
    println(aquaDecor3)
    println(aquaDecor1.equals(aquaDecor2))
    println(aquaDecor3.equals(aquaDecor2))
}

fun genericsExample(){
//    val aquarium = Aquarium<TapWater>(TapWater())
    val cleaner = TapWaterCleaner()
    val aquarium = Aquarium(TapWater())
//    println("Before processing ${aquarium.waterSupply.needsProcessing}")
//    aquarium.waterSupply.addChemicals()
//    println("After processing ${aquarium.waterSupply.needsProcessing}")
//    val aquarium2 = Aquarium(LakeWater())
//    aquarium2.waterSupply.filter()
//    aquarium2.addWater()
    aquarium.addWater(cleaner)
    println(aquarium.hasWaterSupplyOfType<TapWater>())
}

fun main(){
    //buildAquarium()
//    colorAquarium()
    //makeDecor()
    //genericsExample()
   // testAnnotation()
    labelledBreak()

}
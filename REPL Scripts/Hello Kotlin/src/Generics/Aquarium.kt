package Generics

open class WaterSupply(var needsProcessing: Boolean)

class TapWater : WaterSupply(true){
    fun addChemicals(){
         needsProcessing = false
    }
}

class FishstoreWater : WaterSupply(false)
class LakeWater : WaterSupply(true){
    fun filter(){
         needsProcessing = false
    }
}

class Aquarium<out T: WaterSupply>(val waterSupply: T){
    fun addWater(cleaner: Cleaner<T>){
        if(waterSupply.needsProcessing){
            cleaner.clean(waterSupply)
        }
//        check(!waterSupply.needsProcessing){"Water needs to be processed first"}
//        println("Adding water from $waterSupply")
        println("Water Cleaned")
    }

    inline fun <reified R: WaterSupply> hasWaterSupplyOfType() = waterSupply is R
}

fun addItemTo(aquarium: Aquarium<WaterSupply>) = println("Item Added")

interface Cleaner <in T: WaterSupply>{
    fun clean(waterSupply: T)
}

class TapWaterCleaner: Cleaner<TapWater>{
    override fun clean(waterSupply: TapWater) = waterSupply.addChemicals()
}


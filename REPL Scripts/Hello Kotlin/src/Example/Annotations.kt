package Example

import kotlin.reflect.full.*

annotation class ImAPlant

@Target(AnnotationTarget.PROPERTY_GETTER)
annotation class onGet
@Target(AnnotationTarget.PROPERTY_SETTER)
annotation class onSet

@ImAPlant class Plant{
    fun trim(){}
    fun fertilize(){}

    @get:onGet
    val isGrowing : Boolean = true

    @set:onSet
    var needsFood: Boolean= false
}

fun testAnnotation(){
    val classobj = Plant::class
    for(m in classobj.declaredMemberFunctions){
        println(m.name)
    }
    val classObj2 = Plant::class
    for(n in classObj2.annotations){
        println(n.annotationClass.simpleName)
    }
    val findAnnotation = classObj2.findAnnotation<ImAPlant>()
    println(findAnnotation)

}

fun labelledBreak(){
    outerloop@ for(i in 1..100){
        println("$i")
        for(j in 1..100){
            if(i>10) break@outerloop
        }
    }
}




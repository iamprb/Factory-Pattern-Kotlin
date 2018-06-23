fun main(args:Array<String>){
    //Factory pattern
   //Do it like this
    val hatchback=CarFactory.getCarInstance(CarFactory.CarType.Hatchback)
    val sedan= CarFactory.getCarInstance(CarFactory.CarType.Sedan)

    println("Manufacturing hatchback")
    hatchback.manufacture()
    println("Manufacturing Sedan")
    sedan.manufacture()
    //Or do it like this
    CarFactory.getCarInstance(CarFactory.CarType.Sedan).manufacture()
    CarFactory.getCarInstance(CarFactory.CarType.Hatchback).manufacture()
}
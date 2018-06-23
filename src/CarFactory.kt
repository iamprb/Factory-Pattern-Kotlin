object CarFactory{
    enum class CarType{Hatchback,Sedan}

    fun getCarInstance(type:CarType):Car{
        return when (type){
            CarType.Hatchback->Hatchback()
            CarType.Sedan->Sedan()
        }
    }
}
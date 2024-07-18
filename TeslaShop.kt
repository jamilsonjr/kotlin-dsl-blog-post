
// Actual code.
fun main() {

   val modelS  = createTesla { builder ->
       builder.setDriveMode(DriveMode.ALL_WHEEL_DRIVE)
       builder.setPaint(Paint.STEALTH_GREY)
       builder.setWheels(Wheels.ARACHNID)
       builder.setInterior(Interior.ALL_BLACK)
       builder.setSteering(Steering.YOKE_STEERING)
       builder.setChargingConnector(ChargingConnector.UNIVERSAL_WALL)
       builder.setAcessories(setOf(Acessories.SUNSHADE, Acessories.ALL_WEATHER_INTERIOR_LINERS))
       builder.setSelfDrivingCapiabilities(true)
   }


    println (modelS)
}

fun createTesla(init: (ModelSBuilder) -> Unit): ModelS {
    val builder = ModelSBuilder()
    init(builder)
    return builder.build()
}

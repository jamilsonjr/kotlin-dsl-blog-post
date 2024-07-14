
// Actual code.
fun main() {
    // Setup your builder
	val modelSBuilder = ModelSBuilder()
    // Customize your tesla
    modelSBuilder.setDriveMode(DriveMode.ALL_WHEEL_DRIVE)
	modelSBuilder.setPaint(Paint.STEALTH_GREY)
    modelSBuilder.setWheels(Wheels.ARACHNID)
    modelSBuilder.setInterior(Interior.ALL_BLACK)
    modelSBuilder.setSteering(Steering.YOKE_STEERING)
    modelSBuilder.setChargingConnector(ChargingConnector.UNIVERSAL_WALL)
    modelSBuilder.setAcessories(setOf(Acessories.SUNSHADE, Acessories.ALL_WEATHER_INTERIOR_LINERS))
    modelSBuilder.setSelfDrivingCapiabilities(true)
    // Build your tesla
    val modelS = modelSBuilder.build()
    println (modelS)
}
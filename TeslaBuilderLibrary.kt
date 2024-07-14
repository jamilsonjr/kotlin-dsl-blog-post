// Library code
enum class DriveMode {
	ALL_WHEEL_DRIVE, PLAID
}

enum class Paint {
   STEALTH_GREY, PEARL_WHITE_MULTI_COAT, DEEP_BLUE_METALIC, SOLID_BLACK, ULTRA_RED, LUNAR_SILVER
}

enum class Wheels {
    ARACHNID, TEMPEST_WHEELS
}

enum class Interior {
    ALL_BLACK, BLACK_AND_WHITE, CREAM
}

enum class Steering {
    YOKE_STEERING, WHEEL
}

enum class ChargingConnector {
    UNIVERSAL_WALL, MOBILE_CONNECTOR
}

enum class Acessories {
    SUNSHADE, ALL_WEATHER_INTERIOR_LINERS, ROOF_RACK
}

class ModelS(var driveMode: DriveMode? = null,
             var paint: Paint? = null,
             var wheels: Wheels? = null,
             var interior: Interior? = null,
             var steering: Steering? = null,
             var charginConnector: ChargingConnector? = null,
             var acessories: Set<Acessories>? = null,
             var selfDrivingCapiabilities: Boolean? = null)


interface ElectricCarBuilder {
    
    fun reset()
    
    fun build(): ModelS
    
    fun setDriveMode(driveMode: DriveMode)
    
    fun setPaint(paint: Paint)
    
    fun setWheels(wheels: Wheels)
    
    fun setInterior(interior: Interior)
    
    fun setSteering(steering: Steering)
    
    fun setChargingConnector(charginConnector: ChargingConnector)
    
    fun setAcessories(acessories: Set<Acessories>?)
    
    fun setSelfDrivingCapiabilities(selfDrivingCapiabilities: Boolean)
}

class ModelSBuilder : ElectricCarBuilder {
    private var tesla: ModelS
    
    init {
        tesla = ModelS() 
    }
    
    override fun reset() {
        tesla = ModelS() 
    }
    
    override fun build(): ModelS {
        return tesla
    }
    
    override fun setDriveMode(driveMode: DriveMode) {
        tesla.driveMode = driveMode
    }
    
	override fun setPaint(paint: Paint) {
        tesla.paint = paint
    }
    
    override fun setWheels(wheels: Wheels) {
       tesla.wheels = wheels
    }
    
    override fun setInterior(interior: Interior) {
        tesla.interior = interior
    }
    	
    override fun setSteering(steering: Steering) {
        tesla.steering = steering
    }
    
	override fun setChargingConnector(charginConnector: ChargingConnector) {
        tesla.charginConnector = charginConnector
    }
    
    override fun setSelfDrivingCapiabilities(selfDrivingCapiabilities: Boolean) {
        tesla.selfDrivingCapiabilities = selfDrivingCapiabilities
    }
    override fun setAcessories(acessories: Set<Acessories>?) {
        tesla.acessories = acessories
    }
}
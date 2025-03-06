package enums

enum class Network {
    CONNECTED,
    DISCONNECTED
}

enum class Direction(val state: String) {

    EAST("Bengal"),
    WEST("Gujarat"),
    SOUTH("Tamil Nadu"),
    NORTH("Jammu & Kashmir")
}

fun getStatus(network : Network): String{

   return when(network){
       Network.CONNECTED -> "Newtwork is Connected"
       Network.DISCONNECTED -> "Network is Disconnected"
    }
}

fun getState(direction: Direction) : String{

    return when(direction){
        Direction.EAST -> {
            direction.state
        }
        Direction.NORTH ->{direction.state}
        Direction.WEST -> {direction.state}
        Direction.SOUTH -> {direction.state}
    }
}

fun main(){

    println(getStatus(Network.CONNECTED))
    println(getState(Direction.NORTH))
}
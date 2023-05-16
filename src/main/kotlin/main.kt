fun main() {
    val parking = Parking()

    do {
        val request = readln().split(" ")
        if ("park" in request) parking.parkCar(request[1], request[2])
        else if ("leave" in request) parking.leaveCar(request[1].toInt())

    } while (request[0].lowercase() != "exit")
}
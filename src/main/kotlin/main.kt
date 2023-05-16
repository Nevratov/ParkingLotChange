fun main() {
    val parking = Parking()

    do {
        val request = readln().split(" ")

        if (parking.spots.isEmpty() && request[0].lowercase() != "create" && request[0].lowercase() != "exit") {
            println("Sorry, a parking lot has not been created.")
            continue
        } else if ("park" in request) parking.parkCar(request[1], request[2])
        else if ("leave" in request) parking.leaveCar(request[1].toInt())
        else if ("status" in request) parking.status()
        else if ("create" in request) parking.create(request[1].toInt())
    } while (request[0].lowercase() != "exit")
}
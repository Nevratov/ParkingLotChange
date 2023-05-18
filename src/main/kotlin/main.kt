fun main() {
    val parking = Parking()

    do {
        val request = readln().split(" ")

        if (parking.spots.isEmpty() && request[0].lowercase() != "create" && request[0].lowercase() != "exit") {
            println("Sorry, a parking lot has not been created.")
            continue
        } else
        when (request[0]) {
            "park" -> parking.parkCar(request[1], request[2].lowercase())
            "leave" -> parking.leaveCar(request[1].toInt())
            "status" -> parking.status()
            "reg_by_color" -> parking.regByColor(request[1].lowercase())
            "spot_by_reg" -> parking.spotByReg(request[1])
            "spot_by_color" -> parking.spotByColor(request[1])
            "create" ->parking.create(request[1].toInt())
        }
    } while (request[0].lowercase() != "exit")
}
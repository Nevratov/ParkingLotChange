fun main() {
    val parking = arrayListOf(ArrayList<String>())
    parking.add(arrayListOf("MA-02-NN-9999", "Red"))

    val request = readln().split(" ")
    if ("park" in request) {
        val currentCar = arrayListOf(request[1], request[2])
        for (i in parking.indices) {
            if (parking[i].isNotEmpty()) {
                println("${request[2]} car parked in spot 2.")
                parking.add(currentCar)
            }
        }
    } else if ("leave" in request) {
        val spot = request[1].toInt()
        if (spot - 1 in 1..parking.size) println("There is no car in spot $spot.")
        else {
            parking[spot-1].clear()
            println("Spot $spot is free.")
        }
    }

}
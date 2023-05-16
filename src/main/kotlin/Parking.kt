class Parking(var spots: Array<ArrayList<String>> = Array(0) { arrayListOf() }) {

    fun parkCar(carNumber: String, carColor: String) {
        for (spot in spots.indices) {
            if (spots[spot].isEmpty()) {
                spots[spot] = arrayListOf(carNumber, carColor)
                println("$carColor car parked in spot ${spot + 1}.")
                return
            }
        }
        println("Sorry, the parking lot is full.")
    }

    fun leaveCar(spot: Int) {
        if (spots[spot - 1].isEmpty()) println("There is no car in spot $spot.")
        else {
            spots[spot - 1].clear()
            println("Spot $spot is free.")
        }
    }

    fun status() {
        if (spots[0].isEmpty()) println("Parking lot is empty.")
        else for (spot in spots.indices) {
            if (spots[spot].isNotEmpty()) println("${spot + 1} ${spots[spot][0]} ${spots[spot][1]}") else continue
        }
    }

    fun create(newSpots: Int) {
        spots = Array(newSpots) { arrayListOf() }
        println("Created a parking lot with $newSpots spots.")
    }
}
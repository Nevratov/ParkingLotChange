class Parking(val spots: Array<ArrayList<String>> = Array(20) { arrayListOf() }) {

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
}
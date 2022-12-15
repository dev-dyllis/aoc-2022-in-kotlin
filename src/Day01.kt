fun part1(inputs: List<String>): Int {
    var maxCalorie = 0
    var sumCalorie = 0
    inputs.forEach { input ->
        if (input == "") {
            if (maxCalorie < sumCalorie) {
                maxCalorie = sumCalorie
            }
            sumCalorie = 0

            return@forEach
        }

        sumCalorie += input.toInt()
    }

    return maxCalorie
}

fun main() {

    val inputs: List<String> = readInput("Day01")
    part1(inputs).println()

}

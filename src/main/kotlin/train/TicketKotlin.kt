package train

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    println("Please enter number of tickets:")
    val count = scanner.nextInt()
    println("How many round-trip tickets: ")
    val roundTripCount = scanner.nextInt()
    TicketPrice(count, roundTripCount).print()

}

class TicketPrice (var count: Int, var roundTripCount: Int ) {
    fun print(){
        print("Total tickets: $count Round-trip: $roundTripCount Total: ${total()}")
    }

    private fun total () = (count - roundTripCount) * 1000 + (roundTripCount * 2000 * 0.9).toInt()
}
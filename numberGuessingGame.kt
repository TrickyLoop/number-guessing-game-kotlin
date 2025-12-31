import kotlin.random.Random

fun main() {
    val randomNumber = Random.nextInt(1, 100 + 1)
    var programIsRunning = true
    var attempts = 9
    // Why 9? Because zero is counted. Thus, the loop will run 10 times

    while (programIsRunning) {

        println("You have ${attempts + 1} attempts available!")

        print("Enter your guess: ")
        val playerGuess = readln().toInt()

        if (playerGuess == randomNumber) {
            println("You won!")
            programIsRunning = false
        } else if (attempts == 0) {
            println("You ran out of available attempts.")
            programIsRunning = false
        } else if (playerGuess > randomNumber) {
            println("Too High. Try again!")
            attempts--
        } else {
            println("Too Low. Try again!")
            attempts--
        }
    }
}
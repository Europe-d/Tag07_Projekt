fun main() {
    val wochentage: MutableList<String> = mutableListOf("Montag", "Dienstag", "Mittwoch")
    wochentage.add("donnerstag")
    wochentage.add("Freitag")
    wochentage.add("Samstag")
    wochentage.add("Sonntag")

    println(wochentage.size)

    wochentage.clear()

    println(wochentage)
    // todo: Erweitere ab hier den Code.

}
fun main() {
    val a: List<Double> = listOf(2.3, 5.4, 6.8)
    val b: Double = a.min()
var warennamenListe: MutableList<String> = mutableListOf("Schokoriegel","Wassereis","Zeitungen")
    var warenpreis: MutableList<Double> = mutableListOf(1.29, 0.49, 1.99)
    println("${warennamenListe[0]} kostet ${warenpreis[0]}")
    println("${warennamenListe[1]} kostet ${warenpreis[1]}")
    println("${warennamenListe[2]} kostet ${warenpreis[2]}")

    //todo Peter hat dich leider nicht ganz verstanden,

println("wie viel denn ein Wassereis kostet?")
    /*hier schreiben wir auf die console Wassereis */

    val warenname1 = readln()
var index = warennamenListe.indexOf(warenname1)
    var preis1 = warenpreis[index]
    println(preis1)

// todo Im Hintergrund kommt Alfred vorbei und gibt dir deine neue Ware.
    println("wir haben neue waren")
    /*bei neue waren wir schreiben auf die console wie viel kostet es?*/

warennamenListe.add(0,"Kaugummis")
warenpreis.add(0,0.19)
    println(warennamenListe)



// todo Der vergessliche Peter fragt jetzt nochmal nach dem Preis für die Zeitung.
    val warenname2 = readln()
    var index1 = warennamenListe.indexOf(warenname2)
    var preis2 = warenpreis.first()
    println(preis2)

    println("wie viel denn die zeitung kostet wieder ich habe es nicht verstanden?")
    val warenname3 = readln()
    var index2 = warennamenListe.indexOf(warenname3)
    var preis3 = warenpreis[3]
    println(preis3)

//todo Schlussendlich will Peter  5 mal Wassereis und 3 Schokoriegel kaufen, er gibt dir 20€, wie viel Restgeld bekommt Peter?
var wassereis : Int = 5
    var preisVonWassereis: Double = warenpreis[2]
    var ergebnis1: Double = wassereis * warenpreis[2]
    println("Die wassereis kostet ${warenpreis[2]} und er hat $wassereis mal gekauft das kostet $ergebnis1")

    //todo Schlussendlich will Peter 10 Kaugummis
    var kaugummis : Int = 10
    var preisvongummis : Double = 0.19
    println("Peter hat $kaugummis mal kaugummis von $preisvongummis")
    var ergebnisMultiplikation: Double = kaugummis * preisvongummis
    println("Das kostet $ergebnisMultiplikation")

    //todo und 3 Schokoriegel kaufen, er gibt dir 20€, wie viel Restgeld bekommt Peter?
    var schokoriegel : Int = 3
    var preisVonSchokoriegel : Double = warenpreis[1]
    var ergebnis2: Double = schokoriegel * warenpreis[1]

    var geld : Double = 20.00
    println("Dann die Schokoriegel kostet ${warenpreis[1]} und er hat $schokoriegel mal gekauft das kostet $ergebnis2 ")


    var ergebnis3: Double = ergebnis2 + ergebnisMultiplikation + ergebnis1
var eregebnis4 : String = ("$ergebnis3 - $geld")
    var restegeld = ergebnis3 - geld
    println("alle zusammen gekostet $ergebnis3 und er hat reste geld von $geld = $restegeld")


}
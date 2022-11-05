fun main() {
    suit2()
}

val Batu = "batu"
val Gunting = "gunting"
val Kertas = "kertas"

var kelas = StringClass()


val randomNum = ((1..3).random())

//Menu picker for suit2() and suit()
fun suitChallenge(){
    var whileStat2=""
    do {
        println("Pilih Permainan: \n" +
                "1. vs player\n" +
                "2. vs computer\n" +
                "\nKetik Angka: ")
        when(readln().toInt()){
            1 -> {suit2()
                whileStat2="benar"}
            2 -> {suit()
                whileStat2="benar"}
        }
    } while (whileStat2=="")
}

//Main Menu for 2 Players Suit Challenge
fun suit2(){
    kelas.header()
    var whileStat=""

    do {
        println("Masukkan pemain 1: ")
        //Step 3. Buatlah interface input untuk user dengan menggunakan readln()
        //Step 4. Buatlah condition when
        when (readln().lowercase()) {
            //Step 5. masukkan pilihan variable dan aksi yang akan dilakukan
            Gunting -> {
                println(kelas.usname2)
                kelas.suitHasil()
                //Step 6. Masukkan Whilestat untuk melompat ke while.
                whileStat="benar"}
            Batu -> {
                println(kelas.usname2)
                kelas.us2batu()
                whileStat="benar"}
            Kertas -> { println(kelas.usname2)
                kelas.us2kertas()
                whileStat="benar"}
            else -> {
                println("input salah")
            }
        }
    } while(whileStat=="")
}

//Main Menu for Player VS CPU Suit Challenge
fun suit(){
    kelas.header()
    var whileStat=""
    do {
        println("Masukkan pemain 1: ")
        //Step 3. Buatlah interface input untuk user dengan menggunakan readln()
        //Step 4. Buatlah condition when
        when (readln().lowercase()) {
            //Step 5. masukkan pilihan variable dan aksi yang akan dilakukan
            Gunting -> {
                println(kelas.comname)
                kelas.compgunting()
                //Step 6. Masukkan Whilestat untuk melompat ke while.
                whileStat="benar"}
            Batu -> {
                println(kelas.comname)
                kelas.compbatu()
                whileStat="benar"}
            Kertas -> { println(kelas.comname)
                kelas.compkertas()
                whileStat="benar"}
            else -> {
                println("input salah")
            }
        }
    } while(whileStat=="")
}



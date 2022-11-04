fun main() {
    suitChallenge()
}

fun suitChallenge(){
    var whileStat2=""
    println("==========================")
    println("GAME SUIT TERMINAL VERSION")
    println("==========================")
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

fun suit2(){
    var whileStat=""

    do {
        println("Masukkan pemain 1: ")
        //Step 3. Buatlah interface input untuk user dengan menggunakan readln()
        //Step 4. Buatlah condition when
        when (readln().lowercase()) {
            //Step 5. masukkan pilihan variable dan aksi yang akan dilakukan
            Gunting -> {
                println(usname2)
                us2gunting()
                //Step 6. Masukkan Whilestat untuk melompat ke while.
                whileStat="benar"}
            Batu -> {
                println(usname2)
                us2batu()
                whileStat="benar"}
            Kertas -> { println(usname2)
                us2kertas()
                whileStat="benar"}
            else -> {
                println("input salah")
            }
        }
    } while(whileStat=="")
}

fun suit(){
    var whileStat=""

    do {
        println("Masukkan pemain 1: ")
        //Step 3. Buatlah interface input untuk user dengan menggunakan readln()
        //Step 4. Buatlah condition when
        when (readln().lowercase()) {
            //Step 5. masukkan pilihan variable dan aksi yang akan dilakukan
            Gunting -> {
                println(comname)
                compgunting()
                //Step 6. Masukkan Whilestat untuk melompat ke while.
                whileStat="benar"}
            Batu -> {
                println(comname)
                compbatu()
                whileStat="benar"}
            Kertas -> { println(comname)
                compkertas()
                whileStat="benar"}
            else -> {
                println("input salah")
            }
        }
    } while(whileStat=="")
}

val Batu = "batu"
val Gunting = "gunting"
val Kertas = "kertas"

val comname = "Masukkan Komputer: "
val usname2 = "Masukkan Player 2: "

val seri= ("\nHasil: \nWah seri!")
val kalah = ("\nHasil: \nYahh anda kalah! :pp")
val menang = ("\nHasil: \nSelamat anda menang!")

val menangplayer1 = ("\nHasil: \nSelamat player 1 menang!")
val menangplayer2 = ("\nHasil: \nSelamat player 2 menang!")

val randomNum = ((1..3).random())

//hasil user2
fun us2gunting(){
    when(readln().lowercase()){
        Gunting -> print("${Gunting}\n" + seri)
        Batu -> print("${Batu}\n" + menangplayer2)
        Kertas -> print("${Kertas}\n" + menangplayer1)
    }
}

fun us2kertas(){
    when(readln().lowercase()){
        Gunting -> print("${Gunting}\n" + menangplayer2)
        Batu -> print("${Batu}\n" + menangplayer1)
        Kertas -> print("${Kertas}\n" + seri)
    }
}

fun us2batu(){
    when(readln().lowercase()){
        Gunting -> print("${Gunting}\n" + menangplayer1)
        Batu -> print("${Batu}\n" + seri)
        Kertas -> print("${Kertas}\n" + menangplayer2)
    }
}

// hasil komputer
fun compgunting(){
    when(randomNum){
        1 -> print("${Gunting}\n" + seri)
        2 -> print("${Batu}\n" + kalah)
        else -> print("${Kertas}\n" + menang)
    }
}

fun compkertas(){
    when(randomNum){
        1 -> print("${Gunting}\n" + kalah)
        2 -> print("${Batu}\n" + menang)
        else -> print("${Kertas}\n" + seri)
    }
}

fun compbatu(){
    when(randomNum){
        1 -> println("${Gunting}\n" + menang)
        2 -> println("${Batu}\n" + seri)
        else -> println("${Kertas}\n" + kalah)
    }
}
fun main() {
    suit()
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


val randomNum = ((1..3).random())



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
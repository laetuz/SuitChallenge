class StringClass {
    var seri:String = ("\nHasil: \nWah seri!")
    val kalah:String = ("\nHasil: \nYahh anda kalah! :pp")
    val menang:String = ("\nHasil: \nSelamat anda menang!")

    val menangplayer1 = ("\nHasil: \nSelamat player 1 menang!")
    val menangplayer2 = ("\nHasil: \nSelamat player 2 menang!")

    val comname = "Komputer: "
    val usname2 = "Masukkan Player 2: "
    /*fun Hasil(hasil:String){
    ("Hasil: $hasil").toString()
    }*/

    //Hasil Computer
    fun compgunting(){
        when(randomNum){
            1 -> print("${Gunting}\n" + kelas.seri)
            2 -> print("${Batu}\n" + kelas.kalah)
            else -> print("${Kertas}\n" + kelas.menang)
        }
    }

    fun compkertas(){
        when(randomNum){
            1 -> print("${Gunting}\n" + kelas.kalah)
            2 -> print("${Batu}\n" + kelas.menang)
            else -> print("${Kertas}\n" + kelas.seri)
        }
    }

    fun compbatu(){
        when(randomNum){
            1 -> println("${Gunting}\n" + kelas.menang)
            2 -> println("${Batu}\n" + kelas.seri)
            else -> println("${Kertas}\n" + kelas.kalah)
        }
    }
}
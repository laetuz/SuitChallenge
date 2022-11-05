open class StringClass {

    val hString="\nHasil: "
    var seri:String = ("\nHasil: \nWah seri!")
    val kalah:String = ("\nHasil: \nYahh anda kalah! :pp")
    val menang:String = ("\nHasil: \nSelamat anda menang!")

    val menangplayer1 = ("\nHasil: \nSelamat player 1 menang!")
    val menangplayer2 = ("\nHasil: \nSelamat player 2 menang!")

    val comname = "Komputer: "
    val usname2 = "Masukkan Player 2: "

    fun header(){
        println("==========================")
        println("GAME SUIT TERMINAL VERSION")
        println("==========================")
    }

    //Hasil PVP/ Player 2
    open fun suitHasil(){
        when(readln().lowercase()){
            Gunting -> print("${Gunting}\n" + kelas.seri)
            Batu -> print("${Batu}\n" + kelas.menangplayer2)
            Kertas -> print("${Kertas}\n" + kelas.menangplayer1)
        }
    }

    fun us2kertas(){
        when(readln().lowercase()){
            Gunting -> print("${Gunting}\n" + kelas.menangplayer2)
            Batu -> print("${Batu}\n" + kelas.menangplayer1)
            Kertas -> print("${Kertas}\n" + kelas.seri)
        }
    }

    fun us2batu(){
        when(readln().lowercase()){
            Gunting -> print("${Gunting}\n" + kelas.menangplayer1)
            Batu -> print("${Batu}\n" + kelas.seri)
            Kertas -> print("${Kertas}\n" + kelas.menangplayer2)
        }
    }



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
class HasilUser: StringClass() {
    //Hasil User
    override fun gunting(){
        when(readln().lowercase()){
            Gunting -> print("${Gunting}\n" + kelas.seri)
            Batu -> print("${Batu}\n" + kelas.menangplayer2)
            Kertas -> print("${Kertas}\n" + kelas.menangplayer1)
        }
    }

    override fun kertas(){
        when(readln().lowercase()){
            Gunting -> print("${Gunting}\n" + kelas.menangplayer2)
            Batu -> print("${Batu}\n" + kelas.menangplayer1)
            Kertas -> print("${Kertas}\n" + kelas.seri)
        }
    }

    override fun batu(){
        when(readln().lowercase()){
            Gunting -> print("${Gunting}\n" + kelas.menangplayer1)
            Batu -> print("${Batu}\n" + kelas.seri)
            Kertas -> print("${Kertas}\n" + kelas.menangplayer2)
        }
    }

}
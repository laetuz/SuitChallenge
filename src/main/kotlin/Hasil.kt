class Hasil: StringClass() {
    override fun suitHasil(){
        when(readln().lowercase()){
            Gunting -> print("${Gunting}\n" + kelas.seri)
            Batu -> print("${Batu}\n" + kelas.menangplayer2)
            Kertas -> print("${Kertas}\n" + kelas.menangplayer1)
        }
    }
}
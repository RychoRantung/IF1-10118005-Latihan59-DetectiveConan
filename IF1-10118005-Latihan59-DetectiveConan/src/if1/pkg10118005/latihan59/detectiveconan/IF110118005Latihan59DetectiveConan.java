/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118005.latihan59.detectiveconan;

/**
 *
 * @author USER
 * NAMA : Rycho Rantung
 * KELAS : IF1
 * NIM : 10118005
 * Deskripsi Program : Berisi program yang menampilkan tokoh-tokoh anime Detective Conan
 */
public class IF110118005Latihan59DetectiveConan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MainChara conan = new MainChara("Conan Edogawa", "Detektif", "Menyelesaikan Kasus", "Detektif Cilik");
        conan.tampil();
        
        MainChara ran = new MainChara("Ran Mouri", "Ahli Karate", "Menjadi Ahli Karate di Seluruh Jepang", "Siswi SMA");
        ran.tampil();
        
        MainChara kogoro = new MainChara("Kogoro Mouri", "Detektif Swasta", "Memecahkan kasus", "Detektif Swasta");
        kogoro.tampil();
        
        SupportChara heiji = new SupportChara("Heiji Hattori", "Detektif SMA", "Temannya Conan");
        heiji.tampil();
        
        SupportChara kazuha = new SupportChara("Kazuha Tayoma", "Ahli Aikido", "Temannya Ran");
        kazuha.tampil();
        
    }
    
}

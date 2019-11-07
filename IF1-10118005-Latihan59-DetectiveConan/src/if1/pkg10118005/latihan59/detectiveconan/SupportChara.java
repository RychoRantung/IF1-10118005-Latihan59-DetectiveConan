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
public class SupportChara extends Chara{
private final String hubungan;
    
    public SupportChara(String nama, String peran, String hubungan) {
        super(nama, peran);
        this.hubungan=hubungan;
    }

    public String getHubungan() {
        return hubungan;
    }
    
    public void tampil(){
        System.out.println("Nama : "+getNama());
        System.out.println("Peran : "+getPeran());
        System.out.println("Hubungan dengan karakter utama : "+getHubungan()+"\n");    
    }
}

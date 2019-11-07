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
public class MainChara extends Chara {
    private String team;
    private String tujuan;
    
    public MainChara(String nama, String peran,String team, String tujuan) {
        super(nama, peran);
        this.team = team;
        this.tujuan = tujuan;
    }

    public String getTeam() {
        return team;
    }

    public String getTujuan() {
        return tujuan;
    }
    public void tampil(){
        System.out.println("Nama : "+getNama());
        System.out.println("Peran : "+getPeran());
        System.out.println("Team : "+getTeam());
        System.out.println("Tujuan : "+getTujuan() + "\n");
    }
    
}

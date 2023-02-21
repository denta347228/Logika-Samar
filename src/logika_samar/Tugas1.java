/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logika_samar;

/**
 *
 * @author ASUS G531GW
 */
public class Tugas1 {
    public static void main(String[] args) {
        MFPi anak = new MFPi(14,26);
        for (int i = 0; i <= 100; i++) {
//            System.out.println(rancid.getMF(i));
            System.out.println(anak.getMF(i));
        }
    }
}

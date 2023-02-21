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
public class logika_samar {
    public static void main(String[] args) {
        MFlinear_naik panas = new MFlinear_naik(25,35);
        MFlinear_turun dingin = new MFlinear_turun(15,25);
        MFsegitiga normal = new MFsegitiga(15,25,35);
        MFtrapesium normal2 = new MFtrapesium(15,24,27,35);
        //MF = membership function
        
//        System.out.println(panas.getMF(32));
//        System.out.println(dingin.getMF(20));
//        System.out.println(normal.getMF(23));
//        System.out.println(normal2.getMF(32));
        
        MFkurvaSpertumbuhan tua = new MFkurvaSpertumbuhan(35,60);
        for (int i = 0; i <= 70; i++) {
//            System.out.println(i+" : "+ tua.getMF(i));
            System.out.println(panas.getMF(i));
        }
        
        MFkurvaSpenyusutan muda = new MFkurvaSpenyusutan(15,50);
        for (int i = 0; i <= 70; i++) {
//            System.out.println(i+" : "+ muda.getMF(i));
//            System.out.println( muda.getMF(i));
        }
        
//        for (int i = 0; i <=40; i++) {
//            System.out.println(normal.getMF(i));
//        }

        MFPi parobaya = new MFPi(10,45);
//        System.out.println(parobaya.getMF(48));
//        System.out.println(parobaya.getMF(51));
        for (int i = 0; i <= 70; i++) {
            //System.out.println(parobaya.getMF(i));
        }
        
        MFBeta parobaya1= new MFBeta(10,45);
//        System.out.println(parobaya1.getMF(42));
//        System.out.println(parobaya1.getMF(51));

        MFGaussian parobaya2 = new MFGaussian(0.002,32.5);
        for (int i = 0; i <= 70; i++) {
            System.out.println(parobaya2.getMF(i));
        }
    }
}

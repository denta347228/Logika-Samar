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
public class MFlinear_naik {
    private double a;
    private double b;

    // cara cepat buat konstruktor dan setter getter
    // klik kanan pilih insert code, lalu pilih setter getter atau constructor
    
     public MFlinear_naik() {
    }

    public MFlinear_naik(double a, double b) {
        this.a = a;
        this.b = b;
    }
    
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getMF(double x){
        if(x<=a)        return 0;
        else if (x>=b)  return 1;
        else            return (x-a)/(b-a);
    }
    
    
}

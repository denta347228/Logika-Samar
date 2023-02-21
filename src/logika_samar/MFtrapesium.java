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
public class MFtrapesium {
    private double a;
    private double b;
    private double c;
    private double d;

    public MFtrapesium(double a, double b, double c, double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
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

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }
    
    public double getMF(double x){
        if(x<=a || x>=d)        return 0;
        else if (x>=b && x<=c)  return 1;
        else if (x>a && x<b)    return (x-a)/(b-a);
        else                    return (d-x)/(d-c);
    }
}

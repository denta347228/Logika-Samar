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
public class MFsegitiga {
    private double a;
    private double b;
    private double c;

    public MFsegitiga(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
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
    
    public double getMF(double x){
        if(x<=a || x>=c)        return 0;
        else if(x>a && x<=b)    return (x-a)/(b-a);
        else                    return (c-x)/(c-b);
    }
    public double getMFI(double x){
        if(x>=c)                 return 0;
        else if(x>=a && x<=b)    return (x-a)/(b-a);
        else                    return (c-x)/(c-b);
    }
}

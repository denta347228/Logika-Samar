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
public class MFGaussian {
    private double k;
    private double gamma;

    public MFGaussian(double k, double gamma) {
        this.k = k;
        this.gamma = gamma;
    }

    public double getK() {
        return k;
    }

    public void setK(double k) {
        this.k = k;
    }

    public double getGamma() {
        return gamma;
    }

    public void setGamma(double gamma) {
        this.gamma = gamma;
    }
    
    public double getMF(double x){
        return Math.exp(-k*Math.pow((gamma-x), 2));
    }
}

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
public class MFBeta {
    private double beta;
    private double gamma;

    public MFBeta(double beta, double gamma) {
        this.beta = beta;
        this.gamma = gamma;
    }

    public double getBeta() {
        return beta;
    }

    public void setBeta(double beta) {
        this.beta = beta;
    }

    public double getGamma() {
        return gamma;
    }

    public void setGamma(double gamma) {
        this.gamma = gamma;
    }
    
    public double getMF(double x){
        return 1/(1+Math.pow(((x-gamma)/beta), 2));
    }
}

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
public class MFkurvaSpenyusutan {
    private double alfa;
    private double beta;
    private double gamma;

    public MFkurvaSpenyusutan(double alfa, double gamma) {
        this.alfa = alfa;
        this.gamma = gamma;
        setBeta(alfa,gamma);
    }

    public double getAlfa() {
        return alfa;
    }

    public void setAlfa(double alfa) {
        this.alfa = alfa;
    }

    public double getBeta() {
        return beta;
    }

    public void setBeta(double alfa, double gamma) {
        this.beta = (alfa+gamma)/2;
    }

    public double getGamma() {
        return gamma;
    }

    public void setGamma(double gamma) {
        this.gamma = gamma;
    }
    
    public double getMF(double x){
        if(x<=alfa)                 return 1;
        else if (x>alfa && x<=beta) return 1-(2*Math.pow((x-alfa)/(gamma-alfa), 2));
        else if (x>beta && x<gamma) return 2*Math.pow((gamma-x)/(gamma-alfa), 2);
        else                        return 0;
    }
}

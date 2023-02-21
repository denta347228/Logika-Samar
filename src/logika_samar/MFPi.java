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
public class MFPi {
    private double beta;
    private double gamma;

    public MFPi(double beta, double gamma) {
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
    
    public double getMFPertumbuhan(double x, double alfa, double beta, double gamma){
        if(x<=alfa)                 return 0;
        else if (x>alfa && x<=beta) return 2*Math.pow((x-alfa)/(gamma-alfa), 2);
        else if (x>beta && x<gamma) return 1-(2*Math.pow((gamma-x)/(gamma-alfa), 2));
        else                        return 1;
    }
    
    public double getMF(double x){
        if(x<=gamma)
            return getMFPertumbuhan(x,(gamma-beta),(gamma-(beta/2)),gamma);
        else
            return 1-(getMFPertumbuhan(x,gamma,(gamma+(beta/2)),(gamma+beta)));
    }
}

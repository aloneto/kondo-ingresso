package com.company;

public class vip extends ingresso {

    public double getAcrecimoVip() {
        return acrecimoVip;
    }

    public void setAcrecimoVip(double acrecimoVip) {
        this.acrecimoVip = acrecimoVip;
    }

    double acrecimoVip = 1.1;


    public double returnVip (){

        double valorVip = this.valor * this.acrecimoVip;
        System.out.println(valorVip);
     return valorVip;

    }


}

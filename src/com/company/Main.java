package com.company;

public class Main {

    public static void main (String[] args) {

        ingresso tk1 = new ingresso();

        tk1.setEvento("AC/DC");
        tk1.setData("16/12/2019");
        tk1.setValor(220);

        ingresso tk2 = new ingresso();

        tk2.setEvento("pear-jam");
        tk2.setData("10/2/2019");
        tk2.setValor(150);

        ingresso tk3 = new ingresso();

        tk3.setEvento("deep purple");
        tk3.setData("01/10/2019");
        tk3.setValor(130);

        System.out.println("shows disponiveis");


        System.out.println("---------------------------------------");
        tk1.printTiket();
        System.out.println("---------------------------------------");
        tk2.printTiket();
        System.out.println("---------------------------------------");
        tk3.printTiket();
        System.out.println("---------------------------------------");




        //tk1.printTiket();

        vip tk1Vip = new vip();
        tk1Vip.acrecimoVip = 1.2;
        tk1Vip.returnVip();




    }
}

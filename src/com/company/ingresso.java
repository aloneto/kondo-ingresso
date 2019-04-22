package com.company;

public class ingresso {


    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

        public int getQuantidade () {
            return quantidade;
        }

        public void setQuantidade ( int quantidade){
            this.quantidade = quantidade;
        }



    String evento;
    String data;
    double valor;
    int quantidade;

    public void printTiket() {




        System.out.println("###########################");
        System.out.println("#### Show:" + this.evento + "############");
        System.out.println("#### Data: " + this.data + "######");
        System.out.println("#### Valor: " + this.valor + "##########");
        System.out.println("###########################");

    }


}

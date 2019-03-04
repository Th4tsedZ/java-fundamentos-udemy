package oo.encapsulamento.casa2;

import oo.encapsulamento.casa1.Sogro;

public class Genro {
    private String segredo = "minha sogra fala demais";

    public static void main(String[] args) {
        Genro euMesmo = new Genro();
        System.out.println("Nunca falarei: " + euMesmo.segredo);

        Filha meuAmor = new Filha();
        System.out.println(meuAmor.segredoDoCasal);

        Sogro sograo = new Sogro();
        System.out.println("Meu sogro gosta de cerveja? " + sograo.gostaDeCerveja);

//        Sogra sogra = new Sogra();
//        System.out.println(sogra.);
    }
}

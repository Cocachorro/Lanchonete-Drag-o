package lanchonete.classes;

import static lanchonete.classes.Produto.*;

public class Informacoes {
    

    // Sanduíches
    public static void sanduiche1() {
        System.out.println(xBurguer.desc);
        opcoes();
    }

    public static void sanduiche2() {
        float valor=14;
        System.out.println(xSalada.desc);
        opcoes();
    }

    public static void sanduiche3() {
        float valor=16;
        System.out.println(xBacon.desc);
        opcoes();
    }

    public static void sanduiche4() {
        float valor=15;
        System.out.println(xEgg.desc);
        opcoes();
    }

    // Pastéis
    public static void pastel1() {
        float valor=8;
        System.out.println(pCarne.desc);
        opcoes();
    }

    public static void pastel2() {
        float valor=8;
        System.out.println(pQueijo.desc);
        opcoes();
    }

    public static void pastel3() {
        float valor=9;
        System.out.println(pPizza.desc);
        opcoes();
    }

    public static void pastel4() {
        float valor=10;
        System.out.println(pChoco.desc);
        opcoes();
    }

    // Sorvetes
    public static void sorvete1() {
        float valor=6;
        System.out.println(sBauni.desc);
        opcoes();
    }

    public static void sorvete2() {
        float valor=6;
        System.out.println(sChoco.desc);
        opcoes();
    }

    public static void sorvete3() {
        float valor=6;
        System.out.println(sMoran.desc);
        opcoes();
    }

    public static void sorvete4() {
        float valor=9;
        System.out.println(sundae.desc);
        opcoes();
    }

    // Bebidas Não Alcoólicas
    public static void bebidaNaoAlcoolica1() {
        float valor=5;
        System.out.println(refri.desc);
        opcoes();
    }

    public static void bebidaNaoAlcoolica2() {
        float valor=7;
        System.out.println(suco.desc);
        opcoes();
    }

    public static void bebidaNaoAlcoolica3() {
        float valor=3;
        System.out.println(agua.desc);
        opcoes();
    }

    public static void bebidaNaoAlcoolica4() {
        float valor=6;
        System.out.println(cha.desc);
        opcoes();
    }

    // Bebidas Alcoólicas
    public static void bebidaAlcoolica1() {
        float valor=8;
        System.out.println(cerveja.desc);
        opcoes();
    }

    public static void bebidaAlcoolica2() {
        float valor=12;
        System.out.println(vinho.desc);
        opcoes();
    }

    public static void bebidaAlcoolica3() {
        float valor=14;
        System.out.println(caipirinha.desc);
        opcoes();
    }

    public static void bebidaAlcoolica4() {
        float valor=18;
        System.out.println(whisky.desc);
        opcoes();
    }

    // Método padrão para mostrar as opções após cada item
    private static void opcoes() {
        System.out.println("1 - Adicionar ao carrinho");
        System.out.println("2 - Voltar ao menu anterior");
        System.out.println("3 - Voltar ao menu principal");
    }
}

package lanchonete;

import lanchonete.classes.Carrinho;
import lanchonete.classes.Entradas;
import lanchonete.classes.Menus;
import lanchonete.classes.Scanner;
import lanchonete.classes.cardapio.Bebidas;
import lanchonete.classes.cardapio.Comidas;

public class Lanchonete extends Scanner {

    public static void main(String[] args) {
        int entrada = 0;
        Menus.bemVindo();
        do {
            Menus.menu();
            entrada = Entradas.menuInv(entrada);

            switch (entrada) {
                case 1:
                    Comidas.sand();
                    break;
                case 2:
                    Comidas.pasteis();
                    break;
                case 3:
                    Comidas.sorvete();
                    break;
                case 4:
                    Bebidas.naoAlcolicas();
                    break;
                case 5:
                    Bebidas.alcolicas();
                    break;
                case 6:
                    Carrinho.carrinho();
                    entrada=0;
                    break;
                case 0:
                    break;
            }

        } while (entrada != 0);
        Menus.despedida();
    }
}
